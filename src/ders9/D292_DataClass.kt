package ders9

fun main() {
    val urun1 = UrunModeli(1,"Klavye")
    val urun2 = UrunModeli(1,"Klavye")
    println(urun1 == urun2)

    val urun1V2 = urun1.copy(sepetMi = true)
    println(urun1V2)

}