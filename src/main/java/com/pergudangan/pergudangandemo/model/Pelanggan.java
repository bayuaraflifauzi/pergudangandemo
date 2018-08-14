package com.pergudangan.pergudangandemo.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by bayu on 31/07/18.
 */

@Entity
@Table(name = "pelanggan")
public class Pelanggan {

    @Id
    @Column(name = "id_pelanggan")
    private String idPelanggan;

    @Column(name = "kode_pelanggan")
    private String kodePelanggan;

    @Column(name = "nama_pelanggan")
    private String namaPelanggan;

    @Column(name = "kota_pelanggan")
    private String kotaPelanggan;

    @Column(name = "no_telepon_pelanggan")
    private String noTeleponPelanggan;

    @Column(name = "email_pelanggan")
    private String emailPelanggan;

    @OneToMany(mappedBy = "pelanggan")
    public List<TransaksiJual> daftarTransaksiJual;

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getKodePelanggan() {
        return kodePelanggan;
    }

    public void setKodePelanggan(String kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getKotaPelanggan() {
        return kotaPelanggan;
    }

    public void setKotaPelanggan(String kotaPelanggan) {
        this.kotaPelanggan = kotaPelanggan;
    }

    public String getNoTeleponPelanggan() {
        return noTeleponPelanggan;
    }

    public void setNoTeleponPelanggan(String noTeleponPelanggan) {
        this.noTeleponPelanggan = noTeleponPelanggan;
    }

    public String getEmailPelanggan() {
        return emailPelanggan;
    }

    public void setEmailPelanggan(String emailPelanggan) {
        this.emailPelanggan = emailPelanggan;
    }

    public List<TransaksiJual> getDaftarTransaksiJual() {
        return daftarTransaksiJual;
    }

    public void setDaftarTransaksiJual(List<TransaksiJual> daftarTransaksiJual) {
        this.daftarTransaksiJual = daftarTransaksiJual;
    }
}
