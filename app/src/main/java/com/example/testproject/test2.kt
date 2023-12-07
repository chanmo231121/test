package com.example.testproject

fun main(){
    println("정수를 '한글자'씩 입력해주세요")
while(true) {
    try {


        val num1 = readLine()!!.toInt()
        val op = readLine()
        val num2 = readLine()!!.toInt()

        val result =
            when (op) {
                "+" -> num1 + num2
                "-" -> num1 - num2
                "*" -> num1 * num2
                "/" -> num1 / num2
                else -> {
                    println("연산자를 제대로 입력해주세요")
                }
            }



        println("${num1} ${op} ${num2} = ${result}")
    } catch (e:java.lang.NumberFormatException) {
        println("정수를 입력하세요")
    }
}
}