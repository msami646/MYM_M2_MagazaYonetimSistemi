package ders7.Alistirmalar.Siniflar

class Kullanici(
    val kullaniciAdi :String,
    val rol: String = "Standart Üye"
) {
    fun bilgilewriGoster(){
        println(kullaniciAdi +" " + rol)
    }
}