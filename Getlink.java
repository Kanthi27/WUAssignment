package test1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlink {
 
 public static void main(String[] args){
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium Assignment\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
 

 driver.get("https://www.flipkart.com/");
 driver.manage().window().maximize();
  List<WebElement> allLinks = driver.findElements(By.tagName("a"));
 for(WebElement link:allLinks){
 System.out.println(link.getText() + " - " + link.getAttribute("href"));
 }
 driver.quit();
 }
 
}