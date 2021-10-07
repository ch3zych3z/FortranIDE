package view.main



import javafx.scene.control.*
import tornadofx.*
import java.awt.MenuBar


class MainView : View("FortranIDE") {


    override val root = borderpane {
        top = TopMenu().setupMenuBar()
        left = ProjectMenu().setupProjectMenu()
        center = vbox {
            EditorView().setupEditorView()
            ConsoleView().setupConsoleView()
        }
    }
}
