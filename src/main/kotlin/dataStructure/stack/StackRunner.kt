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
    val stack1 = StackArrayListImplementation.create(list)
    print(stack1)
    println("Popped: ${stack1.pop()}")

}
