package com.dinesh.alarmmanager.domain.use_cases

import com.dinesh.alarmmanager.domain.repository.ReminderRepository
import javax.inject.Inject

class GetAllReminderUseCase @Inject constructor(
        private val reminderRepository: ReminderRepository
) {

    operator fun invoke() = reminderRepository.getAllReminders()
}