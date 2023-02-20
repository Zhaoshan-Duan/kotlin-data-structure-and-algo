package dataStructure.linkedList

// Manages Nodes
class LinkedList<T : Any> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean = size == 0

    // add to the front
    // Head First Insertion
    fun push(value: T): LinkedList<T> = apply {
        head = Node(value = value, next = head)

        if (tail == null) {
            tail = head
        }
        size++
    }

    // Add to the end of the list
    // Tail End Insertion
    fun append(value: T): LinkedList<T> = apply {
        if (isEmpty()) {
            push(value)
            return this
        }

        val newNode = Node(value = value)
        tail!!.next = newNode
        tail = newNode
        size++
    }

    fun nodeAt(index: Int): Node<T>?{
        var currNode = head
        var currIndex = 0

        while (currNode != null && currIndex < index) {
            currNode = currNode.next
            currIndex++
        }

        return currNode
    }

    fun insert(value: T, afterNode: Node<T>): Node<T> {

        if (tail == afterNode) {
            append(value)
            return tail!!
        }

        val newNode = Node(value, next = afterNode)
        afterNode.next = newNode

        size++

        return newNode
    }



    override fun toString(): String {

        return if (isEmpty()) {
            "Empty List"
        } else {
            head.toString()
        }
    }
}