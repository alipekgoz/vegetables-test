package introduction;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vegetable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver.exe",
				"C:\\Users\\alipe\\OneDrive\\Belgeler\\chrome-headless-shell");
		WebDriver driver = new ChromeDriver();

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#");
		Thread.sleep(3000);

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		int j = 0;

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			List itemNeededList = Arrays.asList(itemsNeeded);

			if (itemNeededList.contains(formattedName)) {
				j++;
				// click AD TO CARD
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}

			}
		}

	}

}
