package com.baidu.mobads.demo.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.baidu.mobads.demo.main.video.BaiduSDKVideoDemo;

public class BaiduSDKDemo extends Activity {
	Button advanced;
	Button simpleDeclaring;
	Button simpleCoding;
	Button simpleVideo;
	Button simpleInter;
	Button simpleIcon;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.main);

		simpleDeclaring = (Button) findViewById(R.id.simple_declaring);
		simpleDeclaring.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(simpleDeclaring.getContext(), SimpleDeclaringLayout.class);
				startActivity(intent);
			}
		});

		simpleCoding = (Button) findViewById(R.id.simple_coding);
		simpleCoding.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(simpleCoding.getContext(), SimpleCodingLayout.class);
				startActivity(intent);
			}
		});
		
		simpleVideo = (Button) findViewById(R.id.simple_video);
		simpleVideo.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(simpleVideo.getContext(), BaiduSDKVideoDemo.class);
				startActivity(intent);
			}
		});
		
		simpleInter = (Button) findViewById(R.id.simple_inters);
		simpleInter.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(simpleInter.getContext(), InterstitialAdActivity.class);
				startActivity(intent);
			}
		});
		
		simpleIcon = (Button) findViewById(R.id.simple_icon);
		simpleIcon.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(simpleIcon.getContext(), IconsAdActivity.class);
				startActivity(intent);
			}
		});
		
	}
}

//      /:~