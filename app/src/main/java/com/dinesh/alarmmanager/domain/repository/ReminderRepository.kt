package com.dinesh.alarmmanager.domain.repository

import com.dinesh.alarmmanager.domain.model.Reminder
import kotlinx.coroutines.flow.Flow

interface ReminderRepository {

    suspend fun insert(reminder: Reminder)

    suspend fun update(reminder: Reminder)

    suspend fun delete(reminder: Reminder)

    fun getAllReminders() :  Flow<List<Reminder>>
}