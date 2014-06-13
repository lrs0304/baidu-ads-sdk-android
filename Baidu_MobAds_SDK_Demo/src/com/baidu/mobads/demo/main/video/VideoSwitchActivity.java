package com.baidu.mobads.demo.main.video;

import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.baidu.mobads.AdSize;
import com.baidu.mobads.AdView;
import com.baidu.mobads.AdViewListener;
import com.baidu.mobads.demo.main.R;

public class VideoSwitchActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.videoswitch);
		final RelativeLayout mainL=(RelativeLayout) findViewById(R.id.videoswitchrel);
		//创建切换视频广告，AdSize.VideoSwitch；广告位ID为null(广告位为""或者null时，表示默认广告位)
		final AdView adView = new AdView(this,AdSize.VideoSwitch,null);
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
				
			}

			@Override
			public void onVideoClickClose() {
				
			}

			@Override
			public void onVideoClickReplay() {
				
			}

			@Override
			public void onVideoError() {
				
			}

			@Override
			public void onVideoFinish() {
				
			}

			@Override
			public void onVideoStart() {
				
			}
			
		});
		RelativeLayout.LayoutParams adViewParams=new RelativeLayout.LayoutParams(-1, 300);
		adViewParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
		mainL.addView(adView, adViewParams);
		
		Button btnHideBanner = (Button) this.findViewById(R.id.btnHideBanner);
		btnHideBanner.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mainL.removeView(adView);
			}
		});
	}
}
