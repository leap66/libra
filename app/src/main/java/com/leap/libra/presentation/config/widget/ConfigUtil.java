package com.leap.libra.presentation.config.widget;

import android.os.Build;

import com.leap.base.data.base.BUcn;
import com.leap.base.util.DateUtil;
import com.leap.base.util.DeviceInfoUtil;
import com.leap.libra.BuildConfig;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ConfigUtil :
 * <p>
 * </> Created by ylwei on 2018/11/21.
 */
public class ConfigUtil {

  public static List<BUcn> getConfigList() {
    List<BUcn> list = new ArrayList<>();
    list.add(new BUcn("", "制造商信息", Build.MANUFACTURER));
    list.add(new BUcn("", "设备信息", DeviceInfoUtil.getDeviceInfo()));
    list.add(new BUcn("", "屏幕分辨率", DeviceInfoUtil.getScreenResolution()));
    list.add(new BUcn("", "屏幕尺寸", DeviceInfoUtil.getPhoneSize()));
    list.add(new BUcn("", "唯一标识码", DeviceInfoUtil.getUDID()));
    list.add(new BUcn("", "当前时间", DateUtil.format(new Date(), DateUtil.DEFAULT_DATE_FORMAT)));
    list.add(new BUcn("", "本机mac地址", DeviceInfoUtil.getMacAddr()));
    list.add(new BUcn("", "设备IP", DeviceInfoUtil.getDeviceIP()));
    list.add(new BUcn("", "版本信息", BuildConfig.VERSION_NAME));
    list.add(new BUcn("", "屏幕类型 1- 横屏 0- 竖屏", DeviceInfoUtil.getScreenType()));
    list.add(new BUcn("", "路由mac地址", DeviceInfoUtil.getRouterMac()));
    list.add(new BUcn("", "系统版本", DeviceInfoUtil.getOsVersion()));
    list.add(new BUcn("", "sdk版本", DeviceInfoUtil.getSdkVersion()));
    list.add(new BUcn("", "wifiMac地址", DeviceInfoUtil.getWifiMac()));
    list.add(new BUcn("", "硬件配置信息", Build.HARDWARE));
    list.add(new BUcn("", "串行接口", Build.SERIAL));
    list.add(new BUcn("", "当前网络状态", DeviceInfoUtil.getNetworkType()));
    list.add(new BUcn("", "当前系统语言格式", DeviceInfoUtil.getSystemLanguage()));
    list.add(new BUcn("", "isRoot", String.valueOf(DeviceInfoUtil.isRoot())));
    list.add(new BUcn("", "运营商", DeviceInfoUtil.getOperators()));
    list.add(new BUcn("", "国际移动用户识别码", DeviceInfoUtil.getImei()));
    list.add(new BUcn("", "移动设备国际身份码", DeviceInfoUtil.getImsi()));
    return list;
  }

}
