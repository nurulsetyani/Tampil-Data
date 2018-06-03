package com.example.tya.mahasiswa.model;

import  retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import  retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface MahasiswaService {
    @GET ("mahasiswe")
    Call<MahasiswaResult> getMahasiswes();

    @GET ("mahasiswe/id")
    Call <MahasiswaResult> getMahasiswe(@Path("id")int id);

    @POST("mahasiswe")
    Call<String> setMahasiswe (@Body Mahasiswa mahasiswa);

    @DELETE("mahasiswe/id")
    Call<String>hapusMahasiswe(@Path("id")int id);

}
