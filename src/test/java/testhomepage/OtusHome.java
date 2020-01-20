package testhomepage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OtusHome {

    private static Logger Log = LogManager.getLogger(OtusHome.class);

    WebDriver driver;

    public OtusHome (WebDriver driver) {this.driver = driver;}

//    By loc_main_courses = By.xpath("//div[@class='subtitle-new' and text()='Популярные курсы']");
    By loc_main_courses = By.xpath("//div[@class='subtitle-new']");


    public boolean findMainCourses()
    {
        WebElement mainCoursesEl;

        try {
            Log.info("Try to find mainCoursesEl");

            mainCoursesEl = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(loc_main_courses));
        } catch (Exception e) {
            Log.error("Error - mainCoursesElement was not found at the opened page", e);
            return false;
        }
        Log.info("mainCoursesEl was found successfully");

        return true;
    }
}
