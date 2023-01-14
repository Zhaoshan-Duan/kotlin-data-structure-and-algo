package scopeFunctionsExample

private fun Person.performApplyOperation(){
    val p: Person? = null
    p?.apply{
        name = "adds"
        contactNumber = "111"
        address = "weddsad"
        displayInfo()
    }
}