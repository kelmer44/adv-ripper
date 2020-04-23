package com.example.demo.view.content

import com.example.demo.controller.ImageController
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Orientation
import tornadofx.*

class ContentView : View("My View") {

    private val controller: ImageController by inject()

    private val fileNameInput =  SimpleStringProperty()

    override val root = splitpane(orientation = Orientation.HORIZONTAL){
            vbox {
                label("Pane 1")
            }
            vbox {
                label("Pane 2")
                imageview("http://aventuraoriginal.com/media/covers/beneath_a_steel_sky_1143_UKtmkWY.jpg")
                textfield(fileNameInput)
                button("Save") {
                    action {
                        controller.saveImage(fileNameInput.value)
                    }
                }
            }
        }
}
