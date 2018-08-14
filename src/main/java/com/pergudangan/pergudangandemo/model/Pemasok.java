package com.pergudangan.pergudangandemo.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by bayu on 31/07/18.
 */

@Entity
@Table(name = "pemasok")
public class Pemasok {

    @Id
    @Column(name = "id_pemasok")
    private String idPemasok;

    @Column(name = "kode_pemasok")
    private String kodePemasok;

    @Column(name = "nama_pemasok")
    private String namaPemasok;

    @Column(name = "kota_pemasok")
    private String kotaPemasok;

    @Column(name = "no_telepon_pemasok")
    private String noTeleponPemasok;

    @OneToMany(mappedBy = "pemasok")
    public List<Barang> daftarBarang;

    public String getIdPemasok() {
        return idPemasok;
    }

    public void setIdPemasok(String idPemasok) {
        this.idPemasok = idPemasok;
    }

    public String getKodePemasok() {
        return kodePemasok;
    }

    public void setKodePemasok(String kodePemasok) {
        this.kodePemasok = kodePemasok;
    }

    public String getNamaPemasok() {
        return namaPemasok;
    }

    public void setNamaPemasok(String namaPemasok) {
        this.namaPemasok = namaPemasok;
    }

    public String getKotaPemasok() {
        return kotaPemasok;
    }

    public void setKotaPemasok(String kotaPemasok) {
        this.kotaPemasok = kotaPemasok;
    }

    public String getNoTeleponPemasok() {
        return noTeleponPemasok;
    }

    public void setNoTeleponPemasok(String noTeleponPemasok) {
        this.noTeleponPemasok = noTeleponPemasok;
    }

    public List<Barang> getDaftarBarang() {
        return daftarBarang;
    }

    public void setDaftarBarang(List<Barang> daftarBarang) {
        this.daftarBarang = daftarBarang;
    }
}
