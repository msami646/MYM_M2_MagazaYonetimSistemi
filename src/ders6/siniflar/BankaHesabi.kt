package ders6.siniflar

class BankaHesabi {
    private var bakiye: Double = 0.0

    fun bakiyeSorgula(){
        println("Bekleyeniz: $bakiye TL")
    }

    fun paraYatir(miktar: Double){
        if (miktar >0){
            bakiye += miktar
            println("Hesabınıza $miktar Tl yatırılırmıştır.")
            println("Yeni bakiyeniz: $bakiye TL.")
        }else{
            println("HATA: Yatırılan para miktarı sıfırdan büyük olmalıdır.")
        }
    }
}