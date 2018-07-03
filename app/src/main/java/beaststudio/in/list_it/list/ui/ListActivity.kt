package beaststudio.`in`.list_it.list.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import beaststudio.`in`.list_it.R

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, ListFragment.newInstance())
                    .commitNow()
        }
    }
}
