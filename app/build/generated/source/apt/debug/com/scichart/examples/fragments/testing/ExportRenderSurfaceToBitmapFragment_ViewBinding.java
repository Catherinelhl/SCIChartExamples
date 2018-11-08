// Generated code from Butter Knife. Do not modify!
package com.scichart.examples.fragments.testing;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.scichart.charting.visuals.SciChartSurface;
import com.scichart.examples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ExportRenderSurfaceToBitmapFragment_ViewBinding implements Unbinder {
  private ExportRenderSurfaceToBitmapFragment target;

  private View view2131296426;

  private View view2131296516;

  private View view2131296354;

  private View view2131296355;

  @UiThread
  public ExportRenderSurfaceToBitmapFragment_ViewBinding(final ExportRenderSurfaceToBitmapFragment target,
      View source) {
    this.target = target;

    View view;
    target.surface = Utils.findRequiredViewAsType(source, R.id.chart, "field 'surface'", SciChartSurface.class);
    target.imageView = Utils.findRequiredViewAsType(source, R.id.chartImage, "field 'imageView'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.renderSurfaceTypeSpinner, "field 'renderSurfaceTypeSpinner' and method 'onRenderSurfaceTypeSelected'");
    target.renderSurfaceTypeSpinner = Utils.castView(view, R.id.renderSurfaceTypeSpinner, "field 'renderSurfaceTypeSpinner'", Spinner.class);
    view2131296426 = view;
    ((AdapterView<?>) view).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> p0, View p1, int p2, long p3) {
        target.onRenderSurfaceTypeSelected(p2);
      }

      @Override
      public void onNothingSelected(AdapterView<?> p0) {
      }
    });
    view = Utils.findRequiredView(source, R.id.themeSelector, "field 'themeSelector' and method 'setTheme'");
    target.themeSelector = Utils.castView(view, R.id.themeSelector, "field 'themeSelector'", Spinner.class);
    view2131296516 = view;
    ((AdapterView<?>) view).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> p0, View p1, int p2, long p3) {
        target.setTheme(p2);
      }

      @Override
      public void onNothingSelected(AdapterView<?> p0) {
      }
    });
    view = Utils.findRequiredView(source, R.id.exportChart, "method 'exportChart'");
    view2131296354 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.exportChart();
      }
    });
    view = Utils.findRequiredView(source, R.id.exportChartInMemory, "method 'exportChartInMemory'");
    view2131296355 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.exportChartInMemory();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ExportRenderSurfaceToBitmapFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.surface = null;
    target.imageView = null;
    target.renderSurfaceTypeSpinner = null;
    target.themeSelector = null;

    ((AdapterView<?>) view2131296426).setOnItemSelectedListener(null);
    view2131296426 = null;
    ((AdapterView<?>) view2131296516).setOnItemSelectedListener(null);
    view2131296516 = null;
    view2131296354.setOnClickListener(null);
    view2131296354 = null;
    view2131296355.setOnClickListener(null);
    view2131296355 = null;
  }
}
