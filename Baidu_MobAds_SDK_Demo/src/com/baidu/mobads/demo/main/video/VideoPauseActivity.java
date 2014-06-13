package com.baidu.mobads.demo.main.video;

import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

import com.baidu.mobads.AdSize;
import com.baidu.mobads.AdView;
import com.baidu.mobads.AdViewListener;
import com.baidu.mobads.demo.main.R;

public class VideoPauseActivity extends Activity {
	// private static final String TAG = VideoPauseActivity.class.getSimpleName();
	Button pause;
	Button close;
	Button action;
	boolean isPause = true;
	AdView adView;
	Activity context;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.videopause);

		action = (Button) findViewById(R.id.action);
		final LinearLayout mainL=(LinearLayout) findViewById(R.id.videopauselinear);
		
		action.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				isPause = !isPause;
				action.setText((isPause ? "Pause" : "Close"));

				if (!isPause) {
					//创建暂停视频广告，AdSize.VideoPause；广告位ID为debug_m1234567
					adView=new AdView(VideoPauseActivity.this, AdSize.VideoPause, "debug_m0000001");
					//设置播放背景为灰色
					adView.setBackgroundColor(0x7f888888);
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
							//MultiFuncService.getInstance(VideoPauseActivity.this).removeFromFloatView(VideoPauseActivity.this, adView);
							mainL.removeView(adView);
						}

						@Override
						public void onVideoStart() {
							Log.i("Demo", "onVideoStart");
						}
						
					});
					//MultiFuncService.getInstance(VideoPauseActivity.this).showInFloatView(VideoPauseActivity.this, adView, new Rect(0,100,240,300));
					mainL.addView(adView);
				} else {
					//MultiFuncService.getInstance(VideoPauseActivity.this).removeFromFloatView(VideoPauseActivity.this, adView);
					mainL.removeView(adView);
				}
			}
		});
	}
}
