package ders6

import ders6.siniflar.Araba

fun main() {
    val benimArabam = Araba()
    val seninAraban = Araba()

    benimArabam.renk = "Kırmızı"
    benimArabam.hiz = 100

    benimArabam.gazaBas()
    benimArabam.frenYap()
    benimArabam.frenYap()
    benimArabam.frenYap()
    benimArabam.frenYap()
    benimArabam.frenYap()

    println("""
        |Benim arabamın özellikler:
        |Renk:${benimArabam.renk}
        |Hız: ${benimArabam.hiz}
        |Marka: ${benimArabam.marka}
    """.trimIndent())

    println("------------------------------------")

    seninAraban.gazaBas()

    println("""
        |Senin arabanın özellikler:
        |Renk:${seninAraban.renk}
        |Hız: ${seninAraban.hiz}
        |Marka: ${seninAraban.marka}
    """.trimIndent())
}

