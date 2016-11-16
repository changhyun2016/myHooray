package com.example.android.myhooray;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.myhooray.R;
import com.example.android.myhooray.WordAdapter;

import java.util.ArrayList;


public class Fairytale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("[바람놀이]", "the winds blow", R.drawable.fairytale_one));
        words.add(new Word("[뮤직맨]", "I am the musicman", R.drawable.fairytale_two));
        words.add(new Word("[머드파이]", "how to make a mudpie", R.drawable.fairytale_three));
        words.add(new Word("[표정]", "eveyone poops", R.drawable.fairytale_four));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_fairytale);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}