package me.longluo.opencv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import me.longluo.opencv.colorblob.ColorBlobDetectionActivity;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, ColorBlobDetectionActivity.class);
        startActivity(intent);
    }
}
