package ders7.Alistirmalar

import ders7.Alistirmalar.Siniflar.Calisan

/*
Görev 4: Şirket Veritabanı ve Çalışan Sayacı (Companion Object)

Calisan adında bir sınıf oluşturun ve girişinde isim parametresini alsın. Sınıfın içine bir companion object bloğu açarak şirketteki toplam personel sayısını tutacak
 bir sayaç (Int) tanımlayın. Sınıfın init bloğu, her yeni çalışan nesnesi üretildiğinde bu sayacı otomatik olarak 1 artırsın. main içinde bir döngü kullanarak
  ,kullanıcıdan sırayla 3 çalışanın ismini isteyip nesneleri üretin. İşlem bittiğinde, üretilen nesneleri hiç kullanmadan doğrudan Calisan sınıfı üzerinden
   toplam personel sayısını ekrana yazdırın.
 */
fun main() {
    for (i in 1..3){
        print("$i.personel adını giriniz: ")
        val yeniPersonel = readln().trim()
        Calisan(yeniPersonel)
    }
    println("Toplam Kayıtlı çalışan sayısı: ${Calisan.calisanSayisi}")
}