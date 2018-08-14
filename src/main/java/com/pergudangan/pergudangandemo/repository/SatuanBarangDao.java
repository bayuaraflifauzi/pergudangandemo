package com.pergudangan.pergudangandemo.repository;

import com.pergudangan.pergudangandemo.model.SatuanBarang;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bayu on 01/08/18.
 */
public interface SatuanBarangDao extends JpaRepository<SatuanBarang, String> {
}
