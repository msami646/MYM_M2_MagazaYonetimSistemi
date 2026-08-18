package ders6

import ders6.siniflar.Kitap

fun main() {
    val kitap = Kitap()

    kitap.kitapAdi = "Kotlin'in Macerakarı"
    kitap.sayfaSayisi = 350
    kitap.sayfaOku(50)
    kitap.sayfaOku(50)
    kitap.sayfaOku(50)
    kitap.sayfaOku(50)
    kitap.sayfaOku(50)
    kitap.sayfaOku(50)
    kitap.sayfaOku(50)
}