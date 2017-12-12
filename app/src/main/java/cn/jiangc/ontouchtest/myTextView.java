package cn.jiangc.ontouchtest;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/12/12.
 */

public class myTextView extends android.support.v7.widget.AppCompatTextView {
    private String TAG = "myTextView";
    public myTextView(Context context) {
        super(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "dispatchTouchEvent----------MotionEvent.ACTION_DOWN" );
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "dispatchTouchEvent----------MotionEvent.ACTION_MOVE" );
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "dispatchTouchEvent----------MotionEvent.ACTION_UP" );
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "dispatchTouchEvent----------MotionEvent.ACTION_CANCEL" );
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "onTouchEvent----------MotionEvent.ACTION_DOWN" );
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "onTouchEvent----------MotionEvent.ACTION_MOVE" );
                break;
            case MotionEvent.ACTION_UP:
                Log.e(TAG, "onTouchEvent----------MotionEvent.ACTION_UP" );
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "onTouchEvent----------MotionEvent.ACTION_CANCEL" );
                break;
        }
        return super.onTouchEvent(event);
    }

}
