package com.example.mkoldobsky.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    private String forecast;
    private TextView textView;

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_detail, container, false);
        textView = (TextView)rootView.findViewById(R.id.forecast_textview);
        return rootView;
    }

    public void setForecast(String forecast){
        this.forecast = forecast;
        textView.setText(this.forecast);
    }
}
