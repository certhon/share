package com.example.yidong_android6.demo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button text = (Button) findViewById(R.id.heheda);
        Button image = (Button) findViewById(R.id.memeda);
        text.setOnClickListener(this);
       image.setOnClickListener(this);
    }
        //分享文字

    public void shareText(View view) {
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.putExtra(Intent.EXTRA_TEXT, "This is my Share text.");
        shareIntent.setType("text/plain");

        //设置分享列表的标题，并且每次都显示分享列表
        startActivity(Intent.createChooser(shareIntent, "分享到"));
        Log.e("test", "testetstetsetest");
    }

    //分享单张图片
    public void shareSingleImage(View view) {
        Toast.makeText(this, "我是在develop", Toast.LENGTH_SHORT);
        Log.e("LOG", "YOU ARE A GABAGER");
        //他们说快些一首情歌雅俗共赏
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.heheda:
                shareText(v);
                break;
            case R.id.memeda:
                shareSingleImage(v);
                break;
        }
    }
}


