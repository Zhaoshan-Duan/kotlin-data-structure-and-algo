package dataStructure.stack

import java.util.LinkedList

class StackLinkedList<T : Any>(override val count: Int) : StackInterface<T> {
    private val stack = LinkedList<T>()

    override fun top(): T? {
        return stack.peekFirst()
    }

    override fun pop(): T? {
        return stack.removeFirst()
    }

    override fun push(element: T) {
        stack.addFirst(element)
    }


}