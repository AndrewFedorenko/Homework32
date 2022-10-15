package main.java

fun main(){
    val i:Int=5;
    println("Pow " + i + " is " + i.pow())
    println("I can filter chars".filterChar('a', 'r', ' '))
}

// this function extends Int for power
fun Int.pow(): Double {
    return (this.toDouble()) * (this.toDouble())
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

