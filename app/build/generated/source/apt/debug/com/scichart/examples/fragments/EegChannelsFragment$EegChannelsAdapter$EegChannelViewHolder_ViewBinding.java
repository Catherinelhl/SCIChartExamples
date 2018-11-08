// Generated code from Butter Knife. Do not modify!
package com.scichart.examples.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.scichart.charting.visuals.SciChartSurface;
import com.scichart.examples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EegChannelsFragment$EegChannelsAdapter$EegChannelViewHolder_ViewBinding implements Unbinder {
  private EegChannelsFragment.EegChannelsAdapter.EegChannelViewHolder target;

  @UiThread
  public EegChannelsFragment$EegChannelsAdapter$EegChannelViewHolder_ViewBinding(EegChannelsFragment.EegChannelsAdapter.EegChannelViewHolder target,
      View source) {
    this.target = target;

    target.chart = Utils.findRequiredViewAsType(source, R.id.eegChart, "field 'chart'", SciChartSurface.class);
    target.channelName = Utils.findRequiredViewAsType(source, R.id.channelName, "field 'channelName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EegChannelsFragment.EegChannelsAdapter.EegChannelViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.chart = null;
    target.channelName = null;
  }
}
