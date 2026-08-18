package ders6.siniflar

class Araba {
    var renk: String = "Beyaz"
    var hiz: Int = 0
    var marka: String = "KotlinMotors"

    fun gazaBas() {
        hiz += 10
        println("Gaza basıldı. Yeni hız: $hiz km/s")
    }

    fun frenYap(){
        if(hiz >= 10){
            hiz -= 10
            println("Frene basıldı. Yeni hız: $hiz km/s")
        }else{
            hiz = 0
            println("Araba zaten duruyor")
        }
    }
}