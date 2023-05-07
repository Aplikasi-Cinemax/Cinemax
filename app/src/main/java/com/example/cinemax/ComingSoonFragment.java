package com.example.cinemax;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class ComingSoonFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_coming_soon, container, false);

        GridView coming_soon_grid = v.findViewById(R.id.comingsoon_grid);
        ArrayList<ComingSoonMovieModel> comingSoonMovieModelArrayList = new ArrayList<ComingSoonMovieModel>();

        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Moonfall", "", R.drawable.moonfall, "Feb, 8 2023"));
        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Belfast", "", R.drawable.belfast, "May, 2 2023"));
        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Los ojos de \n Tammy Faye", "", R.drawable.los_ojo_de, "Apr, 23 2023"));
        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Spiderman", "Far from home", R.drawable.spiderman, "Jun, 4 2023"));
        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Cyrano", "", R.drawable.cyrano, "Nov, 28 2023"));
        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Muarte en el nilo", "", R.drawable.el_nilo, "Dec, 28 2023"));
        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Paris", "Distrito", R.drawable.paris, "Dec 28 2023"));
        comingSoonMovieModelArrayList.add(new ComingSoonMovieModel("Wakanda", "forever", R.drawable.wakanda, "Dec, 28 2023"));

        ComingSoonMovieAdapter adapter = new ComingSoonMovieAdapter(this.getContext(), comingSoonMovieModelArrayList);
        coming_soon_grid.setAdapter(adapter);

        return v;
    }
}