package Test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2
{
    @Test
    public void selenium2()
    {
        System.out.println("selenium2");
    }

    @Test(groups = {"smoke"})
    public void appium2()
    {
        System.out.println("appium2");


    }
    @Test
    public void api2()
    {
        System.out.println("api2");
    }



}
