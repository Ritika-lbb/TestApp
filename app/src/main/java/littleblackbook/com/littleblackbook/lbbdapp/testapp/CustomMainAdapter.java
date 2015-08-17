package littleblackbook.com.littleblackbook.lbbdapp.testapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 8/10/2015.
 */
public class CustomMainAdapter extends BaseAdapter {
    Context context;
    ArrayList<TestRowObject> testRowObjects;
    TestRowObject testRowObject;
    static String book;

    public CustomMainAdapter(Context context, ArrayList<TestRowObject> testRowObjects){
        this.context=context;
        this.testRowObjects=testRowObjects;
    }

    @Override
    public int getCount() {
        return testRowObjects.size();
    }

    @Override
    public Object getItem(int position) {
        return testRowObjects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return testRowObjects.indexOf(getItem(position)) ;
    }

    public class ViewHolder{
        TextView tv_title, tv_category;
        ImageView iv_image;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        LayoutInflater mInflater = (LayoutInflater)
                context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.main_row_element_layout, null);
            holder = new ViewHolder();
            holder.iv_image = (ImageView) convertView.findViewById(R.id.iv_articleImage);
            holder. tv_title = (TextView) convertView.findViewById(R.id.tv_title);
            holder.tv_category = (TextView) convertView.findViewById(R.id.tv_category);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        testRowObject = (TestRowObject) getItem(position);
        holder.tv_title.setText(testRowObject.getTitle());
        holder.tv_category.setText(testRowObject.getCategories());
        holder.iv_image.setImageResource(testRowObject.getMainImage());
        return convertView;
    }

}
