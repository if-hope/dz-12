package employees;

import com.rd.employees.Man;
import com.rd.employees.Woman;
import dataproviders.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonTest {

    private Man man;
    private Woman woman;


    @BeforeMethod
    public void creatingPersons(){
        man = new Man("John", "White", 64, true);
        woman = new Woman("Emma", "Grey", 59, true);
    }

    @Test
    public void testIsRetiredFalseM(){
        Assert.assertFalse(man.isRetired(),  "The man has reached retirement age");
    }

    @Test(dataProvider = "retiredMen", dataProviderClass = TestDataProvider.class)
    public void testIsRetiredTrueM(String firstName, String lastName, int age, boolean isPartner){
        man = new Man(firstName, lastName, age, isPartner);
         Assert.assertTrue(man.isRetired(), "The man hasn't reached retirement age");
    }

    @Test
    public void testIsRetiredFalseW(){
        Assert.assertFalse(woman.isRetired(),  "The woman has reached retirement age");
    }

    @Test(dataProvider = "retiredWomen", dataProviderClass = TestDataProvider.class)
    public void testIsRetiredTrueW(String firstName, String lastName, int age, boolean isPartner){
        woman = new Woman(firstName, lastName, age, isPartner);
        Assert.assertTrue(woman.isRetired(), "The woman hasn't reached retirement age");
    }

    @Test
    public void testRegisterPartnership(){
        woman.registerPartnership(man);
        Assert.assertEquals(woman.getLastName(), "White");
    }

    @Test
    public void testDeregisterPartnership(){
        woman.registerPartnership(man);
        woman.deregisterPartnership();
        Assert.assertEquals(woman.getLastName(), "Grey");
    }

    @Test
    public void testDeregisterPartnershipForNotMarried(){
        woman.deregisterPartnership();
        Assert.assertEquals(woman.getLastName(), "Grey");
    }


}
