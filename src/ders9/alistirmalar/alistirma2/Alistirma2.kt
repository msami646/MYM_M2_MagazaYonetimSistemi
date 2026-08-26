package ders9.alistirmalar.alistirma2

fun main() {
    println("Kargo durumunuzu giriniz(1-BEKLEMEDE, 2-YOLDA , 3-TESLİMEDİLDİ)")
    val secim = readln().toIntOrNull()

    val guncelDurumu = when (secim) {
        1 -> KargoDurumu.BEKLEMEDE
        2 -> KargoDurumu.YOLDA
        3 -> KargoDurumu.TESLIM_EDILDI
        else -> null
    }

    if(guncelDurumu == null){
        println("HATA:Seçtiğiniz durum kodu geçersiz!")
    }else{
        when(guncelDurumu){
            KargoDurumu.BEKLEMEDE -> println("Sipraiş onaylandı.")
            KargoDurumu.YOLDA -> println("Kargonuz yola çıktı en kısa sürede teslim edilecektir.")
            KargoDurumu.TESLIM_EDILDI -> println("Başarıyla kargo adresine teslim edilmiştir.")
        }
    }

}