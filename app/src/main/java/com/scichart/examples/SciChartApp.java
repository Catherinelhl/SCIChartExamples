//******************************************************************************
// SCICHART® Copyright SciChart Ltd. 2011-2017. All rights reserved.
//
// Web: http://www.scichart.com
// Support: support@scichart.com
// Sales:   sales@scichart.com
//
// SciChartApp.java is part of the SCICHART® Examples. Permission is hereby granted
// to modify, create derivative works, distribute and publish any part of this source
// code whether for commercial, private or personal use.
//
// The SCICHART® examples are distributed in the hope that they will be useful, but
// without any warranty. It is provided "AS IS" without warranty of any kind, either
// expressed or implied.
//******************************************************************************

package com.scichart.examples;

import android.app.Application;
import android.util.Log;

//BEGIN_DEMO_APPLICATION
import com.scichart.examples.demo.helpers.Module;
import com.scichart.examples.demo.search.ExampleSearchProvider;
//END_DEMO_APPLICATION

public class SciChartApp extends Application {

    private static SciChartApp sInstance;

    public static SciChartApp getInstance() {
        return sInstance;
    }

    //BEGIN_DEMO_APPLICATION
    private Module module;
    private ExampleSearchProvider searchProvider;
    //END_DEMO_APPLICATION

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        setUpSciChartLicense();
    }

    private void setUpSciChartLicense() {
        // Set your license code here to license the SciChart Android Examples app
        // You can get a trial license key from https://www.scichart.com/licensing-scichart-android/
        // Purchased license keys can be viewed at https://www.scichart.com/profile
        //
        // e.g.
        //
        try {
            com.scichart.charting.visuals.SciChartSurface.setRuntimeLicenseKey(
                   "<LicenseContract>" +
                           "<Customer>Catherineliu@orangeblock.tech</Customer>" +
                           "<OrderId>Trial</OrderId>" +
                           "<LicenseCount>1</LicenseCount>" +
                           "<IsTrialLicense>true</IsTrialLicense>" +
                           "<SupportExpires>12/08/2018 00:00:00</SupportExpires>" +
                           "<ProductCode>SC-ANDROID-2D-ENTERPRISE-SRC</ProductCode>" +
                           "<KeyCode>8575f41bd572f461e6dc983c6ff8cb124299bec50a2e4f04577d5e18e61933036ab7ebdb60da829b4edbda3d48e3bd0b25fdec4c81d1b3ca403dfbb92ae90c6dcc2004d831ce747e372014ec7462737e6347789bd48db9a1a3a5eb05e0a694ac1e80b45a3ce8deae7a73b5fa4ca2c48a4aef182b592eebbab04e7f232aaa4e2a13c414e42e6fca5e9523134cc8d92a215bac736b38fd6c020731f29633611650f7dbb59deb71c63ecb6081a9be39052c401e0f4281d58b</KeyCode>" +
                   "</LicenseContract>"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            com.scichart.charting.visuals.SciChartSurface.setRuntimeLicenseKey("");
        } catch (Exception e) {
            Log.e("SciChart", "Error when setting the license", e);
        }
    }

    //BEGIN_DEMO_APPLICATION
    public Module getModule() {
        if (module == null) {
            module = initModule();
        }
        return module;
    }

    public ExampleSearchProvider getSearchProvider(Module module) {
        if (searchProvider == null) {
            searchProvider = initSearchProvider(module);
        }
        return searchProvider;
    }

    private Module initModule() {
        final Module module = new Module(getApplicationContext());
        module.initialize();
        return module;
    }

    private ExampleSearchProvider initSearchProvider(Module module) {
        if (module != null) {
            return new ExampleSearchProvider(getApplicationContext(), module.getExamples());
        }
        return null;
    }
    //END_DEMO_APPLICATION
}
