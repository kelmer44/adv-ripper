package com.example.demo.controller

import tornadofx.*

class MenuController : Controller() {

    fun openFile(path: String){
        println("Opened file $path")
    }
}