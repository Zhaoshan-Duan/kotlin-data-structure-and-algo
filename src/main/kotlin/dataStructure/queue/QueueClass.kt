package dataStructure.queue

class QueueClass<T> {
    private val storage = arrayListOf<T>()

    private val count: Int
        get() = storage.size

    private val isEmpty: Boolean
        get() = count == 0

    private fun enqueue(element: T): Boolean = storage.add(element)

    private fun dequeue(): T? = if (isEmpty) null else storage.removeAt(0)

    private fun peek(): T? = storage.getOrNull(0)
}