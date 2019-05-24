package com.leo.test.inventory.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.leo.test.inventory.R;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class BuyFragment extends Fragment {

    private TextView currentTimeTv, currentDateTv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buy,container,false);

        currentDateTv = view.findViewById(R.id.current_date_tv);
        currentTimeTv = view.findViewById(R.id.current_time_tv);

        String date = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(new Date());

        String time  = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
        currentTimeTv.setText(time);

        currentDateTv.setText(date);
        return view;
    }
}
