package hu.ibello.homework1.tests;

import hu.ibello.core.Specification;
import hu.ibello.core.Test;
import hu.ibello.homework1.steps.CasesSteps;

@Specification
public class CasesTest {

	private CasesSteps cases;
	
	@Test
	public void change_person_name() {
		cases.I_open_the_page();
		cases.I_see_that_the_first_person_is_$("Kosztolányi Dezső");
		cases.I_change_the_first_persons_name_to_$("József Attila");
		cases.I_see_that_the_first_person_is_$("József Attila");
	}
	
}
