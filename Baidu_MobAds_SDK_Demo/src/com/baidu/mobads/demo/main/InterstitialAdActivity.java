package com.baidu.mobads.demo.main;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.baidu.mobads.InterstitialAd;
import com.baidu.mobads.InterstitialAdListener;
import com.baidu.mobads.demo.main.R;

public class InterstitialAdActivity extends Activity {
	InterstitialAd interAd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.interstitialad);
		interAd=new InterstitialAd(this);
		interAd.setListener(new InterstitialAdListener(){

			@Override
			public void onAdClick(InterstitialAd arg0) {
				Log.i("InterstitialAd","onAdClick");
			}

			@Override
			public void onAdDismissed() {
				Log.i("InterstitialAd","onAdDismissed");
				interAd.loadAd();
			}

			@Override
			public void onAdFailed(String arg0) {
				Log.i("InterstitialAd","onAdFailed");
			}

			@Override
			public void onAdPresent() {
				Log.i("InterstitialAd","onAdPresent");
			}

			@Override
			public void onAdReady() {
				Log.i("InterstitialAd","onAdReady");
			}
			
		});
		interAd.loadAd();
		
		Button btn=(Button)this.findViewById(R.id.btn_interstitial);
		btn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View arg0) {
				if(interAd.isAdReady()){
					interAd.showAd(InterstitialAdActivity.this);
				}else{
					interAd.loadAd();
				}
			}
		});
	}
}
