package com.leap.libra.presentation.hybrid;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.leap.libra.R;
import com.leap.libra.databinding.ActivityHybridBinding;
import com.leap.libra.presentation.base.BaseActivity;
import com.leap.libra.presentation.hybrid.widget.HybridUtil;

/**
 * HybridActivity :
 * <p>
 * </> Created by ylwei on 2018/11/30.
 */
public class HybridActivity extends BaseActivity {
  private ActivityHybridBinding binding;

  @Override
  protected void initComponent() {
    binding = DataBindingUtil.setContentView(this, R.layout.activity_hybrid);
  }

  @Override
  protected View statusBarView() {
    return binding.immersionBar;
  }

  @Override
  protected void loadData(Bundle savedInstanceState) {
    initVebView();
  }

  private void initVebView() {
    binding.webView.loadUrl(HybridUtil.index);
  }

  public class Presenter {

    public void onBack() {

    }
  }
}
