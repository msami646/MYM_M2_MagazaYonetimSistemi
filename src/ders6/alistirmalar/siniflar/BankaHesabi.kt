package ders6.alistirmalar.siniflar

class BankaHesabi {
    private var bakiye: Double = 0.0

    fun bakiyeSorgula(): Double{
        return bakiye
    }

    fun paraYatir (miktar: Double){
        if (miktar >0){
            bakiye += miktar
            println("$miktar TL başarıyla eklendi")
        }else{
            println("HATA: Yatıracağınız miktar 0'dan büyük olmalı")
        }
    }

    fun paraCek(miktar: Double){
        if (miktar>0 && miktar <= bakiye){
            bakiye -= miktar
            println("$miktar Tl başarıyla çekildi")
        }else if (miktar > bakiye){
            println("HATA: Yetersiz Bakiye")
        }else{
            println("HATA: Çekeceğiniz para 0'dan büyük olmalı")
        }
    }

}