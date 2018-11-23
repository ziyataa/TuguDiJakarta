package com.ziyata.tugudijakarta;

import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.Button;

        import butterknife.BindView;
        import butterknife.ButterKnife;
        import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnMasuk)
    Button btnMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnMasuk)
    public void onViewClicked() {
        Intent pindah = new Intent(this,RecycleActivity.class);
        startActivity(pindah);
    }
}
