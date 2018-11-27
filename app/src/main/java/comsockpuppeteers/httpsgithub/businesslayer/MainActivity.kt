package comsockpuppeteers.httpsgithub.businesslayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock.sleep
import android.widget.TextView
import android.support.constraint.ConstraintLayout
import android.widget.Button
import android.graphics.Color
import android.support.constraint.R.id.left
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val l: FirstList = FirstList()
        l.AddList("First Item")
        l.AddList("Second Item")
        l.AddList("Third Item")
        l.AddList("Forth Item")


        l.DeleteList("Third Item")
        var a = 5

        for (item in l.mlist) {
            val constraintLayout = findViewById(R.id.constraintLayout) as ConstraintLayout
            val button = Button(this)
            button.layoutParams = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT
            )

            button.text = item
            button.setPadding(5,5,5,5)
            button.layout(5,5,5,a)
            button
            button.setOnClickListener(
                View.OnClickListener
                {
                    button.text = "You just clicked me"
                }
            )
            button.setBackgroundColor(Color.WHITE)
            button.setTextColor(Color.BLACK)
            constraintLayout.addView(button);
            a += 60
        }

        //val testView: TextView = findViewById(R.id.android_text)

        //sleep(5000)
        //var s = l.PrintList()
        //testView.text = s
    }
}
