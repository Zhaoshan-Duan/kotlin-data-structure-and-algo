package dataStructure.stack

class Stack_array<T: Any> : Stack<T>{
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
}