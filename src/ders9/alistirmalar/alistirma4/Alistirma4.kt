package ders9.alistirmalar.alistirma4

fun main() {
    val ogrenciler = listOf(
        Ogrenci("Mehmet Sami Aydın",85),
        Ogrenci("Ömer Kaçar",45),
        Ogrenci("Kayra Yılmaz",30),
        Ogrenci("Nuray Birinci",90)
    )
    print("Dersten geçme notunu giriniz: ")
    val gecmeNotu = readln().toIntOrNull() ?: 50

    val kalanlar = ogrenciler.filter { it.puan < gecmeNotu } .map { it.ad }

    if(kalanlar.isEmpty()){
        println("Tebrikler sınıfta dersten kalan öğrenci bulunmamaktadır.")
    }else{
        kalanlar.forEach { println("Dersten kalan öğrenci: $it")}
    }
}