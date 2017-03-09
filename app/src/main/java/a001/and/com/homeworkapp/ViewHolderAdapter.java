package a001.and.com.homeworkapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zhaojipu on 2017/3/9.
 */

public class ViewHolderAdapter extends BaseAdapter {
    private Context context;
    private List<String> data;

    public ViewHolderAdapter(Context context, List<String> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder=null;
        if (convertView==null){
            viewHolder=new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.item_listview,null);
            viewHolder.image= (ImageView) convertView.findViewById(R.id.item_image);
            viewHolder.textView= (TextView) convertView.findViewById(R.id.item_text);
            convertView.setTag(viewHolder);

        }else
        viewHolder= (ViewHolder) convertView.getTag();
        viewHolder.textView.setText(data.get(position));
        return convertView;
    }

    public final class ViewHolder{
        public ImageView image;
        public TextView textView;
    }
}
