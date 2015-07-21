package com.dzrapp.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ArticlesList extends ActionBarActivity {
    private String[] articlesList_title = new String[] {"SVG绘图(二) —— 渲染满天星辰", "SVG绘图(二) —— 渲染满天星辰", "SVG绘图(二) —— 渲染满天星辰", "SVG绘图(二) —— 渲染满天星辰", "SVG绘图(二) —— 渲染满天星辰", "SVG绘图(二) —— 渲染满天星辰", "SVG绘图(二) —— 渲染满天星辰", "SVG绘图(二) —— 渲染满天星辰"};
    private String[] articlesList_date = new String[] {"2015-07-15", "2015-07-15", "2015-07-15", "2015-07-15", "2015-07-15", "2015-07-15", "2015-07-15", "2015-07-15"};
    private String[] articlesList_readCounts = new String[] {"120", "120", "120", "120", "120", "120", "120", "120"};
    private String[] articlesList_commentCounts = new String[] {"20", "20", "20", "20", "20", "20", "20", "20"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles_list);

        List<Map<String, Object>> articleLists_items = new ArrayList<Map<String, Object>>();
        for(int i = 0; i < articlesList_title.length; i++) {
            Map<String, Object> articlesList_item = new HashMap<String, Object>();
            articlesList_item.put("title", articlesList_title[i]);
            articlesList_item.put("date", articlesList_date[i]);
            articlesList_item.put("readCounts", articlesList_readCounts[i]);
            articlesList_item.put("commentCounts", articlesList_commentCounts[i]);
            articleLists_items.add(articlesList_item);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, articleLists_items,
                R.layout.style_articles_list, new String[] {"title", "date", "readCounts", "commentCounts"},
                new int[] {R.id.dzr_articlesList_title, R.id.dzr_articlesList_date, R.id.dzr_articlesList_readCounts, R.id.dzr_articlesList_commentCounts});
        ListView articleLists = (ListView) findViewById(R.id.dzr_articlesList_items);
        articleLists.setAdapter(simpleAdapter);

        // 底部菜单Activity的跳转
        TextView dzr_footer_menu_home = (TextView) findViewById(R.id.dzr_footer_menu_home);
        TextView dzr_footer_menu_articles = (TextView) findViewById(R.id.dzr_footer_menu_articles);
        TextView dzr_footer_menu_works = (TextView) findViewById(R.id.dzr_footer_menu_works);
        TextView dzr_footer_menu_author = (TextView) findViewById(R.id.dzr_footer_menu_author);

        dzr_footer_menu_articles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticlesList.this, Article.class));
            }
        });
        dzr_footer_menu_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticlesList.this, MainPage.class));
            }
        });
        dzr_footer_menu_works.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticlesList.this, Works.class));
            }
        });
        dzr_footer_menu_author.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticlesList.this, AboutMe.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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