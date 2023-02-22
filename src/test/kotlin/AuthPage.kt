import BasePageMethod.elementCheck
import BasePageMethod.submitObj
import BasePageMethod.waitObject
import GetDriver.curentDriver
import org.openqa.selenium.By
import ConfProperties.readTestData


class AuthPage {
    var driver = curentDriver()

    private val uniqueElement = "//form[@id=\"formAuthLogin\"]"
    private val mobileInputNoValid = "//input[contains(@class, 'ng-invalid') and " +
            "contains(@id, 'login')]"
    private val mobileInputValid = "//input[contains(@class, 'ng-valid') and " +
            "contains(@id, 'login')]"
    private val buttonContinue = "//button[@id=\"btnNext\"]"

    fun checkCurrentPage(): Boolean {
        waitObject(this.uniqueElement)
        return elementCheck(this.uniqueElement)
    }

    fun getNameTittle(): String {
        return this.driver!!.getTitle()
    }

    fun inputMobileNumber() {
        waitObject(mobileInputNoValid)
        val inputMobile = this.driver!!.findElement(By.xpath(this.mobileInputNoValid));
        inputMobile.sendKeys(readTestData("number_phone"))
    }

    fun clickNextButton(){
        waitObject(this.mobileInputValid)
        waitObject(this.buttonContinue)
        submitObj(this.buttonContinue)
    }
}