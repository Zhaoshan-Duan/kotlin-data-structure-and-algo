package scopeFunctionsExample

private fun Person.performAlsoOperation(){
    val name = Person().also{ currentPerson ->
        println("Current name is :${currentPerson.name}")
        currentPerson.name = "modifiedName"
    }
}