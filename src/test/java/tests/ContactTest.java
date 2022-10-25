package tests;

import models.Contact;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ContactTest extends BaseTest {

    @Test(description = "Create new contact", threadPoolSize = 1, invocationCount = 1)
    public void createNewContact() {
        loginPage
                .openPage()
                .login(USER, PASSWORD)
                .isPageOpened();
        contactPage
                .openContactTab()
                .isPageOpened();
        contactListPage
                .createNewContactForm()
                .isPageOpened();
        Contact contact = new Contact("Г-н", "Baba", "Yaga", "BBQ", "witch",
                "+446467364", "+445362784", "witchby@gmail.com", "Swamp",
                "3/9.Kingdom", "225050", "State",
                "Holliwood", "dygwa", "10/3.Kingdom", "220505",
                "10/3.State", "Bolliwood", "1010101010", "+295364736",
                "+3362736456", "0172354672", "EvilTsmok", "HellDepartment",
                "1/1/1955", "new Contact created");
        contactModal
                .createNewContact(contact)
                .save();
        contactDetailsPage
                .isPageOpened();
        contactDetailsPage
                .validateNewContact(contact);
    }
}
