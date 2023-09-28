package org.example

typealias NoValueFunction = () -> Void // Noncompliant, `Void` used

interface NoValueFunctions {
    fun voidFunction1(): Void // Noncompliant, `Void` used
    fun voidFunction2(): Void // Noncompliant, `Void` used
}