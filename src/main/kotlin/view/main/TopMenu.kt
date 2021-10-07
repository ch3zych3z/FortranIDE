package view.main
import javafx.scene.control.CheckMenuItem
import javafx.scene.control.Menu
import javafx.scene.control.MenuBar
import javafx.scene.control.MenuItem

class TopMenu {
    fun setupMenuBar(): MenuBar{
        val menuBar = MenuBar()

        with(menuBar.menus) {
            add(setupFileMenu())
            add(setupViewMenu())
            add(setupActionMenu())
        }

        return menuBar
    }

    private fun setupFileMenu(): Menu {
        val fileMenu = Menu("File")

        val open = MenuItem("Open project")
        val create = MenuItem("Create project")

        with(fileMenu.items) {
            add(open)
            add(create)
        }

        return fileMenu
    }

    private fun setupViewMenu(): Menu {
        val viewMenu = Menu("View")

        val checkDarkTheme = CheckMenuItem("Dark theme")


        with(viewMenu.items) {
            add(checkDarkTheme)
        }

        return viewMenu
    }

    private fun setupActionMenu(): Menu {
        val actionMenu = Menu("Action")

        val build = MenuItem("Build")
        val run = MenuItem("Run")


        with(actionMenu.items) {
            add(build)
            add(run)
        }

        return actionMenu
    }


}