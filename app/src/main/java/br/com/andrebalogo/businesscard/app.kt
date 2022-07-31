package br.com.andrebalogo.businesscard

import android.app.Application
import br.com.andrebalogo.businesscard.data.AppDatabase
import br.com.andrebalogo.businesscard.data.BusinessCardRepository

class app : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}