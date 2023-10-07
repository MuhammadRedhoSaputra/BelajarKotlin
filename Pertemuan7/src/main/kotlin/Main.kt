fun main() {
    var name = "Redho"
    var age = 21
    var occupation = ""

//    var errorCode = 0
    var errorCode: Int? // nullabe Int
//    cara memberikan nilai pada variabel nullable
    errorCode = 100
    println(errorCode)

//    cara mengaturnya ke null
    errorCode = null
    println(errorCode)

//    checking for null
    var result: Int? = 30
    println(result)
    println(result!! + 1)

    var authorName: String? = "Kotaro Minami"
    var authorAge: Int? = 24
    val ageAfterBirthday = authorAge!! + 1 //not-null assertion operator !!
    println("After their next birthday, author will be $ageAfterBirthday")

    authorAge = null
//    println("After their next birthday, author will be ${authorAge!! + 2}")

    //Smart Casts
    var nonNullableAuthor: String
    var nullableAuthor: String?

    if(authorName != null) {
        nonNullableAuthor = authorName
    } else {
        nullableAuthor = authorName
    }

    // Safe Call
    authorName = "Takeo Ischi"
    var nameLength = authorName?.length
    println("Author's name has length $nameLength.")

    var nameLengthPlus5 = authorName?.length?.plus(5)
    print("Author's name length plus 5 is $nameLengthPlus5.")

//    let() function
    authorName?.let {
        nonNullableAuthor = authorName

    }

    authorName?.let {
        nameLength = authorName.length

    }

//    Elvis operator (?:)
    var nullableInt: Int? = 10
    var mustHaveResult = nullableInt ?: 0
//    var mustHaveResult = if (nullableInt != null) null else 0
    println(mustHaveResult)

    nullableInt = null
    mustHaveResult = nullableInt ?: 0
    println(mustHaveResult)

}