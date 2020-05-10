package com.example.android.datafrominternet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class GitHubSearchFragment extends Fragment {
    EditText mSearchBoxEditText;
    TextView mUrlDisplayTextView;
    TextView mSearchResultsTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_github_search, container, false);

        mSearchBoxEditText = (EditText) view.findViewById(R.id.et_search_box);
        mUrlDisplayTextView = (TextView) view.findViewById(R.id.tv_url_display);
        mSearchResultsTextView = (TextView) view.findViewById(R.id.tv_github_search_results_json);

        return view;
    }
}
