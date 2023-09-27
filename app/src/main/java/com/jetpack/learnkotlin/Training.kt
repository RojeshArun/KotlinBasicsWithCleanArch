package com.jetpack.learnkotlin

fun main(){

    var name = "Medtronic"
    val age = 15   // final in java

    name = "Mozarc"
   // age = 17
 //   print(name)

    var fName:String = "Rojesh"
    var lName: String = "AK"

    var sirName:String? = null


 //   println(fName + lName)


    //var companyName: String = null

    //Null safety
    println(sirName?.length)

    //Null Assertion operator
    var address : String? = null

    address = "Whitefiled, Banglore"
    println(address!!.length)

    // Elwis opeator
     var address1: String? = null
  //  address1 = "Banglore"
    println(address1?:"Invaid")

    //When
    var count = 50
    //count = "Rojesh"


    var answerString = when{
        (count in 1 .. 50) -> "Its in range"
        count == 50 -> "I have the answer."
        count >= 40 -> "The answer is close."
        else -> "The answer eludes me."

    }
    println(answerString)

    //Kotlin range operator ..
    for (numb in 1 .. 10){
        println(numb)

    }

    var ages = arrayOf(1,2,3,4,5,6)
    var ageVal = 5

    if (ageVal in ages){
        println("In range")
    }

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
    if( "VOL" in "volvo"){
        print("YES")
    }
    var myName = "Rojesh"

    var desc = "$myName is a lead engg working in medtronic whose name length is ${myName.length} "
    print(desc)









}