fun main() {
    val i= {x: Int, y: Int -> x+y}
    val j:(Int,Int)->Int ={x,y->x+y}
    println("result is:${   add(3, 5)}")
    println("result is:${   i(3, 5)}")
    println("result is:${   j(3, 5)}")
}

fun add(x: Int, y: Int)=  x+y


