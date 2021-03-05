package dev.fultz.scryfall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.GsonBuilder
import dev.fultz.scryfall.fragments.ScryfallListFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_container,
                ScryfallListFragment())
            .commit()

/*
        val service = Retrofit.Builder()
            .baseUrl("https://api.scryfall.com/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(ScryfallService::class.java)

        CoroutineScope(IO).launch {
            val response = service.getCardId(
                id = "7f4840f1-3db3-4ba6-b75b-bbd87251a3af")
            Log.d("MainActivity", "Found Card: ${response.name}")
        }
*/

    }

}

