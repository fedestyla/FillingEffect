package it.federico.com.fillingeffect.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import it.federico.com.fillingeffect.listener.ScrollViewListener;


public class ObservableScrollView extends ScrollView {

	private ScrollViewListener mScrollViewListener = null;
	private boolean mIsEnabled = true;

	public ObservableScrollView(Context context) {
		super(context);
	}

	public ObservableScrollView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public ObservableScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public void setScrollViewListener(ScrollViewListener scrollViewListener) {
		this.mScrollViewListener = scrollViewListener;
	}

	public boolean isEnabled() {
		return mIsEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.mIsEnabled = isEnabled;
	}

	@Override
	protected void onScrollChanged(int x, int y, int oldx, int oldy) {
		super.onScrollChanged(x, y, oldx, oldy);

		if (mScrollViewListener != null) {
			mScrollViewListener.onScrollChanged(this, x, y, oldx, oldy);
		}
	}

	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		if (mIsEnabled) {
			if (ev.getAction() == MotionEvent.ACTION_UP) {
				if (mScrollViewListener != null) {
					mScrollViewListener.onEndScroll(this);
					return false;
				}
			}
			return super.onTouchEvent(ev);
		} else {
			return false;
		}
	}

}