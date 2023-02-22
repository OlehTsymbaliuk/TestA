import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod
import ConfProperties.readDataConfig
import GetDriver.curentDriver
import GetDriver.destroyDriver


open class Precondition {
    @BeforeMethod
    fun start() {
        val driver = curentDriver()
        driver!![readDataConfig("url_main_page")]
    }

    @AfterMethod
    fun end() {
        val driver = curentDriver()
        driver!!.quit()
        destroyDriver()
    }
}