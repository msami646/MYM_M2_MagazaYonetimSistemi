package ders7

import ders7.siniflar.Araba

fun main() {
    val araba1 = Araba("Tofaş","Kırmızı",2005)
    val araba2 = Araba( "a","a",1)
    val araba3 = Araba("b","b",2)
    araba3.hiz = 100
    araba3.motorCalisiyorMu = false


    println(araba1.marka)
    println(araba1.renk)
    println(araba1.uretimYili)

    println(araba2.marka)
    println(araba2.renk)
    println(araba2.uretimYili)

    println(araba3.motorCalisiyorMu)

}