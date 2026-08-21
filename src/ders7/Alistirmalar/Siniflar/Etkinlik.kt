package ders7.Alistirmalar.Siniflar

class Etkinlik(val etkinlikAd: String, baslangicSaatGirdisi: Int, bitisSaatiGirdisi: Int) {
    val baslangicSaati = baslangicSaatGirdisi
    var bitisSaati = bitisSaatiGirdisi

    init {
        if(bitisSaati <= baslangicSaati){
            println("HATA: Bitiş saati ($bitisSaatiGirdisi: 00) başlangıçtan önce olamaz! Bitiş saati otomatik olarak ${baslangicSaati + 2}:00 saat sonrasına ayarlandı")
            bitisSaati = baslangicSaati + 2
        }else{
            bitisSaati = bitisSaatiGirdisi
            println("Etkinlik zaman planlaması oluşturuldu.")
        }
    }
    fun detaylariGoster(){
        println("Etkinlik adı $etkinlikAd | Saat: $baslangicSaati")
    }

}