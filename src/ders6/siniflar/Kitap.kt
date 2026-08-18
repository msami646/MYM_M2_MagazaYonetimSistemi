package ders6.siniflar

class Kitap {
    var kitapAdi: String = " "
    var sayfaSayisi:Int = 0
    var okunanSayfa:Int = 0

    fun sayfaOku(okunacakAdet: Int){
        okunanSayfa += okunacakAdet

        if (okunanSayfa >= sayfaSayisi){
            println("Tebrikler, $kitapAdi adlı kitabı bitidiniz!")
            println("Toplam okunan sayfa sayısı: $okunanSayfa")
            okunanSayfa = sayfaSayisi
        }

        println("Toplam okunan sayfa sayısı: $okunanSayfa")
    }

}