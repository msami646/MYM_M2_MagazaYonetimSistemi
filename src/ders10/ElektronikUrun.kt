package ders10

data class ElektronikUrun (val garantiSuresi : Int, override val isim: String, override val fiyat: Double, override val kategori: Kategori) : Urun {

    override fun kdvliFiyatHesapla() = fiyat * 1.20


}
