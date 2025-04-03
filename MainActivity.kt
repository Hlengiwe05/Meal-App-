package vcmsa.hlengiwe.mealappassi1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //code starts here
        //step 1 : access the elements
        //create all the value for elements

        val edtMealTime = findViewById<EditText>(R.id.edtMealTime)
        val edtMealOption = findViewById<EditText>(R.id.edtMealOption)
        var btnReset = findViewById<Button>(R.id.btnReset)
        var btnGenerate = findViewById<Button>(R.id.btnGenerate)

        btnGenerate.setOnClickListener {
            val MealTime = edtMealTime.text.toString()

            var MealOption = when (MealTime) {
                "Morning" -> "Breakfast: Toast and Omelette"
                "Mid-Morning" -> "Snack: Yoghurt"
                "AfternoonSnack" -> "Quick Bite: Cookies"
                "Dinner" -> "Main Course: Mutton Biryani"
                "After Dinner Snack" -> "Dessert: Cheesecake"
                else -> "Invalid Input. Please enter Morning, Mid-Morning, AfternoonSnack, Dinner, After Dinner Snack"

            }

            edtMealOption.setText(MealOption)
        }
            //Reset button
            btnReset.setOnClickListener {
                edtMealTime.text.clear()
                edtMealOption.setText("Meal Option will appear here")
            }    }        }












