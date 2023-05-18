package dataStructure.stack

interface StackInterface<T> {
    val count: Int
    val isEmpty: Boolean
        get() = count == 0

    fun pop(): T?

    fun push(element: T)

    fun top(): T?
}