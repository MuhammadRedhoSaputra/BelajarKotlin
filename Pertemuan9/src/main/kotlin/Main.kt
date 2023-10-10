fun main(){
    // Map & Set
    // Map<K, V>
    var tahunKelahiran = mapOf("Redho" to 1990, "Bella" to 1991, "Natashya" to 1992, "Zhafira" to 1993)
    println(tahunKelahiran)
    var skorGame = mutableMapOf("Redho" to 1990, "Bella" to 1991, "Natashya" to 1992, "Zhafira" to 1993)
    println(skorGame)

    // skorGame = mutableMapOf() // membuat map kosong
    var pairs = HashMap<String, Int>() // membuat map kosong baru
    pairs = HashMap<String, Int>(20) // membuat map dengan kapasitas

    // akses value dari map

    println(skorGame["Natasyah"])
    println(skorGame["Zhafira"])

    println(skorGame.get("Redho"))
    println(skorGame.get("Bella"))

    println(skorGame.isEmpty())
    println(skorGame.size)

    // tahunKelahiran["Redho"] = 1989 // error karena menggunakan mapOf()
    skorGame["Redho"]

    var bobData = mutableMapOf("name" to "Bob", "profession" to "Cardplayer", "country" to "Russia")

    println(bobData)

    // cara menambahkan key dan value pada mutablemap
    bobData.put("State", "RS")
    bobData["city"] = "Moskow"
    println(bobData)

    // cara update key dan value pada mutablemap
    bobData.put("name", "Bobby")
    bobData["profession"] = "Soldier"
    println(bobData)

    // menggunakan operator infix += untuk menambahkan pasangan key/value baru ke mutable
    val pairData = "nickname" to "Bobby D"
    bobData += pairData
    println(bobData)

    // removing pairs
    bobData.remove("city")
    bobData.remove("state", "RS")
    println(bobData)

    // for-in
    for ((player, score) in skorGame) {
        println("$player - $score")
    }

    for (player in skorGame.keys) {
        print("$player, ")
    }
    println()

    // Set

    val names = setOf("Redho", "Bella", "Natashya", "Zhafira")
    println(names)
    val hashSet = HashSet<Int>() // membuat satu set kosong

    val bilBulatArray = arrayOf(1, 2, 3, 1)
    var bilBulatSet = mutableSetOf(*bilBulatArray) // spread operator
    println(bilBulatSet)

    // menggunakan contains
    println(bilBulatSet.contains(1)) // true

    // menggunakan in
    println(4 in bilBulatSet) // false

    // menambahkan elemen
    bilBulatSet.add(5)
    println(bilBulatSet)

    // menghapus elemen
    bilBulatSet.remove(5)
    println(bilBulatSet) // [, 2, 3]

    // menghapus elemen
    bilBulatSet.remove(5)
    println(bilBulatSet) // [, 2, 3]


}