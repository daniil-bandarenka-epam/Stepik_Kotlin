// конвертер валют из долларов в рубли на 24 марта 2018
fun convert(dol:Double = 1.00):Double {
    val rub:Double = 57.24
    return dol*rub
}

fun main(args: Array<String>) {
    val user_value:String? = readLine()
    if (user_value == null) return
    val dol:Double = user_value.toDouble()
    val sum:Double = convert(dol)
    println("За ${dol} долларов вы получите ${sum} рублей")
}