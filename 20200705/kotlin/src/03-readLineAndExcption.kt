import java.lang.Exception

fun main() {
    println("please input first num:")
    var num1str= readLine()
    println("please input second num:")
    var num2str= readLine()


    try {
        //    var num1=num1str?.toInt()
//    var num2=num2str?.toInt()//  it not allow null + null

        var num1=num1str!!.toInt()
        var num2=num2str!!.toInt()
        println("$num1str+$num2str=${num1+num2}")
    }
    catch (e:Exception)
    {
        println("大哥，请输入数字！")
    }





}
