package ders8.alistirmalar.alistirma3

fun main() {
    println("Hangi Cihaza bağlanmak istersiniz: ")
    print("1.Kamera \n2.Buzdolabı")

    val secim  = readln().trim()

    when(secim){
        "1" ->{
           val kamera = AkilliKamera()
           kamera.interneteBaglan()
        }
        "2" ->{
            val buzdolabi = AkilliBuzdolabi()
            buzdolabi.interneteBaglan()
        }
        else ->{
            println("Geçersiz İşlem")
        }
    }
}