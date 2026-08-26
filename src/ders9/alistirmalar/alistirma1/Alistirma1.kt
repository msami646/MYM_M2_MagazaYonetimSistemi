package ders9.alistirmalar.alistirma1

fun main() {
    print("Yolcu adını giriniz: ")
    val isimGirdisi = readln().trim()

    val isim = if (isimGirdisi.isEmpty()) "İsimsiz Yolcu" else isimGirdisi

    print("Koltuk numarısını giriniz: ")
    val koltuk = readln().trim().uppercase()

    val standartYolcu = Yolcu(isim,koltuk,false)

    println(standartYolcu)

    val vipYolcu = standartYolcu.copy(koltukNo = "1A", vipUyelik = true)

    println("ESKİ KART: $standartYolcu")
    println("YENİ VIP KART: $vipYolcu")
}