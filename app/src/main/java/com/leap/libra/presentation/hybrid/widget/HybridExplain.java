package com.leap.libra.presentation.hybrid.widget;

import com.leap.base.data.base.BEntity;

/**
 * HybridExplain :
 * <p>
 * </> Created by ylwei on 2018/11/23.
 */
public class HybridExplain extends BEntity {
  private String title;
  private String url;
  private String explain;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getExplain() {
    return explain;
  }

  public void setExplain(String explain) {
    this.explain = explain;
  }
}
