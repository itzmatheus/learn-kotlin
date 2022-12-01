package week2.variables

fun main() {

    // Variables

    // Kotlin is a statically-typed language, means that every variable, expression has a type!

    // val read-only or assigned-once
    // corresponds to a final in java
    // you can modify objects in val like in java
    // you can't modify a read-only list EX: val list = listOf("Java"); list.add("Kotlin") -> compile error

    val question: String = "life, the universe, and everything";
    println(question)

    // question = "New other thing" -> compiler error assign

    // var mutable can be modified

    var answer = 0;
    answer = 1;
    println(answer);

    // Kotlin's infers types

    val greeting = "Hi!"; // :String
    println(greeting)

    var number = 0; // :Int
    println(number)

    // Lists: mutable & read-only

    // read-only list lacks mutating methods

    val mutableList = mutableListOf("Java");
    mutableList.add("Kotlin");
    println(mutableList);

    val readOnlyList = listOf("Java");
    // readOnlyList.add not work
    println(readOnlyList);

    /* Prefer val to var
    * Using immutable references, immutable objects and functions without side effects
    * makes the code closer to the functional style that is easier to understand and support it the end
    * */

    // Don't omit types (specify them explicit)


}