package com.example.android.contacts;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                Intent intent = new Intent();  //Intent object
                intent.setAction(android.content.Intent.ACTION_VIEW);  //Action to view the contacts
                intent.setData(ContactsContract.Contacts.CONTENT_URI);   //Contacts uri need to be pass to the setData method
                startActivity(intent); //Start an activity
                finish();         // This will close the activity

            }





    }







