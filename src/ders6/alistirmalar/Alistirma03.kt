package ders6.alistirmalar

import ders6.alistirmalar.siniflar.BankaHesabi

fun main() {
    val hesap = BankaHesabi()

    print("yatırmak istediğiniz tutar: ")
    val yatirilan = readln().toDoubleOrNull() ?: 0.0
    hesap.paraYatir(yatirilan)

    print("Çekmek istediğinz tutar: ")
    val cekilen = readln().toDoubleOrNull() ?: 0.0
    hesap.paraCek(cekilen)

    val guncelBakiye = hesap.bakiyeSorgula()
    println(guncelBakiye)
}