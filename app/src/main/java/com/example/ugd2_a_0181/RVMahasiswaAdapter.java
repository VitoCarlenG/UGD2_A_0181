package com.example.ugd2_a_0181;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ugd2_a_0181.entity.Mahasiswa;

public class RVMahasiswaAdapter extends RecyclerView.Adapter<RVMahasiswaAdapter.viewHolder> {
    //  Attribute listMahasiswa kita pada adapter
    private final Mahasiswa[] listMahasiswa;

    // Kelas ini berguna untuk menghubungkan view view yang ada pada item di recycler view kita.
    public static class viewHolder extends RecyclerView.ViewHolder{
        TextView tvNama;
        TextView tvDetails;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvDetails = itemView.findViewById(R.id.tv_details);
        }
    }

    //  Constructor adapter kita
    RVMahasiswaAdapter(Mahasiswa[] data){
        listMahasiswa = data;
    }

    @NonNull
    @Override
    public RVMahasiswaAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //  Disini kita menghubungkan layout item recycler view kita
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_mahasiswa,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RVMahasiswaAdapter.viewHolder holder, int position) {
        //  Karena kita sudah mendefinisikan dan menghubungkan view kita,
        //  kita bisa memakai view tersebut dan Melakukan setText pada view tersebut

        holder.tvNama.setText(listMahasiswa[position].getName());
        holder.tvDetails.setText(listMahasiswa[position].getTahunMasuk() + " - " + listMahasiswa[position].getIPK());
    }

    @Override
    public int getItemCount() {
        //  Disini kita memberitahu jumlah dari item pada recycler view kita.
        return listMahasiswa.length;
    }

}