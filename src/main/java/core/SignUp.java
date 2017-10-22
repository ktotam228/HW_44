package core;

import org.openqa.selenium.WebDriver;

public class SignUp {
	
	public static void validate(WebDriver driver, String url) {
		
		Common.open(url);
		
		Common.pageValidation("01. Element [Quotes (dynamic)]: ",		Common.item_01);
		Common.pageValidation("02. Element [Current Location]: ",		Common.item_02);
		Common.pageValidation("03. Element [Weather Icon]: ",			Common.item_03);
		Common.pageValidation("04. Element [Quotes (dynamic)]: ",		Common.item_04);
		Common.pageValidation("05. Element [Title]: ", 				Common.item_05);
			
		Common.pageValidation("06. Element [First Name (label)]: ", 	Common.item_06);
		Common.pageValidation("07. Element [First Name (field)]: ", 	Common.item_07);
		Common.pageValidation("08. Element [Last Name (label)]: ", 	Common.item_08);
		Common.pageValidation("09. Element [Last Name (field)]: ", 	Common.item_09);
		Common.pageValidation("10. Element [Email (label)]: ", 		Common.item_10);
			
		Common.pageValidation("11. Element [Email (filed)]: ", 		Common.item_11);
		Common.pageValidation("12. Element [Phone (label)]: ", 		Common.item_12);
		Common.pageValidation("13. Element [Phone (field)]: ", 		Common.item_13);
		Common.pageValidation("14. Element [Genre (label)]: ", 		Common.item_14);
		Common.pageValidation("15. Element [Male (label)]: ", 		Common.item_15);
		
		Common.pageValidation("16. Element [Male (radio button)]: ", 	Common.item_16);
		Common.pageValidation("17. Element [Female (label)]: ", 		Common.item_17);
		Common.pageValidation("18. Element [Female (radio button)]: ", Common.item_18);
		Common.pageValidation("19. Element [State (label)]: ", 		Common.item_19);
		Common.pageValidation("20. Element [State (drop-down)]: ", 	Common.item_20);
		
		Common.pageValidation("21. Element [State California (item)]: ", Common.item_21);
		Common.pageValidation("22. Element [Terms (label)]: ", 		Common.item_22);
		Common.pageValidation("23. Element [Terms (checkbox)]: ", 	Common.item_23);
		Common.pageValidation("24. Element [Image (facebook)]: ", 	Common.item_24);
		Common.pageValidation("25. Element [Image (twitter)]: ", 		Common.item_25);
				
		Common.pageValidation("26. Element [Image (flickr)]: ", 		Common.item_26);
		Common.pageValidation("27. Element [Image (youtube)]: ", 		Common.item_27);
		Common.pageValidation("28. Element [Reset (button)]:  ", 		Common.item_28);
		Common.pageValidation("29. Element [Submit (button)]: ", 		Common.item_29);
		Common.pageValidation("30. Element [Timestamp (dynamic)]: ", Common.item_30);
		
		Common.pageValidation("31. Element [Copyright (dynamic)]: ", 	Common.item_31);
		Common.pageValidation("32. Element [OS & Browser (dynamic)]: ", Common.item_32);
		Common.pageValidation("33. Element [Error Line]: ", 			Common.item_33);
		Common.pageValidation("34. Element [First Name Error]: ", 	Common.item_34);
		Common.pageValidation("35. Element [Last Name Error]: ", 		Common.item_35);
		
		Common.pageValidation("36. Element [Email Error]: ", 			Common.item_36);
		Common.pageValidation("37. Element [Phone Error]: ", 			Common.item_37);
		Common.pageValidation("38. Element [First Name Error (img)]: ", Common.item_38);
		Common.pageValidation("39. Element [Last Name Error (img)]: ", Common.item_39);
		Common.pageValidation("40. Element [Email Error (img)]: ", 	Common.item_40);
		Common.pageValidation("41. Element [Phone Error (img)]: ", 	Common.item_41);
		}
}
