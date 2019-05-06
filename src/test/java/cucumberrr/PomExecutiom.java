package cucumberrr;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PomExecutiom extends PomBaseclass {

	PomLocators a = new PomLocators();
	//PomLocators p =  PageFactory.initElements(driver, PomLocators.class);

	@Given("The user is in add tariff plan")
	public void plan() throws InterruptedException {

		launch("http://demo.guru99.com/telecom/addtariffplans.php");
		Thread.sleep(5000);

	}

	@When("The user fill in valid plan details with data")

	public void the_user_fill_in_valid_plan_details_with_data() throws Throwable{
        type(a.getmonthRent(), "67567");
		type(a.getfreeLoc(),"2356");
		type(a.getfreeInteg(), "8979");
		type(a.getsMSCharge(), "5645");
		type(a.gettreeSMS(), "345");
		type(a.getlocCharg(), "3457");
		type(a.getintCharg(), "3566");
	}

	@When("The user clicks submit button using pom")
	public void the_user_clicks_submit_button_using_pom()throws Throwable {
		clickBtn(a.getbtnsubmit());

	}

	@Then("The user should see the sucess message")
	public void the_user_should_see_the_sucess_message()throws Throwable {
		Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());

	}}



