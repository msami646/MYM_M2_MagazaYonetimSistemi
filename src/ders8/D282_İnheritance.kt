package ders8

fun main() {
    val kedi = Kedi()
    kedi.ad = "Tekir"
    kedi.yas = 3

    kedi.beslen()
    println("${kedi.ad}'in yaşı : ${kedi.yas}")
    kedi.uykuModu()


}
