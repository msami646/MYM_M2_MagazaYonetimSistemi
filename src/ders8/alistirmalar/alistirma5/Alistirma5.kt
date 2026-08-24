package ders8.alistirmalar.alistirma5

fun main() {
    println("Adınızı giriniz: ")
    val adGirdisi = readln().trim()

    val ad = if (adGirdisi.isEmpty()) "Admin" else adGirdisi

    println("Yetki seviyesini giriniz: ")
    val yetkiSeviyesi = readln().toIntOrNull() ?: 1

    val yonetici = YoneticiKullanici(ad,yetkiSeviyesi)
    println("Yönetici Adı: ${yonetici.ad}")
    println("Yetki Seviyesi: ${yonetici.yetkiSeviyesi}")

}