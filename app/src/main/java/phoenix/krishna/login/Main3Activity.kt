package phoenix.krishna.login

import androidx.appcompat.app.AppCompatActivity

import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val show = findViewById<TextView>(R.id.ShowTimerId)

        val submit = findViewById<Button>(R.id.OtpSubmit)

        object : CountDownTimer(60000, 1) {

            override fun onTick(l: Long) {


                show.text = (l / 1000).toString()
                submit.isEnabled = false
                submit.setBackgroundResource(R.drawable.otpbutton)

            }

            override fun onFinish() {

                submit.isEnabled = true
                submit.setBackgroundResource(R.drawable.mobilebutton)


            }
        }.start()
    }
}
