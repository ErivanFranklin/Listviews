package com.example.erivan.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Movie[] moviesArray = new Movie[]{

            new Movie("Ant-Man and the Wasp", "Action", "July 6", "Peyton Reed (Ant-Man)"),
            new Movie("Game Night", "Action", "February 23", "John Francis Daley and Jonathan Goldstein (Vacation)"),
            new Movie("Gemini", "Drama", "March 30", "Lola Kirke, Zoë Kravitz, John Cho, Greta Lee"),
            new Movie("The Ritual", "Thriller", "February 9", "Rafe Spall, Arsher Ali, Robert James-Collier, Sam Troughton"),
            new Movie(" A Quiet Place", "Drama", "April 6", "John Krasinski (The Hollars)"),
            new Movie("Eighth Grade", "Drama", "July 13", "Elsie Fisher, Josh Hamilton, Emily Robinson, Catherine Oliviere"),
            new Movie("The Commuter", "Action", "January 12", "Jaume Collet-Serra (The Shallows)")
    };

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.mListView);
    }
}
