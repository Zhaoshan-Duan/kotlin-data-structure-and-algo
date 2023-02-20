package dataStructure.linkedList


fun main() {
    val list = Node(1, Node(3, Node(2, Node(5))))
    println(list)
    list.printInReverse()

    pushExample()
    appendExample()
}

fun pushExample() {
    val list = LinkedList<Int>()
    list.push(30).push(10).push(1)
    print("Linked List $list")
}

fun appendExample(){
    val list = LinkedList<Int>()
    list.append(30).append(10).append(1)
    print("Linked List $list")
}