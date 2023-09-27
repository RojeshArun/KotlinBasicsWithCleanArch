package com.jetpack.learnkotlin

fun main(){

    //Keywords used to create variables
    var name ="Rojesh" // Mutable
    val age = 16  //immutable

    //age = 40
    name = "sachin"
  //  name = 100
    println(name)
    print(age)

    //The difference between var and val is that variables declared
   // with the var keyword can be changed/modified, while val variables cannot.

    //We dont have to specify which type of variable it it,

    //eg:
    var brand: String
    brand = "BMW"

    //var model
    //model = "C class"

    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

    /////Type safety ?

    var companyName:String? = "Medtronic" // Null safe
   // companyName = null
    println(companyName)
    println(companyName?.length)

    //Executes the relevant call only when the value
   // is non-null else it prints a null
    // Avoid null point exception


    /////Not null assertion

    var address : String? = null
    address = "Whitefiled, Banglore"
    println(address!!.length)


    //converts the nullable references into nullable
    // type  irrespective of its a null or not
    //This operator must be only used when one is
   //  200% sure the value is not null

////// elwis  operator - Null collation operator
    var id : Int?= null
    id = 535173
    println(id?:"Invalid id")

    //When expression - Similar to switch in java


    var count:Int? = 50

    val answerString = when {
        count == 42 -> "I have the answer."
        count!! > 35 -> "The answer is close."
        else -> "The answer eludes me."
    }
    println(answerString)

    //Kotlin range .. operator
    for (chars in 'a'..'x') {
        println(chars)
    }

    for (nums in 1..10) {
        println(nums)
    }

    //Kotlin in operator - To check the value exists in the range
    val nums = arrayOf(2, 4, 6, 8)

    if (2 in nums) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

//Function or Methods
//    A function is a block of code which only runs when it is called.

    fun myFunction(){
        print("Hi i'm kotlin function")
    }

    myFunction()

    fun myFunction1(title: String){
        print("Hi i'm kotlin function"+ title )
    }

    myFunction1("Happy learning")


    fun add(a: Int, b : Int): Int{
        var c = a+ b
       return c
    }

    print(add(10, 20))


    /**************** OOPS ******************/
class car{   // Class
        var brand = ""
        var model = ""
        var year = 0
}

    var bmw = car()  //Object // Default constructor
    bmw.year = 1990
    print(bmw.year)

    // Remove constructor if modifer is not there
    // class Vechile private constructor(
    // We can have secordy constructor but the ideal way is to have a single constructor
    //
    class Vechile( // primary constructor
        var brand: String,
        var model: String,
        var year : Int
    ) {
        init {
            //Just after the constructor
            print("Init block called ")  // Only called after the primary constructor
        }

        //Secondary constructor
        constructor(color: String ="Red"): this("RE","Hunter", 2022){

        }

        //Class function
        fun getDetails(): String {
            return brand + model + year
        }

    }

    var bike = Vechile("RE","Classic",1990)  //Object
    // Names argumetns
    var bike1 = Vechile(brand = "RE",model = "Classic",year = 1990)  //Object

    var bike2 = Vechile()

    println(bike.getDetails())


    //Class functions
    class Employee(var name: String, var id:Int, var gender: Boolean){

        fun getEmployeeDetails(){

        }

    }

    //Inheritance
    //By default the classes in kotlin are closed for inheritance
    //open keyword

    //Superclass or parent class
    open class ParentClass{
        val x = 5
    }

    //Subclass or child class
    class ChildClass: ParentClass(){
        fun myFunction(){
            print(x)
        }
    }

    var child = ChildClass()
    println(child.myFunction())


    //String interpolation

    var myName = "Rojesh"
    var desc = "$myName is a lead engg working in medtronic whose name length is ${myName.length} "
    print(desc)


    //Singleton class
    //object MySingletonClass
    //An `object` cannot have a constructor set.
// We can use the init block inside it though.

    class  MySingleton{
        init {

        }

    }

    fun main(){
        val obj1 = MySingleton()
        val obj2 = MySingleton()
        println(obj1.toString())
        println(obj2.toString())

    }


}
