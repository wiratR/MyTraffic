package appewtc.masterung.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detailTextView;
    private ImageView trafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        blindWidget();

        showView();

    }// Main Method

    private void showView() {

        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        String strDetail = getIntent().getStringExtra("Detail");
        detailTextView.setText(strDetail);

        int intView = getIntent().getIntExtra("image", R.drawable.traffic_01);
        trafficImageView.setImageResource(intView);

    } // ShowView

    private void blindWidget() {
        titleTextView = (TextView) findViewById(R.id.textView2);
        detailTextView = (TextView) findViewById(R.id.textView3);
        trafficImageView = (ImageView) findViewById(R.id.imageView);

    }

}// Main Clas
