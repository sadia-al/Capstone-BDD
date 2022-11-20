package capstone.cucumber.config;

import org.openqa.selenium.WebDriver;

public interface Browser {
	
	
	WebDriver openBrowser(String url);

}
