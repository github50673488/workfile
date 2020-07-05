//fun Recurrence(n:Long):Long
//{
//    if(n===1L){
//     return 1L
//    }
//  return  n+Recurrence(n-1)
//}

tailrec  fun Recurrence(n:Long,result:Long):Long
{
    println("  ${n}-------result=${result}")
    if(n===0L){
        return 1L
    }
    return  Recurrence(n-1,result+n)
}
fun main() {
    var result:Long=0
    println(Recurrence(1000000,result ))


}
