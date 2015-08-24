package com.example.mkoldobsky.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_main, container, false);
        final ListView listView = (ListView)rootView.findViewById(R.id.listview_forecast);
        String[] forecasts = getForecasts();
        final ArrayList<String> list = new ArrayList<>();
        for(int i = 0;  i< forecasts.length; ++i){
            list.add(forecasts[i]);
        }

        final ArrayAdapter adapter = new ArrayAdapter(inflater.getContext(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, list);
        listView.setAdapter(adapter);

        return rootView;
    }


    private String[] getForecasts() {
        String[] result = new String[]{"Today - sunny - 10ª/2ª", "Tomorrow - cloudy - 12ª/4ª", "Wendesday - cluody - 15ª/6ª", "Thurdsday - raining - 17ª/10", "Friday - cloudy - 20ª-14ª",
                "Saturday - cloudy - 20ª/14ª", "Sunday - sunny - 25ª/20ª"};
        return result;

    }



}
