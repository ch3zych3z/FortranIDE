package view.main

import javafx.scene.Node
import javafx.scene.control.TextArea

class ConsoleView {


    fun setupConsoleView(): TextArea {
        val console = TextArea()
        console.setMaxSize(10000000.0,100.0)
        return console
    }

}