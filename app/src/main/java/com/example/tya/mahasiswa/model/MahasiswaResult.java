package com.example.tya.mahasiswa.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MahasiswaResult {
    @SerializedName("mahasiswes")
    @Expose
    private List<Mahasiswa> mahasiswes = null;

    public List<Mahasiswa> getMahasiswes() {
        return mahasiswes;
    }

    public void setMahasiswes(List<Mahasiswa> mahasiswes) {
        this.mahasiswes = mahasiswes;
    }
}
