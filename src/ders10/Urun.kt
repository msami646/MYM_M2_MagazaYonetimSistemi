package ders10

interface Urun {
    val isim: String
    val fiyat: Double
    val kategori : Kategori

    fun kdvliFiyatHesapla() : Double
}
