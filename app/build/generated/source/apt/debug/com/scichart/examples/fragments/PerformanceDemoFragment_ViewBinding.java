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

public class PerformanceDemoFragment_ViewBinding implements Unbinder {
  private PerformanceDemoFragment target;

  @UiThread
  public PerformanceDemoFragment_ViewBinding(PerformanceDemoFragment target, View source) {
    this.target = target;

    target.surface = Utils.findRequiredViewAsType(source, R.id.chart, "field 'surface'", SciChartSurface.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PerformanceDemoFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.surface = null;
  }
}
