// Generated code from Butter Knife. Do not modify!
package com.scichart.examples.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.scichart.charting.visuals.SciChartSurface;
import com.scichart.examples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SyncMultipleChartsFragment_ViewBinding implements Unbinder {
  private SyncMultipleChartsFragment target;

  @UiThread
  public SyncMultipleChartsFragment_ViewBinding(SyncMultipleChartsFragment target, View source) {
    this.target = target;

    target.chart0 = Utils.findRequiredViewAsType(source, R.id.chart0, "field 'chart0'", SciChartSurface.class);
    target.chart1 = Utils.findRequiredViewAsType(source, R.id.chart1, "field 'chart1'", SciChartSurface.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SyncMultipleChartsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.chart0 = null;
    target.chart1 = null;
  }
}
