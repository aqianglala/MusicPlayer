package com.example.admin.musicplayer.adapter;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin.musicplayer.R;
import com.example.admin.musicplayer.bean.HotBean;
import com.example.admin.musicplayer.utils.ScreenUtils;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

public class HotGridAdapter extends MyBaseAdapter<HotBean.ShowapiResBodyEntity.PagebeanEntity.SonglistEntity> {

    private Context mContext;
    public HotGridAdapter(Context context , List<HotBean.ShowapiResBodyEntity.PagebeanEntity.SonglistEntity> data) {
        super(data);
        mContext=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HotBean.ShowapiResBodyEntity.PagebeanEntity.SonglistEntity item = (HotBean
                .ShowapiResBodyEntity.PagebeanEntity.SonglistEntity) getItem(position);
        ViewHolder holder;
        if(convertView==null){
            convertView= LayoutInflater.from(mContext).inflate(R.layout.item_gridview_hot,parent,
                    false);
            holder=new ViewHolder();
            holder.sdv_album= (SimpleDraweeView) convertView.findViewById(R.id.sdv_album);
            holder.tv_singername= (TextView) convertView.findViewById(R.id.tv_singername);
            holder.tv_songname= (TextView) convertView.findViewById(R.id.tv_songname);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }
        Uri uri=null;
        int screenWidth = ScreenUtils.getScreenWidth(mContext);
        int imgWidthOrHeight=(int)((float)screenWidth-3*ScreenUtils.dip2px(6))/2;
        ViewGroup.LayoutParams layoutParams = holder.sdv_album.getLayoutParams();
        layoutParams.width=imgWidthOrHeight;
        layoutParams.height=imgWidthOrHeight;
        holder.sdv_album.setLayoutParams(layoutParams);
        if(!TextUtils.isEmpty(item.getAlbumpic_big())){
            uri = Uri.parse(item.getAlbumpic_big());
            holder.sdv_album.setImageURI(uri);
        }
        holder.tv_singername.setText(item.getSingername());
        holder.tv_songname.setText(item.getSongname());
        return convertView;
    }

    class ViewHolder {
        SimpleDraweeView sdv_album;
        TextView tv_singername;
        TextView tv_songname;
    }

}
