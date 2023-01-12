package com.example.kotlinfundamentals

// o play só aparece para funções chamadas main, que funciona como a mainactivity, se vc não tem ela
fun main() {
    // verifique nas abas inferiores a aba T O D O para ver o comentário da linha abaixo, é uma forma fácil de achar o que queremos
    //TODO: Add new functionality
    varAndVal()
    numberTypes()
}


fun varAndVal() {
    //Quero que o valor mude com o tempo
    //var = valor pode ser substituido, reassigned
    // var = mutable variable
    var yourName = "Keanu Reeves"
    yourName = "Pretty"
    print("Hello " + yourName)

    //Quero que o valor seja o mesmo
    // val = valor não pode ser substituido, é sempre o inicialmente setado
    // val = immutable variable
    val hisName = "Rodrigo Hilbert"
    print("Hello " + yourName)
}

fun numberTypes() {

    // Tipos INTEIROS (Integer Types)
    // Byte (8 bits), Short (16 bits), Int (32 bits), Long (64 bits)
    // teste colocar um numero a mais em cada linha e ele vai reclamar
    // Long geralmente são usados em coisas como numero de cartão de crédito, docs, etc
    val nByte: Byte = 13
    val nShort: Short = 125
    val nInt: Int = 123123123
    val nLong: Long = 2_039_812_309_487_120_390

    // Tipos FLUTUANTES (Floating Point Types)
    // Float (32 bits), Double (64 bits)
    // 1- Para ter um Float coloque o F no final, senão o kotlin pensa que é um double,
    // ao setar como float vc economiza espaço de memória e garante um processamento mais rápido.
    // 2- verifique o tipo nFloatFalse, vc verá que é na verdade um Double, pq não tem o F no final
    // 3- tire o F do nFloat para ver o kotlin reclamar pois vc definiu como float, mas não colocou o F no final
    val nFloatFalse = 10.55
    val nFloatTrue = 10.55F
    val nFloat: Float = 10.55F
    val nDouble: Double = 3.112233445566778


    val name = "Otacílio Rocha"
    // type Int (aloca 32 bits de memória)
    var age = 51
    print("Eu sou" + name + "e tenho" + age + "anos")

}
