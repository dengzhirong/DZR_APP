package com.dzrapp.myapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class AboutMe extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        // 底部菜单Activity的跳转
        final TextView dzr_footer_menu_home = (TextView) findViewById(R.id.dzr_footer_menu_home);
        final TextView dzr_footer_menu_articles = (TextView) findViewById(R.id.dzr_footer_menu_articles);
        final TextView dzr_footer_menu_works = (TextView) findViewById(R.id.dzr_footer_menu_works);
        final TextView dzr_footer_menu_author = (TextView) findViewById(R.id.dzr_footer_menu_author);

        dzr_footer_menu_articles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutMe.this, Article.class));
            }
        });
        dzr_footer_menu_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutMe.this, MainPage.class));
            }
        });
        dzr_footer_menu_works.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutMe.this, Works.class));
            }
        });
        dzr_footer_menu_author.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutMe.this, AboutMe.class));
            }
        });

        // 关于作者系列链接的添加
        TextView dzr_author_github = (TextView) findViewById(R.id.dzr_author_github);
        TextView dzr_author_sina = (TextView) findViewById(R.id.dzr_author_sina);
        TextView dzr_author_douban = (TextView) findViewById(R.id.dzr_author_douban);
        TextView dzr_author_cnblog = (TextView) findViewById(R.id.dzr_author_cnblog);
        TextView dzr_author_works = (TextView) findViewById(R.id.dzr_author_works);
        TextView dzr_author_hope = (TextView) findViewById(R.id.dzr_author_hope);
        TextView dzr_author_more = (TextView) findViewById(R.id.dzr_author_more);

        dzr_author_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/dengzhirong")));
            }
        });
        dzr_author_sina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://weibo.com/dengzhirong8344")));
            }
        });
        dzr_author_douban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.douban.com/people/dengzhirong/")));
            }
        });
        dzr_author_cnblog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cnblogs.com/polygon/")));
            }
        });
        dzr_author_works.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutMe.this, Works.class));
            }
        });
        dzr_author_hope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://ce.sysu.edu.cn/hope/")));
            }
        });
        dzr_author_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dengzhr.com/")));
            }
        });

        // 底部按钮高亮显示当前页面
        Drawable icon_footer_home_on= getResources().getDrawable(R.drawable.icon_footer_author_on);
        icon_footer_home_on.setBounds(0, 0, icon_footer_home_on.getMinimumWidth(), icon_footer_home_on.getMinimumHeight());
        dzr_footer_menu_author.setCompoundDrawables(null, icon_footer_home_on, null, null);

        // 底部菜单按钮点击特效
        dzr_footer_menu_home.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    Drawable icon_footer_home_on= getResources().getDrawable(R.drawable.icon_footer_home_on);
                    icon_footer_home_on.setBounds(0, 0, icon_footer_home_on.getMinimumWidth(), icon_footer_home_on.getMinimumHeight());
                    dzr_footer_menu_home.setCompoundDrawables(null, icon_footer_home_on, null, null);
                }else if(event.getAction() == MotionEvent.ACTION_UP){
                    Drawable icon_footer_home_normal= getResources().getDrawable(R.drawable.icon_footer_home_normal);
                    icon_footer_home_normal.setBounds(0, 0, icon_footer_home_normal.getMinimumWidth(), icon_footer_home_normal.getMinimumHeight());
                    dzr_footer_menu_home.setCompoundDrawables(null, icon_footer_home_normal, null, null);
                    finish();
                }
                return false;
            }
        });
        dzr_footer_menu_articles.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    Drawable icon_footer_home_on= getResources().getDrawable(R.drawable.icon_footer_articles_on);
                    icon_footer_home_on.setBounds(0, 0, icon_footer_home_on.getMinimumWidth(), icon_footer_home_on.getMinimumHeight());
                    dzr_footer_menu_articles.setCompoundDrawables(null, icon_footer_home_on, null, null);
                }else if(event.getAction() == MotionEvent.ACTION_UP){
                    Drawable icon_footer_home_normal= getResources().getDrawable(R.drawable.icon_footer_articles_normal);
                    icon_footer_home_normal.setBounds(0, 0, icon_footer_home_normal.getMinimumWidth(), icon_footer_home_normal.getMinimumHeight());
                    dzr_footer_menu_articles.setCompoundDrawables(null, icon_footer_home_normal, null, null);
                    finish();
                }
                return false;
            }
        });
        dzr_footer_menu_works.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    Drawable icon_footer_home_on= getResources().getDrawable(R.drawable.icon_footer_works_on);
                    icon_footer_home_on.setBounds(0, 0, icon_footer_home_on.getMinimumWidth(), icon_footer_home_on.getMinimumHeight());
                    dzr_footer_menu_works.setCompoundDrawables(null, icon_footer_home_on, null, null);
                }else if(event.getAction() == MotionEvent.ACTION_UP){
                    Drawable icon_footer_home_normal= getResources().getDrawable(R.drawable.icon_footer_works_normal);
                    icon_footer_home_normal.setBounds(0, 0, icon_footer_home_normal.getMinimumWidth(), icon_footer_home_normal.getMinimumHeight());
                    dzr_footer_menu_works.setCompoundDrawables(null, icon_footer_home_normal, null, null);
                    finish();
                }
                return false;
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
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
