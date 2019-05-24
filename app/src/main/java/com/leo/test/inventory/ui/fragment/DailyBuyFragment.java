package com.leo.test.inventory.ui.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leo.test.inventory.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DailyBuyFragment extends Fragment {


    public DailyBuyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daily_buy, container, false);
    }

}
