package com.example.tya.mahasiswa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import com.example.tya.mahasiswa.model.AplClient;
import com.example.tya.mahasiswa.model.Mahasiswa;
import com.example.tya.mahasiswa.model.MahasiswaAdapter;
import com.example.tya.mahasiswa.model.MahasiswaResult;
import com.example.tya.mahasiswa.model.MahasiswaService;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisualisasi

        ListView lvUser = (ListView) findViewById(R.id.lv_user);
        //String[] user= new String []("Nurul","Setyani");
        //ArrayAdapter<String> userAdapter = new ArrayAdapter<>(context: this,
       // android.R.layout.simple_list_item_1, user);
       // lvUser.setAdapter(userAdapter);

        //Pojo (Plain Old Jawa Object)

//        Mahasiswa mahasiswa1 = new Mahasiswa();
//        mahasiswa1.setNama ("Nurul");
//        mahasiswa1.setNim ("33415018");
//        mahasiswa1.setEmail("nurul@gmail.com");
//        mahasiswa1.setFoto("https://picsum.photos/200/300?random");
//
//        Mahasiswa mahasiswa2 = new Mahasiswa();
//        mahasiswa2.setNama ("tya");
//        mahasiswa2.setNim ("33415018");
//        mahasiswa2.setEmail("tya@gmail.com");
//        mahasiswa2.setFoto("https://picsum.photos/200/300?random");
//
//        Mahasiswa mahasiswa3 = new Mahasiswa();
//        mahasiswa3.setNama ("Setyani");
//        mahasiswa3.setNim ("33415018");
//        mahasiswa3.setEmail("nurul@gmail.com");
//        mahasiswa3.setFoto("https://picsum.photos/200/300?random");
//
//        ArrayList<Mahasiswa>mahasiswas = new ArrayList<>();
//        mahasiswas.add(mahasiswa1);
//        mahasiswas.add(mahasiswa2);
//        mahasiswas.add(mahasiswa3);


        MahasiswaService mService = AplClient.getRetrofit().create(MahasiswaService.class);
        Call<MahasiswaResult> mahasiswe = mService.getMahasiswes();
        mahasiswe.enqueue(new Callback<MahasiswaResult>() {
            @Override
            public void onResponse(Call<MahasiswaResult> call, Response<MahasiswaResult> response) {
                List<Mahasiswa>user = (response.body().getMahasiswes());
                MahasiswaAdapter userAdapter = new MahasiswaAdapter(getApplicationContext(), 0, user);
                ListView lvUser = (ListView)findViewById(R.id.l) )
                Toast.makeText(
                        getApplicationContext(),
                        "Jumlah Mahasiswa:" + response.body().getMahasiswes();
                        Toast.LENGTH_LONG
                ).show();
            }

            @Override
            public void onFailure(Call<MahasiswaResult> call, Throwable t) {

            }
        });
    }

    private void tampilkan (List<Mahasiswa>mahasiswes){
        MahasiswaAdapter userAdapter = new MahasiswaAdapter(this,0,mahasiswes);
        ListView lvUser =(ListView) findViewById(R.id.lv_user);
        lvUser.setAdapter(userAdapter);
    }

//        MahasiswaAdapter userAdapter userAdapter = new MahasiswaAdapter(context)


}

