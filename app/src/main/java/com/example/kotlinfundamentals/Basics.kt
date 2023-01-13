package com.example.kotlinfundamentals

// o play só aparece para funções chamadas main, que funciona como a mainactivity, se vc não tem ela
fun main() {
    // verifique nas abas inferiores a aba TO DO para ver o comentário da linha abaixo, é uma forma fácil de achar o que queremos
    // Vc pode definir o tipo da variável ou apenas dar um valor pra ela que o kotlin vai entender que tipo é.
    // Mas atenção: se vc escrever o valor sem seguir as regras o kotlin vai interpretar errado
    // (ex.: sempre coloque F no final do valor de um Float)
    //TODO: verify here all variables types
    varAndVal()
    numberTypes()
    booleanType()
    charAndStringType()
}

fun varAndVal() {
    //Quero que o valor mude com o tempo
    //var = valor pode ser substituido, reassigned
    // var = mutable variable
    var yourName = "Keanu Reeves"
    yourName = "Pretty"
    print("Hello " + yourName)

    //Quero que o valor seja o mesmo sempre
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
    // vc pode usar underscore _ no Long ou Int para tornar os números mais legíveis
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

fun booleanType(){

    // Boolean Types representa valores lógicos TRUE ou FALSE (verdadeiro ou falso)

    var isSunny :Boolean = true
    isSunny = false

    var isRaining = false
    isRaining = true

}

fun charAndStringType() {

    // Characteres Type
    // Para termos um char ele deve ser cercado por apóstrofes ''
    // Porém um char só pode conter 1 caracter dentro dos apóstrofes (coloque mais de um e ele irá reclamar),
    // se vc deseja mais terá que usar o tipo String.

    // tipo letra -> é tipo Char quando a letra é cercada por apóstrofes e não aspas
    val letterChar = 'A'
    // tipo dígito -> é tipo Char quando o dígito é cercada por apóstrofes e não aspas
    val digitChar = '1'
    // qualquer símbolo ou outra caracter pode ser um char, desde que cercado por apóstrofes
    val symbolChar = '$'

    // String Type
    // É uma conexão feita com vários Char, que são cercados por aspas " "

    val name = "Maria"
    val priceString = "R$ 50,00"

    // para acessar cada letra ou caracter da string vc aponta que posição que ela ocupa
    // (que sempre começa a contar pela posição ZERO no Kotlin),
    // não se esqueça de contar a posição do espaço entre as palavras da String tb.
    val myString = "Hello World"
    val firstCharInMyString = myString[0]
    print("O primeiro caracter é" + firstCharInMyString)

    // para acessar a última letra vc deve saber o quão longa (length) a string é (quantos caracteres ela tem)
    // e subtrair uma posição"
    val lastCharInMyString = myString[myString.length -1]
    print("O último caracter é" + lastCharInMyString)


}

