package com.example.demo.view.menu

import com.example.demo.controller.MenuController
import javafx.scene.Parent
import javafx.scene.control.MenuBar
import javafx.stage.FileChooser
import tornadofx.*

class MenuView : View() {

    private val menuController: MenuController by inject()

    override val root: Parent =
            menubar {
                menu("File") {
                    item("Open").action {
                        menuController.openFile(
                                chooseFile("Select file", arrayOf(FileChooser.ExtensionFilter("File", "*.*")),FileChooserMode.Single).first().path
                        )
                    }
                    separator()
                    item("Quit").action {

                    }
                }
                menu("Edit") {
                    item("Pollas")
                    separator()
                    item("En vinagr")
                }
            }
}