package dataStructure.stack

class StackArrayListImplementation<T> : StackInterface<T> {
    private var storage = arrayListOf<T>()

    override val count: Int
        get() = storage.size

    override fun top(): T? {
        return storage.lastOrNull()
    }

    override fun pop(): T? {
        return storage.removeLastOrNull()
    }

    override fun push(element: T) {
        storage.add(element)
    }

    override fun toString() = buildString {
        appendLine("----top----")
        storage.asReversed().forEach {
            appendLine("$it")
        }
        appendLine("---------")
    }
    companion object {
        // take existing list and convert to a stack so the accessing order is guaranteed
        fun <T> create(items: Iterable<T>): StackArrayListImplementation<T> {
            val stack = StackArrayListImplementation<T>()
            for (item in items) {
                stack.push(item)
            }
            return stack
        }

    }
}

fun <T> stackOf(vararg elements: T): StackArrayListImplementation<T>{
    return StackArrayListImplementation.create(elements.asList())
}
