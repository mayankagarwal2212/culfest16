package com.culfest.nit.jamshedpur;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by nit on 20-Jan-16.
 */
public class event4 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.event4, container, false);

        TextView tv = (TextView) v.findViewById(R.id.prize);
        tv.setText(Content.str[3]);
        return v;
    }
}
