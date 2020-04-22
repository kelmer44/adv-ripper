package com.example.demo.view

import com.example.demo.app.Styles
import javafx.geometry.Orientation
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root = vbox {
        menubar {
            menu {
                label("File")
            }
        }
        label(title) {
            addClass(Styles.heading)
        }
        splitpane(orientation = Orientation.HORIZONTAL){
            vbox {
                label("Pane 1")
            }
            vbox {
                label("Pane 2")
                imageview("http://aventuraoriginal.com/media/covers/beneath_a_steel_sky_1143_UKtmkWY.jpg")
            }
        }
    }
}