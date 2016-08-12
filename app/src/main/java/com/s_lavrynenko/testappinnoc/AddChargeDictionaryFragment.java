package com.s_lavrynenko.testappinnoc;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class AddChargeDictionaryFragment extends Fragment implements FragmentManager.OnBackStackChangedListener{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_add_charge_dictionary, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
      // ActionBar actionBar = getActivity().getActionBar();
       // actionBar.setDisplayHomeAsUpEnabled(true);
        super.onAttach(activity);
        FloatBut floatBut = null;
        try {
            floatBut = (FloatBut) activity;
        }catch (ClassCastException e){}
        if(floatBut != null)
            floatBut.hideButt();

    }


    @Override
    public void onBackStackChanged() {
        shouldDisplayHomeUp();
    }

    public void shouldDisplayHomeUp(){
        //Enable Up button only  if there are entries in the back stack
        ActionBar actionBar = getActivity().getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

}
