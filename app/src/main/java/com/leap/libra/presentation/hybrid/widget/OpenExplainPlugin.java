package com.leap.libra.presentation.hybrid.widget;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;

import com.leap.base.util.GsonUtil;
import com.leap.base.util.IsEmpty;
import com.leap.base.util.ToastUtil;

import java.util.HashMap;

/**
 * OpenExplainPlugin : 开户模块H5 JS交互
 * <p>
 * </> Created by ylwei on 2018/5/21.
 */
public class OpenExplainPlugin {
  private Context context;

  public OpenExplainPlugin(Context context) {
    this.context = context;
  }

  @JavascriptInterface
  public void postMessage(String method, String params, String handler) {
    if (IsEmpty.string(method))
      return;
    if ("sendMail".equals(method)) {
      ToastUtil.showSuccess(method);
    } else if ("call".equals(method)) {
      String temp = getValue(params, "tel");
      // if (!IsEmpty.string(temp))
      // CommonUtil.dial(context, temp);
    } else if ("openUrl".equals(method)) {
      openOutUrl(params);
    } else if ("pushPage".equals(method)) {
      ToastUtil.showSuccess(method);
    }
  }

  // @JavascriptInterface必须添加，这样才可以标志这个类的名称是 button
  // 在android4.2之前不需要添加，在4.2之后需要添加
  @JavascriptInterface
  public String toString() {
    return "nativeHandle";
  }

  private void openOutUrl(String params) {
    String temp = getValue(params, "url");
    if (IsEmpty.string(temp))
      return;
    HybridUtil.openOutUrl(context, temp);
  }

  private String getValue(String json, String key) {
    try {
      if (!IsEmpty.string(json)) {
        HashMap map = GsonUtil.parse(json, HashMap.class);
        return map.get(key).toString();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  // 启动target页面
  private void startActivity(String params) {
    String temp = getValue(params, "target");
    try {
      Class cla = Class.forName("com.qianfan123.laya.presentation.paybox." + temp + "Activity");
      context.startActivity(new Intent(context, cla));
    } catch (Exception ignored) {
    }
  }
}
