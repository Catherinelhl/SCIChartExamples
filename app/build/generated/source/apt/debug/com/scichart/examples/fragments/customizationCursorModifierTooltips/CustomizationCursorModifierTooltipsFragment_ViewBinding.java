// Generated code from Butter Knife. Do not modify!
package com.scichart.examples.fragments.customizationCursorModifierTooltips;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.scichart.charting.visuals.SciChartSurface;
import com.scichart.examples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CustomizationCursorModifierTooltipsFragment_ViewBinding implements Unbinder {
  private CustomizationCursorModifierTooltipsFragment target;

  @UiThread
  public CustomizationCursorModifierTooltipsFragment_ViewBinding(CustomizationCursorModifierTooltipsFragment target,
      View source) {
    this.target = target;

    target.surface = Utils.findRequiredViewAsType(source, R.id.chart, "field 'surface'", SciChartSurface.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CustomizationCursorModifierTooltipsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.surface = null;
  }
}
