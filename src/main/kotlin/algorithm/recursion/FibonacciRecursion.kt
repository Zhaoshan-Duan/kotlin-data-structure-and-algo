package algorithm.recursion

fun main() {
    val n = 5
    fib(n).run(::println)
    fibTailRec(n, Pair(0, 1)).run(::println)
}

fun fib(n: Int): Int{
    if (n <= 1) return n
    return fib(n-1) + fib(n-2)
}

tailrec fun fibTailRec(n: Int, a: Pair<Int, Int>): Int{
    when (n) {
        0 -> return a.first
        1 -> return a.second
        else -> return fibTailRec( n-1, Pair(a.second, a.first + a.second))
    }
}