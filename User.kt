package KotlinPractice

open abstract class User {
    open var userName:String?=null
    open var password:String?=null
    constructor(){
        print("Enter userName: ")
        userName= readLine()
        print("Enter Password: ")
        this.password = readLine()
    }
    constructor(userName:String,password:String){
        this.userName=userName
        this.password=password
    }
    fun hello(){
        println("Hello from $userName")
        println()
    }
}