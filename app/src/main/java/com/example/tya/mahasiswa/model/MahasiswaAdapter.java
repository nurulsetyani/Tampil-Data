package com.example.tya.mahasiswa.model;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import com.example.tya.mahasiswa.R;

import java.util.ArrayList;
import java.util.List;
//public class MahasiswaAdapter extends ArrayAdapter<Mahasiswa> {
//    public MahasiswaAdapter(@NonNull Context context, int resource, @NonNull List<Mahasiswa> objects) {
//        super(context, resource, objects);
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        if (convertView  == null){
//            convertView= LayoutInflater.from(getContext()).inflate(R.layout.item_mahasiswa, parent, false);
//        return super.getView(position, convertView, parent);
//
//    }


//        String user = getItem(position);

//        Mahasiswa user = getItem(position);
//
//
//        TextView tvNama = convertView.findViewById(R.id.tv_nama);
//        tvNama.setText(mahasiswa.getNama());
//
//        TextView tvNim = convertView.findViewById(R.id.tv_nim);
//        tvNim.setText(mahasiswa.getNim());
//
//        TextView tvEmail = convertView.findViewById(R.id.tv_email);
//        tvEmail.setText(mahasiswa.getEmail());


public class MahasiswaAdapter extends ArrayAdapter<Mahasiswa> {
    ArrayList<Mahasiswa> data;
    private Context context;

    public MahasiswaAdapter(@NonNull Context context, int resource, ArrayList<Mahasiswa> datas) {
        super(context, resource, datas);
        this.data = datas;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_mahasiswa, parent, false);
        }
        TextView txtNama = convertView.findViewById(R.id.tv_nama);
        TextView txtNim = convertView.findViewById(R.id.tv_nim);
        TextView txtEmail = convertView.findViewById(R.id.tv_email);

        txtNama.setText(data.get(position).getNama());
        txtNim.setText(data.get(position).getNim());
        txtEmail.setText(data.get(position).getEmail());
        /*Picasso.get().load(mahasisa.getFoto()).into(ivFoto);*/

        ImageView img = convertView.findViewById(R.id.iv_foto);
        Picasso.get().load(data.get(position).getFoto())
                .resize(50,50).into(img);

        return convertView;
    }
}
