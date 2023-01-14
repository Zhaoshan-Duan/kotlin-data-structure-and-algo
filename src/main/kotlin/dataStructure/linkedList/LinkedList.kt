package dataStructure.linkedList

data class ListNode<T : Any>(
    var value: T,
    var next: ListNode<T>? = null
) {

    override fun toString(): String {
        next?.let { return "$value -> ${next.toString()}" }
        return "$value"
    }

    fun printInReverse() {
        next?.printInReverse()

        next?.let { print(" -> ") }

        print(value.toString())
    }
}

