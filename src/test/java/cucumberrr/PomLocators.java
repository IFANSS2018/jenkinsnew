package cucumberrr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLocators extends PomBaseclass{

	
		public PomLocators() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(id = "rental1")
		private WebElement monthRent;

		@FindBy(id = "local_minutes")
		private WebElement freeLoc;
		
		@FindBy(id = "inter_minutes")
		private WebElement freeInteg;

		@FindBy(id = "sms_pack")
		private WebElement treeSMS;
		
		@FindBy(id = "minutes_charges")
		private WebElement locCharg;
		
		@FindBy(id = "inter_charges")
		private WebElement intCharg;
		
		@FindBy(id = "sms_charges")
		private WebElement sMSCharge;
		
		@FindBy(name = "submit")
		private WebElement btnsubmit;
		
		@FindBy(tagName = "h2")
		private WebElement check;
		
		
		public WebElement getmonthRent( ) {
			return monthRent;
		}

		public WebElement getfreeLoc() {
			return freeLoc;
		}

		public WebElement getfreeInteg() {
			return freeInteg;
		}

		public WebElement getsMSCharge() {
			return sMSCharge;
		}

		public WebElement gettreeSMS() {
			return treeSMS;
		}

		public WebElement getlocCharg() {
			return locCharg;
		}

		public WebElement getintCharg() {
			return intCharg;
		}

		public WebElement getbtnsubmit() {
			return btnsubmit;
		}

		public WebElement getcheck() {
			return check;
		}

		

	

	
/*
	public WebElement getmonthRent() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getbtnsubmit() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getfreeLoc() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getfreeInteg() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getsMSCharge() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement gettreeSMS() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getlocCharg() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getintCharg() {
		// TODO Auto-generated method stub
		return null;
	}

	*/

}

