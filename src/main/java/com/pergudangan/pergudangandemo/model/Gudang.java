package com.pergudangan.pergudangandemo.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by bayu on 24/07/18.
 */

@Entity
@Table(name = "gudang")
public class Gudang {

    @Id
    @Column(name = "id_gudang")
    private String idGudang;

    @Column(name = "kode_gudang")
    private String kdGudang;

    @Column(name = "nama_gudang")
    private String namaGudang;

    @Column(name = "lokasi_gudang")
    private String lokasiGudang;

    @OneToMany(mappedBy = "gudang")
    public List<TransaksiGudangBarang> daftarGudangBarang;

    public String getIdGudang() {
        return idGudang;
    }

    public void setIdGudang(String idGudang) {
        this.idGudang = idGudang;
    }

    public String getKdGudang() {
        return kdGudang;
    }

    public void setKdGudang(String kdGudang) {
        this.kdGudang = kdGudang;
    }

    public String getNamaGudang() {
        return namaGudang;
    }

    public void setNamaGudang(String namaGudang) {
        this.namaGudang = namaGudang;
    }

    public String getLokasiGudang() {
        return lokasiGudang;
    }

    public void setLokasiGudang(String lokasiGudang) {
        this.lokasiGudang = lokasiGudang;
    }

    public List<TransaksiGudangBarang> getDaftarGudangBarang() {
        return daftarGudangBarang;
    }

    public void setDaftarGudangBarang(List<TransaksiGudangBarang> daftarGudangBarang) {
        this.daftarGudangBarang = daftarGudangBarang;
    }
}
