package com.example.ndmoo.DeuEng;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.DeuEng.R;

import java.util.ArrayList;

/**
 * Created by ndmoo on 25.11.2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /**Resource ID for the background color for this list of words*/
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> wordArrayList,int colorResourceId){
        super(context,0,wordArrayList);
        mColorResourceId = colorResourceId;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView deuEngTextView = (TextView) listItemView.findViewById(R.id.DeuEng_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        deuEngTextView.setText(currentWord.getmGermanTranslationId());


        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentWord.getmDefaultTranslationId());

        //Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image_view);
        if (currentWord.hasImage()) {
            //Set the ImageView to the image resource specified in the current Word
            imageView.setImageResource(currentWord.getmImageResourceId());

            //Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        //Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
