package ders8.alistirmalar.alistirma1

import ders8.alistirmalar.alistirma1.Yonetici

fun main() {
    print("Yöneticin Adı Soyası: ")
    val ad = readln().trim()

    print("Temel Maaş: ")
    val temelMaas = readln().toDoubleOrNull() ?: 0.0

    print("Prim miktarı: ")
    val primMiktari = readln().toDoubleOrNull() ?: 0.0

    val yonetici = Yonetici(ad, temelMaas, primMiktari)

    println("Yönetici: ${yonetici}")
    println("Ödenecek Toplam MaaŞ: ${yonetici.maasHesapla()}")


}