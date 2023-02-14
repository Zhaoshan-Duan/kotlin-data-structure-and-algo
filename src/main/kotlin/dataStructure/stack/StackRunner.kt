package dataStructure.stack

fun main() {
    val stack = StackArrayListImplementation<Int>().apply {
        push(1)
        push(2)
        push(3)
        push(4)
    }
    print(stack)

    val poppedElement = stack.pop()
    if (poppedElement != null) {
        println("Popped: $poppedElement")
    }
    print(stack)

    val list = listOf("A", "B", "C", "D")
    val stackConverted = StackArrayListImplementation.create(list)
    print(stackConverted)
    println("Popped: ${stackConverted.pop()}")

    // or create a initializer
    val stackInitilizer = stackOf(1.0, 2.0, 3.0, 4.0)
    print(stackInitilizer)
    println("Popped: ${stackInitilizer.pop()}")

}
