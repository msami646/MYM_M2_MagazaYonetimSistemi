package ders10

data class GidaUrunu(val sonKullanmaTarihi : String, override val isim: String, override val fiyat: Double, override val kategori: Kategori) : Urun {

    override fun kdvliFiyatHesapla() = fiyat * 1.01
}
