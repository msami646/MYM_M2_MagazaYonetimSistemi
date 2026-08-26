package ders9.alistirmalar.alistirma3

fun main() {
    val odaSicakliklari = listOf(18.5,25.4,22.8,30.0,34.8)

    println("Odaların anlık sıcaklıkları: $odaSicakliklari")

    println("Tehlikeli sınır sıcaklık değerini giriniz: ")
    val sinirSicaklikDerecesi = readln().toDoubleOrNull() ?: 25.0

    odaSicakliklari
        .filter { it > sinirSicaklikDerecesi }
        .map {"Yüksek sıcaklık uyarısı $it derece!!"}
        .forEach { println(it)}

}