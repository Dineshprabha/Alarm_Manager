package com.dinesh.alarmmanager.di

import android.content.Context
import com.dinesh.alarmmanager.data.local.ReminderDao
import com.dinesh.alarmmanager.data.local.ReminderDatabase
import com.dinesh.alarmmanager.data.repository.ReminderRepoImpl
import com.dinesh.alarmmanager.domain.repository.ReminderRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideReminderDatabase(@ApplicationContext context: Context) : ReminderDatabase {
        return ReminderDatabase.getInstance(context)
    }

    @Provides
    fun provideReminderDao(reminderDatabase: ReminderDatabase) : ReminderDao{
        return reminderDatabase.getReminderDao()
    }

    @Provides
    fun provideReminderRepository(reminderDao: ReminderDao) : ReminderRepository {
        return ReminderRepoImpl(reminderDao)
    }
}