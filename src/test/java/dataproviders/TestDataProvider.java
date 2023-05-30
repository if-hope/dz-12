package dataproviders;

import models.Person;
import org.testng.annotations.DataProvider;

import static utils.CsvReader.getListObjectsFromCsv;

public class TestDataProvider {

//    @DataProvider(name = "retiredMen")
//    public static Object [][] createMen(){
//        return new Object[][]{{new Man("Ben", "Green", 65, false)},
//                {new Man ("Tag", "Rich", 66, false)}};
//    }
//
//    @DataProvider(name = "retiredWomen")
//    public static Object [][] createWomen(){
//        return new Object[][]{{new Woman("Cate", "Black", 60, true)},
//                {new Woman ("Ann", "Jones", 61, false)}};
//    }

    private static final String PATH = "src\\test\\resources\\dataMan.csv";
    private static final String PATH_ANOTHER = "src\\test\\resources\\dataWoman.csv";

    @DataProvider(name = "retiredMen")
    public static Object[][] createMan() {
//        List<Number> numbers = getListObjectsFromCsv();
//        Object[][] objects = new Object[numbers.size()][2];
//
//        for(int i = 0; i < numbers.size(); i++){
//            objects[i][0] = numbers.get(i).getNum1();
//            objects[i][1] = numbers.get(i).getNum2();
//        }
//
//        return objects;

        return getListObjectsFromCsv(PATH, Person.class).stream().map(man -> new Object[]{man.getFirstName(), man.getLastName(), man.getAge(), man.isPartner()})
                .toArray(Object[][]::new);
    }


    @DataProvider(name = "retiredWomen")
    public static Object[][] createWoman() {
        return getListObjectsFromCsv(PATH_ANOTHER, Person.class).stream().map(woman -> new Object[]{woman.getFirstName(), woman.getLastName(), woman.getAge(), woman.isPartner()})
                .toArray(Object[][]::new);
    }
}
