package org.example

typealias NoValueFunction = () -> Void // Noncompliant, `Void` used

interface NoValueFunctions {
    fun voidFunction1(): Void // Noncompliant, `Void` used
    fun voidFunction2(): Void // Noncompliant, `Void` used
}

object ReverseComparator : Comparator<Int>
{
    override fun compare(first: Int, second: Int): Int
    {
        return second - first
    }
}
