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

public class CreateMultiPaneStockChartsFragment_ViewBinding implements Unbinder {
  private CreateMultiPaneStockChartsFragment target;

  @UiThread
  public CreateMultiPaneStockChartsFragment_ViewBinding(CreateMultiPaneStockChartsFragment target,
      View source) {
    this.target = target;

    target.priceChart = Utils.findRequiredViewAsType(source, R.id.priceChart, "field 'priceChart'", SciChartSurface.class);
    target.macdChart = Utils.findRequiredViewAsType(source, R.id.macdChart, "field 'macdChart'", SciChartSurface.class);
    target.rsiChart = Utils.findRequiredViewAsType(source, R.id.rsiChart, "field 'rsiChart'", SciChartSurface.class);
    target.volumeChart = Utils.findRequiredViewAsType(source, R.id.volumeChart, "field 'volumeChart'", SciChartSurface.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CreateMultiPaneStockChartsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.priceChart = null;
    target.macdChart = null;
    target.rsiChart = null;
    target.volumeChart = null;
  }
}
