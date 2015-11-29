package appewtc.masterung.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 11/29/2015.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private int[] iconInts;     //name+datatype
    private String[] tittleStrings;
    private String[] detailStrings;

    public MyAdapter(Context objContext, int[] iconInts, String[] tittleStrings, String[] detailStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.tittleStrings = tittleStrings;
        this.detailStrings = detailStrings;




    }

    @Override
    public int getCount() { //ทำหน้าที่ในการนับ List view
        return tittleStrings.length;    // นับจำนวน String ที่ได้รับ เข้ามา
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) { // position = i , parent = viewGroup

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // open service , Get service cahe to ให้พารามิเตอร์ วื่งผ่านเข้ามา
        View ObjView1 = objLayoutInflater.inflate(R.layout.my_listview, parent, false);
        // กดหนด ค่า พารามิเตอร์ ImageView icon
        ImageView iconImageView = (ImageView) ObjView1.findViewById(R.id.imvicon);
        iconImageView.setImageResource(iconInts[position]);
        // กดหนด ค่า พารามิเตอร์ Textview titletextview
        TextView titleTextView = (TextView) ObjView1.findViewById(R.id.txtTitle);
        titleTextView.setText(tittleStrings[position]);
        // กดหนด ค่า พารามิเตอร์ Textview detailtextview
        TextView detailTextView = (TextView) ObjView1.findViewById(R.id.txtDetail);
        detailTextView.setText(detailStrings[position]);


        return ObjView1;
    }

    // Main Class
}
