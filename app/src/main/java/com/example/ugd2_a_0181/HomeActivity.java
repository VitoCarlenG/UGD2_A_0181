package com.example.ugd2_a_0181;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //  Fragment yang pertama kali terlihat adalah fragment mahasiswa
        changeFragment(new FragmentMahasiswa());
        setTitle("Data Mahasiswa");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Disini kita menghubungkan menu yang telah kita buat dengan activity ini
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.home_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.menu_mahasiswa){
            //  Jika menu yang dipilih adalah Mahasiswa maka ganti fragmentnya dengan FragmentMahasiswa
            changeFragment(new FragmentMahasiswa());
            setTitle("Data Mahasiswa");
        }else if(item.getItemId() == R.id.menu_dosen){
            //  Jika menu yang dipilih adalah Dosen maka ganti fragmentnya dengan FragmentDosen
            changeFragment(new DosenFragment());
            setTitle("Data Dosen");
        }else{
            //  Jika menu yang dipilih adalah menu Exit, maka tampilkan sebuah dialog
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure want to exit?")
                    .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //  Keluar dari aplikasi
                            finishAndRemoveTask();
                        }
                    })
                    .show();
        }
        return super.onOptionsItemSelected(item);
    }

    //  Method untuk mengubah fragment
    public void changeFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.layout_fragment,fragment)
                .commit();
    }
}