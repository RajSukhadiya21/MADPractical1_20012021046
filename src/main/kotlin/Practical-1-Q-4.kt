fun main()
{
    println("Enter a number")
    var n:Int= readLine()!!.toInt()
    println(if(n%2==0)
    {
       ("Number is even")
    }
    else
    {
        ("Number is odd")
    })
}