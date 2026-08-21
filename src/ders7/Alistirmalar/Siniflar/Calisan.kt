package ders7.Alistirmalar.Siniflar

class Calisan (var isim: String){
    companion object{
        var calisanSayisi = 0
    }
    init {
        calisanSayisi++
    }
}