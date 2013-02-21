package andrei.android.androidtechtalks.optimizingtheui;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;

public class MainActivity extends Activity {

	boolean isVisible = false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main1);
	}
	
	/*@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (!isVisible) {
			((ViewStub) findViewById(R.id.stub_import)).setVisibility(View.VISIBLE);
			isVisible = true;
		}
		return super.onTouchEvent(event);
	}*/

}
