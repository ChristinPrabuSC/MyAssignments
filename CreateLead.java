package assign.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		// To maximize the browser
		driver.manage().window().maximize();

		// to locate the username
		// driver -> findElement ->using id attribute -
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// to locate password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// to locate the login buttonand click on the element
		driver.findElement(By.className("decorativeSubmit")).click();

		// to click on the link ->with text
		driver.findElement(By.linkText("CRM/SFA")).click();

		// click on the Leads
		driver.findElement(By.linkText("Leads")).click();

		// click on the Leads
		driver.findElement(By.linkText("Create Lead")).click();

		// enter the mandatory fields - Company Name, First Name & Last Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sundar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pitchai");

		// click on the Leads
		driver.findElement(By.name("submitButton")).click();

		// verify the title page
		String title = driver.getTitle();
		System.out.println(title);

		// close the browser
		driver.close();
	}

}