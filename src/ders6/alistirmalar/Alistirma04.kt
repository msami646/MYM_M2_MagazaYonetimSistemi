package ders6.alistirmalar

import ders6.alistirmalar.siniflar.KullaniciHesabi

fun main() {
    val profil = KullaniciHesabi()

    println("Yeni şifrenizi girin: ")
    val kullaniciSifresi = readln()
    profil.sifre = kullaniciSifresi


}