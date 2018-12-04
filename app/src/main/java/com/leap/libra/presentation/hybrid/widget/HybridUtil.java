package com.leap.libra.presentation.hybrid.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * HybridUtil :
 * <p>
 * </> Created by ylwei on 2018/11/23.
 */
public class HybridUtil {
  public static String url = "https://portal.qianfan123.com/dpos/prod/vue/static/app/OpenNotice.html";
  public static String testUrl = "http://soft.imtt.qq.com/browser/tes/feedback.html";
  public static String index = "file:///android_asset/index.html";
  public static String hybrid = "file:///android_asset/hybrid.html";

  // 打开外部浏览器
  public static void openOutUrl(Context context, String url) {
    Intent intent = new Intent();
    intent.setAction("android.intent.action.VIEW");
    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    Uri content_url = Uri.parse(url);
    intent.setData(content_url);
    context.startActivity(intent);
  }
}
