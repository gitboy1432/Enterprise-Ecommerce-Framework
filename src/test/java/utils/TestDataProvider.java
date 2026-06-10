

package utils;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

//    ,parallel=true
    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return ExcelUtils.getTestData(
                "C:/Users/Dell/Desktop/dataLoginSauce.xlsx",
                "Sheet1");
    }
}
