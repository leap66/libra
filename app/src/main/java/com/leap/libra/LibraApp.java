package com.leap.libra;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.support.multidex.MultiDexApplication;

import com.leap.base.mgr.BaseMgr;

/**
 * LibraApp :
 * <p>
 * </> Created by ylwei on 2018/11/21.
 */
public class LibraApp extends MultiDexApplication {

  @Override
  public void onCreate() {
    super.onCreate();
    BaseMgr.init(this);
  }

  @Override
  public void onTerminate() {
    super.onTerminate();
  }

  @Override
  public void onLowMemory() {
    super.onLowMemory();
  }

  @SuppressLint("SwitchIntDef")
  @Override
  public void onTrimMemory(int level) {
    super.onTrimMemory(level);
    switch (level) {
    case TRIM_MEMORY_UI_HIDDEN:
      break;
    case TRIM_MEMORY_COMPLETE:
      break;
    }
  }

  @Override
  public void onConfigurationChanged(Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
  }

}
