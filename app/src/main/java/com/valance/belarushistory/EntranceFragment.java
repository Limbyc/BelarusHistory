package com.valance.belarushistory;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;


public class EntranceFragment extends Fragment {

    View view;
    TextView enter_text;
    Button enter_button;
    FrameLayout entrance_framelayout;
    LinearLayout elements_linear_container;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_entrance, container, false);
        entrance_framelayout = view.findViewById(R.id.entrance_framelayout);

        elements_linear_container = new LinearLayout(getContext());
        elements_linear_container.setOrientation(LinearLayout.HORIZONTAL);

        enter_text = new TextView(getContext());
        enter_text.setText(R.string.enter_name);
        enter_text.setTextSize(30); //изменим

        enter_button = new Button(getContext());
        enter_button.setText(R.string.enter);
        enter_button.setTextSize(30); //изменим

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        enter_text.setLayoutParams(layoutParams);
        enter_button.setLayoutParams(layoutParams);
        elements_linear_container.addView(enter_text);
        elements_linear_container.addView(enter_button);
        entrance_framelayout.addView(elements_linear_container);

       // setContentView(linearLayout);
        return view;
    }
}