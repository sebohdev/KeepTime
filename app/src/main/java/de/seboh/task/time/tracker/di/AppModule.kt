package de.seboh.task.time.tracker.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import de.seboh.task.time.tracker.data.repository.TaskRepository

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Provides
    fun taskRepository(): TaskRepository {
        return TaskRepository()
    }

}