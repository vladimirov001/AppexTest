package ru.vladimirov.appextext.ui.main

import com.arellomobile.mvp.MvpView
import ru.vladimirov.appextext.models.Message

interface MainView : MvpView {

    fun showMessage(message:Message)
    
}