package com.pergudangan.pergudangandemo.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by bayu on 24/07/18.
 */

@Entity
@Table(name = "jenis_barang")
public class JenisBarang {

    @Id
    @Column(name = "id_jenis_barang")
    private String idJenisBarang;

    @Column(name = "nama_jenis_barang")
    private String namaJenisBarang;

    @OneToMany(mappedBy = "jenisBarang")
    public List<Barang> daftarBarang;

    public String getIdJenisBarang() {
        return idJenisBarang;
    }

    public void setIdJenisBarang(String idJenisBarang) {
        this.idJenisBarang = idJenisBarang;
    }

    public String getNamaJenisBarang() {
        return namaJenisBarang;
    }

    public void setNamaJenisBarang(String namaJenisBarang) {
        this.namaJenisBarang = namaJenisBarang;
    }

    public List<Barang> getDaftarBarang() {
        return daftarBarang;
    }

    public void setDaftarBarang(List<Barang> daftarBarang) {
        this.daftarBarang = daftarBarang;
    }
}
