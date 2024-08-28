package com.dinesh.alarmmanager.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Reminder(
    val name : String,
    val dosage : String,
    @PrimaryKey(autoGenerate = false)
    val timeInMillis : Long,
    val isTaken : Boolean,
    val isRepeat : Boolean
)
