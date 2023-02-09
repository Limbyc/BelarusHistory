package com.valance.belarushistory;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class EntranceActivity extends AppCompatActivity {

    static private EntranceActivity INSTANCE;
    static public EntranceActivity getInstance() { return INSTANCE;}



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrance_activity);
        INSTANCE = this;

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.entrance_fragment_container_view, EntranceFragment.class,null)
                    .commit();
        }

    }
}
