package com.hprnetwork.talkbackplayer.fragments;

/**
 * Created by Holger on 28.04.2016.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.hprnetwork.talkbackplayer.R;
import com.hprnetwork.talkbackplayer.adapter.AlbumListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class AlbumFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public AlbumFragment() { }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static AlbumFragment newInstance(int sectionNumber) {
        AlbumFragment fragment = new AlbumFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_album, container, false);

        String[] titles = {
                "HIStory",
                "Best of the Beast",
                "And Justice For All",
                "9. Synphonie",
                "102",
                "88",
                "Best of Live"
        };

        String[] subTitles = {
                "Michael Jackson",
                "Iron Maiden",
                "Metallica",
                "Ludwig van Beethoven",
                "Bravo Hits",
                "Trance Hits",
                "AC/DC"
        };

        AlbumListAdapter adapter = new AlbumListAdapter(this.getActivity(), titles, subTitles);
        ListView list = (ListView) rootView.findViewById(R.id.listView_Album);
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
