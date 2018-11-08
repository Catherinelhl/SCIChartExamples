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

public class AnimatingLineChartFragment_ViewBinding implements Unbinder {
  private AnimatingLineChartFragment target;

  @UiThread
  public AnimatingLineChartFragment_ViewBinding(AnimatingLineChartFragment target, View source) {
    this.target = target;

    target.surface = Utils.findRequiredViewAsType(source, R.id.chart, "field 'surface'", SciChartSurface.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AnimatingLineChartFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.surface = null;
  }
}
