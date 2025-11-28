package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.ModelMahasiswa;
import com.example.demo.service.MahasiswaService;
import org.springframework.stereotype.Component;
import java.util.List;


@Component // <-- GANTI INI
public class MahasiswaController {

    @Autowired // <-- BIARKAN INI, ini adalah inti dari Spring
    private MahasiswaService mahasiswaService;

    // Hapus constructor manual (jika ada)

    // Method-method ini HARUS sesuai dengan apa yang dipanggil oleh View
    // (Tanpa @RequestBody, @PathVariable, dan tidak return String)

    public void addMahasiswa(ModelMahasiswa mhs) {
        mahasiswaService.addMhs(mhs);
    }

    public ModelMahasiswa getMahasiswa(int id) {
        return mahasiswaService.getMhs(id);
    }

    public void updateMahasiswa(ModelMahasiswa mhs) {
        mahasiswaService.updateMhs(mhs);
    }

    public void deleteMahasiswa(int id) {
        mahasiswaService.deleteMhs(id);
    }

    public List<ModelMahasiswa> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswa();
    }
}
