package Adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import com.example.billy.galaxy_app.R;
import com.example.billy.galaxy_app.fragment_content;
import com.example.billy.galaxy_app.fragment_details;

/**
 * Created by Billy on 10/6/2017.
 */

public class Pager_Adapter_Details extends FragmentPagerAdapter {
    private Context context;
    public Pager_Adapter_Details(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.context = context;
    }
    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag = new fragment_details();
                break;
            case 1:
                frag = new fragment_details();
                break;
            case 2:
                frag = new fragment_details();
                break;
            case 3:
                frag = new fragment_details();
                break;

        }
        return frag;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position)
        {
            case 0: return "Thông tin";
            case 1:return "Bình luận";

            case 2:return "Hướng dẫn";

            case  3:return "Thư viện";

        }
        return "";
    }
}
