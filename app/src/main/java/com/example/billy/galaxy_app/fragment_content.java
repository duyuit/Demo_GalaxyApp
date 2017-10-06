package com.example.billy.galaxy_app;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import Adapter.Adapter_Content_Shop;
import Model.Shop;

/**
 * Created by Billy on 10/4/2017.
 */

public class fragment_content extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_content,container,false);
        ListView listView=view.findViewById(R.id.lvContent);
        ArrayList<Shop> arrayList=new ArrayList<>();
        Shop shop1=new Shop("I LOVE KEM","Đây là mẩu tin quảng cáo...","12:00:00 23/7/2017","15%","10","20","4","null");
        Shop shop2=new Shop("I LOVE KEM2","Đây là mẩu tin quảng cáo...","12:00:00 23/7/2017","15%","10","20","4","null");
        arrayList.add(shop1);
        arrayList.add(shop2);

        Adapter_Content_Shop adapter_content_shop=new Adapter_Content_Shop(getActivity(),R.layout.item_content,arrayList);
        listView.setAdapter(adapter_content_shop);
        return view;
    }
}
