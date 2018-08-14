package com.pergudangan.pergudangandemo.repository;

import com.pergudangan.pergudangandemo.model.Gudang;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bayu on 01/08/18.
 */
public interface GudangDao extends JpaRepository<Gudang, String> {
}
