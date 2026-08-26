package ders9.alistirmalar.alistirma5

fun main() {
    val calisanlar = listOf(
        Calisan("Ahmet Can Yıldırım",80000.0),
        Calisan("Bahar Atasoy" ,120000.0),
        Calisan("Mehmet Sami Aydın",150000.0)
    )
    calisanlar.forEach { println("Ad: ${it.ad} -> ${it.maas}TL")}

    println("Zam oranında yüzde olarak giriniz: ")
    val zamOrani = readln().toDoubleOrNull() ?: 0.0

    calisanlar.map {
        val yeniMaas = it.maas+(it.maas * zamOrani / 100)
        it.copy(maas = yeniMaas)
    }.forEach {
        println("Ad.${it.ad} -> yeni Maaş: ${it.maas} TL")
    }
}