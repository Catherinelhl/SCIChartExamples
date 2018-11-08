// Generated code from Butter Knife. Do not modify!
package com.scichart.examples.fragments.testing;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.scichart.charting.visuals.SciChartSurface;
import com.scichart.examples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AnimationsTestFragment_ViewBinding implements Unbinder {
  private AnimationsTestFragment target;

  @UiThread
  public AnimationsTestFragment_ViewBinding(AnimationsTestFragment target, View source) {
    this.target = target;

    target.scale = Utils.findRequiredViewAsType(source, R.id.scale, "field 'scale'", Button.class);
    target.wave = Utils.findRequiredViewAsType(source, R.id.wave, "field 'wave'", Button.class);
    target.sweep = Utils.findRequiredViewAsType(source, R.id.sweep, "field 'sweep'", Button.class);
    target.translateX = Utils.findRequiredViewAsType(source, R.id.translateX, "field 'translateX'", Button.class);
    target.translateY = Utils.findRequiredViewAsType(source, R.id.translateY, "field 'translateY'", Button.class);
    target.seriesSelector = Utils.findRequiredViewAsType(source, R.id.seriesSelector, "field 'seriesSelector'", Spinner.class);
    target.surface = Utils.findRequiredViewAsType(source, R.id.chart, "field 'surface'", SciChartSurface.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AnimationsTestFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.scale = null;
    target.wave = null;
    target.sweep = null;
    target.translateX = null;
    target.translateY = null;
    target.seriesSelector = null;
    target.surface = null;
  }
}
