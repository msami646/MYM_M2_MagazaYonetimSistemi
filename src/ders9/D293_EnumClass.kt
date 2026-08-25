package ders9

fun main() {
    val isik = TrafikIsigi.KIRMIZI

    when(isik){
        TrafikIsigi.KIRMIZI -> println("Dur")
        TrafikIsigi.SARI -> println("Hazırlan")
        TrafikIsigi.YESIL -> println("Geç")
    }
}