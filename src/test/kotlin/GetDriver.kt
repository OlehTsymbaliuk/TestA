import org.openqa.selenium.WebDriver

object GetDriver {
    fun curentDriver(): WebDriver? {
        val sbc1 = SingletonBrowserClass.getInstanceOfSingletonBrowserClass()
        return sbc1!!.driver
    }

    fun destroyDriver() {
        val sbc1 = SingletonBrowserClass.getInstanceOfSingletonBrowserClass()
        sbc1!!.destroyDriver()
    }
}