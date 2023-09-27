package com.jetpack.learnkotlin

fun main(){

    class Car(var color:String="Green"){ // Primary constructor
        init {
            //just after the primiary const
            print("init called"+color)

        }

        init {

        }

        var name:String = "BMW"
        var model: String = "C Class"
        var year : Int = 1990


        constructor(cost:Int,make:String,warrety:String):this(color="red"){

        }// SEcondary const


       //constructor(cost:Int) : this()

        //Function or method




    }

  //  var car1 = Car() // Default const

    var car2 = Car()
    //var car3 = Car(100)
    // Secondary const

    var x = 0b1001
    print(x)



    open class MyParentClass(var myName:String){
        fun getParentDetails(){
            println(myName)
        }

    }

    open class MyChildClass(name: String) : MyParentClass(myName = name){

    }

    class MyGrandChildClass: MyChildClass("Sachin"){

    }

    var obj = MyChildClass("Rojesh")
    obj.getParentDetails()





    open class A{
        fun getData(): Unit {
            print("A")
            return
        }
    }

    class B:A(){

    }

    var b = B()
    b.getData()
    



}