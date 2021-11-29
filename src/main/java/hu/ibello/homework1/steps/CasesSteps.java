package hu.ibello.homework1.steps;

import hu.ibello.core.Name;
import hu.ibello.homework1.pages.CasesPage;
import hu.ibello.steps.StepLibrary;

@Name("Cases")
public class CasesSteps extends StepLibrary {

	private CasesPage cases;
	
	// TODO insert CasePage-type variable here
	
	public void I_open_the_page() {
		cases.I_open_the_page();
		cases.I_see_that_the_page_is_opened();
	}
	
	public void I_see_that_the_first_person_is_$(String personName) {
		cases.I_see_that_the_first_person_is_$(personName);
	}
	
	public void I_change_the_first_persons_name_to_$(String personName) {
		cases.I_open_the_first_case();
		// TODO verify that the page was opened
		// TODO enter the name into the person field
		// TODO save the page
		// TODO validate that the current page is the cases
	}
	
}
