package com.example.demo.respository;

import com.example.demo.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Integer> {


}
