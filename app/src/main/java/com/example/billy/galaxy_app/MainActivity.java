package com.example.billy.galaxy_app;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import java.util.HashMap;

import Adapter.PagerAdapter;

public class MainActivity  extends AppCompatActivity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener{
    private ViewPager pager;
    private TabLayout tabLayout;
    private SliderLayout imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        ADDLOL();

        TabHost tabHost;
        tabHost= (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        //Setup cho tab 1
        TabHost.TabSpec tab1=tabHost.newTabSpec("t1");
        tab1.setIndicator("Ưu đãi");
        tab1.setContent(R.id.tab1);
        tabHost.addTab(tab1);

        //Setup cho tab 2
        TabHost.TabSpec tab2=tabHost.newTabSpec("t2");
        tab2.setIndicator("D.vụ Galaxy");
        tab2.setContent(R.id.tab2);
        tabHost.addTab(tab2);

        TabHost.TabSpec tab3=tabHost.newTabSpec("t2");
        tab2.setIndicator("Samsung Elite");
        tab2.setContent(R.id.tab3);
        tabHost.addTab(tab2);

        for(int i=0;i<3;i++)
        {
            TextView x = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            x.setTextSize(12);
        }

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String s) {
                switch (s)
                {
                    case  "t1":
                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                    break;

                }
            }
        });

    }

    private void addControl() {
        pager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        FragmentManager manager = getSupportFragmentManager();
        PagerAdapter adapter = new PagerAdapter(manager, getBaseContext());
        pager.setAdapter(adapter);
        tabLayout.setupWithViewPager(pager);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setTabsFromPagerAdapter(adapter);
    }
    void ADDLOL()
    {
        imageSlider = (SliderLayout)findViewById(R.id.slider2);

        HashMap<String,String> url_maps = new HashMap<String, String>();
        url_maps.put("Hannibal", "https://www.youtube.com/yts/img/yt_1200-vfl4C3T0K.png");
        url_maps.put("Big Bang Theory", "http://tvfiles.alphacoders.com/100/hdclearart-10.png");
        url_maps.put("House of Cards", "http://cdn3.nflximg.net/images/3093/2043093.jpg");
        url_maps.put("Game of Thrones", "https://www.google.com.vn/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");
        url_maps.put("Game of Thrones 2", "https://d1afx9quaogywf.cloudfront.net/sites/default/files/Logos/facebook-logo_0.png");

        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
//        file_maps.put("Hannibal",R.drawable.hannibal);
//        file_maps.put("Big Bang Theory",R.drawable.bigbang);
//        file_maps.put("House of Cards",R.drawable.house);
//        file_maps.put("Game of Thrones", R.drawable.game_of_thrones);

        for(String name : url_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(url_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);

            imageSlider.addSlider(textSliderView);
        }
        imageSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        imageSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        imageSlider.setCustomAnimation(new DescriptionAnimation());
        imageSlider.setDuration(5000);
        imageSlider.addOnPageChangeListener(this);

    }
    @Override
    protected void onStop() {
        //make sure to call stopAutoCycle() on the slider before activity or fragment is destroyed
        imageSlider.stopAutoCycle();
        super.onStop();
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {
        Toast.makeText(this,slider.getBundle().get("extra") + "", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

    @Override
    public void onPageSelected(int position) {
        Log.e("Slider Demo", "Page Changed: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {}
}