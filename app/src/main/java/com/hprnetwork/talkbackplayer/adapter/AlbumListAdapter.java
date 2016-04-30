package com.hprnetwork.talkbackplayer.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hprnetwork.talkbackplayer.R;

/**
 * Created by Holger on 30.04.2016.
 */
public class AlbumListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] title;
    private final String[] subTitle;
    public AlbumListAdapter(Activity context,
                      String[] title, String[] subTitle) {
        super(context, R.layout.list_adapter_album, title);
        this.context = context;
        this.title = title;
        this.subTitle = subTitle;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_adapter_album, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.album_album_title);
        TextView txtSubTitle = (TextView) rowView.findViewById(R.id.album_album_interpreter);

        txtTitle.setText(title[position]);
        txtSubTitle.setText(subTitle[position]);

        return rowView;
    }

}
