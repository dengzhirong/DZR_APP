package com.dzrapp.myapp;

import java.io.IOException;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class WebviewTest extends ActionBarActivity {

    String url="http://www.dengzhr.com/archives/182";
    Button bt1;
    WebView tv1;
    String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_test);
        bt1 = (Button)findViewById(R.id.bttitle);
        tv1 = (WebView)findViewById(R.id.tv1);



        bt1.setOnClickListener(new OnClickListener()
        {


            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new Thread(runnable).start();
            }

        });

    }

    Runnable runnable = new Runnable(){
        @Override
        public void run() {
            try {
                Document doc= Jsoup.connect(url).get();
                title = doc.getElementsByClass("article").toString();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            handler.sendEmptyMessage(0);
        }
    };

    @SuppressLint("HandlerLeak")
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            tv1.loadDataWithBaseURL(null, title, "text/html", "utf-8", null);
        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}