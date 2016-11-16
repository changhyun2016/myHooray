package com.example.android.myhooray;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.myhooray.R;
import com.example.android.myhooray.WordAdapter;

import java.util.ArrayList;


public class Video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("가을동요", "달 달 무슨달", R.drawable.video_one));
        words.add(new Word("가을동요", "가을바람", R.drawable.video_two));
        words.add(new Word("10월 Finger play", "Whoops, Johny!", R.drawable.video_three));
        words.add(new Word("9월 영어동요", "Hickery dickery dock", R.drawable.video_four));
        words.add(new Word("가을동요", "빨개졌대요", R.drawable.video_five));
        words.add(new Word("가을동요", "허수아비 아저씨", R.drawable.video_six));
        words.add(new Word("동요", "엄마돼지 아빠돼지", R.drawable.video_seven));
        words.add(new Word("롤리폴리 마사지", "(16~24개월)", R.drawable.video_eight));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_video);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}