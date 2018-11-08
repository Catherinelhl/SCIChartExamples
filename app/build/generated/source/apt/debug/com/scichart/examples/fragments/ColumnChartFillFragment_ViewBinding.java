// Generated code from Butter Knife. Do not modify!
package com.scichart.examples.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.ToggleButton;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.scichart.charting.visuals.SciChartSurface;
import com.scichart.examples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ColumnChartFillFragment_ViewBinding implements Unbinder {
  private ColumnChartFillFragment target;

  private View view2131296357;

  private View view2131296515;

  private View view2131296437;

  @UiThread
  public ColumnChartFillFragment_ViewBinding(final ColumnChartFillFragment target, View source) {
    this.target = target;

    View view;
    target.surface = Utils.findRequiredViewAsType(source, R.id.chart, "field 'surface'", SciChartSurface.class);
    view = Utils.findRequiredView(source, R.id.fillList, "field 'fillSpinner' and method 'onFillStyleSelected'");
    target.fillSpinner = Utils.castView(view, R.id.fillList, "field 'fillSpinner'", Spinner.class);
    view2131296357 = view;
    ((AdapterView<?>) view).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> p0, View p1, int p2, long p3) {
        target.onFillStyleSelected(p2);
      }

      @Override
      public void onNothingSelected(AdapterView<?> p0) {
      }
    });
    view = Utils.findRequiredView(source, R.id.textureMappingModesList, "field 'textureMappingModesSpinner' and method 'onTextureMappingModeSelected'");
    target.textureMappingModesSpinner = Utils.castView(view, R.id.textureMappingModesList, "field 'textureMappingModesSpinner'", Spinner.class);
    view2131296515 = view;
    ((AdapterView<?>) view).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
      @Override
      public void onItemSelected(AdapterView<?> p0, View p1, int p2, long p3) {
        target.onTextureMappingModeSelected(p2);
      }

      @Override
      public void onNothingSelected(AdapterView<?> p0) {
      }
    });
    view = Utils.findRequiredView(source, R.id.rotate, "field 'rotateChartButton' and method 'onRotateButtonClicked'");
    target.rotateChartButton = Utils.castView(view, R.id.rotate, "field 'rotateChartButton'", ToggleButton.class);
    view2131296437 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onRotateButtonClicked(Utils.castParam(p0, "doClick", 0, "onRotateButtonClicked", 0, ToggleButton.class));
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ColumnChartFillFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.surface = null;
    target.fillSpinner = null;
    target.textureMappingModesSpinner = null;
    target.rotateChartButton = null;

    ((AdapterView<?>) view2131296357).setOnItemSelectedListener(null);
    view2131296357 = null;
    ((AdapterView<?>) view2131296515).setOnItemSelectedListener(null);
    view2131296515 = null;
    view2131296437.setOnClickListener(null);
    view2131296437 = null;
  }
}
