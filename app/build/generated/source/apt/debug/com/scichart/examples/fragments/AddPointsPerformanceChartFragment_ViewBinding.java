// Generated code from Butter Knife. Do not modify!
package com.scichart.examples.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.scichart.charting.visuals.SciChartSurface;
import com.scichart.examples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddPointsPerformanceChartFragment_ViewBinding implements Unbinder {
  private AddPointsPerformanceChartFragment target;

  private View view2131296293;

  private View view2131296292;

  private View view2131296294;

  private View view2131296430;

  @UiThread
  public AddPointsPerformanceChartFragment_ViewBinding(final AddPointsPerformanceChartFragment target,
      View source) {
    this.target = target;

    View view;
    target.surface = Utils.findRequiredViewAsType(source, R.id.chart, "field 'surface'", SciChartSurface.class);
    view = Utils.findRequiredView(source, R.id.append10k, "method 'onAppend10KPoints'");
    view2131296293 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAppend10KPoints();
      }
    });
    view = Utils.findRequiredView(source, R.id.append100k, "method 'onAppend100KPoints'");
    view2131296292 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAppend100KPoints();
      }
    });
    view = Utils.findRequiredView(source, R.id.appendMLN, "method 'onAppendMLNPoints'");
    view2131296294 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAppendMLNPoints();
      }
    });
    view = Utils.findRequiredView(source, R.id.reset, "method 'onReset'");
    view2131296430 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onReset();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AddPointsPerformanceChartFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.surface = null;

    view2131296293.setOnClickListener(null);
    view2131296293 = null;
    view2131296292.setOnClickListener(null);
    view2131296292 = null;
    view2131296294.setOnClickListener(null);
    view2131296294 = null;
    view2131296430.setOnClickListener(null);
    view2131296430 = null;
  }
}
