package com.qa.util;


import java.io.IOException;

import org.testng.annotations.*;

import com.qa.base.Base;

public class qa_infinity_dataProviderutils extends Base{
	@DataProvider(name = "infinitycredencialtestData")
	public Object[][] getLoginDetails() throws IOException{
		String filePath  = "src\\main\\java\\com\\qa\\testdata\\Infinity_Test_Data.xlsx";
		String sheetName = "CRMdetails";
		return excelUtils.getExcelData(filePath,sheetName);
	}
	

}
