package dataStructure.stack

class StackClass<T> {
    private var storage = arrayListOf<T>()

    private val count: Int
        get() = storage.size

    private fun top(): T?{
        return storage.lastOrNull()
    }

    private fun pop(): T?{
        return storage.removeLastOrNull()
    }

    private fun push(element:T ){
        storage.add(element)
    }
}