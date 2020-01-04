package com.example.exercis4_epfcalulator

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private val calendar = Calendar.getInstance()

    private val yearr = calendar.get(Calendar.YEAR)
    private val monthh = calendar.get(Calendar.MONTH)
    private val dayy = calendar.get(Calendar.DAY_OF_MONTH)
    private var age = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonReset.setOnClickListener{resettt()}
    }

    fun clickDatePicker(view: View) {
        val pickkk = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthhhhh, dayyyyy ->

            age = yearr - year + 1
            textDOB.text = "%d-%d-%d".format(dayyyyy, monthhhhh, year)
            textAge.text = (age.toString())

            if(age in 16..20){
                textSaving.text = "RM 5,000"
                textInvestment.text = "RM " + (5000*0.3).toString()
            }else if(age in 21..25){
                textSaving.text = "RM 14,000"
                textInvestment.text = "RM" + (14000*0.3).toString()
            }else if(age in 26..30){
                textSaving.text = "RM 29,000"
                textInvestment.text = "RM" + (29000*0.3).toString()
            }else if(age in 31..35){
                textSaving.text = "RM 50,000"
                textInvestment.text = "RM" + (50000*0.3).toString()
            }else if(age in 36..40){
                textSaving.text = "RM 78,000"
                textInvestment.text = "RM" + (78000*0.3).toString()
            }else if(age in 41..45){
                textSaving.text = "RM 116,000"
                textInvestment.text = "RM" + (116000*0.3).toString()
            }else if(age in 46..50){
                textSaving.text = "RM 165,000"
                textInvestment.text = "RM" + (165000*0.3).toString()
            }else if(age in 51..55){
                textSaving.text = "RM 228,000"
                textInvestment.text = "RM" + (228000*0.3).toString()
            }else{
                textSaving.text = "Cannot Calculate"
                textInvestment.text = "Cannot Calculate"
            }

        }, yearr, monthh, dayy)
        pickkk.show()
    }

    fun resettt(){
        textDOB.text = ""
        textAge.text = ""
        textSaving.text = ""
        textInvestment.text = ""
    }
}
