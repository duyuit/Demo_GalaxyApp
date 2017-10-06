package com.example.billy.galaxy_app;

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
 * Created by Billy on 10/6/2017.
 */

public class fragment_details  extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_details,container,false);
        return view;
    }
}
