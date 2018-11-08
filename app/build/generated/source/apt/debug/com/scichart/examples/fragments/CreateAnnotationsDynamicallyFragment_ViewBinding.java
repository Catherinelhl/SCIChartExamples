// Generated code from Butter Knife. Do not modify!
package com.scichart.examples.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.scichart.charting.visuals.SciChartSurface;
import com.scichart.examples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CreateAnnotationsDynamicallyFragment_ViewBinding implements Unbinder {
  private CreateAnnotationsDynamicallyFragment target;

  private View view2131296333;

  @UiThread
  public CreateAnnotationsDynamicallyFragment_ViewBinding(final CreateAnnotationsDynamicallyFragment target,
      View source) {
    this.target = target;

    View view;
    target.surface = Utils.findRequiredViewAsType(source, R.id.chart, "field 'surface'", SciChartSurface.class);
    target.annotationTypeSelector = Utils.findRequiredViewAsType(source, R.id.annotationTypeSelector, "field 'annotationTypeSelector'", Spinner.class);
    view = Utils.findRequiredView(source, R.id.deleteAnnotation, "method 'deleteSelectedAnnotation'");
    view2131296333 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.deleteSelectedAnnotation();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    CreateAnnotationsDynamicallyFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.surface = null;
    target.annotationTypeSelector = null;

    view2131296333.setOnClickListener(null);
    view2131296333 = null;
  }
}
