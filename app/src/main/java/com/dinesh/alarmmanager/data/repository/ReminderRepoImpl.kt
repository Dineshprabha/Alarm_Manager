package com.dinesh.alarmmanager.data.repository

import com.dinesh.alarmmanager.data.local.ReminderDao
import com.dinesh.alarmmanager.domain.model.Reminder
import com.dinesh.alarmmanager.domain.repository.ReminderRepository
import kotlinx.coroutines.flow.Flow

class ReminderRepoImpl(
    private val reminderDao: ReminderDao
) : ReminderRepository {

    override suspend fun insert(reminder: Reminder) {
        reminderDao.insert(reminder)
    }

    override suspend fun update(reminder: Reminder) {
        reminderDao.Update(reminder)
    }

    override suspend fun delete(reminder: Reminder) {
        reminderDao.delete(reminder)
    }

    override fun getAllReminders(): Flow<List<Reminder>> = reminderDao.getAllReminders()
}