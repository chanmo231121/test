package com.example.testproject

import android.annotation.SuppressLint

@SuppressLint("SuspiciousIndentation")

fun main(){
    println("정수를 '한글자'씩 입력해주세요")
    var  culc = Calculator()

while(true) {
    try {
        val num1 = readLine()!!.toDouble()
        val op = readLine()
        val num2 = readLine()!!.toDouble()
        var result = 0.0

            when (op) {
                "+" -> result = culc.add(AddOperation(),num1,num2)
                "-" -> result = culc.subtract(SubtractOperation(),num1,num2)
                "*" -> result = culc.multi(MultiplyOperation(),num1,num2)
                "/" -> result = culc.divide(DivideOperation(),num1,num2)
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
class Calculator{
    fun add(sum:AddOperation , num1:Double , num2:Double):Double{
        return sum.operate(num1,num2)
    }
    fun subtract(sub:SubtractOperation , num1:Double , num2:Double):Double{
        return sub.operate(num1,num2)
    }
    fun multi(multi:MultiplyOperation , num1:Double , num2:Double):Double{
        return multi.operate(num1,num2)
    }
    fun divide(div:DivideOperation , num1:Double , num2:Double):Double{
        return div.operate(num1,num2)
    }
}


class AddOperation{
    fun operate(num1:Double,num2:Double):Double = (num1+num2).toDouble()
}

class SubtractOperation{
    fun operate(num1:Double,num2:Double):Double = (num1-num2).toDouble()
}

class MultiplyOperation{
    fun operate(num1:Double,num2:Double):Double = (num1*num2).toDouble()
}

class DivideOperation{
    fun operate(num1:Double,num2:Double):Double = (num1/num2).toDouble()
}
