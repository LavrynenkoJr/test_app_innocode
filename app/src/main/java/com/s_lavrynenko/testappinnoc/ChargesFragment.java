package com.s_lavrynenko.testappinnoc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class ChargesFragment extends Fragment {

    private RecyclerView recyclerView;

      @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
          recyclerView = (RecyclerView)findViewById(R.id.rv);
        return inflater.inflate(R.layout.fragment_charges, container, false);
    }
}
