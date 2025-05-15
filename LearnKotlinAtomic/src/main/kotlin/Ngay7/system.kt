package org.example.Ngay7.system

import org.example.Ngay7.tools.*

fun main() {
    val task = Task()
    task.setPriority(3)
    task.description = "Fix bug"
    println(task.report())
    task.setPriority(3)
    println(task.report())


}

