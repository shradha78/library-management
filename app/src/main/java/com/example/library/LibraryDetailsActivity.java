package com.example.library;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LibraryDetailsActivity extends AppCompatActivity {
    private TextView name,address,timings,services;
    private Bundle extras;
    private String amirUdDaulaLib = "AMIR-UD-DAULA PUBLIC LIBRARY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libdetails);
        name=(TextView)findViewById(R.id.libraryNameID);
        address=(TextView)findViewById(R.id.addressId);
        timings=(TextView)findViewById(R.id.timingsId);
        services=(TextView)findViewById(R.id.servicesId);
        extras=getIntent().getExtras();
        if(extras!=null) {
            if (extras.containsKey("Name")) {
                if (extras.getString("Name").trim().equalsIgnoreCase(amirUdDaulaLib)) {
//                    String n = getColoredSpanned("Name:", "#FF191717");
//                    String n1 = getColoredSpanned(amirUdDaulaLib, "#FFC7C7C2");
                    name.setText("Name: AMIR-UD-DAULA PUBLIC LIBRARY ");
                    address.setText(String.format("%s%s", "Address: ", getString(R.string.address1)));
                    timings.setText("Timings: Mon & Wed - Sun 12:30 pm - 7:00 pm ,Tue Closed");
                    services.setText("Amir-Ud-Daula Public Library has a collection of about 2 lakh books in different languages and has a reading room for newspapers, and that is for all public. " +
                            "Their Reading hall is for the magazine, old newspapers & other informative material reading. There is a separate study hall for competitive scholars/library members. The library has separate children section that has books in English, Hindi & Urdu.");
                }

                else if (extras.getString("Name").trim().equalsIgnoreCase("GURUKUL STUDY ZONE LIBRARY")) {
                    name.setText(R.string.lib2);
                    address.setText(R.string.address2);
                    timings.setText(R.string.timings2);
                    services.setText(R.string.services2);

                }
                else if(extras.getString("Name").trim().equalsIgnoreCase("THE READER'S CHOICE LIBRARY")){
                    name.setText(R.string.lib3);
                    address.setText(R.string.address3);
                    timings.setText(R.string.timings3);
                    services.setText(R.string.services3);
                }
                else if(extras.getString("Name").trim().equalsIgnoreCase("INFINIAN")){
                    name.setText(R.string.lib4);
                    address.setText(R.string.address4);
                    timings.setText(R.string.timings4);
                    services.setText(R.string.services4);

                }
                else if(extras.getString("Name").trim().equalsIgnoreCase("SCHOLAR'S LIBRARY")){
                    name.setText(R.string.lib5);
                    address.setText(R.string.address5);
                    timings.setText(R.string.timings5);
                    services.setText(R.string.services5);

                }
                else if(extras.getString("Name").trim().equalsIgnoreCase("KANPUR CENTRAL LIBRARY")){
                    name.setText(R.string.lib6);
                    address.setText(R.string.address6);
                    timings.setText(R.string.timings6);
                    services.setText(R.string.services6);

                }
                else if(extras.getString("Name").trim().equalsIgnoreCase("HBTU CENTRAL LIBRARY")){
                    name.setText(R.string.lib7);
                    address.setText(R.string.address7);
                    timings.setText(R.string.timings7);
                    services.setText(R.string.services7);

                }
                else if(extras.getString("Name").trim().equalsIgnoreCase("PK KELKAR LIBRARY")){
                    name.setText(R.string.lib8);
                    address.setText(R.string.address8);
                    timings.setText(R.string.timings8);
                    services.setText(R.string.services8);

                }
                else if (extras.getString("Name").trim().equalsIgnoreCase("CONCEPT LIBRARY")){
                    name.setText(R.string.lib9);
                    address.setText(R.string.address9);
                    timings.setText(R.string.timings9);
                    services.setText(R.string.services9);
                }
                else if (extras.getString("Name").trim().equalsIgnoreCase("KANPUR PUBLIC LIBRARY")){
                    name.setText(R.string.lib10);
                    address.setText(R.string.address10);
                    timings.setText(R.string.timings10);
                    services.setText(R.string.services10);
                }
                else if (extras.getString("Name").trim().equalsIgnoreCase("GOVERNMENT DISTRICT LIBRARY")){
                    name.setText(R.string.lib11);
                    address.setText(R.string.address11);
                    timings.setText(R.string.timings11);
                    services.setText(R.string.services11);
                }
                else if (extras.getString("Name").trim().equalsIgnoreCase("KARMAICAL LIBRARY ASSOCIATION")){
                    name.setText(R.string.lib12);
                    address.setText(R.string.address12);
                    timings.setText(R.string.timings12);
                    services.setText(R.string.services12);
                }
                else if (extras.getString("Name").trim().equalsIgnoreCase("KASHIKATHA LIBRARY")){
                    name.setText(R.string.lib13);
                    address.setText(R.string.address13);
                    timings.setText(R.string.timings13);
                    services.setText(R.string.services13);
                }
                else if (extras.getString("Name").trim().equalsIgnoreCase("SHREE VISHVANATH PUSTAKALAYA")){
                    name.setText(R.string.lib14);
                    address.setText(R.string.address14);
                    timings.setText(R.string.timings14);
                    services.setText(R.string.services14);
                }
                else if (extras.getString("Name").trim().equalsIgnoreCase(" SHARSWATI SADAN PUSTAKALAYA")){
                    name.setText(R.string.lib15);
                    address.setText(R.string.address15);
                    timings.setText(R.string.timings15);
                    services.setText(R.string.services15);
                }
                else if (extras.getString("Name").trim().equalsIgnoreCase("ALLAHABAD PUBLIC LIBRARY")){
                    name.setText(R.string.lib16);
                    address.setText(R.string.address16);
                    timings.setText(R.string.timings16);
                    services.setText(R.string.services16);
                }
                else if (extras.getString("Name").trim().equalsIgnoreCase("CENTRAL STATE LIBRARY")){
                    name.setText(R.string.lib17);
                    address.setText(R.string.address17);
                    timings.setText(R.string.timings17);
                    services.setText(R.string.services17);
                }
                else if (extras.getString("Name").trim().equalsIgnoreCase("LAKSHYA LIBRARY")){
                    name.setText(R.string.lib18);
                    address.setText(R.string.address18);
                    timings.setText(R.string.timings18);
                    services.setText(R.string.services18);
                }


            }
        }

    }

}
