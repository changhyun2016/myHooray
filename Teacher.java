package com.example.android.myhooray;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.myhooray.R;
import com.example.android.myhooray.WordAdapter;

import java.util.ArrayList;


public class Teacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("김현주 강사님", "lemonplanet@naver.com", R.drawable.teacher_one));
        words.add(new Word("박경우 강사님", "afken@naver.com", R.drawable.teacher_two));
        words.add(new Word("박서현 강사님", "seohyun@naver.com", R.drawable.teacher_three));
        words.add(new Word("박창현 강사님", "road.tour@gmail.com", R.drawable.teacher_four));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_teacher);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}