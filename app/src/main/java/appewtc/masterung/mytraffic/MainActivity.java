package appewtc.masterung.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        // create ListView
        createListView();


    }   // Main Method

    private void createListView() {

        //Icon
        final int[] intIcon = new int[20];            // 0 - 19
        intIcon[0] = R.drawable.traffic_01;     // Integer
        intIcon[1] = R.drawable.traffic_02;
        intIcon[2] = R.drawable.traffic_03;
        intIcon[3] = R.drawable.traffic_04;
        intIcon[4] = R.drawable.traffic_05;
        intIcon[5] = R.drawable.traffic_06;
        intIcon[6] = R.drawable.traffic_07;
        intIcon[7] = R.drawable.traffic_08;
        intIcon[8] = R.drawable.traffic_09;
        intIcon[9] = R.drawable.traffic_10;
        intIcon[10] = R.drawable.traffic_11;
        intIcon[11] = R.drawable.traffic_12;
        intIcon[12] = R.drawable.traffic_13;
        intIcon[13] = R.drawable.traffic_14;
        intIcon[14] = R.drawable.traffic_15;
        intIcon[15] = R.drawable.traffic_16;
        intIcon[16] = R.drawable.traffic_17;
        intIcon[17] = R.drawable.traffic_18;
        intIcon[18] = R.drawable.traffic_19;
        intIcon[19] = R.drawable.traffic_20;
        // Integer โยนไป Adapter

        //Title
        final String[] strTitle = new String[20];
        strTitle[0] = "หัวข้อที่ 1";
        strTitle[1] = "หัวข้อที่ 2";
        strTitle[2] = "หัวข้อที่ 3";
        strTitle[3] = "หัวข้อที่ 4";
        strTitle[4] = "หัวข้อที่ 5";
        strTitle[5] = "หัวข้อที่ 6";
        strTitle[6] = "หัวข้อที่ 7";
        strTitle[7] = "หัวข้อที่ 8";
        strTitle[8] = "หัวข้อที่ 9";
        strTitle[9] = "หัวข้อที่ 10";
        strTitle[10] = "หัวข้อที่ 11";
        strTitle[11] = "หัวข้อที่ 12";
        strTitle[12] = "หัวข้อที่ 13";
        strTitle[13] = "หัวข้อที่ 14";
        strTitle[14] = "หัวข้อที่ 15";
        strTitle[15] = "หัวข้อที่ 16";
        strTitle[16] = "หัวข้อที่ 17";
        strTitle[17] = "หัวข้อที่ 18";
        strTitle[18] = "หัวข้อที่ 19";
        strTitle[19] = "หัวข้อที่ 20";

        // Detail
        final String[] strDetail = new String[20];
        strDetail[0] = "รายละเอีดยที่ 1";
        strDetail[1] = "รายละเอีดยที่ 2";
        strDetail[2] = "รายละเอีดยที่ 3";
        strDetail[3] = "รายละเอีดยที่ 4";
        strDetail[4] = "รายละเอีดยที่ 5";
        strDetail[5] = "รายละเอีดยที่ 6";
        strDetail[6] = "รายละเอีดยที่ 7";
        strDetail[7] = "รายละเอีดยที่ 8";
        strDetail[8] = "รายละเอีดยที่ 9";
        strDetail[9] = "รายละเอีดยที่ 10";
        strDetail[10] = "รายละเอีดยที่ 11";
        strDetail[11] = "รายละเอีดยที่ 12";
        strDetail[12] = "รายละเอีดยที่ 13";
        strDetail[13] = "รายละเอีดยที่ 14";
        strDetail[14] = "รายละเอีดยที่ 15";
        strDetail[15] = "รายละเอีดยที่ 16";
        strDetail[16] = "รายละเอีดยที่ 17";
        strDetail[17] = "รายละเอีดยที่ 18";
        strDetail[18] = "รายละเอีดยที่ 19";
        strDetail[19] = "รายละเอีดยที่ 20";


        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this,intIcon,strTitle,strDetail);
        trafficListView.setAdapter(objMyAdapter);

        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // Add event additem
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent ObjIntent = new Intent(MainActivity.this, DetailActivity.class);
                ObjIntent.putExtra("Title",strTitle[position]); // โยน ค่า ออกไป ที่หน้า Page ด้วยค่า Postion
                ObjIntent.putExtra("image", intIcon[position]);
                ObjIntent.putExtra("Detail",strDetail[position]);
                startActivity(ObjIntent);

            }// Event
        });


    }// Create ListView




    private void buttonController() {
        aboutMEButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sound effect
                MediaPlayer ButtonPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
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
