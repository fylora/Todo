package com.fylora.emilytodo.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.fylora.emilytodo.data.entity.TaskEntity

@Database(
    entities = [TaskEntity::class],
    version = 1,
    exportSchema = false
)
abstract class TaskDatabase: RoomDatabase() {
    abstract val taskDao: TaskDao
}