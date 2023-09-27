package com.jetpack.learnkotlin


    //Step 1
    //Simple Inhertance
    open class baseClass(var x:Int){
      open var name = "BaseClass"

        @JvmName("functionOfKotlin") // Name conflict
        fun getName():String{
            return name
        }

        open fun findName():String{
            return name
        }

    }

    //Open and override
    class derivedClass(x:Int): baseClass(x){
       override var name = "Derived Class"

      override  fun findName():String{ // overrides the run method of base class
            return name
        }
    }

//Step 2
//Inner Classes
class Car(){
    var make:String = "BMW"
    var year:Int = 0
    var model:String = "C Class"

    inner class Engine{
        var horsePower : Int = 0
        var cylinder : Int = 0

        fun getEngineInfo():String{
            return horsePower.toString()+ "Horse power"
        }
    }

    fun getCarInfo():String{
        return "Car"
    }


}

//Step 3 - Nested classes

class outterClass{
    var ocv:String = "Outter Class"

    class innerClass{
        var icv:String="Inner Class"
        //1. default nested class is static so we can access
        // the nested class property
       // or variables using dot(.) notation without
       // creating an object of the class.

       //2. Nested class can’t access the members of the outer class,
    // but we can access the property of nested class from the outer
    // class without creating an object for nested class.

        fun innerClassFun(){
            println(icv + " function")
        }

    }

}

//Step 5 interface
interface Animal{
    fun eat()
    fun move()
    fun talk():Int { return 0}
}
class Human:Animal{
    override fun eat() {
        print("eat")
    }

    override fun move() {
        print("Move")
    }

    override fun talk(): Int{
        return 0
    }

}

//HW
//Data Class??
//Sealed Class??
//Abstract class
//Enum
//Lambda function
//influx fun




fun main(){

    //Step 1- Inheritence
    var dc = derivedClass(10)
    println(dc.findName())

    //Step 2 - Innner class
    var ic = Car()
    var eng = ic.Engine()
    println(eng.getEngineInfo())
    println(ic.getCarInfo())
    println(ic.Engine().getEngineInfo())

    //Step 3 - Nested class
    println(outterClass.innerClass().icv)
    println(outterClass.innerClass().innerClassFun())

    //Step 4 - Getter & Setter

    //Setp 5 - Interfaces
    //an interface is a collection of abstract methods and properties
    // that define a common contract for classes that implement the interface.
        val hum = Human()
        hum.eat()
    //Default values and Default Methods
    //


    //Step 6 : Step Function
    for (x in 0 .. 30 step 5){
        println(x)
    }

    //




}