package dataStructure.stack


fun main(){
    var stack = ArrayDeque<String>()

    stack.add("Ferrari")
    stack.add("BMW")
    stack.add("Porsche")

    stack.forEach { print("$it " ) }
}
