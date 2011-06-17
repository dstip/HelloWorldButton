package com.tutorial.HelloFormStuff;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class HelloWorldButton extends Activity {
    /** Called when the activity is first created. */
	
//	CustomDrawableView mCustomDrawableView;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
//        mCustomDrawableView = new CustomDrawableView(this);
//                setContentView(mCustomDrawableView);
    
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
                Toast.makeText(HelloWorldButton.this, "Beep Bop", Toast.LENGTH_SHORT).show();
            }
        });
    } 
    

//public class CustomDrawableView extends View {
//    private ShapeDrawable mDrawable;
//    private ShapeDrawable mDrawablePressed;

//    public CustomDrawableView(Context context) {
//        super(context);

//        int x = 10;
//        int y = 10;
//        int width = 300;
//        int height = 50;

//        mDrawable = new ShapeDrawable(new OvalShape());
//        mDrawable.getPaint().setColor(0xffdd0000);
//        mDrawable.setBounds(x, y, x + width, y + height);
//        
//        mDrawablePressed = new ShapeDrawable(new OvalShape());
//        mDrawablePressed.getPaint().setColor(0xff990000);
//        mDrawablePressed.setBounds(x, y, x + width, y + height);
//    }

//    protected void onDraw(Canvas canvas) {
//        mDrawable.draw(canvas);
//    }
//}

}
