package com.baidu.mobads.demo.main;

import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;

import com.baidu.mobads.AdSettings;
import com.baidu.mobads.AdView;
import com.baidu.mobads.AdViewListener;

public class SimpleCodingLayout extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 代码设置AppSid和Appsec，此函数必须在AdView实例化前调用
		// AdView.setAppSid("debug");
		// AdView.setAppSec("debug");

		// 人群属性
		AdSettings.setKey(new String[] { "baidu", "中 国 " });
		// AdSettings.setSex(AdSettings.Sex.FEMALE);
		// AdSettings.setBirthday(Calendar.getInstance());
		// AdSettings.setCity("上海");
		// AdSettings.setZip("123456");
		// AdSettings.setJob("工程师");
		// AdSettings.setEducation(AdSettings.Education.BACHELOR);
		// AdSettings.setSalary(AdSettings.Salary.F10kT15k);
		// AdSettings.setHob(new String[]{"羽毛球", "足球", "baseball"});
		// AdSettings.setUserAttr("k1","v1");
		// AdSettings.setUserAttr("k2","v2");

		RelativeLayout rlMain = new RelativeLayout(this);
		// 创建广告View
		AdView adView = new AdView(this);
		// 设置监听器
		adView.setListener(new AdViewListener() {
			public void onAdSwitch() {
				Log.w("", "onAdSwitch");
			}
			public void onAdShow(JSONObject info) {
				Log.w("", "onAdShow " + info.toString());
			}
			public void onAdReady(AdView adView) {
				Log.w("", "onAdReady " + adView);
			}
			public void onAdFailed(String reason) {
				Log.w("", "onAdFailed " + reason);
			}
			public void onAdClick(JSONObject info) {
				Log.w("", "onAdClick " + info.toString());
			}
			public void onVideoStart() {
				Log.w("", "onVideoStart");
			}
			public void onVideoFinish() {
				Log.w("", "onVideoFinish");
			}
			@Override
			public void onVideoClickAd() {
				Log.w("", "onVideoFinish");
			}
			@Override
			public void onVideoClickClose() {
				Log.w("", "onVideoFinish");
			}
			@Override
			public void onVideoClickReplay() {
				Log.w("", "onVideoFinish");
			}
			@Override
			public void onVideoError() {
				Log.w("", "onVideoFinish");
			}
		});
		rlMain.addView(adView);
		setContentView(rlMain);

	}
}