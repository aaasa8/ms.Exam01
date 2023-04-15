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
			//방법3
			binding.btnDisplay.setOnClickListener(object : View.OnClickListener {
				override fun onClick(p0: View?){
					binding.tvDisplay.setText(binding.etText.getText().toString())
					}
			})
			//방법4
			binding.btnDisplay.setOnClickListener {
				binding.tvDisplay.setText(binding,etText.getText().toString())
			}
   }
		//방법2
		/*val click = object : View.OnClickListener {
			override fun onClick(p0: View?){
				binding.tvDisplay.setText(binding.etText.getText().toString())
}*/

//방법1
//onCreate부분
//  binding.btnDisplay.setOnClickListener(MyClick())
//    inner class MyClick : View.OnClickListener {
//        override fun onClick(p0: View?) {
//            val str = binding.etText.getText().toString()
//            binding.tvDisplay.setText(str)
//        }
//
//    }
}