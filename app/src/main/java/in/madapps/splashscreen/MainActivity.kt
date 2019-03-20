package `in`.madapps.splashscreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    //To mimic the black screen when data is being loaded in the activity
    Thread.sleep(2000)
    setContentView(R.layout.activity_main)
  }
}
