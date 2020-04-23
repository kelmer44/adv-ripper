package com.example.demo.view

import com.example.demo.controller.MainController
import com.example.demo.view.content.ContentView
import com.example.demo.view.menu.MenuView
import tornadofx.*

class MainView : View("Hello TornadoFX") {

    val controller: MainController by inject()

    override val root = borderpane {
        top<MenuView>()
        center<ContentView>()
        bottom{
            label("Hola")
            useMaxWidth = true
        }

    }
}