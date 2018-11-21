package com.leap.libra.presentation.main;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.leap.grade.util.BaseBarActivity;
import com.leap.libra.R;
import com.leap.libra.databinding.ActivityMainBinding;
import com.leap.libra.presentation.config.ConfigActivity;

/**
 * MainActivity :
 * <p>
 * </> Created by ylwei on 2018/11/21.
 */
public class MainActivity extends BaseBarActivity {
  private ActivityMainBinding binding;

  @Override
  protected void initComponent() {
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    binding.setPresenter(new Presenter());
  }

  @Override
  protected View statusBarView() {
    return binding.immersionBar;
  }

  @Override
  protected void loadData(Bundle savedInstanceState) {
  }

  public class Presenter {

    public void onBack() {
      onBackPressed();
    }

    public void onConfig() {
      Intent intent = new Intent(context, ConfigActivity.class);
      startActivity(intent);
    }
  }
}
