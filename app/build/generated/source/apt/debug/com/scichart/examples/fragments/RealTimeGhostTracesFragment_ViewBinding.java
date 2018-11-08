// Generated code from Butter Knife. Do not modify!
package com.scichart.examples.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.scichart.charting.visuals.SciChartSurface;
import com.scichart.examples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RealTimeGhostTracesFragment_ViewBinding implements Unbinder {
  private RealTimeGhostTracesFragment target;

  @UiThread
  public RealTimeGhostTracesFragment_ViewBinding(RealTimeGhostTracesFragment target, View source) {
    this.target = target;

    target.seekBar = Utils.findRequiredViewAsType(source, R.id.seekBar, "field 'seekBar'", SeekBar.class);
    target.speedValue = Utils.findRequiredViewAsType(source, R.id.speedValue, "field 'speedValue'", TextView.class);
    target.surface = Utils.findRequiredViewAsType(source, R.id.chart, "field 'surface'", SciChartSurface.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RealTimeGhostTracesFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.seekBar = null;
    target.speedValue = null;
    target.surface = null;
  }
}
