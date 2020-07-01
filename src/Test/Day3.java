package Test;

import org.testng.annotations.Test;

public class Day3
{
    @Test
    public void selenium3()
    {
        System.out.println("selenium3");
    }
    @Test
    public void appium3()
    {
        System.out.println("appium3");
    }
    @Test(groups={"smoke"})
    public void api3()
    {
        System.out.println("api3");
    }
}
