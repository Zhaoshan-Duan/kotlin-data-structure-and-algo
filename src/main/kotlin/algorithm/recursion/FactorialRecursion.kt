package algorithm.bucketSort

fun main(){
    val n = 4
    factorial(n).run(::println)
    factorialTailRec(n, 1).run(::println)
}

fun factorial(n: Int): Int{
    if (n == 1) return 1
    return n * factorial(n-1)
}

tailrec fun factorialTailRec(n: Int, a: Int): Int{
    if (n == 1) return a
    return factorialTailRec(n-1, n*a)
}