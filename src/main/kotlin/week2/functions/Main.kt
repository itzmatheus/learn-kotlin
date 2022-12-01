package week2.functions

fun main() {



}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//function with expression body
fun min(a: Int, b: Int): Int = if (a > b) b else a

/* Unit (no return)
* No return in Kotlin just return :Unit witch is something like Void in java
* */
fun displayMax(a: Int, b: Int) {
    println(max(a, b))
}

fun displayMin(a: Int, b: Int): Unit {
    println(min(a, b))
}

/* Functions everywhere
* Top-level function:
* fun topLevel() = 1
*
* Member function:
* class A {
*   fun member() = 2
* }
*
* Local function:
* fun other() {
*   fun local() = 3
* }
* */

// Is it possible to call a top-level function from Java? If yes, how?
// SOLVE: You call it as a static function of the class, which name corresponds to the file name

/* @JvmName
* changes the JVM name of the class containing top-level functions
* EX: @file:JvmName("Util")
* */