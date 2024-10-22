package stepdefination;

import java.util.List;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.util.Browser;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

     LoginPage lp = new LoginPage(Browser.FF);
	 HomePage homePage;
     
     
	@Given("User is on home page")
	public void user_is_on_home_page() throws InterruptedException {
	   lp.EnterEmailAddress("sudarshan.killekar.external@sonymusic.com");
	   homePage = lp.ClickOnNext();
	   Thread.sleep(3000);
	}

	@When("user gets All the modules")
	public void user_gets_all_the_modules(DataTable ModuleList) {
		  List<String> ActualModule_list = ModuleList.asList();
		   System.out.println("Actual"+ ActualModule_list);
	   List<String> ExpectedModuleListList = homePage.getAllHomePagemodules();;
	   System.out.println("Expected ModuleList"+ExpectedModuleListList);
		  
	}

	@Then("the count for the module should be {int}")
	public void the_count_for_the_module_should_be(Integer expectedCount) {
//		Assert.assertTrue(homePage.countHomePageModules()== expectedCount);
	}

	
	
	
}
