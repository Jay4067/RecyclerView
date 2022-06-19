package com.learning.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsReView;
    ArrayList<Contact> contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsReView = findViewById(R.id.contactsRecView);


        contacts.add(new Contact("Margot Robbie","Margot@gmail.com","https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Margot_Robbie_%2828316659170%29_%28cropped%29.jpg/800px-Margot_Robbie_%2828316659170%29_%28cropped%29.jpg"));
        contacts.add(new Contact("Jennifer Lawrence","Jenny@gmail.com","https://m.media-amazon.com/images/M/MV5BOTU3NDE5MDQ4MV5BMl5BanBnXkFtZTgwMzE5ODQ3MDI@._V1_.jpg"));
        contacts.add(new Contact("Zendaya","Zendaya@gmail.com","https://media1.popsugar-assets.com/files/thumbor/ck63Ryb_5C2w6wGkmwXTODedG6E/0x55:3191x3246/fit-in/500x500/filters:format_auto-!!-:strip_icc-!!-/2019/11/20/847/n/1922398/60f627eb5dd592157d0953.98365826_/i/Zendaya.jpg"));
        contacts.add(new Contact("Beyonce","Beyonce@gmail.com","https://assets.vogue.com/photos/5b280fa247b9940fb269b546/master/w_3000,h_1997,c_limit/00-story-beyonce-5-things.jpg"));
        contacts.add(new Contact("Snoop Dogg","Snoppy@gmail.com","https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F9%2F2020%2F04%2F16%2Fsnoop-dogg-wine-FT-BLOG0420.jpg"));

        ContactsReViewAdapter adapter = new ContactsReViewAdapter(this);
        adapter.setContacts(contacts);


        contactsReView.setAdapter(adapter);
        contactsReView.setLayoutManager(new GridLayoutManager(this,2));
    }
}