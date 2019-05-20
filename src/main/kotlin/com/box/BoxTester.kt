package com.kotlin.box

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    println("Please enter object's 「length」:")
    val length = scanner.nextFloat()
    println("Please enter object's 「width」:")
    val width = scanner.nextFloat()
    println("Please enter object's 「height」:")
    val height = scanner.nextFloat()

    val box3 = Box3()
    val box5 = Box5()
    /*if (box3.validate(length, width, height)) {
        println("Box3")
    } else if (box5.validate(length, width, height)) {
        println("Box5")
    } else {
        println("No suitable box ...")
    }*/
    when {
        box3.validate(length, width, height) -> println("Box3")
        box5.validate(length, width, height) -> println("Box5")
        else -> println("No suitable box ...")
    }
}

abstract class Box {
    abstract fun validate(length: Float, width: Float, height: Float): Boolean
}

class Box3 : Box() {
    override fun validate(length: Float, width: Float, height: Float): Boolean {
        return length < 23f && width < 14f && height < 13f
    }
}

class Box5 : Box() {
    override fun validate(length: Float, width: Float, height: Float): Boolean {
        return length < 39.5f && width < 27.5f && height < 23f
    }

}



