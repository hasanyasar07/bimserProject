package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.awt.Point;
import java.awt.*;
import java.awt.event.InputEvent;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;
import java.util.*;
import java.util.function.Function;

import static utilities.Driver.getDriver;

public class ReusableMethods {
    private static int timeout = 5;


    public static String getCompany(String company){
        return ConfigReader.getProperty(company);
    }

    public static String getUsername(String username){
        return ConfigReader.getProperty(username);
    }

    public static String getPassword(String password){
        return ConfigReader.getProperty(password);
    }



    public static void wait(int secs) {

        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public  static void navigateToTheRequestedUrl(String url){
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

}


