package com.sduduzog.slimlauncher.data

import android.app.Application
import androidx.lifecycle.LiveData
import com.sduduzog.slimlauncher.data.model.Note

class NoteRepository(application: Application) {
    private val db: DataRoomDatabase = DataRoomDatabase.getDatabase(application)!!
    private val noteDao: NoteDao = db.noteDao()

    private val _notes = noteDao.notes

    val notes: LiveData<List<Note>>
        get() = _notes
}