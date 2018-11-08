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

public class HeatmapPaletteProviderFragment_ViewBinding implements Unbinder {
  private HeatmapPaletteProviderFragment target;

  @UiThread
  public HeatmapPaletteProviderFragment_ViewBinding(HeatmapPaletteProviderFragment target,
      View source) {
    this.target = target;

    target.chart = Utils.findRequiredViewAsType(source, R.id.chart, "field 'chart'", SciChartSurface.class);
    target.seekBar = Utils.findRequiredViewAsType(source, R.id.seekBar, "field 'seekBar'", SeekBar.class);
    target.thresholdValue = Utils.findRequiredViewAsType(source, R.id.thresholdValue, "field 'thresholdValue'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HeatmapPaletteProviderFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.chart = null;
    target.seekBar = null;
    target.thresholdValue = null;
  }
}
