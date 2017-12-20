package ru.samsung.itschool.spacearrays;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    ImageButton button;
    boolean mPlay = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        button = (ImageButton) findViewById(R.id.imageButton);
        button.setImageResource(R.drawable.cosmonaut);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mPlay)
                    button.setImageResource(R.drawable.alienface);
                else
                    button.setImageResource(R.drawable.cosmonaut);
                mPlay=!mPlay;
            }
        });
	}
}
