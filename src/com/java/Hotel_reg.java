package com.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel_reg {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\K.GOBINATHAN\\eclipse-workspace\\MiniProject\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement u_name = driver.findElement(By.xpath("//input[@type='text']"));
		u_name.sendKeys("sudharsanan");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("sudhar12");
		
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();

		WebElement loc = driver.findElement(By.xpath("//select[@name='location']/option[6]"));
		loc.click();

		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']/option[3]"));
		hotel.click();

		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']/option[3]"));
		room.click();

		WebElement r_no = driver.findElement(By.xpath("//select[@name='room_nos']/option[3]"));
		r_no.click();

		WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkin.clear();
		checkin.sendKeys("08/05/2022");

		WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkout.clear();
		checkout.sendKeys("09/05/2022");

		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']/option[3]"));
		adult.click();

		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']/option[2]"));
		child.click();

		WebElement submit = driver.findElement(By.name("Submit"));
		submit.click();

		WebElement button = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		button.click();

		WebElement cnt = driver.findElement(By.name("continue"));
		cnt.click();

		WebElement f_name = driver.findElement(By.name("first_name"));
		f_name.sendKeys("sr");

		WebElement l_name = driver.findElement(By.name("last_name"));
		l_name.sendKeys("jhon");

		WebElement add = driver.findElement(By.name("address"));
		add.sendKeys("1/74,north street,chittoor,madurai");

		WebElement card_no = driver.findElement(By.name("cc_num"));
		card_no.sendKeys("12345678909876543");

		WebElement cc_type = driver.findElement(By.xpath("//select[@name='cc_type']/option[3]"));
		cc_type.click();

		WebElement exp_month = driver.findElement(By.xpath("//select[@name='cc_exp_month']/option[5]"));
		exp_month.click();

		WebElement exp_year = driver.findElement(By.xpath("//select[@name='cc_exp_year']/option[13]"));
		exp_year.click();

		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("1964982649");

		WebElement booking = driver.findElement(By.xpath("//input[@type='button']"));
		booking.click();

//     WebElement ordernum = driver.findElement(By.name("order_no"));
//     String text = ordernum.getText();
//     System.out.println(text);

		WebElement logoout = driver.findElement(By.xpath("//a[@href='Logout.php']"));
		logoout.click();

		WebElement end = driver.findElement(By.xpath("//td[@class='reg_success']"));
		String text = end.getText();
		System.out.println(text);

//      WebElement end = driver.findElement(By.className("'reg_success'"));
//      String text = end.getText();
//      System.out.println(text);

	}
}
