package pages;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void setup() {

		BasePageTest basepage = new BasePageTest();
		basepage.setup();

	}

	@After
	public void teardown() {

		BasePageTest basepage = new BasePageTest();
		basepage.teardown();

	}

}
