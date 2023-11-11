enum class JenisKelamin {
    LAKI_LAKI, PEREMPUAN
}

enum class Direction {
    LEFT, RIGHT
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class State {
    INPUT{
        override fun result(): State = INPUT
    },
    PROCESS{
        override fun result(): State = PROCESS
    },
    OUTPUT{
        override fun result(): State = OUTPUT
    };
    abstract fun result(): State
}

enum class CreditCard {
    SILVER{
        override fun calculateAdminFee(): Int = 150_000

    },
    GOLD{
        override fun calculateAdminFee(): Int = 200_000
    },
    PLATINUM{
        override fun calculateAdminFee(): Int = 300_000
    };
    abstract fun calculateAdminFee(): Int
}

interface  CardLimit {
    fun getLimit(): Int
}

enum class CardType : CardLimit{
    MASTER_CARD {
        override fun getLimit(): Int = 5_000_000
    },
    VISA_CARD{
        override fun getLimit(): Int = 10_000_000
    }
}

fun main(){
    val lakilaki= JenisKelamin.LAKI_LAKI
    println("Jenis Kelamin : ${lakilaki.name}")

    val arahKanan = Direction.RIGHT
    println("Arah : ${arahKanan.name}")

    val merah = Color.RED
    val hijau = Color.GREEN
    val biru = Color.BLUE
    println("Warna merah : ${merah.rgb}")
    println("Warna hijau : ${hijau.rgb}")
    println("Warna biru : ${biru.rgb}")

    val goldCreditCard = CreditCard.GOLD
    println("Biaya Admin ${goldCreditCard.name} : ${goldCreditCard.calculateAdminFee()}")

    val visaCard = CardType.VISA_CARD
    println("Limit kartu ${visaCard.name} : ${visaCard.getLimit()}")
}