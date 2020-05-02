package com.example.library;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.LibraryList;

public class ListOfLibrariesActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<LibraryList> list;
    private Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerViewId);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this); /*{
            @Override
            public RecyclerView.LayoutParams generateDefaultLayoutParams() {
                return new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
            }
        };*/
        recyclerView.setLayoutManager(layoutManager);

        list=new ArrayList<>();
        extras=getIntent().getExtras();

        if(extras!=null){
            if(extras.containsKey("1")) {
                if (extras.getString("1").equals("lko")) {
                    LibraryList item1 = new LibraryList("AMIR-UD-DAULA PUBLIC LIBRARY", "Lucknow");
                    LibraryList item2 = new LibraryList("GURUKUL STUDY ZONE LIBRARY", "Lucknow");
                    LibraryList item3 = new LibraryList("THE READER'S CHOICE LIBRARY","Lucknow");
                    LibraryList item4 = new LibraryList("INFINIAN","Lucknow");
                    LibraryList item5 = new LibraryList("SCHOLAR'S LIBRARY","Lucknow");
                    LibraryList item6 = new LibraryList("KANPUR CENTRAL LIBRARY","Kanpur");
                    LibraryList item7 = new LibraryList("HBTU CENTRAL LIBRARY","Kanpur");
                    LibraryList item8 = new LibraryList("PK KELKAR LIBRARY","Kanpur");
                    LibraryList item9 = new LibraryList("CONCEPT LIBRARY","Kanpur");
                    LibraryList item10= new LibraryList("KANPUR PUBLIC LIBRARY","KANPUR");

                    list.add(item1);
                    list.add(item2);
                    list.add(item3);
                    list.add(item4);
                    list.add(item5);
                    list.add(item6);
                    list.add(item7);
                    list.add(item8);
                    list.add(item9);
                    list.add(item10);
                    recyclerView.scrollToPosition(list.size() - 1);
                    adapter = new MyAdapter(this, list);
                    recyclerView.setAdapter(adapter);
                }
                else if (extras.getString("1").equals("varanasi")) {
                    LibraryList item1 = new LibraryList(" GOVERNMENT DISTRICT LIBRARY", " Varanasi");
                    LibraryList item2 = new LibraryList("KARMAICAL LIBRARY ASSOCIATION", "Varanasi");
                    LibraryList item3 = new LibraryList("KASHIKATHA LIBRARY","Varanasi");
                    LibraryList item4 = new LibraryList("SHREE VISHVANATH PUSTAKALAYA","Varanasi");
                    LibraryList item5 = new LibraryList("SHARSWATI SADAN PUSTAKALAYA","Varanasi");
                    LibraryList item6 = new LibraryList("ALLAHABAD PUBLIC LIBRARY","Allahabad");
                    LibraryList item7 = new LibraryList("CENTRAL STATE LIBRARY","Allahabad");
                    LibraryList item8 = new LibraryList("LAKSHYA LIBRARY","Allahabad");

                    list.add(item1);
                    list.add(item2);
                    list.add(item3);
                    list.add(item4);
                    list.add(item5);
                    list.add(item6);
                    list.add(item7);
                    list.add(item8);
                    adapter = new MyAdapter(this, list);
                    recyclerView.setAdapter(adapter);

                }
            }
        }





    }
}
