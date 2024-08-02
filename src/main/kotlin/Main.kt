package org.gary

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }

    var radius: Double = 3.9
    val pi = 3.14
    val circumference = 2 * pi * radius

    println("The circumference of circle with radius $radius is $circumference")
    val role = 3
    var salary = when (role) {
        1, 2 -> "R50 000"
        3, 4 -> "R100 000"
        5, 6 -> "R120 000"
        7    -> "R150 000"
        else -> "R0"
    }

    println("Your salary is $salary")
}

//class Shape {
//    var name = null
//
//    fun1(): String {
//        return name
//    }
//
//    String fun2() {}
//}