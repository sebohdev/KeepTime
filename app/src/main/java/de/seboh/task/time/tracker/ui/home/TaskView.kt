package de.seboh.task.time.tracker.ui.home

import java.sql.Time

data class TaskView(
    val taskName: String,
    val projectName: String,
    val startTime: Time?,
    val endTime: Time?,
    val isRunning: Boolean
)