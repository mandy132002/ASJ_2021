package com.gdsctsec.smartt.database

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "timeTable")
data class TimeTable(
    @PrimaryKey(autoGenerate = true)
    @NonNull var id: Int = 0,
    @NonNull var lec: String,
    @NonNull var startTime: String,
    @NonNull var endTime: String,
    @NonNull var weekday: Weekday
)

enum class Weekday {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}