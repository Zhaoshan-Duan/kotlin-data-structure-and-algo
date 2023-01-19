package dataStructure.stack

import java.util.LinkedList

class Stack_linkedList<T : Any>(override val count: Int) : Stack<T> {
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