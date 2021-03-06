// Generated code from Butter Knife. Do not modify!
package com.scichart.examples.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.scichart.charting.visuals.SciChartHeatmapColourMap;
import com.scichart.charting.visuals.SciChartSurface;
import com.scichart.examples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HeatmapWithTextFragment_ViewBinding implements Unbinder {
  private HeatmapWithTextFragment target;

  @UiThread
  public HeatmapWithTextFragment_ViewBinding(HeatmapWithTextFragment target, View source) {
    this.target = target;

    target.chart = Utils.findRequiredViewAsType(source, R.id.chart, "field 'chart'", SciChartSurface.class);
    target.colourMap = Utils.findRequiredViewAsType(source, R.id.heatmapColourMap, "field 'colourMap'", SciChartHeatmapColourMap.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HeatmapWithTextFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.chart = null;
    target.colourMap = null;
  }
}
