package com.ubaya.kpd_160422124

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ubaya.kpd_160422124.databinding.ActivityMainBinding
import com.ubaya.kpd_160422124.ui.theme.Kpd_160422124Theme

class MainActivity : ComponentActivity() {
    var events: ArrayList<Event> = arrayListOf(
        Event(1, "ILPC", "Logic and programming competition", R.drawable.programming,
            "08/01/2021", 25, 10),
        Event(2, "MANIAC", "Multimedia competition", R.drawable.mm,
            "25/07/2021", 20, 10),
        Event(3, "ICF", "Informatics student exhibition", R.drawable.project,
            "25/07/2021", 50, 10)
    )

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}
