package com.baidu.mobads.demo.main.video;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.baidu.mobads.MultiFuncService;
import com.baidu.mobads.demo.main.R;

public class BaiduSDKVideoDemo extends Activity {
	private static final String VIDEO_DEMO = "Video Demo";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// requestWindowFeature(Window.FEATURE_NO_TITLE);
		// getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		// WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.videomain);

		Button btnInterstitial = (Button) this.findViewById(R.id.interstitial);
		btnInterstitial.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent itent = new Intent();
				itent.setClass(BaiduSDKVideoDemo.this, VideoInterstitialActivity.class);
				startActivity(itent);
			}

		});
		Button btnPause = (Button) this.findViewById(R.id.pause);
		btnPause.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent itent = new Intent();
				itent.setClass(BaiduSDKVideoDemo.this, VideoPauseActivity.class);
				startActivity(itent);
			}

		});
		Button btnSwitch = (Button) this.findViewById(R.id.viewswitch);
		btnSwitch.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent itent = new Intent();
				itent.setClass(BaiduSDKVideoDemo.this, VideoSwitchActivity.class);
				startActivity(itent);
			}

		});
		//videoPreLoad接受两个参数：
		//参数1、activity，
		//参数2、广告位ID，如果为""或者null,则指默认广告位
		MultiFuncService.getInstance(this).videoPreLoad(this, null);
	}
}

//                     /:) 