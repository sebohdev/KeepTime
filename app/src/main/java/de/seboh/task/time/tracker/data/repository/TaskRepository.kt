package de.seboh.task.time.tracker.data.repository

import de.seboh.task.time.tracker.data.db.entities.Task

class TaskRepository {

    fun getAllTasks(): List<Task> {
        return listOf(
            Task("A really cool task for you", null),
            Task("Cooking", null),
            Task("Reading", null)
        )
    }

}