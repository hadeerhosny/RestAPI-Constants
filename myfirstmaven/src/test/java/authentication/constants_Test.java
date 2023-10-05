package authentication;

import com.shaft.driver.SHAFT;
import org.testng.annotations.Test;


public class constants_Test {

    String Base_URL = "https://provider.test.carefer.co/api/customer";

    @Test
    public void TC_01_Validate_Get_Contants (){
        SHAFT.API Test = new SHAFT.API(Base_URL);
        Test.get("/v1/constant").addHeader("Platform", "@vb~sD~KS#2>]pq").perform();
        Test.assertThatResponse().extractedJsonValue("data.brands[3].name_en").isEqualTo("Isuzu").perform();
        Test.assertThatResponse().extractedJsonValue("data.engine_types[1].name_en").isEqualTo("Diesel Engines").perform();
        Test.assertThatResponse().extractedJsonValue("data.minimum_vehicle_make_year").isEqualTo("2001").perform();

    }

}
