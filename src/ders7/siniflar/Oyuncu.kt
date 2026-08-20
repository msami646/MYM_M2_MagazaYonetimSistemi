package ders7.siniflar

class Oyuncu(var isim:String,can:Int) {
    var can:Int = can
        set(value){
            if(value !in 0..100){
                println("HATA:Can değeri 0 ile 100 arasından olmalı.")
                field = 100
            }
        }

    init {
        println("Yeni bir oyuncu katıldı. Hoşgeldin $isim")

        if(can !in 1..100){
            println("Can değeri 0 ile 100 arasında olmalı.")
            this.can = can
        }
    }
}