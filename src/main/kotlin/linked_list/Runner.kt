package linked_list


fun main() {
    val list = ListNode(1, ListNode(3, ListNode(2, ListNode(5))))

    println(list)
    list.printInReverse()
}