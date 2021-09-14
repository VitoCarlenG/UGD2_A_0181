package com.example.ugd2_a_0181;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    //  Attribute yang akan kita pakai
    private TextInputLayout inputUsername;
    private TextInputLayout inputPassword;
    private ConstraintLayout mainLayout;
    private String tempUsername, tempPassword;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Ubah Title pada App Bar Aplikasi
        setTitle("User Login");

        //  Hubungkan variabel dengan view di layoutnya.
        inputUsername = findViewById(R.id.inputLayoutUsername);
        inputPassword = findViewById(R.id.inputLayoutPassword);
        mainLayout = findViewById(R.id.mainLayout);

        Button btnClear = findViewById(R.id.btnClear);
        Button btnLogin = findViewById(R.id.btnLogin);

        imageView = findViewById(R.id.glide);

        //  Aksi btnClear ketika di klik
        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //  Mengkosongkan Dan Mengoper Inputan
                tempUsername = inputUsername.getEditText().getText().toString();
                tempPassword = inputPassword.getEditText().getText().toString();
                inputUsername.getEditText().setText("");
                inputPassword.getEditText().setText("");

                //  Memunculkan SnackBar
                Snackbar.make(mainLayout,"Text Cleared Success",Snackbar.LENGTH_LONG).setAction("CANCEL", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        inputUsername.getEditText().setText(tempUsername);
                        inputPassword.getEditText().setText(tempPassword);
                    }
                })
                .show();
            }
        });

        //  Aksi pada btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean checkLogin = false;
                String username = inputUsername.getEditText().getText().toString();
                String password = inputPassword.getEditText().getText().toString();

                //  Pengecekan apakah inputan kosong
                if(username.isEmpty()){
                    inputUsername.setError("Username must be filled with text");
                    checkLogin = false;
                }

                //  Pengecekan apakah Inputan kosong
                if(password.isEmpty()){
                    inputPassword.setError("Password must be filled with text");
                    checkLogin = false;
                }

                //  Ganti Password dengan NPM kalian.
                if(username.equals("admin") && password.equals("0181"))
                    checkLogin = true;

                if(!checkLogin) return;

                Intent moveHome = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(moveHome);
            }
        });
    }

    public void loadImage(View view) {
        String url = "https://i1.sndcdn.com/avatars-BhLriW69ILYgEAzG-ZBeB8w-t240x240.jpg";
        Glide.with(this)
                .load(url)
                .centerCrop()
                .placeholder(R.drawable.undraw_teacher_35j2)
                .into(imageView);
    }
}