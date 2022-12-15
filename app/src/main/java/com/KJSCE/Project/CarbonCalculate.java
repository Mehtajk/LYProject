package com.KJSCE.Project;

import android.os.Bundle;
import android.app.Activity;


import com.github.mikephil.charting.charts.PieChart;

public class CarbonCalculate {
    PieChart pieChart;
    String[] appName = new String[10000];
    String[] appTime = new String[10000];
    double[] carbon = new double[10000];
    int count = 0;

    public CarbonCalculate(String[] an, String[] at, int c, double[] car) {
        count = c;
        appName = an;
        appTime = at;
        carbon = car;

    }
}

