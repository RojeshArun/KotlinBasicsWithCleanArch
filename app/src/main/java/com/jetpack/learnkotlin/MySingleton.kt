package com.jetpack.learnkotlin


//Singleton class
object  MySingleton1{
    init {

    }

}

fun main(){
    val obj1 = MySingleton1
    val obj2 = MySingleton1
    println(obj1.toString())
    println(obj2.toString())

}


