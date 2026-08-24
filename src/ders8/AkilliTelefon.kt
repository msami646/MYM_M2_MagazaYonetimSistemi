package ders8

class AkilliTelefon: SarjEdilebilir , SesCikarabilir {
    override fun sarjEt() {
        println("Şarj ediliyor.")
    }

    override fun sesCikar() {
        println("Zırrrrrr. Telefon çalıyor")
    }

}