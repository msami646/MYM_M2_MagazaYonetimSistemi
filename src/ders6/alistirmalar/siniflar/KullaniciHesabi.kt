package ders6.alistirmalar.siniflar

class KullaniciHesabi {
        var sifre: String = "1233456"
            set (value){
                if(value.length >= 6){
                    field = value
                    println("Şifreniz başarıyla güncellendi")
                }else{
                    println("Şifreniz 6'dan fazla karaktere sahip olmalıdır. Eski şifreniz korunuyor")
                }
            }
}