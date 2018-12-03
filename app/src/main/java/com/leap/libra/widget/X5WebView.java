package com.leap.libra.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;

import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

/**
 * X5WebView :
 * <p>
 * </> Created by ylwei on 2018/11/23.
 */
public class X5WebView extends WebView {

  public X5WebView(Context context, AttributeSet attributeSet) {
    super(context, attributeSet);
    setWebClient();
    initWebViewSettings();
    setClickable(true);
  }

  private void setWebClient() {
    setWebViewClient(new WebViewClient() {
      // 防止加载网页时调起系统浏览器
      public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
      }
    });
  }

  @SuppressLint("SetJavaScriptEnabled")
  private void initWebViewSettings() {
    WebSettings webSetting = this.getSettings();
    webSetting.setJavaScriptEnabled(true);
    webSetting.setJavaScriptCanOpenWindowsAutomatically(true);
    webSetting.setAllowFileAccess(true);
    webSetting.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
    webSetting.setSupportZoom(true);
    webSetting.setBuiltInZoomControls(true);
    webSetting.setUseWideViewPort(true);
    webSetting.setSupportMultipleWindows(true);
    // webSetting.setLoadWithOverviewMode(true);
    webSetting.setAppCacheEnabled(true);
    // webSetting.setDatabaseEnabled(true);
    webSetting.setDomStorageEnabled(true);
    webSetting.setGeolocationEnabled(true);
    webSetting.setAppCacheMaxSize(Long.MAX_VALUE);
    // webSetting.setPageCacheCapacity(IX5WebSettings.DEFAULT_CACHE_CAPACITY);
    webSetting.setPluginState(WebSettings.PluginState.ON_DEMAND);
    // webSetting.setRenderPriority(WebSettings.RenderPriority.HIGH);
    webSetting.setCacheMode(WebSettings.LOAD_NO_CACHE);
  }
}
