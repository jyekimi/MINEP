package ch02.ex2_2_CustomAccessors

class Rectangle(val height: Int, val width: Int) {

    val Height: Int
    init{
        Height = 100
        //생성자 body 에 들어갈것
    }
    val isSquare: Boolean
        get() {
            return height == width
        }
    //secondary index

    //secondary construction

}

fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
}
