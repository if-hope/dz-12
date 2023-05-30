package employees;

import com.rd.employees.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SettersGettersTest {

    private Man man;
    @BeforeMethod
    public void creatingPersons() {

        man = new Man("John", "White", 64, true);
    }

    @DataProvider(name = "age")
    public static Object [][] createAge(){
        return new Object[][]{{-1}, {0}};
    }

    @Test
    public void testSetAge(){
        man.setAge(50);
        Assert.assertEquals(man.getAge(), 50);
    }

    @Test(dataProvider = "age")
    public void testSetAgeNegative(int age){
        man.setAge(age);
        Assert.assertEquals(man.getAge(), 64);
    }

    @Test
    public void testGetAge(){

        Assert.assertEquals(man.getAge(), 64);
    }

    @Test
    public void testSetLastName(){
        man.setLastName("Black");
        Assert.assertEquals(man.getLastName(), "Black");
    }

    @Test
    public void testGetLastNane(){

        Assert.assertEquals(man.getLastName(), "White");
    }
}
