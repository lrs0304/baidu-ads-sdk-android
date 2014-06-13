package com.baidu.mobads.demo.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;

import com.baidu.mobads.SplashAd;
import com.baidu.mobads.SplashAdListener;

public class SplashActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		RelativeLayout adsParent=(RelativeLayout)this.findViewById(R.id.adsRl);
		SplashAd splashAd=new SplashAd(this,adsParent,new SplashAdListener(){
			@Override
			public void onAdDismissed() {
				Log.i("SplashActivity", "onAdDismissed");
				jump();//跳转至您的应用主界面
			}
			@Override
			public void onAdFailed(String arg0) {
				Log.i("SplashActivity", "onAdDismissed");
			}
			@Override
			public void onAdPresent() {
				Log.i("SplashActivity", "onAdDismissed");
			}
		});
	}
	private void jump() {
		this.startActivity(new Intent(SplashActivity.this, BaiduSDKDemo.class));
		this.finish();
	}
	
	
}
