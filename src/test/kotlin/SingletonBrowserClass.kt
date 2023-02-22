import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class SingletonBrowserClass private constructor() {
    // To get driver
    var driver: WebDriver?
        private set

    // Constructor
    init {
        WebDriverManager.chromedriver().setup()
        driver = ChromeDriver()
        (driver as ChromeDriver)
    }

    fun destroyDriver() {
        instanceOfSingletonBrowserClass = null
        driver = null
    }

    companion object {
        // instance of singleton class
        private var instanceOfSingletonBrowserClass: SingletonBrowserClass? = null

        // TO create instance of class
        fun getInstanceOfSingletonBrowserClass(): SingletonBrowserClass? {
            if (instanceOfSingletonBrowserClass == null) {
                instanceOfSingletonBrowserClass = SingletonBrowserClass()
            }
            return instanceOfSingletonBrowserClass
        }
    }
}