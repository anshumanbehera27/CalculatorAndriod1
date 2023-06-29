package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

// TODO : Creat a new branch
// todo : Push all your code to this new brach
// todo : share the link of your brach with me

class MainActivity : AppCompatActivity() , View.OnClickListener {
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_constraint_layout)

//        val tv1:TextView = findViewById(R.id.tv1)
//        tv1.setOnClickListener{
//            Log.d("QWERTY123" ,"view 1 pressed" )
//        }
        tvResult = findViewById(R.id.textView)
        findViewById<TextView>(R.id.tvAC).setOnClickListener(this)
        findViewById<TextView>(R.id.tvOPenBracket).setOnClickListener(this)
        findViewById<TextView>(R.id.tvCloseBracket).setOnClickListener(this)
        findViewById<TextView>(R.id.tvDIVISION).setOnClickListener(this)
        findViewById<TextView>(R.id.tvS7).setOnClickListener(this)
        findViewById<TextView>(R.id.tvS8).setOnClickListener(this)
        findViewById<TextView>(R.id.tvS9).setOnClickListener(this)
        findViewById<TextView>(R.id.tvSAdd).setOnClickListener(this)
        findViewById<TextView>(R.id.tvS4).setOnClickListener(this)
        findViewById<TextView>(R.id.tvS5).setOnClickListener(this)
        findViewById<TextView>(R.id.tvS6).setOnClickListener(this)
        findViewById<TextView>(R.id.tvsSubstarct).setOnClickListener(this)
        findViewById<TextView>(R.id.tvS1).setOnClickListener(this)
        findViewById<TextView>(R.id.tvS2).setOnClickListener(this)
        findViewById<TextView>(R.id.tvS3).setOnClickListener(this)
        findViewById<TextView>(R.id.tvSAdd).setOnClickListener(this)
        findViewById<TextView>(R.id.tvS0).setOnClickListener(this)
        findViewById<TextView>(R.id.tvSpoint).setOnClickListener(this)
        findViewById<TextView>(R.id.tvBack).setOnClickListener(this)
        findViewById<TextView>(R.id.Equals).setOnClickListener(this)





    }

    override  fun onClick(view: View ?){
//        when(view?.id){
//            R.id.tv1 -> Log.d("QWERTY123" , "view 1 pressed")
//            R.id.tv2 -> Log.d("QWERTY123" , "view 2 pressed")
//            R.id.tv3 -> Log.d("QWERTY123" , "view 3 pressed")
//            R.id.tv4 -> Log.d("QWERTY123" , "view 4 pressed")
//            R.id.tv5 -> Log.d("QWERTY123" , "view 5 pressed")
//            R.id.tv6-> Log.d("QWERTY123" , "view 6 pressed")
//
//            else -> Log.d("QWERTY123" , "Other view pressed")
//        }
        when(view?.id){

            R.id.tvSAdd -> {

                onClickDigit("+")
            }
            R.id.tvSmulti -> {

                onClickDigit("*")
            }
            R.id.tvDIVISION -> {

                onClickDigit("/")
            }
            R.id.tvsSubstarct -> {

                onClickDigit("-")
            }
            R.id.tvAC -> {

                onClear()
            }
            R.id.tvOPenBracket -> {

                onClickDigit("(")
            }

            R.id.tvCloseBracket -> {

                onClickDigit(")")
            }

            R.id.tvS9 -> {

                onClickDigit("9")
            }
            R.id.tvS8 -> {

                onClickDigit("8")
            }
            R.id.tvS7 -> {

                onClickDigit("7")
            }
            R.id.tvS6 ->{
                onClickDigit("6")
            }
            R.id.tvS5 ->{
                onClickDigit("5")
            }
            R.id.tvS4 -> {

                onClickDigit("4")
            }
            R.id.tvS3 ->{
                onClickDigit("3")
            }
            R.id.tvS2 -> {
                onClickDigit("2")
            }
            R.id.tvS1 ->{
                onClickDigit("1")
            }
            R.id.tvS0 -> {

                onClickDigit("0")
            }

            R.id.tvSpoint -> {

                onClickDigit(".")
            }
            R.id.tvBack ->{
                if (tvResult.text.toString() != ""){
                    tvResult.text = tvResult.text.toString().substring(0 , tvResult.text.toString().length-1 )

                }
            }
            R.id.Equals -> {
                onEqual()
            }


        }

    }

    private fun onEqual() {
       // TODO we will do the every Possiable operaction

        var text  = tvResult.text
        var sum = 0
        // TODO sum
        // Checks if the string "text" contains the character "+".
        if (text.contains("+")){
            // here i am going to split text which is in right and left of the + sine so
            // with the help of split
            var num = tvResult.text.split("+")
            // Splits the string "text" by the character "+" and stores the results in an array called "num


            for (i in num){
                sum += i.toInt()
            }
            // Iterates through the array "num" and stores each element in a variable called "i"
            // Converts the element "i" to an integer and adds it to the variable "sum"
            // Sets the text of the variable "tvResult" to the string representation of the variable "sum"
            // so  the result is going to fatch in the display

            tvResult.text = sum.toString()
        }
        // TODO substraction
        if(text.contains("-")){
            // split the two number
            var num  = tvResult.text.split("-")
            sum = num[0].toInt()
            // store the first elelment in the sum
            // here drop the first elelment and run the for loop
            for (i in num.drop(1)){
                sum -= i.toInt()
            }
            tvResult.text = sum.toString()
        }
        // TODO DIV
        if (text.contains("/")) {
            var num = tvResult.text.split("/")
            sum = num[0].toInt()
            for(i in num.drop(1)){
                sum /= i.toInt()
            }
            tvResult.text = sum.toString()

        }

        // TODO Multiply
        if (text.contains("*")) {
            var num = tvResult.text.split("*")
            sum = 1
            for(i in num){
                sum *= i.toInt()
            }
            tvResult.text = sum.toString()
        }


    }

    private fun onClickDigit(text :String) {
       // TODO show  the text into the screen
        tvResult.append(text)
    }

    private fun onClear() {
     //   TODO(remove all the data )
        tvResult.text = "0"

       }
}


