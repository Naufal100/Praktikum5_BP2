package com.example.a3129_myapplication1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val dataList = ArrayList<Mahasiswa>()
        dataList.add(Mahasiswa("Budi Santoso", "123456"))
        dataList.add(Mahasiswa("Siti Aminah", "234567"))
        dataList.add(Mahasiswa("Joko Susilo", "345678"))
        dataList.add(Mahasiswa("Dewi Lestari", "456789"))
        dataList.add(Mahasiswa("Agus Wijoyo", "567890"))
        dataList.add(Mahasiswa("Rina Puspita", "678901"))
        dataList.add(Mahasiswa("Eko Prasetyo", "789012"))

        val rvMahasiswa: RecyclerView = findViewById(R.id.rv_mahasiswa)

        rvMahasiswa.layoutManager = GridLayoutManager(this, 2)

        val adapter = MahasiswaAdapter(dataList)

        rvMahasiswa.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
