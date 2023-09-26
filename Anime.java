package com.mycompany.postest1;

import java.util.ArrayList;

public class Anime {
    public String judul_anime;
    public String genre;
    public String studio_produksi;
    public String pengarang;
    public int tahun_rilis;
    public int jumlah_eps;
    public int rating;

// constructor
    public Anime(String judul, String genre, String studio_produksi, String pengarang,
                 int tahun_rilis, int jumlah_eps, int rating) {
        this.judul_anime = judul;
        this.genre = genre;
        this.studio_produksi = studio_produksi;
        this.pengarang = pengarang;
        this.tahun_rilis = tahun_rilis;
        this.jumlah_eps = jumlah_eps;
        this.rating = rating;
    }

    // method get
    public String getJudul_anime() {
        return judul_anime;
    }

    public String getGenre() {
        return genre;
    }

    public String getStudio_produksi() {
        return studio_produksi;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahun_rilis() {
        return tahun_rilis;
    }

    public int getJumlah_eps() {
        return jumlah_eps;
    }

    public int getRating() {
        return rating;
    }

    // metode toString untuk mewakili objek sebagai string
    public String toString() {
        return "Judul: " + judul_anime + "\n" +
               "Genre: " + genre + "\n" +
               "Studio Produksi: " + studio_produksi + "\n" +
               "Pengarang: " + pengarang + "\n" +
               "Tahun Rilis: " + tahun_rilis + "\n" +
               "Jumlah Eps: " + jumlah_eps + "\n" +
               "Rating: " + rating;
    }
}
    