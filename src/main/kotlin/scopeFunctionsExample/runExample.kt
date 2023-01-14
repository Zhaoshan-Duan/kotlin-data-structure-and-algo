package scopeFunctionsExample

private fun performRunOperation(){
    Person().run{
        name = "Asdf"
        contactNumber = "0987654321"
        return@run "the details of the Person is ${displayInfo()}"
    }
}

private fun performRunOperation1(){
    val name = Person().name?.run{
        "The name of the Person is $this"
    }
    print(name)
}
