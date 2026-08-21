package ders7.Alistirmalar

import ders7.Alistirmalar.Siniflar.Kullanici

fun main() {
    print("Adınızı girin: ")
    val ad = readln().trim()

    println("Özel bir yetki rolünüz var mı?(E / H)")
    val secim = readln().trim().uppercase()
    if(secim == "E"){
        print("Sistem rolünüzü giriniz: ")
        val rol = readln().trim()
        val ozelKullanici = Kullanici(ad,rol)
        ozelKullanici.bilgilewriGoster()
    }




}