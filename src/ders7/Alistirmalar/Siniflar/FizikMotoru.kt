package ders7.Alistirmalar.Siniflar

class FizikMotoru {
    companion object{
        const val YER_CEKIMI = 9.8
        fun serbestDusmeHizi(saniye: Double): Double{
            return saniye * YER_CEKIMI
        }
    }

}