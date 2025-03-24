package com.example.lab3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val dataset: Array<Goal> = arrayOf(
            Goal(1, "Hydration Challenge", "Drink at least 8 glasses of water daily to stay hydrated and improve overall health", R.drawable.day1),
            Goal(2, "Morning Exercise Routine", "Start each day with a 15-minute exercise routine to boost energy and mood", R.drawable.day2),
            Goal(3, "Reading Habit", "Read for 30 minutes every day to expand knowledge and improve focus", R.drawable.day3),
            Goal(4, "Gratitude Journal", "Write down three things you are grateful for each day to cultivate positivity", R.drawable.day4),
            Goal(5, "Healthy Meal Prep", "Prepare healthy meals for the week to maintain a balanced diet", R.drawable.day5),
            Goal(6, "Learn a New Skill", "Dedicate 30 minutes daily to learning a new skill, such as a language or instrument", R.drawable.day6),
            Goal(7, "Mindfulness Meditation", "Practice mindfulness meditation for 10 minutes each day to reduce stress", R.drawable.day7),
            Goal(8, "Declutter Space", "Spend 15 minutes daily decluttering a specific area to create a tidy environment", R.drawable.day8),
            Goal(9, "Connect with Nature", "Spend time outdoors each day to appreciate nature and improve mental well-being", R.drawable.day9),
            Goal(10, "Limit Screen Time", "Reduce screen time by setting specific hours for device use", R.drawable.day10),
            Goal(11, "Financial Planning", "Create a budget and track expenses daily to improve financial management", R.drawable.day11),
            Goal(12, "Creative Writing", "Write a short story or poem each day to enhance creativity", R.drawable.day12),
            Goal(13, "Fitness Challenge", "Complete a 30-day fitness challenge, such as push-ups or squats", R.drawable.day13),
            Goal(14, "Learn a New Recipe", "Cook a new recipe each day to expand culinary skills", R.drawable.day14),
        )
        val goalAdapter = GoalAdapter(this, dataset)

        val recyclerView: RecyclerView = findViewById(R.id.goals_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = goalAdapter
    }
}