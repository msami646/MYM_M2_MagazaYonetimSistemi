package ders10

class Magaza {
    companion object{
        const val MarketIsmi = "Kotlin Market"
    }

    private val urunlerListesi = mutableListOf<Urun>()

    fun urunEkle(yeniUrun : Urun){
        urunlerListesi.add(yeniUrun)
        println("${Renk.GREEN}${yeniUrun.isim} sisteme eklendi.${Renk.RESET}")
    }

    fun urunleriListele(){

        if (urunlerListesi.isNotEmpty()){
            urunlerListesi
                .forEach { println("${Renk.BLUE}Ürün ismi: ${it.isim} | Ürün fiyatı: ${it.fiyat} | Ürün kategorisi: ${it.kategori} | Ürün kdvli fiyatı: ${it.kdvliFiyatHesapla()}${Renk.RESET}")}

        } else println("${Renk.RED}HATA: Listenizde bulunana bir ürün yok!${Renk.RESET}")
    }

    fun kategorileriFiltrele(arananKategori: Kategori){

        val suzulenListe = urunlerListesi
            .filter {it.kategori.equals(arananKategori) }

        if (suzulenListe.isNotEmpty()){
            suzulenListe
                .forEach { println("${Renk.BLUE}Ürün ismi: ${it.isim} | Ürün fiyatı: ${it.fiyat} | Ürün kategorisi: ${it.kategori} | Ürün kdvli fiyatı: ${it.kdvliFiyatHesapla()}${Renk.RESET}")}
        }else println("${Renk.RED}HATA: Listenizde bulunana bir ürün yok!${Renk.RESET}")
    }
}