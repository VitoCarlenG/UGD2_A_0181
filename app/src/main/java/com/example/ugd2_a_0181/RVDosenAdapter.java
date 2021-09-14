package com.example.ugd2_a_0181;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ugd2_a_0181.entity.Dosen;
import com.google.android.material.card.MaterialCardView;

public class RVDosenAdapter extends RecyclerView.Adapter<RVDosenAdapter.viewHolder> {
    //  Attribute listDosen kita pada adapter
    private final Dosen[] listDosen;

    // Kelas ini berguna untuk menghubungkan view view yang ada pada item di recycler view kita.
    public static class viewHolder extends RecyclerView.ViewHolder{
        TextView tv_namaDosen;
        TextView tv_nipDosen;
        TextView tv_tahunBergabungDosen;
        MaterialCardView card;
        String url1, url2;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            tv_namaDosen = itemView.findViewById(R.id.tv_namaDosen);
            tv_nipDosen = itemView.findViewById(R.id.tv_nipDosen);
            tv_tahunBergabungDosen = itemView.findViewById(R.id.tv_tahunBergabungDosen);
            card = itemView.findViewById(R.id.card);
            url1 = itemView.getContext().getResources().getText(R.string.url1).toString();
            url2 = itemView.getContext().getResources().getText(R.string.url2).toString();
        }
    }

    //  Constructor adapter kita
    RVDosenAdapter(Dosen[] data){
        listDosen = data;
    }

    @NonNull
    @Override
    public RVDosenAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //  Disini kita menghubungkan layout item recycler view kita
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_dosen,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RVDosenAdapter.viewHolder holder, int position) {
        //  Karena kita sudah mendefinisikan dan menghubungkan view kita,
        //  kita bisa memakai view tersebut dan Melakukan setText pada view tersebut

        holder.tv_namaDosen.setText(listDosen[position].getName());
        holder.tv_nipDosen.setText(listDosen[position].getNIP());
        holder.tv_tahunBergabungDosen.setText(holder.url1 + listDosen[position].getTahunBergabung() + holder.url2);

        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setTitle("Data Dosen");
                builder.setMessage("Dosen yang dipilih adalah " + holder.tv_namaDosen.getText().toString())
                        .setPositiveButton("CLOSE", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        })
                        .show();
            }
        });
    }

    @Override
    public int getItemCount() {
        //  Disini kita memberitahu jumlah dari item pada recycler view kita.
        return listDosen.length;
    }

}