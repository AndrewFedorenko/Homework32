package main.java

fun main(){
    val i:Int=3;
    println("Pow " + i + " is " + i.pow(5.0))
    println("I can filter chars".filterChar('a', 'r', ' '))
}

// this function extends Int for power
fun Int.pow(powVar: Double): Double {
    var result: Double = 1.0;
    for (i in 1..this){
        result *= powVar
    }
    return result
}

// this function extends String for some char filtering
fun String.filterChar(vararg chArray:Char) : String {
    var res:String="";
    for (ch1 in this){
        if (chArray.contains(ch1)){
            res+=ch1
        }
    }
    return res
}

