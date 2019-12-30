package com.example.feelings

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "feeling")
data class Feeling(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val mood: Int, //0 = default, 1 = sad, 2 = neutral, 3 = happy
    val created_at: Long = System.currentTimeMillis(),
    val remark: String
) {
}