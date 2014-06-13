baidu-ads-sdk-android
=====================
百度移动推广SDK(Android)是百度官方推出的移动推广SDK在Android平台上的版本（以下简称SDK）.方便android java开发者通过百度广告盈利<br/>


###运行环境
可运行于Android 1.5（API Level 3）及以上版本。<br/>
百度一定联盟官方网站:http://munion.baidu.com/<br/>
sdk下载地址:https://github.com/baidumobad/baidu-ads-sdk-android<br/>

###baidu移动广告使用
1.百度移动联盟网站申请id(审核通过前用“debug”作为id测试)，创建android项目，导入jar包<br/>
2.修改AndroidManifest.xml配置添加activity，权限和标签数据，正式长传和发布时把meta-data删除或者把debug替换为在网站里申请到的id<br/>
```
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
<uses-permission android:name="android.permission.READ_PHONE_STATE"/>
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
<application>
	<meta-data android:name="BaiduMobAd_APP_ID" android:value="debug" /> 
	<meta-data android:name="BaiduMobAd_APP_SEC" android:value="debug" />
	 <activity android:name="com.baidu.mobads.AppActivity" android:configChanges="keyboard|keyboardHidden|orientation"/> 
</application>
```
3.修改添加代码,this是activity类型，下面是展示一个banner型广告
```
RelativeLayout layer = new RelativeLayout(this);
AdView.setAppSid(this, "debug");
AdView.setAppSec(this, "debug");
AdView adView = new AdView(this);
layer.addView(adView);
setContentView(layer);
```
4.展示全屏广告,this是activity类型
```
InterstitialAd.setAppSid(this, "debug");
InterstitialAd.setAppSec(this, "debug");
InterstitialAd	interAd=new InterstitialAd(this);
interAd.setListener(new InterstitialAdListener(){
	@Override
	public void onAdDismissed() {
		Log.i("InterstitialAd","onAdDismissed");
		interAd.loadAd();//在广告隐藏后重新加载广告
	}

	@Override
	public void onAdReady() {
		Log.i("InterstitialAd","onAdReady");
		interAd.showAd(InterstitialAdActivity.this);//在广告加载完成后显示广告
	}	
});
interAd.loadAd();//加载广告
```
4.如果要处理广告事件，可以像下面的方式处理
```
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
	});
```