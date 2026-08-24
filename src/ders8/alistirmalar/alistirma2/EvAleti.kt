package ders8.alistirmalar.alistirma2
/*
EvAleti adında kalıtıma açık (open) bir ata sınıf oluşturun ve constructor girişinde marka (String) özelliği alsın.
İçine açık (open) bir calis() metodu ekleyin. Bu sınıfı miras alan Televizyon ve Utu adlarında iki adet yavru sınıf tasarlayın.
Televizyon sınıfında calis() metodunu ezerek (override) ekrana “Televizyon açıldı, ekran taranıyor.” yazdırın. Utu sınıfında ise aynı metodu ezerek ekrana
“Ütü ısınmaya başladı, buhar hazır!” yazdırın. main içinde kullanıcıya “1: TV, 2: Ütü” seçeneğini sunup, seçimine göre doğru nesneyi üretin ve calis() metodunu tetikleyin.
 */
open class EvAleti( val marka: String) {
    open fun calis(){
        println("Ev aleti çalışmaya hazır")
    }

}