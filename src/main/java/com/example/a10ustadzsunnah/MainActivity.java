package com.example.a10ustadzsunnah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvUstadz;
    private ArrayList<Ustadz> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvUstadz = findViewById(R.id.rv_ustadz);
        rvUstadz.setHasFixedSize(true);

        list.addAll(UstadzData.getListData());
        showRecyclerList();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerList(){
        rvUstadz.setLayoutManager(new LinearLayoutManager(this));
        ListUstadzAdapter listUstadzAdapter = new ListUstadzAdapter(list);
        rvUstadz.setAdapter(listUstadzAdapter);
    }
    private void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.action_list:
                Intent moveIntent = new Intent(MainActivity.this, Profil.class);
                startActivity(moveIntent);
                break;
                default:
                    break;
        }
    }
}
