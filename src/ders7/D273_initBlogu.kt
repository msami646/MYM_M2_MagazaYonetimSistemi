package ders7

import ders7.siniflar.Oyuncu

fun main() {
    val oyuncu1 = Oyuncu("Hero", -80)
    println(oyuncu1.can)

    oyuncu1.can = -80
    println(oyuncu1.can)
}