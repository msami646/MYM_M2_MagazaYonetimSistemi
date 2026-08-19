package ders6.alistirmalar

import ders6.alistirmalar.siniflar.Ogrenci

fun main() {
    val ogrenci = Ogrenci()

    print("Öğrencinin adını giriniz: ")
    val ogrenciAdi = readln().trim()

    for (i in 1..3){
        print("${i}. Sınav notunu giriniz:  ")
        val sinavNotu = readln().toDoubleOrNull() ?: 0.0
        ogrenci.notEkle(sinavNotu)
        println()
    }

    var ortalama = ogrenci.ortalamaHesapla()

    println("Ogrenci: $ogrenciAdi")
    println("Notlar: ${ogrenci.notlar}")
    println("Ortalama: $ortalama")

}