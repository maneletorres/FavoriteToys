package com.example.android.datafrominternet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.datafrominternet.utilities.ToyBox;

public class FavoriteToysFragment extends Fragment {
    private TextView mToysListTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite_toys, container, false);

        mToysListTextView = (TextView) view.findViewById(R.id.tv_toy_names);

        for (String toyName : ToyBox.getToyNames()) mToysListTextView.append(toyName + "\n");

        return view;
    }
}
