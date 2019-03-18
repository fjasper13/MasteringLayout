package com.example.vivobook.timetolearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        initializeData();
        RecyclerView rv=findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm=new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        RVAdapter adapter=new RVAdapter(movies);
        rv.setAdapter(adapter);
    }
    private List<MovieData>movies;
    private void initializeData() {
        movies=new ArrayList<>();
        movies.add(new MovieData("Sponge Out of Water","https://cdn.vox-cdn.com/thumbor/qYAQgh19lNtRi920JB5VxZI_zK0=/0x0:1000x625/920x613/filters:focal(585x224:745x384):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/61883517/The_SpongeBob_Movie_Sponge_Out_of_Water___logo__English_.0.jpg","2015"));
        movies.add(new MovieData("The SpongeBob SquarePants Movie","https://upload.wikimedia.org/wikipedia/en/thumb/3/31/The_SpongeBob_SquarePants_Movie_poster.jpg/220px-The_SpongeBob_SquarePants_Movie_poster.jpg","2005"));
        movies.add(new MovieData("Spider-Man: Into the Spider-Verse","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtHDla2qAF8ew_GVXfb0_m1ZFWFWV2B_P9GRdR3Ctg3rljtj7J","2018"));
        movies.add(new MovieData("Your Name","https://i.ytimg.com/vi/xU47nhruN-Q/maxresdefault.jpg","2016"));
    }
}
