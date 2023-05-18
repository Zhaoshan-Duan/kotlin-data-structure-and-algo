package dataStructure.linkedList


fun main() {
    val list = Node(1, Node(3, Node(2, Node(5))))
    println(list)
    list.printInReverse()

    pushExample()
    appendExample()
    insertExample()
    popExample()
    removeLastExample()
    removeAfterExample()
}

fun pushExample() {
    println("----Push Example----")
    val list = LinkedList<Int>()
    list.push(30).push(10).push(1)
    print("Linked List $list")
}

fun appendExample(){
    println("----Append Example----")
    val list = LinkedList<Int>()
    list.append(30).append(10).append(1)
    print("Linked List $list")
}

fun insertExample(){
    println("----Insert Example----")
    val list = LinkedList<Int>()
    list.push(3).push(2).push(1)
    println("Before inserting: $list")
    list.insert(-100, list.nodeAt(2)!!)
    println("After Inserting: $list")
}

fun popExample(){
    println("----Pop Example----")
    val list = LinkedList<Int>()
    list.push(3).push(2).push(1)
    println("Before pop $list")
    val poppedValue = list.pop()
    println("After popping list: $list")
    println("Value poped: $poppedValue")
}

fun removeLastExample(){
    println("----Remove Last Example")
    val list = LinkedList<Int>()
    list.push(3).push(2).push(1)
    println("Before removeLast: $list")
    val removeValue = list.removeLast()
    println("After removing: $list")
    println("Value removed: $removeValue")
}

fun removeAfterExample(){
    println("----Remove After----")
    val list = LinkedList<Int>()

    list.push(3).push(2).push(1)
    println("Before RemoveAfter() $list")
    val index = 1
    val node = list.nodeAt(index - 1)!!
    val removedValue = list.removeAfter(node)
    println("After RemoveAfter() at index $index: $list")
}