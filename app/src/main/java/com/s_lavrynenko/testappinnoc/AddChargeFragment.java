package com.s_lavrynenko.testappinnoc;


import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AddChargeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
                // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_charges, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        FloatBut floatBut = null;
        try {
            floatBut = (FloatBut) activity;
        }catch (ClassCastException e){}
        if(floatBut != null)
            floatBut.hideButt();

    }
}
