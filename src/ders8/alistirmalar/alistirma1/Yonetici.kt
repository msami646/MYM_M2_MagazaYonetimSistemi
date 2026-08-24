package ders8.alistirmalar.alistirma1

class Yonetici(isim: String,maas: Double,val prim: Double)  : Calisan(isim,maas) {

    override fun maasHesapla(): Double {
        return maas + prim
    }
}