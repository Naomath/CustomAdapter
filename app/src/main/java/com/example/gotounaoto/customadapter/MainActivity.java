package com.example.gotounaoto.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.list_view);
        InformationAdapter adapter = new InformationAdapter(this, R.layout.adapter_information);
        listView.setAdapter(adapter);
        List<InformationText> items = new ArrayList<>();
        items.add(new InformationText("ユーザー名", "naomath", 25f));
        adapter.add(items.get(0));
        items.add(new InformationText("説明","我々は宇宙人であるということを自覚する必要がある。しかし今現在ほとんど人が宇宙人はいると信じながらも、自らは宇宙人ではないと信じている。これは由々しき自体であるということを宇宙連合銀河管轄署より送信する。", 18f));
        adapter.add(items.get(1));
    }
}
