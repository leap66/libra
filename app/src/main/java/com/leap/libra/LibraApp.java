package com.leap.libra;

import android.support.multidex.MultiDexApplication;

import com.leap.base.mgr.ContextMgr;

/**
 * LibraApp :
 * <p>
 * </> Created by ylwei on 2018/11/21.
 */
public class LibraApp extends MultiDexApplication {

  @Override
  public void onCreate() {
    super.onCreate();
    ContextMgr.init(this);
  }
}
