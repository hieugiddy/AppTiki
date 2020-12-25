package com.hieu.apptiki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridView_Adapter extends BaseAdapter {
    private List<GridItem> list;
    private Context context;
    private LayoutInflater layoutInflater;

    public GridView_Adapter(List<GridItem> list, Context context) {
        this.list = list;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView!=null){
            viewHolder=(ViewHolder) convertView.getTag();
        }
        else
        {
            convertView=layoutInflater.inflate(R.layout.grid_item,null);
            viewHolder=new ViewHolder();
            viewHolder.img_item=convertView.findViewById(R.id.img_item);
            viewHolder.txt_item=convertView.findViewById(R.id.txt_item);
            convertView.setTag(viewHolder);
        }
        GridItem gridItem=list.get(position);
        viewHolder.img_item.setImageResource(gridItem.getImg_item());
        viewHolder.txt_item.setText(gridItem.getTxt_item());
        return convertView;
    }
    private class ViewHolder{
        ImageView img_item;
        TextView txt_item, mota;
    }
}
