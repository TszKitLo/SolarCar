package ucd.org.ucdsolarcar;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.os.Handler;
import java.lang.*;

public class MainActivity extends AppCompatActivity {

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);


    }

    Handler handler = new Handler();
    handler.postDelayed(new Runnable(){
        @Override
        protected void onStart(){
            super.onStart();
            TextView speed = (TextView) findViewById(R.id.speedInt);
            speed.setText(Integer.toString(i));
            for (int i = 0; i < 50; i++) {
                speed.setText(Integer.toString(i));
            }
        }
    }, 5000);
}
