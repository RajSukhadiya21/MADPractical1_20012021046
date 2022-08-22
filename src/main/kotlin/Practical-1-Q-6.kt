fun calculator(vararg n1:Int,n2:Int,n3:Int ,  opr:Char):Int{
    var sum:Int
    var sub:Int
    var mul:Int
    var div:Int
    if(opr=='+')
    {
        println("sum=$n1+$n2+$n3")
    }
    if(opr=='-')
    {
        println("sub=$n1-$n2-$n3")
    }
}}





 fun main() {
     println("Enter a operations")
     var a= readLine()!!.toInt()
     var b= readLine()!!.toInt()
     var c= readLine()!!.toInt()
//     var d= readLine()!!.toInt()
     var y='+'
     calculator(a,b,c,y)

}




