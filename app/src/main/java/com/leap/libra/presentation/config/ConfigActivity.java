package com.leap.libra.presentation.config;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.leap.base.adapter.typeAdapter.MultiTypeAdapter;
import com.leap.base.adapter.typeAdapter.SingleTypeAdapter;
import com.leap.base.adapter.typeAdapter.widget.BaseViewAdapter;
import com.leap.base.data.base.BUcn;
import com.leap.base.util.ToastUtil;
import com.leap.libra.R;
import com.leap.libra.databinding.ActivityConfigBinding;
import com.leap.libra.presentation.base.BaseActivity;
import com.leap.libra.presentation.config.widget.ConfigUtil;

/**
 * ConfigActivity :
 * <p>
 * </> Created by ylwei on 2018/11/21.
 */
public class ConfigActivity extends BaseActivity {
  private ActivityConfigBinding binding;
  private MultiTypeAdapter adapter;

  @Override
  protected void initComponent() {
    binding = DataBindingUtil.setContentView(this, R.layout.activity_config);
    binding.setPresenter(new Presenter());
    initAdapter();
  }

  @Override
  protected View statusBarView() {
    return binding.immersionBar;
  }

  @Override
  protected void loadData(Bundle savedInstanceState) {
    adapter.addAll(ConfigUtil.getConfigList(), 1);
  }

  public class Presenter implements BaseViewAdapter.Presenter {

    public void onBack() {
      onBackPressed();
    }

    public void onItem(BUcn ucn) {
      ToastUtil.showSuccess(ucn.getName());
    }
  }

  private void initAdapter() {
    adapter = new MultiTypeAdapter(context);
    adapter.addViewTypeToLayoutMap(1, R.layout.item_config_list);
    adapter.setPresenter(new Presenter());
    binding.setAdapter(adapter);
  }
}
