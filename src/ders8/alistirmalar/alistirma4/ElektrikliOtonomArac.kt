package ders8.alistirmalar.alistirma4

class ElektrikliOtonomArac: Surulebilir, SarjEdilebilir {
    override fun ilerle() {
        println("Otonom sürüş Modu aktif.Güvenli şekilde ilerleniyor.")
    }

    override fun sarjEt() {
        println("Sarj istasyonuna bağlandı .Pil dolumu başlatıldı")
    }

}