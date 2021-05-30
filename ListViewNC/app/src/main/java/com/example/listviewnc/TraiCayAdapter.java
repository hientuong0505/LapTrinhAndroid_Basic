package com.example.listviewnc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<TraiCay> traiCaylist;

    public TraiCayAdapter(Context context, int layout, List<TraiCay> traiCaylist) {
        this.context = context;
        this.layout = layout;
        this.traiCaylist = traiCaylist;
    }

    @Override
    public int getCount() {
        //Trong Adapter co bao nhieu du lieu thi` tra ve`
        return traiCaylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView  imgHinh;
        TextView txtTen,txtMota;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);

            holder = new ViewHolder();
            //Anh xa View
            holder.txtTen = (TextView) convertView.findViewById(R.id.txtTen);
            holder.txtMota = (TextView) convertView.findViewById(R.id.txtMota);
            holder.imgHinh = (ImageView) convertView.findViewById(R.id.imgHinh);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        //Gan gia tri
        TraiCay traiCay = traiCaylist.get(position);
        holder.txtTen.setText(traiCay.getTen());
        holder.txtMota.setText(traiCay.getMota());
        holder.imgHinh.setImageResource(traiCay.getHinh());

        return convertView;
    }
}
