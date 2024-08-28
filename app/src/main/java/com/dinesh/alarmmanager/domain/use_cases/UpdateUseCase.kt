package com.dinesh.alarmmanager.domain.use_cases

import com.dinesh.alarmmanager.domain.model.Reminder
import com.dinesh.alarmmanager.domain.repository.ReminderRepository
import javax.inject.Inject

class UpdateUseCase @Inject constructor(
    private val reminderRepository: ReminderRepository
) {

    suspend operator fun invoke(reminder: Reminder) = reminderRepository.update(reminder)
}