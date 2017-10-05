package Adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import com.example.billy.galaxy_app.R;
import com.example.billy.galaxy_app.fragment_content;

/**
 * Created by Billy on 10/5/2017.
 */

public class PagerAdapter extends FragmentPagerAdapter {
    private Context context;
    public PagerAdapter(FragmentManager fragmentManager,Context context) {
        super(fragmentManager);
        this.context = context;
    }
    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag = new fragment_content();
                break;
            case 1:
                frag = new fragment_content();
                break;
            case 2:
                frag = new fragment_content();
                break;
            case 3:
                frag = new fragment_content();
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
        Drawable image=null;
        SpannableString sb=null;
        ImageSpan imageSpan=null;
        switch (position)
        {
            case 0:
                image =  context.getResources().getDrawable(R.drawable.ic_restaurant_black_18dp);

                sb = new SpannableString("   " +"\n "+"Ẩm thực");
                break;
            case 1:
                image =  context.getResources().getDrawable(R.drawable.ic_movie_filter_black_18dp);

                sb = new SpannableString("   " +"\n "+"Giải trí");
                break;
            case 2:
                image =  context.getResources().getDrawable(R.drawable.ic_shopping_cart_black_18dp);

                sb = new SpannableString("   " +"\n "+"Mua sắm");
                break;
            case  3:
                image =  context.getResources().getDrawable(R.drawable.ic_stars_black_18dp);

                sb = new SpannableString("   " +"\n "+"Khác");
                break;

        }
        image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());
        imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BOTTOM);
        sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        // Replace blank spaces with image icon

        return sb;
    }
}
