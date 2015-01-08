package com.example.vvm.testlistview.activity.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.vvm.testlistview.R;

import java.util.ArrayList;
import java.util.List;

import com.example.vvm.testlistview.activity.adapter.PhoneModelAdapter;
import com.example.vvm.testlistview.activity.pojo.PhoneModel;


public class MainActivity extends ActionBarActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        listView = (ListView) findViewById(R.id.listView);

        PhoneModelAdapter adapter = new PhoneModelAdapter(this, initData());
        listView.setAdapter(adapter);
    }

    private List<PhoneModel> initData() {

        List<PhoneModel> list = new ArrayList<PhoneModel>();

        list.add(new PhoneModel(1, "iPhone", 1000));
        list.add(new PhoneModel(2, "Sony", 800));
        list.add(new PhoneModel(3, "Philips", 500));
        list.add(new PhoneModel(4, "HTC", 700));
        list.add(new PhoneModel(5, "Lenovo", 600));

        return list;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
