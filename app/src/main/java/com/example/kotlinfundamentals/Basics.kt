package com.example.kotlinfundamentals

// o play só aparece para funções chamadas main, que funciona como a mainactivity, se vc não tem ela
fun main(){
    // verifique nas abas inferiores a aba T O D O para ver o comentário da linha abaixo, é uma forma fácil de achar o que queremos
    //TODO: Add new functionality
    varAndVal()
}


fun varAndVal(){
    //Quero que o valor mude com o tempo
    //var = valor pode ser substituido, reassigned
    // var = mutable variable
    var yourName = "Keanu Reeves"
    yourName = "Pretty"
    print("Hello "+ yourName)

    //Quero que o valor seja o mesmo
    // val = valor não pode ser substituido, é sempre o inicialmente setado
    // val = immutable variable
    val hisName = "Rodrigo Hilbert"
    print("Hello "+ yourName)
}
