package tests;

import models.Account;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class AccountTest extends BaseTest {

    @Test(description = "Create new account", threadPoolSize = 1, invocationCount = 1)
    public void createNewAccount() {

        loginPage
                .openPage()
                .login(USER, PASSWORD)
                .isPageOpened();
        accountListPage
                .open()
                .isPageOpened();
        accountListPage
                .createNewCompanyForm();
        Account account = new Account("BBQ", "111.000.222", "1234567890",
                "15", "12345", "Ort", "Sxn",
                "Land", "54321", "Tro", "Nxs",
                "Dnal", "Инвестор", "Сельское хозяйство",
                "Broadway", "Avenue", "new company added");
        accountModal
                .createNewCompany(account)
                .save();
        accountDetailsPage
                .openDetailsTab()
                .isPageOpened();
        accountDetailsPage
                .validateNewAccount(account);
    }
}
