package scopeFunctionsExample

class Person() {
    var name: String? = "Jojo"
    var contactNumber: String = "123456789"
    var address: String = "123 Xyz Blvd, Yui City, CA"

    fun displayInfo() = print("\n Name: $name\n " +
            "Contact Number: $contactNumber\n " +
            "Address: $address")
}

fun main(){

}