package ders8

fun main() {
    val bisiklet = Bisiklet("BMX")
    bisiklet.kornaCal()
    println(bisiklet.marka)

    bisiklet.tekerlekSayisi = 2
    println(bisiklet.tekerlekSayisi)
}