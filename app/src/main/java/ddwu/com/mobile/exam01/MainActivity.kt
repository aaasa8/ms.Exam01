package ddwu.com.mobile.exam01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ddwu.com.mobile.exam01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.btnDisplay.setOnLongClickListener(object  : View.OnClickListener{
//            override fun onClick(p0: View?) {
//
//            }
//
//        })
    }
}