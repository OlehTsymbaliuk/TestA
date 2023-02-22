import ConfProperties.readDataConfig
import GetDriver.curentDriver
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

object BasePageMethod {
    fun waitObject(xpathLocator: String?) {
        val waitTime = readDataConfig("time_wait")
        val timeToWaite = waitTime.toInt()
        val driver = curentDriver()
        val wait = WebDriverWait(driver, timeToWaite.toLong())
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator)))
    }

    fun clickObj(xpathLocator: String?) {
        val driver = curentDriver()
        val clickObj = driver!!.findElement(By.xpath(xpathLocator))
        clickObj.click()
    }

    fun submitObj(xpathLocator: String?) {
        val driver = curentDriver()
        val clickObj = driver!!.findElement(By.xpath(xpathLocator))
        clickObj.submit()
    }

    fun elementCheck(xpathLocator: String?): Boolean {
        val driver = curentDriver()
        val elementsUnique = driver!!.findElements(By.xpath(xpathLocator))
        return elementsUnique.size > 0
    }
}