package hlt.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ";
            //"Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.";

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList arrayList = new ArrayList<CardItem>();

        arrayList.add(new CardItem("Sarah", "Lawyer", lorem, R.drawable.girl));
        arrayList.add(new CardItem("Carl", "Web Developer", lorem, R.drawable.man));
        arrayList.add(new CardItem("Kate", "Doctor", lorem, R.drawable.girl));
        arrayList.add(new CardItem("David", "Software Engineer", lorem, R.drawable.man));

        mAdapter = new MyAdapter(arrayList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
