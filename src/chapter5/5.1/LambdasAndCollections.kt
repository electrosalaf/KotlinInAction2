package chapter5.LambdasAndCollections

data class Person(val name: String, val age: Int)

fun findTheOldestPerson(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null

    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main() {
    val people = listOf(Person("Ibrahim", 25), Person("Pascal", 19))
    findTheOldestPerson(people)

    // This lines means the same thing
    println(people.maxBy { it.age })
    println(people.maxBy(Person::age))
}