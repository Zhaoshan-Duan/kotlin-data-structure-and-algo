package dataStructure.linkedList

data class Node<T>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }

    fun printInReverse() {
        // going until next is null
        next?.printInReverse()

        next?.let { print(" -> ") }

        print(value.toString())
    }
}

