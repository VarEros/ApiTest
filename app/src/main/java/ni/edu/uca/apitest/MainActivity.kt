package ni.edu.uca.apitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ni.edu.uca.apitest.databinding.ActivityMainBinding
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetRan.setOnClickListener {

        }
    }

    private fun getRetrofit():Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://dog.ceo/api/breeds/image/random")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun findPhoto() {
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(APIService::class.java).getARandomDog()
            val puppy = call.body()
            if(call.isSuccessful){
            }
        }
    }




}