package org.example.tests.pageObjectModel;

import io.qameta.allure.Description;
import org.apache.logging.log4j.LogManager;
import org.example.Utils.PropertiesReader;
import org.example.base.CommonToAllTest;
import org.example.drivers.DriverManager;
import org.example.pages.pageObjectModel.vwoApplication.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestVWOLogin_02_PropertyReader_DriverManager_POM_CommonToAll extends CommonToAllTest {
    private static final Logger logger = (Logger) LogManager.getLogger(TestVWOLogin_02_PropertyReader_DriverManager_POM_CommonToAll.class);


    @Description("TC#1- Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() throws Exception {

        logger.info("Starting the Testcases Page Object Model");

        // Page Class Code (POM Code) - 2
        LoginPage loginPage  = new LoginPage(DriverManager.getDriver());
        String error_msg = loginPage.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));

        // Assertions - 3
        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_msg,PropertiesReader.readKey("error_message"));

    }



}
