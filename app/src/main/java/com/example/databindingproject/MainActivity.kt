package com.example.databindingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingproject.virtualShopApp.data.model.Shop
import com.example.databindingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //databindingin veri kaynağını belirtmek ve tanımlamak için bir instance oluşturdum
    //ilk başta null gelmesin diye lateinit olarak tanımladık
    private lateinit var activityMainBinding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.shop = Shop(1, "TV", "Electronic", 2500, 10, null)

    }
}