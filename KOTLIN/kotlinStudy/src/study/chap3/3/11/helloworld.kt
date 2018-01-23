package study.chap3.`3`.`11`
//
//class helloworld(val height: Int, val width: Int) {
//
//
//    init{
//        height = 100
//    }
//
//
//    val isSquare: Boolean
//        get() {
//            return height == width
//        }
//
//}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {
    println(isLetter('q'))
    println(isNotDigit('x'))
    print("hello world")
    noReturnFun(1)
    val list = listOf(1,2,3)
    stringReturn(list.joinToString (separator = "; ",
            prefix = "(") })
}

fun stringReturn(Collection<T>.joinToString(seperator: String =", ",
prefix: String = "",
postfix: String = ".")): String {
    val result = StringBuilder(prefix)

    for(indx, element) int this.withIndex()){
        if(indx > 0 ) result.append(seperator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()

}
fun noReturnFun(args: Int) : Unit{
    print ("test")
    println("Any")

    val list = listOf(1, 2, 3)
    println(list)

}
