package com.hprnetwork.talkbackplayer.fragments;

/**
 * Created by Holger on 28.04.2016.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.hprnetwork.talkbackplayer.R;
import com.hprnetwork.talkbackplayer.adapter.AlbumListAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class GenreFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public GenreFragment() { }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static GenreFragment newInstance(int sectionNumber) {
        GenreFragment fragment = new GenreFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_genre, container, false);

        String[] titles = {
                "Klassik",
                "Pop",
                "Rock",
                "Hard Rock",
                "Dance",
                "House"
        };

        String[] subTitles = {
                "1 Alben",
                "1 Alben",
                "1 Alben",
                "2 Alben",
                "1 Alben",
                "1 Album"
        };

        AlbumListAdapter adapter = new AlbumListAdapter(this.getActivity(), titles, subTitles);
        ListView list = (ListView) rootView.findViewById(R.id.listView_Genre);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


            }
        });

        return rootView;
    }

}
