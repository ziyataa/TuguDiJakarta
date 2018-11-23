package com.ziyata.tugudijakarta;

import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.ImageView;
        import android.widget.TextView;

        import com.bumptech.glide.Glide;

        import butterknife.BindView;
        import butterknife.ButterKnife;

public class DetailTuguActivity extends AppCompatActivity {

    @BindView(R.id.imgLogo)
    ImageView imgLogo;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.txtDetail)
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tugu);
        ButterKnife.bind(this);

        Glide.with(this).load(getIntent().getIntExtra("gt",0)).into(imgLogo);
        txtTitle.setText(getIntent().getStringExtra("nt"));
        txtDetail.setText(getIntent().getStringExtra("it"));

    }
}
