package de.seboh.task.time.tracker.ui.home

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import de.seboh.task.time.tracker.data.repository.TaskRepository

class TaskViewModel @ViewModelInject constructor(
    private val repository: TaskRepository
) :
    ViewModel() {

    fun getAllTasks() = repository.getAllTasks()

}