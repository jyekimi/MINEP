package ch02.ex1_2_Functions

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun voidFunction (a: Int, b: Int): Unit //scala랑 kotlin 은 void 가 unit 임
{
    print("hello world")
}
fun main(args: Array<String>) {
    //println(max(1, 2))
    voidFunction(1,2)
}
