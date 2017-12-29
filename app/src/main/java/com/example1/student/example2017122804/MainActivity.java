package com.example1.student.example2017122804;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        Uri uri=Uri.parse("http://google.com.tw");
        Intent it=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
    public void click2(View v)
    {
        Uri uri=Uri.parse("geo:0,0?q=信義華納威秀影城");
        Intent it=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
    public  void click3(View v)
    {
        Uri uri=Uri.parse("tel:0975-638-853");
        Intent it=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(it);
    }

}
