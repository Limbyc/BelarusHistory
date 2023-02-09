package com.valance.belarushistory.util;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;

import com.valance.belarushistory.EntranceActivity;
import com.valance.belarushistory.MainActivity;

public class AndroidUtil {
    static private float getDensity() {
        return EntranceActivity.getInstance().getResources().getDisplayMetrics().density;
    }

    static public int dp(@IntRange(from=0) int value){
        if(value==0) return 0;
        return (int) (value*getDensity());
    }

    static public float dp(@FloatRange(from = 0) float value){
        if(value == 0f) return 0f;
        return value * getDensity();
    }
}
