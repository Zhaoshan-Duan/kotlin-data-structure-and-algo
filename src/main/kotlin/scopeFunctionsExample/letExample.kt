package scopeFunctionsExample

private fun Person.performLetOperation0(){
    val p = Person().let{
        // return@let "The name of the Person is: ${it.name}"
        "The name of the Person is: ${it.name}"
    }
    print(p)
}

private fun Person.performLetOperation1(){
    val p = Person().let{
        it.name = "NewName"
    }
    print(p)
}

private fun Person.performLetOperation2(){
    val name = Person().name?.let{
        "The name of the Person is: $it"
    }
    print(name)
}