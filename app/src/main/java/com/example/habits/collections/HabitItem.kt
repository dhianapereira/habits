package com.example.habits.collections

/**
 * Habit Model representing an Item in a ListView.
 *
 * @param title the title of the habit
 * @param description the description of the habit
 * @param isCompleted whether the habit is checked or not
 */
data class HabitItem(
    val id: String,
    val title: String,
    val description: String? = null,
    val isCompleted: Boolean
)