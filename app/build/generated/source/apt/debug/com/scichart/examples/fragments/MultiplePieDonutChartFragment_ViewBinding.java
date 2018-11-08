// Generated code from Butter Knife. Do not modify!
package com.scichart.examples.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.scichart.charting.visuals.SciPieChartSurface;
import com.scichart.charting.visuals.legend.SciChartLegend;
import com.scichart.examples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MultiplePieDonutChartFragment_ViewBinding implements Unbinder {
  private MultiplePieDonutChartFragment target;

  @UiThread
  public MultiplePieDonutChartFragment_ViewBinding(MultiplePieDonutChartFragment target,
      View source) {
    this.target = target;

    target.pieChartSurface = Utils.findRequiredViewAsType(source, R.id.pieChart, "field 'pieChartSurface'", SciPieChartSurface.class);
    target.legend = Utils.findRequiredViewAsType(source, R.id.pieChartLegend, "field 'legend'", SciChartLegend.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MultiplePieDonutChartFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.pieChartSurface = null;
    target.legend = null;
  }
}
