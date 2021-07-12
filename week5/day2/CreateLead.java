package week5.day2;




import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass{

	@Test(dataProvider = "fetchData" )
	public  void runCreateLead(String cName, String firstName, String lastName, String phNo) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
	
}
	@DataProvider(name = "fetchData")
	public String[][] SendData() throws IOException {
		
		ReadExcelData re = new ReadExcelData();
		return re.ReadExcel();
		
		
		/*String data[][] = new String[2][4];
		data[0][0] = "TestLeaf";
		data[0][1] = "Milan";
		data[0][2] = "M";
		data[0][3] = "99";
		
		data[1][0] = "CTS";
		data[1][1] = "Hari";
		data[1][2] = "R";
		data[1][3] = "98";*/
		
	}
}






