import BasePageMethod.elementCheck
import BasePageMethod.waitObject
import GetDriver.curentDriver


class PasswordPage {
    var driver = curentDriver()

    private val uniqueElement = "//form[@id=\"formAuthPwd\"]"

    fun checkCurrentPage(): Boolean {
        waitObject(this.uniqueElement)
        return elementCheck(this.uniqueElement)
    }
}