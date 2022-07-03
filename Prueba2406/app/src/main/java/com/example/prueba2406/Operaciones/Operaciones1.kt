package com.example.prueba2406.Operaciones

class Operaciones1 {

    var n1:Double = 0.0
    var n2:Double = 0.0
    var icono:String = ""

    fun acciones():String{
        var r = ""
        when(icono){
            "+"-> r = "La suma es: "+(n1+n2).toString()
            "-"-> r = "La resta es: "+(n1-n2).toString()
            "x"-> r = "La multiplicacion es: "+(n1*n2).toString()
            "/"->
                if (n2 == 0.0){
                    r = "No se puede didivir por 0"
                }else{
                    r = "La division es: "+(n1/n2).toString()
                }
            ""-> r = "Seleccionar una opcion"
        }
        return r
    }

}