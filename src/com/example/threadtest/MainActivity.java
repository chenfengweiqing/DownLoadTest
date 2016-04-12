package com.example.threadtest;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

class MainActivity extends Activity{
    private FrameLayout circleOne;
    private FrameLayout circleTwo;
    private FrameLayout circleThree;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		final LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//				LinearLayout.LayoutParams.WRAP_CONTENT,
//				LinearLayout.LayoutParams.WRAP_CONTENT);
//		circleOne = (FrameLayout) findViewById(R.id.circle_one);
//		circleTwo = (FrameLayout) findViewById(R.id.circle_two);
//		circleThree = (FrameLayout) findViewById(R.id.circle_three);
//		circleOne.addView(new MyView(this,null,Color.BLACK),params);
//		paintCircle(circleOne,Color.RED,params);
//		final Thread tr1 = new Thread(new Runnable(){
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				paintCircle(circleTwo,Color.GREEN,params);
//			}
//			
//		});
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//            	paintCircle(circleOne,Color.RED,params);
////            	tr1.start();
//            }
//        }, 2000);
	}
//	private void paintCircle(FrameLayout ft,int color,LinearLayout.LayoutParams params){
//		ft.addView(new MyView(this,null,color),params);
//	}

	
}