package com.pergudangan.pergudangandemo.repository;

import com.pergudangan.pergudangandemo.model.Pemasok;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bayu on 01/08/18.
 */
public interface PemasokDao extends JpaRepository<Pemasok, String> {
}
