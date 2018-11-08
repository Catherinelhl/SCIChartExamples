// Generated code from Butter Knife. Do not modify!
package com.scichart.examples.fragments.testing;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.scichart.examples.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RenderSurfaceSandboxFragment_ViewBinding implements Unbinder {
  private RenderSurfaceSandboxFragment target;

  private View view2131296426;

  @UiThread
  public RenderSurfaceSandboxFragment_ViewBinding(final RenderSurfaceSandboxFragment target,
      View source) {
    this.target = target;

    View view;
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
    target.renderSurfaceFrame = Utils.findRequiredViewAsType(source, R.id.rendersurfaceFrame, "field 'renderSurfaceFrame'", FrameLayout.class);
    target.rotation = Utils.findRequiredViewAsType(source, R.id.rotation, "field 'rotation'", SeekBar.class);
    target.translateX = Utils.findRequiredViewAsType(source, R.id.translateX, "field 'translateX'", SeekBar.class);
    target.translateY = Utils.findRequiredViewAsType(source, R.id.translateY, "field 'translateY'", SeekBar.class);
    target.opacity = Utils.findRequiredViewAsType(source, R.id.opacity, "field 'opacity'", SeekBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RenderSurfaceSandboxFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.renderSurfaceTypeSpinner = null;
    target.renderSurfaceFrame = null;
    target.rotation = null;
    target.translateX = null;
    target.translateY = null;
    target.opacity = null;

    ((AdapterView<?>) view2131296426).setOnItemSelectedListener(null);
    view2131296426 = null;
  }
}
