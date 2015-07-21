package com.dzrapp.myapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Works extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_works);

        // 底部菜单Activity的跳转
        TextView dzr_footer_menu_home = (TextView) findViewById(R.id.dzr_footer_menu_home);
        TextView dzr_footer_menu_articles = (TextView) findViewById(R.id.dzr_footer_menu_articles);
        TextView dzr_footer_menu_works = (TextView) findViewById(R.id.dzr_footer_menu_works);
        TextView dzr_footer_menu_author = (TextView) findViewById(R.id.dzr_footer_menu_author);

        dzr_footer_menu_articles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Works.this, Article.class));
            }
        });
        dzr_footer_menu_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Works.this, MainPage.class));
            }
        });
        dzr_footer_menu_works.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Works.this, Works.class));
            }
        });
        dzr_footer_menu_author.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Works.this, AboutMe.class));
            }
        });

        // 我的作品项目列表链接
        TextView dzr_works_articlecms = (TextView) findViewById(R.id.dzr_works_articlecms);
        TextView dzr_works_20anni = (TextView) findViewById(R.id.dzr_works_20anni);
        dzr_works_articlecms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/dengzhirong/ArticleCMS_PHP")));
            }
        });
        dzr_works_20anni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://ce.sysu.edu.cn/20anni/")));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_works, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
