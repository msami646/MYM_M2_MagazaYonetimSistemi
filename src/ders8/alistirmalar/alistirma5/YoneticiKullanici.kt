package ders8.alistirmalar.alistirma5

class YoneticiKullanici(ad: String,val yetkiGirdisi: Int) : Kullanici(ad) {
    var yetkiSeviyesi: Int = 1
        set(value){
            if (value in 1..5){
                field = value
            }else{
                println("Hatalı yetki seviyesi girdiniz. Yetki otomatik olarak 1 yapıldı.")
                field = 1
            }
        }
    init {
        yetkiSeviyesi = yetkiGirdisi
    }
}