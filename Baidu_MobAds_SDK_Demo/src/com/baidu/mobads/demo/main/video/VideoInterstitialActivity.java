package com.baidu.mobads.demo.main.video;

import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.baidu.mobads.AdSize;
import com.baidu.mobads.AdView;
import com.baidu.mobads.AdViewListener;
import com.baidu.mobads.demo.main.R;

public class VideoInterstitialActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams. FLAG_FULLSCREEN ,
		              WindowManager.LayoutParams. FLAG_FULLSCREEN);
		setContentView(R.layout.videointerstitial);
		
		final LinearLayout mainL = (LinearLayout)findViewById(R.id.videointerstitiallinear);
		
		//创建前贴片视频广告，AdSize.VideoInterstitial；广告位ID为null(广告位为""或者null时，表示默认广告位)
		final AdView adView=new AdView(this, AdSize.VideoInterstitial, null);
		//设置监听接口，当视频播放完时，将视图彻底移除。
		adView.setListener(new AdViewListener(){

			@Override
			public void onAdClick(JSONObject arg0) {
				
			}

			@Override
			public void onAdFailed(String arg0) {
				
			}

			@Override
			public void onAdReady(AdView arg0) {
				
			}

			@Override
			public void onAdShow(JSONObject arg0) {
				
			}

			@Override
			public void onAdSwitch() {
				
			}

			@Override
			public void onVideoClickAd() {
				Log.i("Demo", "onVideoClickAd");
			}

			@Override
			public void onVideoClickClose() {
				Log.i("Demo", "onVideoClickClose");
			}

			@Override
			public void onVideoClickReplay() {
				Log.i("Demo", "onVideoClickReplay");
			}

			@Override
			public void onVideoError() {
				Log.i("Demo", "onVideoError");
			}

			@Override
			public void onVideoFinish() {
				Log.i("Demo", "onVideoFinish");
				//检测到播放完成后移除广告
				mainL.removeView(adView);
			}

			@Override
			public void onVideoStart() {
				Log.i("Demo", "onVideoStart");
			}
			
		});
		mainL.addView(adView,new LinearLayout.LayoutParams(-1,-1));
		
	}
}
