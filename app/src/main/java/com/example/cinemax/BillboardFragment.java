package com.example.cinemax;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class BillboardFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_billboard, container, false);

        Spinner location_list = (Spinner) v.findViewById(R.id.location_list);
        ArrayAdapter<CharSequence> adapterSpinner = ArrayAdapter.createFromResource(this.getActivity(), R.array.list_location, android.R.layout.simple_spinner_item);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        location_list.setAdapter(adapterSpinner);

        // onclick profile image button
        ImageButton profileBtn = (ImageButton) v.findViewById(R.id.profile_btn);
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireContext(), ProfileActivity.class));
            }
        });

        LinearLayout movieCard = (LinearLayout) v.findViewById(R.id.movie_card);
        movieCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireContext(), DetailMovieActivity.class));
            }
        });

        // Inflate the layout for this fragment
        return v;
    }
}