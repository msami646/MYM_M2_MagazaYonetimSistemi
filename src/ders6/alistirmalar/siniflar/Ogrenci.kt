package ders6.alistirmalar.siniflar

class Ogrenci {
    val adSoyad = "Bilinmeyen"
    val notlar = mutableListOf<Double>()

    fun notEkle(yeniNot: Double){
        if (yeniNot in 0.0..100.0){
            notlar.add(yeniNot)
            println("Not başarıyla eklendi")
        }
    }
    fun ortalamaHesapla(): Double {
        var toplam = 0.0

        if (notlar.isEmpty()) {
            return 0.0
        } else {
            for (not in notlar) toplam += notlar[not.toInt()]
        }
        return toplam

    }
}