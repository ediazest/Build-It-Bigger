package com.development.edu.jokescreen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class JokeActivityFragment extends Fragment {

    private String joke = "";

    public JokeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_joke, container, false);

        if (getActivity().getIntent() != null && getActivity().getIntent().getExtras() != null) {
            joke = getActivity().getIntent().getExtras().getString(JokeActivity.INTENT_EXTRA_JOKE);
        }

        TextView tx = (TextView) rootView.findViewById(R.id.joke_textview);
        tx.setText(joke);


        return rootView;
    }
}
