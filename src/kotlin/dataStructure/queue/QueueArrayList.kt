package dataStructure.queue

class QueueArrayList<T: Any>: QueueInterface<T> {
    private val storage = arrayListOf<T>()

    override val count: Int
        get() = storage.size

    override val isEmpty: Boolean
        get() = count == 0

    override fun enqueue(element: T): Boolean = storage.add(element)

    override fun dequeue(): T? = if (isEmpty) null else storage.removeFirst()

    override fun peek(): T? = storage.getOrNull(0)
}