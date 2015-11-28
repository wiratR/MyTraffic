package appewtc.masterung.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    /// Explicit
    private ListView trafficListView;   //decalre parameter inside class parameter
    private Button aboutMEButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Bind Widget @คือดารผูก พารามิตอร์ กับ Widget
        bindWidget();
        

    }   // Main Method

    private void bindWidget() {
    }

}   // Main Class นี่คือคลาสหลัก นะคะ
