package appewtc.masterung.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    /// Explicit
    private ListView trafficListView;   //declare parameter inside class parameter
    private Button aboutMEButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind Widget @คือดารผูก พารามิตอร์ () กับ Widget
        bindWidget();

        //Button Controller
        buttonController();
    }   // Main Method

    private void buttonController() {
        aboutMEButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sound effect
                MediaPlayer ButtonPlayer = MediaPlayer.create(getBaseContext(),R.raw.effect_btn_long);
                // getBaseContext คือ แหล่งเสียงภายใน เครื่อง internal memory
                ButtonPlayer.start();

                // Web View
                Intent ObjIntent = new Intent(Intent.ACTION_VIEW);    // ให้ ObjIntent เป็น Intent
                ObjIntent.setData(Uri.parse("https://youtu.be/YM_D0Qx5VOk"));
                //startActivities(ObjIntent);
                startActivity(ObjIntent);



            } //event
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMEButton = (Button) findViewById(R.id.button);


    }// bindWidget

}   // Main Class นี่คือคลาสหลัก นะคะ
