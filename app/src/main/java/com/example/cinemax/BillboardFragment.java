package com.example.cinemax;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class BillboardFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_billboard, container, false);

        Spinner location_list = (Spinner) v.findViewById(R.id.location_list);
        ArrayAdapter<CharSequence> adapterSpinner = ArrayAdapter.createFromResource(this.getActivity(), R.array.list_location, android.R.layout.simple_spinner_item);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        location_list.setAdapter(adapterSpinner);

        // Inflate the layout for this fragment
        return v;
    }
}