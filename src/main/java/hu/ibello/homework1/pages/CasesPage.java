package hu.ibello.homework1.pages;

import hu.ibello.core.Name;
import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;

@Name("Cases Page")
public class CasesPage extends PageObject {

	@Find(by = By.CSS_SELECTOR, using = "tbody tr a")
	private WebElement caseLink;

	@Find(by = By.CSS_SELECTOR, using = "tbody tr td:nth-child(4)")
	private WebElement personField;

	@Find(by = By.CSS_SELECTOR, using = ".buttons a")
	private WebElement newCaseButton;
	
	public void I_open_the_page() {
		String url = getConfigurationValue("url").toString();
		browser().openURL(url);
	}

	public void I_see_that_the_page_is_opened() {
		expectations().expect(newCaseButton).toBe().displayed();
	}

	public void I_see_that_the_first_person_is_$(String value) {
		expectations().expect(personField).toHave().text(value);
	}

	public void I_open_the_first_case() {
		doWith(caseLink).click();
	}

}
