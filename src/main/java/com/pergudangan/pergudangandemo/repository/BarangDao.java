package com.pergudangan.pergudangandemo.repository;

import com.pergudangan.pergudangandemo.model.Barang;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bayu on 02/08/18.
 */
public interface BarangDao extends JpaRepository<Barang, String> {
}
