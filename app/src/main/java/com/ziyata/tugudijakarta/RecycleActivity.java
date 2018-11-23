package com.ziyata.tugudijakarta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {
    String[] namaTugu, isiTugu;
    int[] gambarTugu = {R.drawable.selamatdatang, R.drawable.monas, R.drawable.pancasila, R.drawable.pancoran};
    @BindView(R.id.myRecycleView)
    RecyclerView myRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        Toolbar myToolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(myToolbar);

        namaTugu = getResources().getStringArray(R.array.nama_tugu);
        isiTugu = getResources().getStringArray(R.array.isi_tugu);

        AdapterTugu adapterTugu = new AdapterTugu(this, namaTugu, isiTugu, gambarTugu);

        myRecycleView.setHasFixedSize(true);
        myRecycleView.setLayoutManager(new LinearLayoutManager(this));
        myRecycleView.setAdapter(adapterTugu);



        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.About:
                Intent pindah = new Intent(this, About.class);
                startActivity(pindah);
                break;
            case R.id.Profile:
                pindah = new Intent(this, Profile.class);
                startActivity(pindah);
        }
        return super.onOptionsItemSelected(item);
    }
}