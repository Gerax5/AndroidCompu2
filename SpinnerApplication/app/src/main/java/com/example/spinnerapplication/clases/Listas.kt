package com.example.spinnerapplication.clases

class Listas {

    var n1 = 0
    var n2 = 0
    var palabra = ""
    var list = mutableListOf<String>()

    fun generarLista(){
        var max = 0
        var min = 0
        list.clear()
        if(n1 != n2) {
            if(n1>n2){
                max = n1
                min = n2
            }else{
                max = n2
                min = n1
            }
            for (i in min..max){
                list.add(i.toString())
            }
        }else{
            list.add(n1.toString())
        }
    }

    fun listaNumerosMultiplos3(){
        list.clear()
        for(i in 6..n1){
            if((i%3) == 0){
                list.add(i.toString())
            }
        }
    }

    fun ciencoEncienco(){
        var max = 0
        var min = 0
        list.clear()
        if(n1 != n2) {
            if(n1>n2){
                max = n1
                min = n2
            }else{
                max = n2
                min = n1
            }
            var cont = 0
            var primeraVez = true
            for (i in min..max){
                if(primeraVez){
                    list.add(i.toString())
                    primeraVez = false
                }
                if(cont == 5){
                    list.add(i.toString())
                    cont = 0
                }
                cont++
            }
        }

    }

    fun letraPorLetra(){
        list.clear()
        for(i in palabra){
            list.add(i.toString())
        }
    }

    fun contarVocales(){
        list.clear()
        var contA = 0
        var contE = 0
        var contI = 0
        var contO = 0
        var contU = 0
        palabra = palabra.lowercase()
        for(i in palabra){
            if(i == 'a'){
                contA++
            }
            if(i == 'e'){
                contE++
            }
            if(i == 'i'){
                contI++
            }
            if(i=='o'){
                contO++
            }
            if(i=='u'){
                contU++
            }
        }
        list.add("A,a = $contA")
        list.add("E,e = $contE")
        list.add("I,i = $contI")
        list.add("O,o = $contO")
        list.add("U,u = $contU")
    }

}