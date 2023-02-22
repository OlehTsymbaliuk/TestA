import GetDriver.curentDriver
import org.testng.annotations.Test
import org.testng.Assert


class TestOpen : Precondition(){

    @Test
    fun testOpenSite(){
        val authPage = AuthPage()
        val passwordPage = PasswordPage()

        Assert.assertTrue(authPage.checkCurrentPage(), "Not found auth page")
        Assert.assertEquals(authPage.getNameTittle(), "NEOBANK для бізнесу", "Tab does not match")

        authPage.inputMobileNumber()
        authPage.clickNextButton()

        Assert.assertTrue(passwordPage.checkCurrentPage(), "Not found password page")

        val driver = curentDriver()
        driver!!.manage().window().maximize()
        driver.close()
    }
}