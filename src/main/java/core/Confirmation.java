package core;

import org.openqa.selenium.WebDriver;

public class Confirmation {
	
	public static void validate(WebDriver driver, String url) {
		
		Common.open(url);
		
		Common.pageValidation("01. Element [Title]: ", 				Common.item_05);
		Common.pageValidation("02. Element [First Name (label)]: ",	Common.item_06);
		Common.pageValidation("03. Element [First Name (field)]: ", 	Common.item_07);
		Common.pageValidation("04. Element [Last Name (label)]: ",	Common.item_08);
		Common.pageValidation("05. Element [Last Name (field)]: ",	Common.item_09);
			
		Common.pageValidation("06. Element [Email (label)]: ", 		Common.item_10);
		Common.pageValidation("07. Element [Email (filed)]: ", 		Common.item_11);
		Common.pageValidation("08. Element [Phone (label)]: ", 		Common.item_12);
		Common.pageValidation("09. Element [Phone (field)]: ", 		Common.item_13);
		Common.pageValidation("10. Element [Genre (label)]: ", 		Common.item_14);
			
		Common.pageValidation("11. Element [Genre (field)): ", 		Common.item_42);
		Common.pageValidation("12. Element [Back (button)]: ", 		Common.item_43);	
		}
}
