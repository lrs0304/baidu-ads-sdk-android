package com.baidu.mobads.demo.main;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.baidu.mobads.IconsAd;

public class IconsAdActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		RelativeLayout rlMain=new RelativeLayout(this);
		setContentView(rlMain);
//		调用方式1： 不传drawable，则使用默认图标
//		IconsAd iconsAd=new IconsAd(this);
		
//		调用方式2： 传入1个R.drawable资源，表示自定义浮标;
//		浮标会缩放到：42dip * 48dip, 即宽高比:7:8，建议适当留白以增加点击范围
//		IconsAd iconsAd=new IconsAd(this,new int[]{R.drawable.ico_xp});
		
//		调用方式3： 传入2个R.drawable资源，第二个为自定义轮盘收起按钮；
//		收起按钮 会缩放到： (屏幕窄边)/6 * (屏幕窄边)/4, 即宽高比：2:3
//		IconsAd iconsAd=new IconsAd(this,new int[]{R.drawable.mp_icon, R.drawable.mp_close });
		IconsAd iconsAd=new IconsAd(this,new int[]{R.drawable.music, R.drawable.music_close });
		iconsAd.loadAd(this);
	}
}

