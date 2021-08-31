import KotlinPractice.Customer

fun main() {
    val userList=ArrayList<Customer>()
    userList.add(Customer("navneth","vishnu"))
    userList.add(Customer("vishnu","navneth"))
    var c= Customer("vishnu","navneth")
    while (true) {
        print("1-Log in\n2-Sign up\nEnter your choice:")
        when(readLine()){
            "1"->userLogin(userList)
            "2"->createUser()
            else-> println("*****Wrong Input*****")
        }

    }
}
fun createUser(){
    val customer= Customer()
    print("${customer.userName}  ${customer.password}")
}
fun userLogin(userList:ArrayList<Customer>){
    print("Enter userName: ")
    val userName= readLine()!!.toString()
    print("Enter password: ")
    val password= readLine()!!.toString()
    var customer: Customer?=null
    outer@ for( user in userList)
            when(true){
                (userName==user.userName) &&(password==user.password) ->{
                    customer= Customer(userName,password)
                    println("login succesfull")
                    break@outer
                }
                (userName==user.userName)-> {
                    println("...Invalid password...")
                    break@outer
                }
            }
    if (customer!=null) customer.view()
}