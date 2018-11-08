// Generated code from Butter Knife. Do not modify!
package com.scichart.examples.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.scichart.charting.visuals.SciChartSurface;
import com.scichart.examples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ThemeProviderFragment_ViewBinding implements Unbinder {
  private ThemeProviderFragment target;

  @UiThread
  public ThemeProviderFragment_ViewBinding(ThemeProviderFragment target, View source) {
    this.target = target;

    target.surface = Utils.findRequiredViewAsType(source, R.id.chart, "field 'surface'", SciChartSurface.class);
    target.themeSelector = Utils.findRequiredViewAsType(source, R.id.themeSelector, "field 'themeSelector'", Spinner.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ThemeProviderFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.surface = null;
    target.themeSelector = null;
  }
}
