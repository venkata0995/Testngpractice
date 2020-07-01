package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo
{

    @Test(groups = {"smoke"})
    public void Demo()
    {
        System.out.println("hello");

    }

    @Test(dataProvider = "getdata")
    public void Venkata(String username,String password)
    {
        System.out.println("Venkata");
        System.out.println(username);
        System.out.println(password);

    }
    @Test
    public void sam()
    {
        System.out.println("sam");
    }
    @DataProvider
    public Object[][] getdata()
    {
        Object [][] data=new Object[3][2];
        data[0][0]="firstusername";
        data[0][1]="firstpassword";
        data[1][0]="secondusername";
        data[1][1]="secondpassword";
        data[2][0]="thirdusername";
        data[2][1]="thirdpassword";
        return data;
    }
}
