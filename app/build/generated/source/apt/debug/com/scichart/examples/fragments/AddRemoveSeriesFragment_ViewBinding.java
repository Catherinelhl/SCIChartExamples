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

public class AddRemoveSeriesFragment_ViewBinding implements Unbinder {
  private AddRemoveSeriesFragment target;

  private View view2131296284;

  private View view2131296425;

  private View view2131296430;

  @UiThread
  public AddRemoveSeriesFragment_ViewBinding(final AddRemoveSeriesFragment target, View source) {
    this.target = target;

    View view;
    target.surface = Utils.findRequiredViewAsType(source, R.id.chart, "field 'surface'", SciChartSurface.class);
    view = Utils.findRequiredView(source, R.id.addSeries, "method 'onAddSeries'");
    view2131296284 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onAddSeries();
      }
    });
    view = Utils.findRequiredView(source, R.id.removeSeries, "method 'onRemoveSeries'");
    view2131296425 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRemoveSeries();
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
    AddRemoveSeriesFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.surface = null;

    view2131296284.setOnClickListener(null);
    view2131296284 = null;
    view2131296425.setOnClickListener(null);
    view2131296425 = null;
    view2131296430.setOnClickListener(null);
    view2131296430 = null;
  }
}
