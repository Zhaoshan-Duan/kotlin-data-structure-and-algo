package dataStructure.stack

import java.util.Stack

fun main() {
    var cars = Stack<String>()
    cars.addAll(listOf("Ferrari", "BMW", "Porsche"))
    cars.push("Lambor")

    cars.forEach { print("$it ") }
    println()

    var lambo = cars.pop()
    cars.forEach { print("$it ") }

    var top = cars.peek()
    println(top)

    println("\nLooking for Ferrari: " + cars.search("Ferrari"))
    println("Looking for Jeep: " + cars.search("Jeep"))

    println("Is the stack empty? ${cars.isEmpty()}")


}