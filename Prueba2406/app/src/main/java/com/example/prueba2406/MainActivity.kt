package com.example.prueba2406

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.prueba2406.Operaciones.Operaciones1
import com.example.prueba2406.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var op1 = Operaciones1()

        fun metodo(){
            var r = ""
            if(binding.rbSuma.isChecked){
                r = "+"
            }
            if(binding.rbResta.isChecked){
                r = "-"
            }
            if (binding.rbDivi.isChecked){
                r = "/"
            }
            if(binding.rbMulti.isChecked){
                r = "x"
            }
            op1.icono = r
        }

        fun setVaribles():Boolean{
            var flag = false
            if((!(TextUtils.isEmpty(binding.etNumero1.text.toString())))&&(!(TextUtils.isEmpty(binding.etNumero2.text.toString())))){
                flag = true
                op1.n1 = binding.etNumero1.text.toString().toDouble()
                op1.n2 = binding.etNumero2.text.toString().toDouble()
            }
            return flag
        }


        binding.btnAcciones.setOnClickListener {
            if(setVaribles()){
                metodo()
                binding.tvRespueta.text = op1.acciones()
            }else{
                Toast.makeText(this, "Ingrese todos los valores",Toast.LENGTH_SHORT)
            }
        }

        binding.btnSalir.setOnClickListener {
            finish()
        }

    }
}