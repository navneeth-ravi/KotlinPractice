package KotlinPractice

class Customer: User {
    constructor():super()
    constructor(userName:String,password:String):super(userName,password)
    fun view(){
        println("Under construction.... Enter to Log Out")
        readLine()
    }
}
