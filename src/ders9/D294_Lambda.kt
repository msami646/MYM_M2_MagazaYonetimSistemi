package ders9

fun main() {
    val sayilar = listOf(1,2,3,4,5)

    val ciftler = sayilar.filter { it % 2 == 0 }
    println(ciftler)

    val kareler = sayilar.map { it * it }
    println(kareler)

    ciftler.forEach { println("Çift Sayı: $it")}



    val numaralar = listOf(10,15,45,85,5,20,25,30)

    numaralar.filter { it > 15 }.map { it * 2 }.forEach { println(it)}

    numaralar.sorted().forEach { println(it)}
    println("-------------")
    numaralar.reversed().forEach { println(it)}
}