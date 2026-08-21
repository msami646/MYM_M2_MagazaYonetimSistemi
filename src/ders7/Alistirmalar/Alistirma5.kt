package ders7.Alistirmalar

import ders7.Alistirmalar.Siniflar.FizikMotoru

fun main() {
    print("Düşüş süresini saniye cinsinden giriniz: ")
    val sure = readln().toDoubleOrNull()?:0.0

    val hiz = FizikMotoru.serbestDusmeHizi(sure)

    println("$sure saniye serbest düşen cismin ulaşacağı hız: ${"%.2f".format(hiz)}")
}