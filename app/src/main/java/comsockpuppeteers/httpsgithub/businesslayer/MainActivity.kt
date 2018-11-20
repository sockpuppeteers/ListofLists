package comsockpuppeteers.httpsgithub.businesslayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock.sleep
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testView: TextView = findViewById(R.id.android_text)

        val l: FirstList = FirstList()
        l.AddList("First Item")
        l.AddList("Second Item")
        l.AddList("Third Item")
        l.AddList("Forth Item")


        l.DeleteList("Third Item")

        sleep(5000)
        testView.text = l.PrintList()
    }
}
