package ders7.Alistirmalar

import ders7.Alistirmalar.Siniflar.Etkinlik

fun main() {
    print("Etkinlik adını giriniz: ")
    val ad = readln().trim()

    print("Başlangıç saatini giriniz: ")
    val baslangicSaati = readln().toIntOrNull() ?: 10

    print("Bitiş saatini giriniz: ")
    val bitisSaati = readln().toIntOrNull() ?: 12

    val konser = Etkinlik(ad,baslangicSaati,bitisSaati)
    konser.detaylariGoster()
}