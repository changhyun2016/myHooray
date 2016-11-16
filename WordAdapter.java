package com.example.android.myhooray;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.myhooray.R;

import java.util.ArrayList;

import static android.widget.ImageView.ScaleType.CENTER_CROP;
import static com.example.android.myhooray.R.id.korean_title;
import static com.example.android.myhooray.R.id.imageView;
import static com.example.android.myhooray.R.id.english_title;

public class WordAdapter extends ArrayAdapter<com.example.android.myhooray.Word>{


    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<com.example.android.myhooray.Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        com.example.android.myhooray.Word currentWord = getItem(position);

        TextView koreanTitle = (TextView) listItemView.findViewById(R.id.korean_title);
        koreanTitle.setText(currentWord.getKoreanTitle());

        TextView englishTitle = (TextView) listItemView.findViewById(R.id.english_title);
        englishTitle.setText(currentWord.getEnglishTitle());

        ImageView img_resource_id = (ImageView) listItemView.findViewById(R.id.imageView);

        if (currentWord.hasImage()) {
            img_resource_id.setImageResource(currentWord.getImageResourceId());
            img_resource_id.setVisibility(View.VISIBLE);
            img_resource_id.setScaleType(CENTER_CROP);
        } else {
            img_resource_id.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}