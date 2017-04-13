package jp.co.recruit.lifestyle.android.testandroid.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import jp.co.recruit.lifestyle.android.testandroid.R;

/**
 * Created by user on 2016/11/08.
 */
public class SplashActivity extends Activity {

	/** スプラッシュ表示時間 */
	private static final int DELAY_TIME = 3000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_activity);

		System.out.println(123);


		startActivityDelayed();
	}

	private void startActivityDelayed() {
		final Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			@Override
			public void run() {
				synchronized (this) {
					startActivity();
				}
			}
		}, DELAY_TIME);
	}

	private void startActivity() {
		synchronized (this) {
			Intent intent = new Intent(this, IndexActivity.class);
			startActivity(intent);
			finish();
		}
	}
}