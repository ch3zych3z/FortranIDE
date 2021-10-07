import styles.Styles
import view.main.MainView

import javafx.stage.Stage
import javafx.stage.StageStyle
import tornadofx.App
import tornadofx.launch

class MainApp : App(MainView::class, Styles::class) {


    override fun start(stage: Stage) {
        with(stage) {
            initStyle(StageStyle.UNDECORATED)
            width = 800.0
            height = 600.0
            isMaximized = true
        }

        super.start(stage)
    }

    override fun stop() {
        super.stop()
    }
}


fun main(args: Array<String>) {
    launch<MainApp>(args)
}
