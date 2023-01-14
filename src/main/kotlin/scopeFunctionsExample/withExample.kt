package scopeFunctionsExample

private fun Person.performWithOperation(){
    val person = with(Person()){
        return@with "The name of the Person is ${this.name}"
    }
    print(person)
}