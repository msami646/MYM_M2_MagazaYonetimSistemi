package ders10

fun main() {

    val magaza = Magaza()

    do {
        println(
            """
         ${Magaza.MarketIsmi}'ne hoşgeldiniz!
         💻   1: Elektronik Ürün Ekle
         🍎   2: Gıda Ürünü Ekle
         📝   3: Tüm Ürünleri Listele
         💻📝 4: Elektronik Ürünleri Filtrele
         🚪    5: Çıkış 
    """.trimIndent()
        )

        println("Seçiminizi girin: ")
        val secim = readln()

        when (secim) {
            "1" -> {

                var urunGarantiSuresi: Int
                var urunFiyati: Double
                var urunIsmi: String

                do {
                    print("Urun ismini girin: ")
                    urunIsmi = readln().trim()
                    if (urunIsmi.isEmpty()){
                        println("${Renk.RED}HATA: Girdiğiniz isim boş! Lütfen girdiyi doldurunuz.${Renk.RESET}")
                    }else break
                } while (true)

                do {
                    try {
                        print("Urunun garanti suresini girin: ")
                        urunGarantiSuresi = readln().toInt()
                        break
                    } catch (e: Exception) {
                        println("${Renk.RED}HATA: Urun garantisine verdiğin değerler geçerli değil! Lütfen bir tam sayı girin!${Renk.RESET}")
                    }
                } while (true)

                do {
                    try {
                        print("Urunun fıyatını girin: ")
                        urunFiyati = readln().toDouble()
                        break
                    } catch (e: Exception) {
                        println("${Renk.RED}HATA: Urun fiyatına veriler geçerli değil! Lütfen bir sayı girin!${Renk.RESET}")
                    }
                } while (true)

                val yeniUrun = ElektronikUrun(urunGarantiSuresi, urunIsmi, urunFiyati, Kategori.ELEKTRONIK)
                magaza.urunEkle(yeniUrun)
                println()
            }

            "2" -> {
                var sonKullanmaTarihi: String
                var urunFiyati: Double
                var urunIsmi: String

                do {
                    print("Urun ismini girin: ")
                    urunIsmi = readln().trim()
                    if (urunIsmi.isEmpty()){
                        println("${Renk.RED}HATA: Girdiğiniz isim boş! Lütfen girdiyi doldurunuz.${Renk.RESET}")
                    }else break
                } while (true)


                print("Urunun son kullanma tarihini girin ('24/3/2025' gibi kullanarak belirtin) : ")

                do {
                    print("Urun ismini girin: ")
                    sonKullanmaTarihi = readln().trim()
                    if (sonKullanmaTarihi.isEmpty()){
                        println("${Renk.RED}HATA: Girdiğiniz tarih yok! Lütfen girdiyi doldurunuz.${Renk.RESET}")
                    }else break
                } while (true)

                do {
                    try {
                        print("Urunun fıyatını girin: ")
                        urunFiyati = readln().toDouble()
                        break
                    } catch (e: Exception) {
                        println("${Renk.RED}HATA: Urun fiyatına veriler geçerli değil! Lütfen bir sayı girin!${Renk.RESET}")
                    }
                } while (true)

                val yeniUrun = GidaUrunu(sonKullanmaTarihi,urunIsmi,urunFiyati, Kategori.GIDA)
                magaza.urunEkle(yeniUrun)
                println()
            }

            "3" -> {
                magaza.urunleriListele()
                println()
            }

            "4" -> {
                magaza.kategorileriFiltrele(Kategori.ELEKTRONIK)
                println()
            }

            "5" -> {
                break
            }

            else -> println("${Renk.RED}Girdiğiniz seçim geçersiz${Renk.RESET}")
        }
    } while (true)

    println("Görüşürüz, ${Magaza.MarketIsmi}'ne yine bekleriz...")
}