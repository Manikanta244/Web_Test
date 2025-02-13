
package com.orasi;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.*;
import com.orasi.datasource.*;


public class ObjectManager {
  private static final ObjectManager singleton = new ObjectManager();
  
  public static final ObjectManager instance() {
    return singleton;
  }
  
  private final Map<String,ByFactory> objectMap = new HashMap<>( 10 );
  
  private ObjectManager() {
    ByFactoryCollection bC = null;
    /*
    Site: practicetestautomation.com
    Add a description of practicetestautomation.com
    */
    /* Page: Test Login | Practice Test Automation 
    
    */

    

bC = new ByFactoryCollection("username", "26434.7411", "");
bC.add( new ByFactory( ByXPath.class, "//label[@for='username']/following-sibling::input[1]", "SiblingRule", "26434.7413", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@type='text']", "AttributeRule", "26434.7415", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='text']", "AttributeRule", "26434.7417", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"username\"]", "IDRule", "26434.7419", "" ) );
bC.add( new ByFactory( ById.class, "username", "IDRule", "26434.7421", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"username\"]", "IDRule", "26434.7423", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"username\"]", "NameRule", "26434.7425", "" ) );
bC.add( new ByFactory( ByName.class, "username", "NameRule", "26434.7427", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"username\"]", "NameRule", "26434.7429", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"form\"]/div[1]/input[1]", "ParentRule[IDRule]", "26434.7431", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"form\"]/div[1]/input[1]", "ParentRule[IDRule]", "26434.7433", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[1]/input[1]", "AbsoluteRule", "26434.7435", "" ) );


objectMap.put( "26434.7411", bC );


bC = new ByFactoryCollection("Testlogin", "26434.7439", "");
bC.add( new ByFactory( ByXPath.class, "//section[@id=\"login\"]/h2[1]", "ParentRule[IDRule]", "26434.7441", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"login\"]/h2[1]", "ParentRule[IDRule]", "26434.7443", "" ) );
bC.add( new ByFactory( ByXPath.class, "//h2", "TagRule", "26434.7445", "" ) );
bC.add( new ByFactory( ByXPath.class, "//h2[text()=\"Test login\"]", "TextRule", "26434.7447", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/section[1]/section[1]/h2[1]", "AbsoluteRule", "26434.7449", "" ) );


objectMap.put( "26434.7439", bC );


bC = new ByFactoryCollection("password", "26434.7452", "");
bC.add( new ByFactory( ByXPath.class, "//label[@for='password']/following-sibling::input[1]", "SiblingRule", "26434.7454", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@type='password']", "AttributeRule", "26434.7456", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='password']", "AttributeRule", "26434.7458", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"password\"]", "IDRule", "26434.7460", "" ) );
bC.add( new ByFactory( ById.class, "password", "IDRule", "26434.7462", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"password\"]", "IDRule", "26434.7464", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"password\"]", "NameRule", "26434.7466", "" ) );
bC.add( new ByFactory( ByName.class, "password", "NameRule", "26434.7468", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"password\"]", "NameRule", "26434.7470", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"form\"]/div[2]/input[1]", "ParentRule[IDRule]", "26434.7472", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"form\"]/div[2]/input[1]", "ParentRule[IDRule]", "26434.7474", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/input[1]", "AbsoluteRule", "26434.7476", "" ) );


objectMap.put( "26434.7452", bC );


bC = new ByFactoryCollection("main-container", "26434.7525", "");
bC.add( new ByFactory( ByXPath.class, "//header[@class='site-header']/following-sibling::section[1]", "SiblingRule", "26434.7527", "" ) );
bC.add( new ByFactory( ByXPath.class, "//section[@class='main-container']", "AttributeRule", "26434.7529", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='main-container']", "AttributeRule", "26434.7531", "" ) );
bC.add( new ByFactory( ByXPath.class, "//section[@role='main']", "AttributeRule", "26434.7533", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@role='main']", "AttributeRule", "26434.7535", "" ) );
bC.add( new ByFactory( ByXPath.class, "//section[@id=\"main-container\"]", "IDRule", "26434.7537", "" ) );
bC.add( new ByFactory( ById.class, "main-container", "IDRule", "26434.7539", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"main-container\"]", "IDRule", "26434.7541", "" ) );
bC.add( new ByFactory( ByXPath.class, "//section[./section[@id=\"login\"]]", "ChildRule[IDRule]", "26434.7543", "" ) );
bC.add( new ByFactory( ByXPath.class, "//section[./*[@id=\"login\"]]", "ChildRule[IDRule]", "26434.7545", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='max-width']/section[1]", "ParentRule[AttributeRule]", "26434.7547", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='max-width']/section[1]", "ParentRule[AttributeRule]", "26434.7549", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"max-width\"]/section[1]", "ParentRule[IDRule]", "26434.7551", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"max-width\"]/section[1]", "ParentRule[IDRule]", "26434.7553", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/section[1]", "AbsoluteRule", "26434.7555", "" ) );


objectMap.put( "26434.7525", bC );


bC = new ByFactoryCollection("Yourpasswordisinvalid!", "26434.7668", "");
bC.add( new ByFactory( ByXPath.class, "//b[text()=\"Your password is invalid!\"]", "TextRule", "26434.7670", "" ) );
bC.add( new ByFactory( ByXPath.class, "//section[@id=\"login\"]/ol[3]/li[6]/b[1]", "ParentRule[IDRule]", "26434.7672", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"login\"]/ol[3]/li[6]/b[1]", "ParentRule[IDRule]", "26434.7674", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/section[1]/section[1]/ol[3]/li[6]/b[1]", "AbsoluteRule", "26434.7676", "" ) );


objectMap.put( "26434.7668", bC );


bC = new ByFactoryCollection("UsenextcredentialstoexecuteLogin:Username:studentPassword:Passwo...", "26434.7701", "");
bC.add( new ByFactory( ByXPath.class, "//li[text()=\"This is a simple Login page. Students can use this page to practice writing simple positive and negative LogIn tests. Login functionality is something that most of the test automation engineers need to automate.\"]/following-sibling::li[1]", "SiblingRule", "26434.7703", "" ) );
bC.add( new ByFactory( ByXPath.class, "//section[@id=\"login\"]/ul[1]/li[2]", "ParentRule[IDRule]", "26434.7705", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"login\"]/ul[1]/li[2]", "ParentRule[IDRule]", "26434.7707", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/section[1]/section[1]/ul[1]/li[2]", "AbsoluteRule", "26434.7709", "" ) );


objectMap.put( "26434.7701", bC );


bC = new ByFactoryCollection("ThisisasimpleLoginpageStudentscanusethispagetopracticewritingsim...", "26434.7791", "");
bC.add( new ByFactory( ByXPath.class, "//li[text()=\"This is a simple Login page. Students can use this page to practice writing simple positive and negative LogIn tests. Login functionality is something that most of the test automation engineers need to automate.\"]", "TextRule", "26434.7793", "" ) );
bC.add( new ByFactory( ByXPath.class, "//section[@id=\"login\"]/ul[1]/li[1]", "ParentRule[IDRule]", "26434.7795", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"login\"]/ul[1]/li[1]", "ParentRule[IDRule]", "26434.7797", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/section[1]/section[1]/ul[1]/li[1]", "AbsoluteRule", "26434.7799", "" ) );


objectMap.put( "26434.7791", bC );


bC = new ByFactoryCollection("submit", "26434.7854", "");
bC.add( new ByFactory( ByXPath.class, "//button[@class='btn']", "AttributeRule", "26434.7856", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='btn']", "AttributeRule", "26434.7858", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"submit\"]", "IDRule", "26434.7860", "" ) );
bC.add( new ByFactory( ById.class, "submit", "IDRule", "26434.7862", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"submit\"]", "IDRule", "26434.7864", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"form\"]/button[1]", "ParentRule[IDRule]", "26434.7866", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"form\"]/button[1]", "ParentRule[IDRule]", "26434.7868", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[text()=\"Submit\"]", "TextRule", "26434.7870", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/button[1]", "AbsoluteRule", "26434.7872", "" ) );


objectMap.put( "26434.7854", bC );
/* Page: default 
    
    */

    /* Page: Logged In Successfully | Practice Test Automation 
    
    */

    

bC = new ByFactoryCollection("Logout", "26434.7886", "");
bC.add( new ByFactory( ByXPath.class, "//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']", "AttributeRule", "26434.7888", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']", "AttributeRule", "26434.7890", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@href='https://practicetestautomation.com/practice-test-login/']", "AttributeRule", "26434.7892", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@href='https://practicetestautomation.com/practice-test-login/']", "AttributeRule", "26434.7894", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@style='color:#ffffff']", "AttributeRule", "26434.7896", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='color:#ffffff']", "AttributeRule", "26434.7898", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='wp-block-button aligncenter is-style-fill']/a[1]", "ParentRule[AttributeRule]", "26434.7900", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='wp-block-button aligncenter is-style-fill']/a[1]", "ParentRule[AttributeRule]", "26434.7902", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[text()=\"Log out\"]", "TextRule", "26434.7904", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/article[1]/div[2]/div[1]/div[1]/div[1]/a[1]", "AbsoluteRule", "26434.7906", "" ) );


objectMap.put( "26434.7886", bC );
/*
    Site: demoqa.com
    Add a description of demoqa.com
    */
    /* Page: DEMOQA 
    
    */

    

bC = new ByFactoryCollection("Elements", "26303.1799", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='category-cards']/div[1]", "ParentRule[AttributeRule]", "26303.1801", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='category-cards']/div[1]", "ParentRule[AttributeRule]", "26303.1803", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class='card mt-4 top-card'])[1]", "IndexedAttributeRule", "26303.1805", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]", "AbsoluteRule", "26303.1807", "" ) );


objectMap.put( "26303.1799", bC );


bC = new ByFactoryCollection("item-2", "26303.1810", "");
bC.add( new ByFactory( ByXPath.class, "//li[@class='btn btn-light active']", "AttributeRule", "26303.1812", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='btn btn-light active']", "AttributeRule", "26303.1814", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[3]", "ParentRule[AttributeRule]", "26303.1816", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[3]", "ParentRule[AttributeRule]", "26303.1818", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Radio Button\"]]", "ChildRule[TextRule]", "26303.1820", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[1]/following-sibling::li[2]", "SiblingRule", "26303.1822", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]", "AbsoluteRule", "26303.1824", "" ) );


objectMap.put( "26303.1810", bC );


bC = new ByFactoryCollection("A", "26303.1827", "");
bC.add( new ByFactory( ByXPath.class, "//a[@href='https://demoqa.com']", "AttributeRule", "26303.1829", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@href='https://demoqa.com']", "AttributeRule", "26303.1831", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[./img[@src='/images/Toolsqa.jpg']]", "ChildRule[AttributeRule]", "26303.1833", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[./*[@src='/images/Toolsqa.jpg']]", "ChildRule[AttributeRule]", "26303.1835", "" ) );
bC.add( new ByFactory( ByXPath.class, "//header/a[1]", "ParentRule[TagRule]", "26303.1837", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/header[1]/a[1]", "AbsoluteRule", "26303.1839", "" ) );


objectMap.put( "26303.1827", bC );


bC = new ByFactoryCollection("item-0", "26303.1843", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[1]", "ParentRule[AttributeRule]", "26303.1845", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[1]", "ParentRule[AttributeRule]", "26303.1847", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Text Box\"]]", "ChildRule[TextRule]", "26303.1849", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[1]", "IndexedAttributeRule", "26303.1851", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]", "AbsoluteRule", "26303.1853", "" ) );


objectMap.put( "26303.1843", bC );


bC = new ByFactoryCollection("userName", "26303.1856", "");
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Full Name']", "AttributeRule", "26303.1858", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Full Name']", "AttributeRule", "26303.1860", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@type='text']", "AttributeRule", "26303.1862", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='text']", "AttributeRule", "26303.1864", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class=' mr-sm-2 form-control']", "AttributeRule", "26303.1866", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class=' mr-sm-2 form-control']", "AttributeRule", "26303.1868", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"userName\"]", "IDRule", "26303.1870", "" ) );
bC.add( new ByFactory( ById.class, "userName", "IDRule", "26303.1872", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"userName\"]", "IDRule", "26303.1874", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"userName-wrapper\"]/div[2]/input[1]", "ParentRule[IDRule]", "26303.1876", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"userName-wrapper\"]/div[2]/input[1]", "ParentRule[IDRule]", "26303.1878", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@autocomplete='off'])[1]", "IndexedAttributeRule", "26303.1880", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]", "AbsoluteRule", "26303.1882", "" ) );


objectMap.put( "26303.1856", bC );


bC = new ByFactoryCollection("userEmail", "26303.1886", "");
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='name@example.com']", "AttributeRule", "26303.1888", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='name@example.com']", "AttributeRule", "26303.1890", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@type='email']", "AttributeRule", "26303.1892", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='email']", "AttributeRule", "26303.1894", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='mr-sm-2 form-control']", "AttributeRule", "26303.1896", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='mr-sm-2 form-control']", "AttributeRule", "26303.1898", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"userEmail\"]", "IDRule", "26303.1900", "" ) );
bC.add( new ByFactory( ById.class, "userEmail", "IDRule", "26303.1902", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"userEmail\"]", "IDRule", "26303.1904", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"userEmail-wrapper\"]/div[2]/input[1]", "ParentRule[IDRule]", "26303.1906", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"userEmail-wrapper\"]/div[2]/input[1]", "ParentRule[IDRule]", "26303.1908", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@autocomplete='off'])[2]", "IndexedAttributeRule", "26303.1910", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[2]/input[1]", "AbsoluteRule", "26303.1912", "" ) );


objectMap.put( "26303.1886", bC );


bC = new ByFactoryCollection("currentAddress", "26303.1916", "");
bC.add( new ByFactory( ByXPath.class, "//textarea[@placeholder='Current Address']", "AttributeRule", "26303.1918", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Current Address']", "AttributeRule", "26303.1920", "" ) );
bC.add( new ByFactory( ByXPath.class, "//textarea[@id=\"currentAddress\"]", "IDRule", "26303.1922", "" ) );
bC.add( new ByFactory( ById.class, "currentAddress", "IDRule", "26303.1924", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"currentAddress\"]", "IDRule", "26303.1926", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"currentAddress-wrapper\"]/div[2]/textarea[1]", "ParentRule[IDRule]", "26303.1928", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"currentAddress-wrapper\"]/div[2]/textarea[1]", "ParentRule[IDRule]", "26303.1930", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//textarea[@class='form-control'])[1]", "IndexedAttributeRule", "26303.1932", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//textarea[@rows='5'])[1]", "IndexedAttributeRule", "26303.1934", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//textarea[@cols='20'])[1]", "IndexedAttributeRule", "26303.1936", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[2]/textarea[1]", "AbsoluteRule", "26303.1938", "" ) );


objectMap.put( "26303.1916", bC );


bC = new ByFactoryCollection("permanentAddress", "26303.1942", "");
bC.add( new ByFactory( ByXPath.class, "//textarea[@id=\"permanentAddress\"]", "IDRule", "26303.1944", "" ) );
bC.add( new ByFactory( ById.class, "permanentAddress", "IDRule", "26303.1946", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"permanentAddress\"]", "IDRule", "26303.1948", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"permanentAddress-wrapper\"]/div[2]/textarea[1]", "ParentRule[IDRule]", "26303.1950", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"permanentAddress-wrapper\"]/div[2]/textarea[1]", "ParentRule[IDRule]", "26303.1952", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//textarea[@class='form-control'])[2]", "IndexedAttributeRule", "26303.1954", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//textarea[@rows='5'])[2]", "IndexedAttributeRule", "26303.1956", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//textarea[@cols='20'])[2]", "IndexedAttributeRule", "26303.1958", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/div[2]/textarea[1]", "AbsoluteRule", "26303.1960", "" ) );


objectMap.put( "26303.1942", bC );


bC = new ByFactoryCollection("submit", "26303.1964", "");
bC.add( new ByFactory( ByXPath.class, "//button[@class='btn btn-primary']", "AttributeRule", "26303.1966", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='btn btn-primary']", "AttributeRule", "26303.1968", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"submit\"]", "IDRule", "26303.1970", "" ) );
bC.add( new ByFactory( ById.class, "submit", "IDRule", "26303.1972", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"submit\"]", "IDRule", "26303.1974", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='text-right col-md-2 col-sm-12']/button[1]", "ParentRule[AttributeRule]", "26303.1976", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='text-right col-md-2 col-sm-12']/button[1]", "ParentRule[AttributeRule]", "26303.1978", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[text()=\"Submit\"]", "TextRule", "26303.1980", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@type='button'])[2]", "IndexedAttributeRule", "26303.1982", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/div[1]/button[1]", "AbsoluteRule", "26303.1984", "" ) );


objectMap.put( "26303.1964", bC );


bC = new ByFactoryCollection("item-1", "26303.1987", "");
bC.add( new ByFactory( ByXPath.class, "//li[@class='btn btn-light active']/following-sibling::li[1]", "SiblingRule", "26303.1989", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[2]", "ParentRule[AttributeRule]", "26303.1991", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[2]", "ParentRule[AttributeRule]", "26303.1993", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Check Box\"]]", "ChildRule[TextRule]", "26303.1995", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[1]", "IndexedAttributeRule", "26303.1997", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]", "AbsoluteRule", "26303.1999", "" ) );


objectMap.put( "26303.1987", bC );


bC = new ByFactoryCollection("Elements-1", "26303.2041", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='accordion']/div[1]/span[1]", "ParentRule[AttributeRule]", "26303.2043", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='accordion']/div[1]/span[1]", "ParentRule[AttributeRule]", "26303.2045", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[text()=\"Elements\"]]", "ChildRule[TextRule]", "26303.2047", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//span[@class='group-header'])[1]", "IndexedAttributeRule", "26303.2049", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]", "AbsoluteRule", "26303.2051", "" ) );


objectMap.put( "26303.2041", bC );


bC = new ByFactoryCollection("item-8", "26303.2055", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[9]", "ParentRule[AttributeRule]", "26303.2057", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[9]", "ParentRule[AttributeRule]", "26303.2059", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Dynamic Properties\"]]", "ChildRule[TextRule]", "26303.2061", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[3]/following-sibling::li[5]", "SiblingRule", "26303.2063", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[8]", "IndexedAttributeRule", "26303.2065", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]", "AbsoluteRule", "26303.2067", "" ) );


objectMap.put( "26303.2055", bC );


bC = new ByFactoryCollection("item-7", "26303.2117", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[8]", "ParentRule[AttributeRule]", "26303.2119", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[8]", "ParentRule[AttributeRule]", "26303.2121", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Upload and Download\"]]", "ChildRule[TextRule]", "26303.2123", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[3]/following-sibling::li[5]", "SiblingRule", "26303.2125", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[8]", "IndexedAttributeRule", "26303.2127", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]", "AbsoluteRule", "26303.2129", "" ) );


objectMap.put( "26303.2117", bC );


bC = new ByFactoryCollection("uploadFile", "26303.2132", "");
bC.add( new ByFactory( ByXPath.class, "//label[@for='uploadFile']/following-sibling::input[1]", "SiblingRule", "26303.2134", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='form-control-file']", "AttributeRule", "26303.2136", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='form-control-file']", "AttributeRule", "26303.2138", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@type='file']", "AttributeRule", "26303.2140", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='file']", "AttributeRule", "26303.2142", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@lang='en']", "AttributeRule", "26303.2144", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@lang='en']", "AttributeRule", "26303.2146", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"uploadFile\"]", "IDRule", "26303.2148", "" ) );
bC.add( new ByFactory( ById.class, "uploadFile", "IDRule", "26303.2150", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"uploadFile\"]", "IDRule", "26303.2152", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='form-file']/input[1]", "ParentRule[AttributeRule]", "26303.2154", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='form-file']/input[1]", "ParentRule[AttributeRule]", "26303.2156", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input", "TagRule", "26303.2158", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/input[1]", "AbsoluteRule", "26303.2160", "" ) );


objectMap.put( "26303.2132", bC );


bC = new ByFactoryCollection("downloadButton", "26303.2163", "");
bC.add( new ByFactory( ByXPath.class, "//a[@class='btn btn-primary']", "AttributeRule", "26303.2165", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='btn btn-primary']", "AttributeRule", "26303.2167", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@href='data:image/jpeg;base64,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']", "AttributeRule", "26303.2169", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@href='data:image/jpeg;base64,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']", "AttributeRule", "26303.2171", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@target='_blank']", "AttributeRule", "26303.2173", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@target='_blank']", "AttributeRule", "26303.2175", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@download='sampleFile.jpeg']", "AttributeRule", "26303.2177", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@download='sampleFile.jpeg']", "AttributeRule", "26303.2179", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@id=\"downloadButton\"]", "IDRule", "26303.2181", "" ) );
bC.add( new ByFactory( ById.class, "downloadButton", "IDRule", "26303.2183", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"downloadButton\"]", "IDRule", "26303.2185", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[text()=\"Download\"]", "TextRule", "26303.2187", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='col-12 mt-4 col-md-6']/div[2]/div[1]/a[1]", "ParentRule[AttributeRule]", "26303.2189", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='col-12 mt-4 col-md-6']/div[2]/div[1]/a[1]", "ParentRule[AttributeRule]", "26303.2191", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]", "AbsoluteRule", "26303.2193", "" ) );


objectMap.put( "26303.2163", bC );


bC = new ByFactoryCollection("Forms", "26303.2211", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='category-cards']/div[2]", "ParentRule[AttributeRule]", "26303.2213", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='category-cards']/div[2]", "ParentRule[AttributeRule]", "26303.2215", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class='card mt-4 top-card'])[1]/following-sibling::div[1]", "SiblingRule", "26303.2217", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class='card mt-4 top-card'])[2]", "IndexedAttributeRule", "26303.2219", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]", "AbsoluteRule", "26303.2221", "" ) );


objectMap.put( "26303.2211", bC );


bC = new ByFactoryCollection("Pleaseselectanitemfromlefttostartpractice", "26303.2224", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='col-12 mt-4  col-md-3']/following-sibling::div[1]", "SiblingRule", "26303.2226", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='col-12 mt-4 col-md-6']", "AttributeRule", "26303.2228", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='col-12 mt-4 col-md-6']", "AttributeRule", "26303.2230", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@style='border: 1px solid rgb(229, 229, 229); margin-top: 50px; padding: 50px;']]", "ChildRule[AttributeRule]", "26303.2232", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@style='border: 1px solid rgb(229, 229, 229); margin-top: 50px; padding: 50px;']]", "ChildRule[AttributeRule]", "26303.2234", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@id=\"Ad.Plus-970x250-1\"]]", "ChildRule[IDRule]", "26303.2236", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"Ad.Plus-970x250-1\"]]", "ChildRule[IDRule]", "26303.2238", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='row']/div[2]", "ParentRule[AttributeRule]", "26303.2240", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='row']/div[2]", "ParentRule[AttributeRule]", "26303.2242", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[text()=\"Please select an item from left to start practice.\"]", "TextRule", "26303.2244", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]", "AbsoluteRule", "26303.2246", "" ) );


objectMap.put( "26303.2224", bC );


bC = new ByFactoryCollection("item-0-1", "26303.2249", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[1]", "ParentRule[AttributeRule]", "26303.2251", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[1]", "ParentRule[AttributeRule]", "26303.2253", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Practice Form\"]]", "ChildRule[TextRule]", "26303.2255", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[10]", "IndexedAttributeRule", "26303.2257", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]", "AbsoluteRule", "26303.2259", "" ) );


objectMap.put( "26303.2249", bC );


bC = new ByFactoryCollection("DIV", "26303.2261", "");
bC.add( new ByFactory( ByXPath.class, "//div[@style='border: 1px solid rgb(229, 229, 229); margin-top: 50px; padding: 50px;']", "AttributeRule", "26303.2263", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='border: 1px solid rgb(229, 229, 229); margin-top: 50px; padding: 50px;']", "AttributeRule", "26303.2265", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"Ad.Plus-970x250-1\"]/following-sibling::div[1]", "SiblingRule", "26303.2267", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@id=\"Ad.Plus-970x250-2\"]]", "ChildRule[IDRule]", "26303.2269", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"Ad.Plus-970x250-2\"]]", "ChildRule[IDRule]", "26303.2271", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='col-12 mt-4 col-md-6']/div[2]", "ParentRule[AttributeRule]", "26303.2273", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='col-12 mt-4 col-md-6']/div[2]", "ParentRule[AttributeRule]", "26303.2275", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[text()=\"Please select an item from left to start practice.\"]/div[2]", "ParentRule[TextRule]", "26303.2277", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]", "AbsoluteRule", "26303.2279", "" ) );


objectMap.put( "26303.2261", bC );


bC = new ByFactoryCollection("firstName", "26303.2283", "");
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='First Name']", "AttributeRule", "26303.2285", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='First Name']", "AttributeRule", "26303.2287", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"firstName\"]", "IDRule", "26303.2289", "" ) );
bC.add( new ByFactory( ById.class, "firstName", "IDRule", "26303.2291", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"firstName\"]", "IDRule", "26303.2293", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"userName-wrapper\"]/div[2]/input[1]", "ParentRule[IDRule]", "26303.2295", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"userName-wrapper\"]/div[2]/input[1]", "ParentRule[IDRule]", "26303.2297", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@autocomplete='off'])[1]", "IndexedAttributeRule", "26303.2299", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[1]", "IndexedAttributeRule", "26303.2301", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@class=' mr-sm-2 form-control'])[1]", "IndexedAttributeRule", "26303.2303", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]", "AbsoluteRule", "26303.2305", "" ) );


objectMap.put( "26303.2283", bC );


bC = new ByFactoryCollection("AlertsFrame&Windows", "26303.2308", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='accordion']/div[3]/span[1]", "ParentRule[AttributeRule]", "26303.2310", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='accordion']/div[3]/span[1]", "ParentRule[AttributeRule]", "26303.2312", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[text()=\"Alerts, Frame & Windows\"]]", "ChildRule[TextRule]", "26303.2314", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//span[@class='group-header'])[3]", "IndexedAttributeRule", "26303.2316", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[1]", "AbsoluteRule", "26303.2318", "" ) );


objectMap.put( "26303.2308", bC );


bC = new ByFactoryCollection("item-0-2", "26303.2328", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[1]", "ParentRule[AttributeRule]", "26303.2330", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[1]", "ParentRule[AttributeRule]", "26303.2332", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Browser Windows\"]]", "ChildRule[TextRule]", "26303.2334", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[11]", "IndexedAttributeRule", "26303.2336", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]", "AbsoluteRule", "26303.2338", "" ) );


objectMap.put( "26303.2328", bC );


bC = new ByFactoryCollection("tabButton", "26303.2341", "");
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"tabButton\"]", "IDRule", "26303.2343", "" ) );
bC.add( new ByFactory( ById.class, "tabButton", "IDRule", "26303.2345", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"tabButton\"]", "IDRule", "26303.2347", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"tabButtonWrapper\"]/button[1]", "ParentRule[IDRule]", "26303.2349", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"tabButtonWrapper\"]/button[1]", "ParentRule[IDRule]", "26303.2351", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[text()=\"New Tab\"]", "TextRule", "26303.2353", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@type='button'])[2]", "IndexedAttributeRule", "26303.2355", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@class='btn btn-primary'])[1]", "IndexedAttributeRule", "26303.2357", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]", "AbsoluteRule", "26303.2359", "" ) );


objectMap.put( "26303.2341", bC );


bC = new ByFactoryCollection("windowButton", "26303.2365", "");
bC.add( new ByFactory( ByXPath.class, "//button[@class='mt-4 btn btn-primary']", "AttributeRule", "26303.2367", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='mt-4 btn btn-primary']", "AttributeRule", "26303.2369", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"windowButton\"]", "IDRule", "26303.2371", "" ) );
bC.add( new ByFactory( ById.class, "windowButton", "IDRule", "26303.2373", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"windowButton\"]", "IDRule", "26303.2375", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"windowButtonWrapper\"]/button[1]", "ParentRule[IDRule]", "26303.2377", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"windowButtonWrapper\"]/button[1]", "ParentRule[IDRule]", "26303.2379", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[text()=\"New Window\"]", "TextRule", "26303.2381", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@type='button'])[3]", "IndexedAttributeRule", "26303.2383", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/button[1]", "AbsoluteRule", "26303.2385", "" ) );


objectMap.put( "26303.2365", bC );


bC = new ByFactoryCollection("messageWindowButton", "26303.2391", "");
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"messageWindowButton\"]", "IDRule", "26303.2393", "" ) );
bC.add( new ByFactory( ById.class, "messageWindowButton", "IDRule", "26303.2395", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"messageWindowButton\"]", "IDRule", "26303.2397", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='mt-4']/button[1]", "ParentRule[AttributeRule]", "26303.2399", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='mt-4']/button[1]", "ParentRule[AttributeRule]", "26303.2401", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"msgWindowButtonWrapper\"]/button[1]", "ParentRule[IDRule]", "26303.2403", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"msgWindowButtonWrapper\"]/button[1]", "ParentRule[IDRule]", "26303.2405", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[text()=\"New Window Message\"]", "TextRule", "26303.2407", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@type='button'])[4]", "IndexedAttributeRule", "26303.2409", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@class='btn btn-primary'])[2]", "IndexedAttributeRule", "26303.2411", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/button[1]", "AbsoluteRule", "26303.2413", "" ) );


objectMap.put( "26303.2391", bC );


bC = new ByFactoryCollection("AlertsFrame&Windows-1", "26303.2476", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='category-cards']/div[3]", "ParentRule[AttributeRule]", "26303.2478", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='category-cards']/div[3]", "ParentRule[AttributeRule]", "26303.2480", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class='card mt-4 top-card'])[1]/following-sibling::div[2]", "SiblingRule", "26303.2482", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class='card mt-4 top-card'])[3]", "IndexedAttributeRule", "26303.2484", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]", "AbsoluteRule", "26303.2486", "" ) );


objectMap.put( "26303.2476", bC );


bC = new ByFactoryCollection("item-1-1", "26303.2489", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[2]", "ParentRule[AttributeRule]", "26303.2491", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[2]", "ParentRule[AttributeRule]", "26303.2493", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Alerts\"]]", "ChildRule[TextRule]", "26303.2495", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[11]/following-sibling::li[1]", "SiblingRule", "26303.2497", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[12]", "IndexedAttributeRule", "26303.2499", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]", "AbsoluteRule", "26303.2501", "" ) );


objectMap.put( "26303.2489", bC );


bC = new ByFactoryCollection("alertButton", "26303.2504", "");
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"alertButton\"]", "IDRule", "26303.2506", "" ) );
bC.add( new ByFactory( ById.class, "alertButton", "IDRule", "26303.2508", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"alertButton\"]", "IDRule", "26303.2510", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@type='button'])[2]", "IndexedAttributeRule", "26303.2512", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@class='btn btn-primary'])[1]", "IndexedAttributeRule", "26303.2514", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"javascriptAlertsWrapper\"]/div[1]/div[2]/button[1]", "ParentRule[IDRule]", "26303.2516", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"javascriptAlertsWrapper\"]/div[1]/div[2]/button[1]", "ParentRule[IDRule]", "26303.2518", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/button[1]", "AbsoluteRule", "26303.2520", "" ) );


objectMap.put( "26303.2504", bC );


bC = new ByFactoryCollection("timerAlertButton", "26303.2524", "");
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"timerAlertButton\"]", "IDRule", "26303.2526", "" ) );
bC.add( new ByFactory( ById.class, "timerAlertButton", "IDRule", "26303.2528", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"timerAlertButton\"]", "IDRule", "26303.2530", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@type='button'])[3]", "IndexedAttributeRule", "26303.2532", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@class='btn btn-primary'])[2]", "IndexedAttributeRule", "26303.2534", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"javascriptAlertsWrapper\"]/div[2]/div[2]/button[1]", "ParentRule[IDRule]", "26303.2536", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"javascriptAlertsWrapper\"]/div[2]/div[2]/button[1]", "ParentRule[IDRule]", "26303.2538", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/button[1]", "AbsoluteRule", "26303.2540", "" ) );


objectMap.put( "26303.2524", bC );


bC = new ByFactoryCollection("confirmButton", "26303.2544", "");
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"confirmButton\"]", "IDRule", "26303.2546", "" ) );
bC.add( new ByFactory( ById.class, "confirmButton", "IDRule", "26303.2548", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"confirmButton\"]", "IDRule", "26303.2550", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@type='button'])[4]", "IndexedAttributeRule", "26303.2552", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@class='btn btn-primary'])[3]", "IndexedAttributeRule", "26303.2554", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"javascriptAlertsWrapper\"]/div[3]/div[2]/button[1]", "ParentRule[IDRule]", "26303.2556", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"javascriptAlertsWrapper\"]/div[3]/div[2]/button[1]", "ParentRule[IDRule]", "26303.2558", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/button[1]", "AbsoluteRule", "26303.2560", "" ) );


objectMap.put( "26303.2544", bC );


bC = new ByFactoryCollection("promtButton", "26303.2564", "");
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"promtButton\"]", "IDRule", "26303.2566", "" ) );
bC.add( new ByFactory( ById.class, "promtButton", "IDRule", "26303.2568", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"promtButton\"]", "IDRule", "26303.2570", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@type='button'])[5]", "IndexedAttributeRule", "26303.2572", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@class='btn btn-primary'])[4]", "IndexedAttributeRule", "26303.2574", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"javascriptAlertsWrapper\"]/div[4]/div[2]/button[1]", "ParentRule[IDRule]", "26303.2576", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"javascriptAlertsWrapper\"]/div[4]/div[2]/button[1]", "ParentRule[IDRule]", "26303.2578", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/button[1]", "AbsoluteRule", "26303.2580", "" ) );


objectMap.put( "26303.2564", bC );


bC = new ByFactoryCollection("item-4", "26303.2584", "");
bC.add( new ByFactory( ByXPath.class, "//li[@class='btn btn-light active']/following-sibling::li[3]", "SiblingRule", "26303.2586", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[5]", "ParentRule[AttributeRule]", "26303.2588", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[5]", "ParentRule[AttributeRule]", "26303.2590", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Modal Dialogs\"]]", "ChildRule[TextRule]", "26303.2592", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[14]", "IndexedAttributeRule", "26303.2594", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[5]", "AbsoluteRule", "26303.2596", "" ) );


objectMap.put( "26303.2584", bC );


bC = new ByFactoryCollection("showSmallModal", "26303.2599", "");
bC.add( new ByFactory( ByXPath.class, "//button[@class='mr-4 mt-2 btn btn-primary']", "AttributeRule", "26303.2601", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='mr-4 mt-2 btn btn-primary']", "AttributeRule", "26303.2603", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"showSmallModal\"]", "IDRule", "26303.2605", "" ) );
bC.add( new ByFactory( ById.class, "showSmallModal", "IDRule", "26303.2607", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"showSmallModal\"]", "IDRule", "26303.2609", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[text()=\"Click on button to see modal\"]/following-sibling::button[1]", "SiblingRule", "26303.2611", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[text()=\"Small modal\"]", "TextRule", "26303.2613", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"modalWrapper\"]/div[1]/button[1]", "ParentRule[IDRule]", "26303.2615", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"modalWrapper\"]/div[1]/button[1]", "ParentRule[IDRule]", "26303.2617", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@type='button'])[2]", "IndexedAttributeRule", "26303.2619", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]", "AbsoluteRule", "26303.2621", "" ) );


objectMap.put( "26303.2599", bC );


bC = new ByFactoryCollection("closeSmallModal", "26303.2624", "");
bC.add( new ByFactory( ByXPath.class, "//button[@class='btn btn-primary']", "AttributeRule", "26303.2626", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='btn btn-primary']", "AttributeRule", "26303.2628", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"closeSmallModal\"]", "IDRule", "26303.2630", "" ) );
bC.add( new ByFactory( ById.class, "closeSmallModal", "IDRule", "26303.2632", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"closeSmallModal\"]", "IDRule", "26303.2634", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='modal-footer']/button[1]", "ParentRule[AttributeRule]", "26303.2636", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='modal-footer']/button[1]", "ParentRule[AttributeRule]", "26303.2638", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[text()=\"Close\"]", "TextRule", "26303.2640", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@type='button'])[5]", "IndexedAttributeRule", "26303.2642", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[4]/div[1]/div[1]/div[3]/button[1]", "AbsoluteRule", "26303.2644", "" ) );


objectMap.put( "26303.2624", bC );


bC = new ByFactoryCollection("showLargeModal", "26303.2647", "");
bC.add( new ByFactory( ByXPath.class, "//button[@class='mr-4 mt-2 btn btn-primary']/following-sibling::button[1]", "SiblingRule", "26303.2649", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@class='mt-2 btn btn-primary']", "AttributeRule", "26303.2651", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='mt-2 btn btn-primary']", "AttributeRule", "26303.2653", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"showLargeModal\"]", "IDRule", "26303.2655", "" ) );
bC.add( new ByFactory( ById.class, "showLargeModal", "IDRule", "26303.2657", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"showLargeModal\"]", "IDRule", "26303.2659", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[text()=\"Large modal\"]", "TextRule", "26303.2661", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"modalWrapper\"]/div[1]/button[2]", "ParentRule[IDRule]", "26303.2663", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"modalWrapper\"]/div[1]/button[2]", "ParentRule[IDRule]", "26303.2665", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@type='button'])[3]", "IndexedAttributeRule", "26303.2667", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[2]", "AbsoluteRule", "26303.2669", "" ) );


objectMap.put( "26303.2647", bC );


bC = new ByFactoryCollection("LargeModalCloseLoremIpsumissimplydummytextoftheprintingandtypese...", "26303.2672", "");
bC.add( new ByFactory( ByXPath.class, "//script[@src='https://www.google.com/recaptcha/api.js?onload=onloadCallback&render=explicit']/following-sibling::div[2]", "SiblingRule", "26303.2674", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@role='dialog']", "AttributeRule", "26303.2676", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@role='dialog']", "AttributeRule", "26303.2678", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@aria-modal='true']", "AttributeRule", "26303.2680", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-modal='true']", "AttributeRule", "26303.2682", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@aria-labelledby='example-modal-sizes-title-lg']", "AttributeRule", "26303.2684", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-labelledby='example-modal-sizes-title-lg']", "AttributeRule", "26303.2686", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='fade modal show']", "AttributeRule", "26303.2688", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='fade modal show']", "AttributeRule", "26303.2690", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@tabindex='-1']", "AttributeRule", "26303.2692", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@tabindex='-1']", "AttributeRule", "26303.2694", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@style='display: block;']", "AttributeRule", "26303.2696", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@role='document']]", "ChildRule[AttributeRule]", "26303.2698", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@role='document']]", "ChildRule[AttributeRule]", "26303.2700", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@class='modal-dialog modal-lg']]", "ChildRule[AttributeRule]", "26303.2702", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@class='modal-dialog modal-lg']]", "ChildRule[AttributeRule]", "26303.2704", "" ) );
bC.add( new ByFactory( ByXPath.class, "//body[@class='modal-open']/div[4]", "ParentRule[AttributeRule]", "26303.2706", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='modal-open']/div[4]", "ParentRule[AttributeRule]", "26303.2708", "" ) );
bC.add( new ByFactory( ByXPath.class, "//body[@style='overflow: hidden; padding-right: 17px;']/div[4]", "ParentRule[AttributeRule]", "26303.2710", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='overflow: hidden; padding-right: 17px;']/div[4]", "ParentRule[AttributeRule]", "26303.2712", "" ) );
bC.add( new ByFactory( ByXPath.class, "//body/div[4]", "ParentRule[TagRule]", "26303.2714", "" ) );


objectMap.put( "26303.2672", bC );


bC = new ByFactoryCollection("datePickerMonthYearInput", "26303.2832", "");
bC.add( new ByFactory( ByXPath.class, "//input[@value='01/24/2025']", "AttributeRule", "26303.2834", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@value='01/24/2025']", "AttributeRule", "26303.2836", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"datePickerMonthYearInput\"]", "IDRule", "26303.2838", "" ) );
bC.add( new ByFactory( ById.class, "datePickerMonthYearInput", "IDRule", "26303.2840", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"datePickerMonthYearInput\"]", "IDRule", "26303.2842", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[1]", "IndexedAttributeRule", "26303.2844", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"datePickerMonthYear\"]/div[1]/div[1]/input[1]", "ParentRule[IDRule]", "26303.2846", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"datePickerMonthYear\"]/div[1]/div[1]/input[1]", "ParentRule[IDRule]", "26303.2848", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]", "AbsoluteRule", "26303.2850", "" ) );


objectMap.put( "26303.2832", bC );


bC = new ByFactoryCollection("27", "26303.2853", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='react-datepicker__day react-datepicker__day--026 react-datepicker__day--weekend']/following-sibling::div[1]", "SiblingRule", "26303.2855", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='react-datepicker__day react-datepicker__day--027']", "AttributeRule", "26303.2857", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='react-datepicker__day react-datepicker__day--027']", "AttributeRule", "26303.2859", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@aria-label='Choose Monday, January 27th, 2025']", "AttributeRule", "26303.2861", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Choose Monday, January 27th, 2025']", "AttributeRule", "26303.2863", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='react-datepicker__month']/div[5]/div[2]", "ParentRule[AttributeRule]", "26303.2865", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='react-datepicker__month']/div[5]/div[2]", "ParentRule[AttributeRule]", "26303.2867", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@role='listbox']/div[5]/div[2]", "ParentRule[AttributeRule]", "26303.2869", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@role='listbox']/div[5]/div[2]", "ParentRule[AttributeRule]", "26303.2871", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@aria-label='month  2025-01']/div[5]/div[2]", "ParentRule[AttributeRule]", "26303.2873", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='month  2025-01']/div[5]/div[2]", "ParentRule[AttributeRule]", "26303.2875", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[text()=\"27\"]", "TextRule", "26303.2877", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@tabindex='-1'])[29]", "IndexedAttributeRule", "26303.2879", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@role='option'])[30]", "IndexedAttributeRule", "26303.2881", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@aria-disabled='false'])[30]", "IndexedAttributeRule", "26303.2883", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[5]/div[2]", "AbsoluteRule", "26303.2885", "" ) );


objectMap.put( "26303.2853", bC );


bC = new ByFactoryCollection("dateAndTimePickerInput", "26303.2888", "");
bC.add( new ByFactory( ByXPath.class, "//input[@value='January 24, 2025 4:22 PM']", "AttributeRule", "26303.2890", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@value='January 24, 2025 4:22 PM']", "AttributeRule", "26303.2892", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"dateAndTimePickerInput\"]", "IDRule", "26303.2894", "" ) );
bC.add( new ByFactory( ById.class, "dateAndTimePickerInput", "IDRule", "26303.2896", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"dateAndTimePickerInput\"]", "IDRule", "26303.2898", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[2]", "IndexedAttributeRule", "26303.2900", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"dateAndTimePicker\"]/div[1]/div[1]/input[1]", "ParentRule[IDRule]", "26303.2902", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"dateAndTimePicker\"]/div[1]/div[1]/input[1]", "ParentRule[IDRule]", "26303.2904", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]", "AbsoluteRule", "26303.2906", "" ) );


objectMap.put( "26303.2888", bC );


bC = new ByFactoryCollection("31", "26303.2909", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='react-datepicker__day react-datepicker__day--026 react-datepicker__day--weekend']/following-sibling::div[5]", "SiblingRule", "26303.2911", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='react-datepicker__day react-datepicker__day--031']", "AttributeRule", "26303.2913", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='react-datepicker__day react-datepicker__day--031']", "AttributeRule", "26303.2915", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@aria-label='Choose Friday, January 31st, 2025']", "AttributeRule", "26303.2917", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Choose Friday, January 31st, 2025']", "AttributeRule", "26303.2919", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='react-datepicker__month']/div[5]/div[6]", "ParentRule[AttributeRule]", "26303.2921", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='react-datepicker__month']/div[5]/div[6]", "ParentRule[AttributeRule]", "26303.2923", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@role='listbox']/div[5]/div[6]", "ParentRule[AttributeRule]", "26303.2925", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@role='listbox']/div[5]/div[6]", "ParentRule[AttributeRule]", "26303.2927", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@aria-label='month  2025-01']/div[5]/div[6]", "ParentRule[AttributeRule]", "26303.2929", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='month  2025-01']/div[5]/div[6]", "ParentRule[AttributeRule]", "26303.2931", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@tabindex='-1'])[33]", "IndexedAttributeRule", "26303.2933", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@role='option'])[34]", "IndexedAttributeRule", "26303.2935", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@aria-disabled='false'])[34]", "IndexedAttributeRule", "26303.2937", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[5]/div[6]", "AbsoluteRule", "26303.2939", "" ) );


objectMap.put( "26303.2909", bC );


bC = new ByFactoryCollection("DIV1", "26303.2955", "");
bC.add( new ByFactory( ByXPath.class, "//div[@data-google-query-id='CNXw6-CajosDFStfnQkdqX0SoQ']/following-sibling::div[2]", "SiblingRule", "26303.2957", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@style='border: 1px solid rgb(229, 229, 229); margin-top: 50px; padding: 50px;']", "AttributeRule", "26303.2959", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='border: 1px solid rgb(229, 229, 229); margin-top: 50px; padding: 50px;']", "AttributeRule", "26303.2961", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@data-google-query-id='CODx6-CajosDFStZnQkd_6AeYg']]", "ChildRule[AttributeRule]", "26303.2963", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@data-google-query-id='CODx6-CajosDFStZnQkd_6AeYg']]", "ChildRule[AttributeRule]", "26303.2965", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@id=\"Ad.Plus-970x250-2\"]]", "ChildRule[IDRule]", "26303.2967", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"Ad.Plus-970x250-2\"]]", "ChildRule[IDRule]", "26303.2969", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='col-12 mt-4 col-md-6']/div[3]", "ParentRule[AttributeRule]", "26303.2971", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='col-12 mt-4 col-md-6']/div[3]", "ParentRule[AttributeRule]", "26303.2973", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]", "AbsoluteRule", "26303.2975", "" ) );


objectMap.put( "26303.2955", bC );


bC = new ByFactoryCollection("cbb", "26303.2980", "");
bC.add( new ByFactory( ByXPath.class, "//script[@data-jcp-viewport-entered-threshold='0']/following-sibling::div[2]", "SiblingRule", "26303.2982", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='cbb']", "AttributeRule", "26303.2984", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='cbb']", "AttributeRule", "26303.2986", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@tabindex='0']", "AttributeRule", "26303.2988", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@tabindex='0']", "AttributeRule", "26303.2990", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@role='button']", "AttributeRule", "26303.2992", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@role='button']", "AttributeRule", "26303.2994", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"cbb\"]", "IDRule", "26303.2996", "" ) );
bC.add( new ByFactory( ById.class, "cbb", "IDRule", "26303.2998", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"cbb\"]", "IDRule", "26303.3000", "" ) );
bC.add( new ByFactory( ByXPath.class, "//body[@class='jar']/div[4]", "ParentRule[AttributeRule]", "26303.3002", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='jar']/div[4]", "ParentRule[AttributeRule]", "26303.3004", "" ) );
bC.add( new ByFactory( ByXPath.class, "//body[@marginwidth='0']/div[4]", "ParentRule[AttributeRule]", "26303.3006", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@marginwidth='0']/div[4]", "ParentRule[AttributeRule]", "26303.3008", "" ) );
bC.add( new ByFactory( ByXPath.class, "//body[@marginheight='0']/div[4]", "ParentRule[AttributeRule]", "26303.3010", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@marginheight='0']/div[4]", "ParentRule[AttributeRule]", "26303.3012", "" ) );
bC.add( new ByFactory( ByXPath.class, "//body/div[4]", "ParentRule[TagRule]", "26303.3014", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[4]", "AbsoluteRule", "26303.3016", "" ) );


objectMap.put( "26303.2980", bC );


bC = new ByFactoryCollection("datePickerContainer", "26303.3020", "");
bC.add( new ByFactory( ByXPath.class, "//div[@data-google-query-id='CNXw6-CajosDFStfnQkdqX0SoQ']/following-sibling::div[1]", "SiblingRule", "26303.3022", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./h1[@class='text-center']]", "ChildRule[AttributeRule]", "26303.3024", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@class='text-center']]", "ChildRule[AttributeRule]", "26303.3026", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@class='mt-4 row']]", "ChildRule[AttributeRule]", "26303.3028", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@class='mt-4 row']]", "ChildRule[AttributeRule]", "26303.3030", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"datePickerContainer\"]", "IDRule", "26303.3032", "" ) );
bC.add( new ByFactory( ById.class, "datePickerContainer", "IDRule", "26303.3034", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"datePickerContainer\"]", "IDRule", "26303.3036", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='col-12 mt-4 col-md-6']/div[2]", "ParentRule[AttributeRule]", "26303.3038", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='col-12 mt-4 col-md-6']/div[2]", "ParentRule[AttributeRule]", "26303.3040", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./h1]", "ChildRule[TagRule]", "26303.3042", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./h1[text()=\"Date Picker\"]]", "ChildRule[TextRule]", "26303.3044", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]", "AbsoluteRule", "26303.3046", "" ) );


objectMap.put( "26303.3020", bC );


bC = new ByFactoryCollection("Widgets", "26303.3072", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='category-cards']/div[4]", "ParentRule[AttributeRule]", "26303.3074", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='category-cards']/div[4]", "ParentRule[AttributeRule]", "26303.3076", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class='card mt-4 top-card'])[1]/following-sibling::div[3]", "SiblingRule", "26303.3078", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class='card mt-4 top-card'])[4]", "IndexedAttributeRule", "26303.3080", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]", "AbsoluteRule", "26303.3082", "" ) );


objectMap.put( "26303.3072", bC );


bC = new ByFactoryCollection("Widgets-1", "26303.3085", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='accordion']/div[4]/span[1]", "ParentRule[AttributeRule]", "26303.3087", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='accordion']/div[4]/span[1]", "ParentRule[AttributeRule]", "26303.3089", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[text()=\"Widgets\"]]", "ChildRule[TextRule]", "26303.3091", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//span[@class='group-header'])[4]", "IndexedAttributeRule", "26303.3093", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/span[1]", "AbsoluteRule", "26303.3095", "" ) );


objectMap.put( "26303.3085", bC );


bC = new ByFactoryCollection("item-0-3", "26303.3099", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[1]", "ParentRule[AttributeRule]", "26303.3101", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[1]", "ParentRule[AttributeRule]", "26303.3103", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Accordian\"]]", "ChildRule[TextRule]", "26303.3105", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[16]", "IndexedAttributeRule", "26303.3107", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]", "AbsoluteRule", "26303.3109", "" ) );


objectMap.put( "26303.3099", bC );


bC = new ByFactoryCollection("section1Heading", "26303.3112", "");
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"section1Heading\"]", "IDRule", "26303.3114", "" ) );
bC.add( new ByFactory( ById.class, "section1Heading", "IDRule", "26303.3116", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"section1Heading\"]", "IDRule", "26303.3118", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[text()=\"What is Lorem Ipsum?\"]", "TextRule", "26303.3120", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='accordian-container']/div[1]/div[1]/div[1]", "ParentRule[AttributeRule]", "26303.3122", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='accordian-container']/div[1]/div[1]/div[1]", "ParentRule[AttributeRule]", "26303.3124", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class='card-header'])[1]", "IndexedAttributeRule", "26303.3126", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"accordianContainer\"]/div[1]/div[1]/div[1]", "ParentRule[IDRule]", "26303.3128", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"accordianContainer\"]/div[1]/div[1]/div[1]", "ParentRule[IDRule]", "26303.3130", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]", "AbsoluteRule", "26303.3132", "" ) );


objectMap.put( "26303.3112", bC );


bC = new ByFactoryCollection("section2Heading", "26303.3135", "");
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"section2Heading\"]", "IDRule", "26303.3137", "" ) );
bC.add( new ByFactory( ById.class, "section2Heading", "IDRule", "26303.3139", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"section2Heading\"]", "IDRule", "26303.3141", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[text()=\"Where does it come from?\"]", "TextRule", "26303.3143", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='accordian-container']/div[1]/div[2]/div[1]", "ParentRule[AttributeRule]", "26303.3145", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='accordian-container']/div[1]/div[2]/div[1]", "ParentRule[AttributeRule]", "26303.3147", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class='card-header'])[2]", "IndexedAttributeRule", "26303.3149", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"accordianContainer\"]/div[1]/div[2]/div[1]", "ParentRule[IDRule]", "26303.3151", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"accordianContainer\"]/div[1]/div[2]/div[1]", "ParentRule[IDRule]", "26303.3153", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]", "AbsoluteRule", "26303.3155", "" ) );


objectMap.put( "26303.3135", bC );


bC = new ByFactoryCollection("section3Heading", "26303.3159", "");
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"section3Heading\"]", "IDRule", "26303.3161", "" ) );
bC.add( new ByFactory( ById.class, "section3Heading", "IDRule", "26303.3163", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"section3Heading\"]", "IDRule", "26303.3165", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[text()=\"Why do we use it?\"]", "TextRule", "26303.3167", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='accordian-container']/div[1]/div[3]/div[1]", "ParentRule[AttributeRule]", "26303.3169", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='accordian-container']/div[1]/div[3]/div[1]", "ParentRule[AttributeRule]", "26303.3171", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class='card-header'])[3]", "IndexedAttributeRule", "26303.3173", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"accordianContainer\"]/div[1]/div[3]/div[1]", "ParentRule[IDRule]", "26303.3175", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"accordianContainer\"]/div[1]/div[3]/div[1]", "ParentRule[IDRule]", "26303.3177", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]", "AbsoluteRule", "26303.3179", "" ) );


objectMap.put( "26303.3159", bC );


bC = new ByFactoryCollection("item-1-2", "26303.3183", "");
bC.add( new ByFactory( ByXPath.class, "//li[@class='btn btn-light active']/following-sibling::li[1]", "SiblingRule", "26303.3185", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[2]", "ParentRule[AttributeRule]", "26303.3187", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[2]", "ParentRule[AttributeRule]", "26303.3189", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Auto Complete\"]]", "ChildRule[TextRule]", "26303.3191", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[16]", "IndexedAttributeRule", "26303.3193", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]", "AbsoluteRule", "26303.3195", "" ) );


objectMap.put( "26303.3183", bC );


bC = new ByFactoryCollection("auto-complete__value-containerauto-complete__value-container--is...", "26303.3198", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']", "AttributeRule", "26303.3200", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']", "AttributeRule", "26303.3202", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"autoCompleteMultipleContainer\"]/div[1]/div[1]", "ParentRule[IDRule]", "26303.3204", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"autoCompleteMultipleContainer\"]/div[1]/div[1]", "ParentRule[IDRule]", "26303.3206", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]", "AbsoluteRule", "26303.3208", "" ) );


objectMap.put( "26303.3198", bC );


bC = new ByFactoryCollection("autoCompleteMultipleInput", "26303.3211", "");
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"autoCompleteMultipleInput\"]", "IDRule", "26303.3213", "" ) );
bC.add( new ByFactory( ById.class, "autoCompleteMultipleInput", "IDRule", "26303.3215", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"autoCompleteMultipleInput\"]", "IDRule", "26303.3217", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']/div[2]/div[1]/input[1]", "ParentRule[AttributeRule]", "26303.3219", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']/div[2]/div[1]/input[1]", "ParentRule[AttributeRule]", "26303.3221", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@autocapitalize='none'])[1]", "IndexedAttributeRule", "26303.3223", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@autocomplete='off'])[1]", "IndexedAttributeRule", "26303.3225", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@autocorrect='off'])[1]", "IndexedAttributeRule", "26303.3227", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@spellcheck='false'])[1]", "IndexedAttributeRule", "26303.3229", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@tabindex='0'])[1]", "IndexedAttributeRule", "26303.3231", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[1]", "IndexedAttributeRule", "26303.3233", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@aria-autocomplete='list'])[1]", "IndexedAttributeRule", "26303.3235", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@style='box-sizing: content-box; width: 2px; background: 0px center; border: 0px; font-size: inherit; opacity: 1; outline: 0px; padding: 0px; color: inherit;'])[1]", "IndexedAttributeRule", "26303.3237", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]", "AbsoluteRule", "26303.3239", "" ) );


objectMap.put( "26303.3211", bC );


bC = new ByFactoryCollection("auto-complete__value-containercss-1hwfws3", "26303.3242", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='auto-complete__value-container css-1hwfws3']", "AttributeRule", "26303.3244", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='auto-complete__value-container css-1hwfws3']", "AttributeRule", "26303.3246", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@class='auto-complete__placeholder css-1wa3eu0-placeholder']]", "ChildRule[AttributeRule]", "26303.3248", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@class='auto-complete__placeholder css-1wa3eu0-placeholder']]", "ChildRule[AttributeRule]", "26303.3250", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='auto-complete__control css-yk16xz-control']/div[1]", "ParentRule[AttributeRule]", "26303.3252", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='auto-complete__control css-yk16xz-control']/div[1]", "ParentRule[AttributeRule]", "26303.3254", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]", "AbsoluteRule", "26303.3256", "" ) );


objectMap.put( "26303.3242", bC );


bC = new ByFactoryCollection("autoCompleteSingleInput", "26303.3259", "");
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"autoCompleteSingleInput\"]", "IDRule", "26303.3261", "" ) );
bC.add( new ByFactory( ById.class, "autoCompleteSingleInput", "IDRule", "26303.3263", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"autoCompleteSingleInput\"]", "IDRule", "26303.3265", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='auto-complete__value-container css-1hwfws3']/div[2]/div[1]/input[1]", "ParentRule[AttributeRule]", "26303.3267", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='auto-complete__value-container css-1hwfws3']/div[2]/div[1]/input[1]", "ParentRule[AttributeRule]", "26303.3269", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@autocapitalize='none'])[2]", "IndexedAttributeRule", "26303.3271", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@autocomplete='off'])[2]", "IndexedAttributeRule", "26303.3273", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@autocorrect='off'])[2]", "IndexedAttributeRule", "26303.3275", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@spellcheck='false'])[2]", "IndexedAttributeRule", "26303.3277", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@tabindex='0'])[2]", "IndexedAttributeRule", "26303.3279", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[2]", "IndexedAttributeRule", "26303.3281", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@aria-autocomplete='list'])[2]", "IndexedAttributeRule", "26303.3283", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@style='box-sizing: content-box; width: 2px; background: 0px center; border: 0px; font-size: inherit; opacity: 1; outline: 0px; padding: 0px; color: inherit;'])[2]", "IndexedAttributeRule", "26303.3285", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]", "AbsoluteRule", "26303.3287", "" ) );


objectMap.put( "26303.3259", bC );


bC = new ByFactoryCollection("react-select-3-option-0", "26303.3290", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='auto-complete__option auto-complete__option--is-focused css-1n7v3ny-option']", "AttributeRule", "26303.3292", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='auto-complete__option auto-complete__option--is-focused css-1n7v3ny-option']", "AttributeRule", "26303.3294", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@tabindex='-1']", "AttributeRule", "26303.3296", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@tabindex='-1']", "AttributeRule", "26303.3298", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"react-select-3-option-0\"]", "IDRule", "26303.3300", "" ) );
bC.add( new ByFactory( ById.class, "react-select-3-option-0", "IDRule", "26303.3302", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"react-select-3-option-0\"]", "IDRule", "26303.3304", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='auto-complete__menu-list css-11unzgr']/div[1]", "ParentRule[AttributeRule]", "26303.3306", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='auto-complete__menu-list css-11unzgr']/div[1]", "ParentRule[AttributeRule]", "26303.3308", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[text()=\"White\"]", "TextRule", "26303.3310", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]", "AbsoluteRule", "26303.3312", "" ) );


objectMap.put( "26303.3290", bC );


bC = new ByFactoryCollection("auto-complete__value-containerauto-complete__value-container--is...-1", "26303.3315", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']", "AttributeRule", "26303.3317", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']", "AttributeRule", "26303.3319", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@class='auto-complete__placeholder css-1wa3eu0-placeholder']]", "ChildRule[AttributeRule]", "26303.3321", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@class='auto-complete__placeholder css-1wa3eu0-placeholder']]", "ChildRule[AttributeRule]", "26303.3323", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='auto-complete__control css-yk16xz-control']/div[1]", "ParentRule[AttributeRule]", "26303.3325", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='auto-complete__control css-yk16xz-control']/div[1]", "ParentRule[AttributeRule]", "26303.3327", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]", "AbsoluteRule", "26303.3329", "" ) );


objectMap.put( "26303.3315", bC );


bC = new ByFactoryCollection("react-select-2-option-0", "26303.3333", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='auto-complete__option auto-complete__option--is-focused css-1n7v3ny-option']", "AttributeRule", "26303.3335", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='auto-complete__option auto-complete__option--is-focused css-1n7v3ny-option']", "AttributeRule", "26303.3337", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@tabindex='-1']", "AttributeRule", "26303.3339", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@tabindex='-1']", "AttributeRule", "26303.3341", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"react-select-2-option-0\"]", "IDRule", "26303.3343", "" ) );
bC.add( new ByFactory( ById.class, "react-select-2-option-0", "IDRule", "26303.3345", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"react-select-2-option-0\"]", "IDRule", "26303.3347", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='auto-complete__menu-list auto-complete__menu-list--is-multi css-11unzgr']/div[1]", "ParentRule[AttributeRule]", "26303.3349", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='auto-complete__menu-list auto-complete__menu-list--is-multi css-11unzgr']/div[1]", "ParentRule[AttributeRule]", "26303.3351", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[text()=\"Blue\"]", "TextRule", "26303.3353", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]", "AbsoluteRule", "26303.3355", "" ) );


objectMap.put( "26303.3333", bC );


bC = new ByFactoryCollection("item-2-1", "26303.3360", "");
bC.add( new ByFactory( ByXPath.class, "//li[@class='btn btn-light active']/following-sibling::li[1]", "SiblingRule", "26303.3362", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[3]", "ParentRule[AttributeRule]", "26303.3364", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[3]", "ParentRule[AttributeRule]", "26303.3366", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Date Picker\"]]", "ChildRule[TextRule]", "26303.3368", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[17]", "IndexedAttributeRule", "26303.3370", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]", "AbsoluteRule", "26303.3372", "" ) );


objectMap.put( "26303.3360", bC );


bC = new ByFactoryCollection("item-3", "26303.3375", "");
bC.add( new ByFactory( ByXPath.class, "//li[@class='btn btn-light active']/following-sibling::li[1]", "SiblingRule", "26303.3377", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[4]", "ParentRule[AttributeRule]", "26303.3379", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[4]", "ParentRule[AttributeRule]", "26303.3381", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Slider\"]]", "ChildRule[TextRule]", "26303.3383", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[18]", "IndexedAttributeRule", "26303.3385", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]", "AbsoluteRule", "26303.3387", "" ) );


objectMap.put( "26303.3375", bC );


bC = new ByFactoryCollection("25", "26303.3390", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='range']", "AttributeRule", "26303.3392", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='range']", "AttributeRule", "26303.3394", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='range-slider range-slider--primary']", "AttributeRule", "26303.3396", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='range-slider range-slider--primary']", "AttributeRule", "26303.3398", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@min='0']", "AttributeRule", "26303.3400", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@min='0']", "AttributeRule", "26303.3402", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@max='100']", "AttributeRule", "26303.3404", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@max='100']", "AttributeRule", "26303.3406", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@style='--value: 25;']", "AttributeRule", "26303.3408", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='--value: 25;']", "AttributeRule", "26303.3410", "" ) );
bC.add( new ByFactory( ByXPath.class, "//span[@class='range-slider__wrap']/input[1]", "ParentRule[AttributeRule]", "26303.3412", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='range-slider__wrap']/input[1]", "ParentRule[AttributeRule]", "26303.3414", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@value='25'])[1]", "IndexedAttributeRule", "26303.3416", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/span[1]/input[1]", "AbsoluteRule", "26303.3418", "" ) );


objectMap.put( "26303.3390", bC );


bC = new ByFactoryCollection("item-4-1", "26303.3421", "");
bC.add( new ByFactory( ByXPath.class, "//li[@class='btn btn-light active']/following-sibling::li[1]", "SiblingRule", "26303.3423", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[5]", "ParentRule[AttributeRule]", "26303.3425", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[5]", "ParentRule[AttributeRule]", "26303.3427", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Progress Bar\"]]", "ChildRule[TextRule]", "26303.3429", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[19]", "IndexedAttributeRule", "26303.3431", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]", "AbsoluteRule", "26303.3433", "" ) );


objectMap.put( "26303.3421", bC );


bC = new ByFactoryCollection("startStopButton", "26303.3436", "");
bC.add( new ByFactory( ByXPath.class, "//h1[@class='text-center']/following-sibling::button[1]", "SiblingRule", "26303.3438", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@class='mt-3 btn btn-primary']", "AttributeRule", "26303.3440", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='mt-3 btn btn-primary']", "AttributeRule", "26303.3442", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"startStopButton\"]", "IDRule", "26303.3444", "" ) );
bC.add( new ByFactory( ById.class, "startStopButton", "IDRule", "26303.3446", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"startStopButton\"]", "IDRule", "26303.3448", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"progressBarContainer\"]/button[1]", "ParentRule[IDRule]", "26303.3450", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"progressBarContainer\"]/button[1]", "ParentRule[IDRule]", "26303.3452", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[text()=\"Start\"]", "TextRule", "26303.3454", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@type='button'])[2]", "IndexedAttributeRule", "26303.3456", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]", "AbsoluteRule", "26303.3458", "" ) );


objectMap.put( "26303.3436", bC );


bC = new ByFactoryCollection("83%", "26303.3461", "");
bC.add( new ByFactory( ByXPath.class, "//div[@role='progressbar']", "AttributeRule", "26303.3463", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@role='progressbar']", "AttributeRule", "26303.3465", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@aria-valuenow='82']", "AttributeRule", "26303.3467", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-valuenow='82']", "AttributeRule", "26303.3469", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@aria-valuemin='0']", "AttributeRule", "26303.3471", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-valuemin='0']", "AttributeRule", "26303.3473", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@aria-valuemax='100']", "AttributeRule", "26303.3475", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-valuemax='100']", "AttributeRule", "26303.3477", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@style='width: 82%;']", "AttributeRule", "26303.3479", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='width: 82%;']", "AttributeRule", "26303.3481", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='progress']/div[1]", "ParentRule[AttributeRule]", "26303.3483", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='progress']/div[1]", "ParentRule[AttributeRule]", "26303.3485", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"progressBar\"]/div[1]", "ParentRule[IDRule]", "26303.3487", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"progressBar\"]/div[1]", "ParentRule[IDRule]", "26303.3489", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[text()=\"83%\"]", "TextRule", "26303.3491", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]", "AbsoluteRule", "26303.3493", "" ) );


objectMap.put( "26303.3461", bC );


bC = new ByFactoryCollection("item-5", "26303.3496", "");
bC.add( new ByFactory( ByXPath.class, "//li[@class='btn btn-light active']/following-sibling::li[1]", "SiblingRule", "26303.3498", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[6]", "ParentRule[AttributeRule]", "26303.3500", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[6]", "ParentRule[AttributeRule]", "26303.3502", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Tabs\"]]", "ChildRule[TextRule]", "26303.3504", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[20]", "IndexedAttributeRule", "26303.3506", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]", "AbsoluteRule", "26303.3508", "" ) );


objectMap.put( "26303.3496", bC );


bC = new ByFactoryCollection("demo-tab-origin", "26303.3511", "");
bC.add( new ByFactory( ByXPath.class, "//a[@data-rb-event-key='what']/following-sibling::a[1]", "SiblingRule", "26303.3513", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@data-rb-event-key='origin']", "AttributeRule", "26303.3515", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-rb-event-key='origin']", "AttributeRule", "26303.3517", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@aria-controls='demo-tabpane-origin']", "AttributeRule", "26303.3519", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-controls='demo-tabpane-origin']", "AttributeRule", "26303.3521", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@id=\"demo-tab-origin\"]", "IDRule", "26303.3523", "" ) );
bC.add( new ByFactory( ById.class, "demo-tab-origin", "IDRule", "26303.3525", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"demo-tab-origin\"]", "IDRule", "26303.3527", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[@class='nav nav-tabs']/a[2]", "ParentRule[AttributeRule]", "26303.3529", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='nav nav-tabs']/a[2]", "ParentRule[AttributeRule]", "26303.3531", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[@role='tablist']/a[2]", "ParentRule[AttributeRule]", "26303.3533", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@role='tablist']/a[2]", "ParentRule[AttributeRule]", "26303.3535", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[text()=\"Origin\"]", "TextRule", "26303.3537", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@href='#'])[2]", "IndexedAttributeRule", "26303.3539", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@role='tab'])[2]", "IndexedAttributeRule", "26303.3541", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@tabindex='-1'])[1]", "IndexedAttributeRule", "26303.3543", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@aria-selected='false'])[1]", "IndexedAttributeRule", "26303.3545", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@class='nav-item nav-link'])[1]", "IndexedAttributeRule", "26303.3547", "" ) );


objectMap.put( "26303.3511", bC );


bC = new ByFactoryCollection("demo-tab-use", "26303.3550", "");
bC.add( new ByFactory( ByXPath.class, "//a[@data-rb-event-key='what']/following-sibling::a[2]", "SiblingRule", "26303.3552", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@data-rb-event-key='use']", "AttributeRule", "26303.3554", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-rb-event-key='use']", "AttributeRule", "26303.3556", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@aria-controls='demo-tabpane-use']", "AttributeRule", "26303.3558", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-controls='demo-tabpane-use']", "AttributeRule", "26303.3560", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@id=\"demo-tab-use\"]", "IDRule", "26303.3562", "" ) );
bC.add( new ByFactory( ById.class, "demo-tab-use", "IDRule", "26303.3564", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"demo-tab-use\"]", "IDRule", "26303.3566", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[@class='nav nav-tabs']/a[3]", "ParentRule[AttributeRule]", "26303.3568", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='nav nav-tabs']/a[3]", "ParentRule[AttributeRule]", "26303.3570", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[@role='tablist']/a[3]", "ParentRule[AttributeRule]", "26303.3572", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@role='tablist']/a[3]", "ParentRule[AttributeRule]", "26303.3574", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[text()=\"Use\"]", "TextRule", "26303.3576", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@href='#'])[3]", "IndexedAttributeRule", "26303.3578", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@role='tab'])[3]", "IndexedAttributeRule", "26303.3580", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@aria-selected='false'])[2]", "IndexedAttributeRule", "26303.3582", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@class='nav-item nav-link'])[2]", "IndexedAttributeRule", "26303.3584", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@tabindex='-1'])[2]", "IndexedAttributeRule", "26303.3586", "" ) );


objectMap.put( "26303.3550", bC );


bC = new ByFactoryCollection("WhatOriginUseMore", "26303.3589", "");
bC.add( new ByFactory( ByXPath.class, "//h1[@class='text-center']/following-sibling::nav[1]", "SiblingRule", "26303.3591", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[@class='nav nav-tabs']", "AttributeRule", "26303.3593", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='nav nav-tabs']", "AttributeRule", "26303.3595", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[@role='tablist']", "AttributeRule", "26303.3597", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@role='tablist']", "AttributeRule", "26303.3599", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@data-rb-event-key='what']]", "ChildRule[AttributeRule]", "26303.3601", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@data-rb-event-key='what']]", "ChildRule[AttributeRule]", "26303.3603", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@aria-controls='demo-tabpane-what']]", "ChildRule[AttributeRule]", "26303.3605", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@aria-controls='demo-tabpane-what']]", "ChildRule[AttributeRule]", "26303.3607", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@data-rb-event-key='origin']]", "ChildRule[AttributeRule]", "26303.3609", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@data-rb-event-key='origin']]", "ChildRule[AttributeRule]", "26303.3611", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@aria-controls='demo-tabpane-origin']]", "ChildRule[AttributeRule]", "26303.3613", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@aria-controls='demo-tabpane-origin']]", "ChildRule[AttributeRule]", "26303.3615", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@data-rb-event-key='use']]", "ChildRule[AttributeRule]", "26303.3617", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@data-rb-event-key='use']]", "ChildRule[AttributeRule]", "26303.3619", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@aria-controls='demo-tabpane-use']]", "ChildRule[AttributeRule]", "26303.3621", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@aria-controls='demo-tabpane-use']]", "ChildRule[AttributeRule]", "26303.3623", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@aria-selected='true']]", "ChildRule[AttributeRule]", "26303.3625", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@aria-selected='true']]", "ChildRule[AttributeRule]", "26303.3627", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@class='nav-item nav-link active']]", "ChildRule[AttributeRule]", "26303.3629", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@class='nav-item nav-link active']]", "ChildRule[AttributeRule]", "26303.3631", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@data-rb-event-key='more']]", "ChildRule[AttributeRule]", "26303.3633", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@data-rb-event-key='more']]", "ChildRule[AttributeRule]", "26303.3635", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@aria-controls='demo-tabpane-more']]", "ChildRule[AttributeRule]", "26303.3637", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@aria-controls='demo-tabpane-more']]", "ChildRule[AttributeRule]", "26303.3639", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@class='nav-item nav-link disabled']]", "ChildRule[AttributeRule]", "26303.3641", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@class='nav-item nav-link disabled']]", "ChildRule[AttributeRule]", "26303.3643", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@aria-disabled='true']]", "ChildRule[AttributeRule]", "26303.3645", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@aria-disabled='true']]", "ChildRule[AttributeRule]", "26303.3647", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@id=\"demo-tab-what\"]]", "ChildRule[IDRule]", "26303.3649", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@id=\"demo-tab-what\"]]", "ChildRule[IDRule]", "26303.3651", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@id=\"demo-tab-origin\"]]", "ChildRule[IDRule]", "26303.3653", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@id=\"demo-tab-origin\"]]", "ChildRule[IDRule]", "26303.3655", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@id=\"demo-tab-use\"]]", "ChildRule[IDRule]", "26303.3657", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@id=\"demo-tab-use\"]]", "ChildRule[IDRule]", "26303.3659", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[@id=\"demo-tab-more\"]]", "ChildRule[IDRule]", "26303.3661", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./*[@id=\"demo-tab-more\"]]", "ChildRule[IDRule]", "26303.3663", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"tabsContainer\"]/nav[1]", "ParentRule[IDRule]", "26303.3665", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"tabsContainer\"]/nav[1]", "ParentRule[IDRule]", "26303.3667", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[text()=\"What\"]]", "ChildRule[TextRule]", "26303.3669", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[text()=\"Origin\"]]", "ChildRule[TextRule]", "26303.3671", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[text()=\"Use\"]]", "ChildRule[TextRule]", "26303.3673", "" ) );
bC.add( new ByFactory( ByXPath.class, "//nav[./a[text()=\"More\"]]", "ChildRule[TextRule]", "26303.3675", "" ) );


objectMap.put( "26303.3589", bC );


bC = new ByFactoryCollection("item-6", "26303.3679", "");
bC.add( new ByFactory( ByXPath.class, "//li[@class='btn btn-light active']/following-sibling::li[1]", "SiblingRule", "26303.3681", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[7]", "ParentRule[AttributeRule]", "26303.3683", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[7]", "ParentRule[AttributeRule]", "26303.3685", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Tool Tips\"]]", "ChildRule[TextRule]", "26303.3687", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[21]", "IndexedAttributeRule", "26303.3689", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[7]", "AbsoluteRule", "26303.3691", "" ) );


objectMap.put( "26303.3679", bC );


bC = new ByFactoryCollection("toolTipButton", "26303.3694", "");
bC.add( new ByFactory( ByXPath.class, "//button[@class='btn btn-success']", "AttributeRule", "26303.3696", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='btn btn-success']", "AttributeRule", "26303.3698", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@aria-describedby='buttonToolTip']", "AttributeRule", "26303.3700", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-describedby='buttonToolTip']", "AttributeRule", "26303.3702", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@id=\"toolTipButton\"]", "IDRule", "26303.3704", "" ) );
bC.add( new ByFactory( ById.class, "toolTipButton", "IDRule", "26303.3706", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"toolTipButton\"]", "IDRule", "26303.3708", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"buttonToolTopContainer\"]/button[1]", "ParentRule[IDRule]", "26303.3710", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"buttonToolTopContainer\"]/button[1]", "ParentRule[IDRule]", "26303.3712", "" ) );
bC.add( new ByFactory( ByXPath.class, "//p/following-sibling::button[1]", "SiblingRule", "26303.3714", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[text()=\"Hover me to see\"]", "TextRule", "26303.3716", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//button[@type='button'])[2]", "IndexedAttributeRule", "26303.3718", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[1]", "AbsoluteRule", "26303.3720", "" ) );


objectMap.put( "26303.3694", bC );


bC = new ByFactoryCollection("buttonToolTopContainer", "26303.3793", "");
bC.add( new ByFactory( ByXPath.class, "//h1[@class='text-center']/following-sibling::div[1]", "SiblingRule", "26303.3795", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./button[@class='btn btn-success']]", "ChildRule[AttributeRule]", "26303.3797", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@class='btn btn-success']]", "ChildRule[AttributeRule]", "26303.3799", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"buttonToolTopContainer\"]", "IDRule", "26303.3801", "" ) );
bC.add( new ByFactory( ById.class, "buttonToolTopContainer", "IDRule", "26303.3803", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"buttonToolTopContainer\"]", "IDRule", "26303.3805", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./button[@id=\"toolTipButton\"]]", "ChildRule[IDRule]", "26303.3807", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@id=\"toolTipButton\"]]", "ChildRule[IDRule]", "26303.3809", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"toopTipContainer\"]/div[1]", "ParentRule[IDRule]", "26303.3811", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"toopTipContainer\"]/div[1]", "ParentRule[IDRule]", "26303.3813", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./p]", "ChildRule[TagRule]", "26303.3815", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./p[text()=\"Practice Tool Tips\"]]", "ChildRule[TextRule]", "26303.3817", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./button[text()=\"Hover me to see\"]]", "ChildRule[TextRule]", "26303.3819", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]", "AbsoluteRule", "26303.3821", "" ) );


objectMap.put( "26303.3793", bC );


bC = new ByFactoryCollection("item-8-1", "26303.4117", "");
bC.add( new ByFactory( ByXPath.class, "//li[@class='btn btn-light active']/following-sibling::li[3]", "SiblingRule", "26303.4119", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[9]", "ParentRule[AttributeRule]", "26303.4121", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[9]", "ParentRule[AttributeRule]", "26303.4123", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Select Menu\"]]", "ChildRule[TextRule]", "26303.4125", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[23]", "IndexedAttributeRule", "26303.4127", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[9]", "AbsoluteRule", "26303.4129", "" ) );


objectMap.put( "26303.4117", bC );


bC = new ByFactoryCollection("item-7-1", "26303.4132", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='element-list collapse show']/ul[1]/li[8]", "ParentRule[AttributeRule]", "26303.4134", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='element-list collapse show']/ul[1]/li[8]", "ParentRule[AttributeRule]", "26303.4136", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Menu\"]]", "ChildRule[TextRule]", "26303.4138", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[18]/following-sibling::li[5]", "SiblingRule", "26303.4140", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='btn btn-light '])[23]", "IndexedAttributeRule", "26303.4142", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[8]", "AbsoluteRule", "26303.4144", "" ) );


objectMap.put( "26303.4132", bC );


bC = new ByFactoryCollection("MainItem1", "26303.4147", "");
bC.add( new ByFactory( ByXPath.class, "//a[text()=\"Main Item 1\"]", "TextRule", "26303.4149", "" ) );
bC.add( new ByFactory( ByXPath.class, "//ul[@id=\"nav\"]/li[1]/a[1]", "ParentRule[IDRule]", "26303.4151", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"nav\"]/li[1]/a[1]", "ParentRule[IDRule]", "26303.4153", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@href='#'])[1]", "IndexedAttributeRule", "26303.4155", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/a[1]", "AbsoluteRule", "26303.4157", "" ) );


objectMap.put( "26303.4147", bC );


bC = new ByFactoryCollection("MainItem2", "26303.4160", "");
bC.add( new ByFactory( ByXPath.class, "//a[text()=\"Main Item 2\"]", "TextRule", "26303.4162", "" ) );
bC.add( new ByFactory( ByXPath.class, "//ul[@id=\"nav\"]/li[2]/a[1]", "ParentRule[IDRule]", "26303.4164", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"nav\"]/li[2]/a[1]", "ParentRule[IDRule]", "26303.4166", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@href='#'])[2]", "IndexedAttributeRule", "26303.4168", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]", "AbsoluteRule", "26303.4170", "" ) );


objectMap.put( "26303.4160", bC );


bC = new ByFactoryCollection("MainItem3", "26303.4173", "");
bC.add( new ByFactory( ByXPath.class, "//a[text()=\"Main Item 3\"]", "TextRule", "26303.4175", "" ) );
bC.add( new ByFactory( ByXPath.class, "//ul[@id=\"nav\"]/li[3]/a[1]", "ParentRule[IDRule]", "26303.4177", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"nav\"]/li[3]/a[1]", "ParentRule[IDRule]", "26303.4179", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@href='#'])[8]", "IndexedAttributeRule", "26303.4181", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/a[1]", "AbsoluteRule", "26303.4183", "" ) );


objectMap.put( "26303.4173", bC );


bC = new ByFactoryCollection("SubSubItem1", "26303.4186", "");
bC.add( new ByFactory( ByXPath.class, "//a[text()=\"Sub Sub Item 1\"]", "TextRule", "26303.4188", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@href='#'])[6]", "IndexedAttributeRule", "26303.4190", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]", "AbsoluteRule", "26303.4192", "" ) );


objectMap.put( "26303.4186", bC );


bC = new ByFactoryCollection("ns-tdpaa-e-2", "26303.4197", "");
bC.add( new ByFactory( ByXPath.class, "//a[@class='ns-tdpaa-e-2']", "AttributeRule", "26303.4199", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='ns-tdpaa-e-2']", "AttributeRule", "26303.4201", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@data-asoch-targets='ad0,imageClk']", "AttributeRule", "26303.4203", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-asoch-targets='ad0,imageClk']", "AttributeRule", "26303.4205", "" ) );
bC.add( new ByFactory( ByXPath.class, "//a[@href='https://www.googleadservices.com/pagead/aclk?nis=4&sa=L&ai=Cp661KICTZ-T9EqzXmsMP8Z3QwQfG6afddYHP-PjaEOyb7d__JRABIMb71nlg5crlg7QOoAG234LCAsgBCakCLG5La5HoSD7gAgCoAwHIA8sEqgSBAk_QpPa4QtX8h_Mpd7Yqe-3m9-8d-NImThVlmlrqRERMwQOxOWMBxpaFftTb2qtHNIskXzclBn08fbUdoLIgmTaBqePJcHpDHg4SliD0g4h3yxlKCoxMnkGbYlBEk1BopTnn3A_vq852kExf4uPnkWGXvR1jD6HCEx_gRNEPEKOKY0jT3GhwZ_jLuIaYsu1CUb_AuOv9G_jMadJcUYZjOr6UMLXeTx8Sq2x6k50RX-2WQTxgMhsIVUEe4gvE6WDgfr-Z4ynu5anQL4T5gLytylTsGrEpafgbgb-3R1PssxSeRUvMMSqz2OHLNOpUlpDsjiRLCixJFG6sXVMyETfbU2RewAT86L31jgTgBAGIBaPZwulDoAYugAeyoP29AagH1ckbqAfZtrECqAemvhuoB47OG6gHk9gbqAfw4BuoB-6WsQKoB_6esQKoB6--sQKoB5oGqAfz0RuoB5bYG6gHqpuxAqgH4L2xAqgH_56xAqgH35-xAqgHyqmxAqgH66WxAqgH6rGxAqgHmbWxAqgHvrexAqgH-MKxAqgH-8KxAtgHANIIJgiAYRABGB0yAooCOguAQIDAgICAoKiAAki9_cE6WNXKmvKmjosD8ggbYWR4LXN1YnN5bi0zNTIwNjE3MzQxNjY1NTkysQm1wLl8zHiCg4AKA5gLAcgLAYAMAdoMFgoLENDGvq-kjtTo7gESAgEDQAFKASWqDQJJTsgNAeINEwjxgJvypo6LAxWsq2YCHfEONHjqDRMIsPyb8qaOiwMVrKtmAh3xDjR42BMCiBQC0BUBmBYB-BYBgBcBshcCGAG6FwI4AbIYCRICuFAYLiIBANAYAegYAQ&ae=1&ase=2&gclid=EAIaIQobChMI5LGc8qaOiwMVrKtmAh3xDjR4EAEYASAAEgJYJvD_BwE&num=1&cid=CAQSOwCa7L7dJxP7Ogo2yoReuZOBTAWBrAS33FqF1MOoSJdCLeD8Iwr2Okgh_JA5Rcj2oXm8DQEtADfIFzn7GAE&sig=AOD64_2AJKTmSm4SmbiThvvnzTe2SmvRJA&client=ca-pub-4573231550355221&rf=1&nb=9&adurl=https://www.manageengine.com/products/eventlog/iis-server-log-analyzer.html%3Fcamid%3D18206469283%26adgid%3D141443429500%26kwd%3D%26matchtype%3D%26adid%3D619079183430%26network%3Dd%26adposition%3D%26loc%3D9062036%26placement%3Ddemoqa.com%26target%3Dcustomaffinity%253A%253A217639632%26device%3Dc%26gad_source%3D5%26gclid%3DEAIaIQobChMI5LGc8qaOiwMVrKtmAh3xDjR4EAEYASAAEgJYJvD_BwE']", "AttributeRule", "26303.4207", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@href='https://www.googleadservices.com/pagead/aclk?nis=4&sa=L&ai=Cp661KICTZ-T9EqzXmsMP8Z3QwQfG6afddYHP-PjaEOyb7d__JRABIMb71nlg5crlg7QOoAG234LCAsgBCakCLG5La5HoSD7gAgCoAwHIA8sEqgSBAk_QpPa4QtX8h_Mpd7Yqe-3m9-8d-NImThVlmlrqRERMwQOxOWMBxpaFftTb2qtHNIskXzclBn08fbUdoLIgmTaBqePJcHpDHg4SliD0g4h3yxlKCoxMnkGbYlBEk1BopTnn3A_vq852kExf4uPnkWGXvR1jD6HCEx_gRNEPEKOKY0jT3GhwZ_jLuIaYsu1CUb_AuOv9G_jMadJcUYZjOr6UMLXeTx8Sq2x6k50RX-2WQTxgMhsIVUEe4gvE6WDgfr-Z4ynu5anQL4T5gLytylTsGrEpafgbgb-3R1PssxSeRUvMMSqz2OHLNOpUlpDsjiRLCixJFG6sXVMyETfbU2RewAT86L31jgTgBAGIBaPZwulDoAYugAeyoP29AagH1ckbqAfZtrECqAemvhuoB47OG6gHk9gbqAfw4BuoB-6WsQKoB_6esQKoB6--sQKoB5oGqAfz0RuoB5bYG6gHqpuxAqgH4L2xAqgH_56xAqgH35-xAqgHyqmxAqgH66WxAqgH6rGxAqgHmbWxAqgHvrexAqgH-MKxAqgH-8KxAtgHANIIJgiAYRABGB0yAooCOguAQIDAgICAoKiAAki9_cE6WNXKmvKmjosD8ggbYWR4LXN1YnN5bi0zNTIwNjE3MzQxNjY1NTkysQm1wLl8zHiCg4AKA5gLAcgLAYAMAdoMFgoLENDGvq-kjtTo7gESAgEDQAFKASWqDQJJTsgNAeINEwjxgJvypo6LAxWsq2YCHfEONHjqDRMIsPyb8qaOiwMVrKtmAh3xDjR42BMCiBQC0BUBmBYB-BYBgBcBshcCGAG6FwI4AbIYCRICuFAYLiIBANAYAegYAQ&ae=1&ase=2&gclid=EAIaIQobChMI5LGc8qaOiwMVrKtmAh3xDjR4EAEYASAAEgJYJvD_BwE&num=1&cid=CAQSOwCa7L7dJxP7Ogo2yoReuZOBTAWBrAS33FqF1MOoSJdCLeD8Iwr2Okgh_JA5Rcj2oXm8DQEtADfIFzn7GAE&sig=AOD64_2AJKTmSm4SmbiThvvnzTe2SmvRJA&client=ca-pub-4573231550355221&rf=1&nb=9&adurl=https://www.manageengine.com/products/eventlog/iis-server-log-analyzer.html%3Fcamid%3D18206469283%26adgid%3D141443429500%26kwd%3D%26matchtype%3D%26adid%3D619079183430%26network%3Dd%26adposition%3D%26loc%3D9062036%26placement%3Ddemoqa.com%26target%3Dcustomaffinity%253A%253A217639632%26device%3Dc%26gad_source%3D5%26gclid%3DEAIaIQobChMI5LGc8qaOiwMVrKtmAh3xDjR4EAEYASAAEgJYJvD_BwE']", "AttributeRule", "26303.4209", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='ns-tdpaa-e-1 row-container']/a[1]", "ParentRule[AttributeRule]", "26303.4211", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='ns-tdpaa-e-1 row-container']/a[1]", "ParentRule[AttributeRule]", "26303.4213", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//a[@target='_blank'])[1]", "IndexedAttributeRule", "26303.4215", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]", "AbsoluteRule", "26303.4217", "" ) );


objectMap.put( "26303.4197", bC );


bC = new ByFactoryCollection("SelectOption", "26303.4253", "");
bC.add( new ByFactory( ByXPath.class, "//div[./div[text()=\"Select Option\"]]", "ChildRule[TextRule]", "26303.4255", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"withOptGroup\"]/div[1]/div[1]", "ParentRule[IDRule]", "26303.4257", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"withOptGroup\"]/div[1]/div[1]", "ParentRule[IDRule]", "26303.4259", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class=' css-1hwfws3'])[1]", "IndexedAttributeRule", "26303.4261", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]", "AbsoluteRule", "26303.4263", "" ) );


objectMap.put( "26303.4253", bC );


bC = new ByFactoryCollection("react-select-5-option-0-1", "26303.4266", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class=' css-1n7v3ny-option']", "AttributeRule", "26303.4268", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class=' css-1n7v3ny-option']", "AttributeRule", "26303.4270", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"react-select-5-option-0-1\"]", "IDRule", "26303.4272", "" ) );
bC.add( new ByFactory( ById.class, "react-select-5-option-0-1", "IDRule", "26303.4274", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"react-select-5-option-0-1\"]", "IDRule", "26303.4276", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"react-select-5-option-0-0\"]/following-sibling::div[1]", "SiblingRule", "26303.4278", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[text()=\"Group 1, option 2\"]", "TextRule", "26303.4280", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class=' css-11unzgr']/div[1]/div[2]/div[2]", "ParentRule[AttributeRule]", "26303.4282", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class=' css-11unzgr']/div[1]/div[2]/div[2]", "ParentRule[AttributeRule]", "26303.4284", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@tabindex='-1'])[2]", "IndexedAttributeRule", "26303.4286", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]", "AbsoluteRule", "26303.4288", "" ) );


objectMap.put( "26303.4266", bC );


bC = new ByFactoryCollection("SelectTitle", "26303.4291", "");
bC.add( new ByFactory( ByXPath.class, "//div[./div[text()=\"Select Title\"]]", "ChildRule[TextRule]", "26303.4293", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"selectOne\"]/div[1]/div[1]", "ParentRule[IDRule]", "26303.4295", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"selectOne\"]/div[1]/div[1]", "ParentRule[IDRule]", "26303.4297", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class=' css-1hwfws3'])[2]", "IndexedAttributeRule", "26303.4299", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]", "AbsoluteRule", "26303.4301", "" ) );


objectMap.put( "26303.4291", bC );


bC = new ByFactoryCollection("react-select-6-option-0-1", "26303.4304", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class=' css-1n7v3ny-option']", "AttributeRule", "26303.4306", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class=' css-1n7v3ny-option']", "AttributeRule", "26303.4308", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"react-select-6-option-0-1\"]", "IDRule", "26303.4310", "" ) );
bC.add( new ByFactory( ById.class, "react-select-6-option-0-1", "IDRule", "26303.4312", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"react-select-6-option-0-1\"]", "IDRule", "26303.4314", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"react-select-6-option-0-0\"]/following-sibling::div[1]", "SiblingRule", "26303.4316", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class=' css-1s9izoc']/div[2]/div[2]", "ParentRule[AttributeRule]", "26303.4318", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class=' css-1s9izoc']/div[2]/div[2]", "ParentRule[AttributeRule]", "26303.4320", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[text()=\"Mr.\"]", "TextRule", "26303.4322", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@tabindex='-1'])[2]", "IndexedAttributeRule", "26303.4324", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]", "AbsoluteRule", "26303.4326", "" ) );


objectMap.put( "26303.4304", bC );


bC = new ByFactoryCollection("oldSelectMenu", "26303.4329", "");
bC.add( new ByFactory( ByXPath.class, "//select[./option[@value='red']]", "ChildRule[AttributeRule]", "26303.4331", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./*[@value='red']]", "ChildRule[AttributeRule]", "26303.4333", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[@value='1']]", "ChildRule[AttributeRule]", "26303.4335", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./*[@value='1']]", "ChildRule[AttributeRule]", "26303.4337", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[@value='2']]", "ChildRule[AttributeRule]", "26303.4339", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./*[@value='2']]", "ChildRule[AttributeRule]", "26303.4341", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[@value='3']]", "ChildRule[AttributeRule]", "26303.4343", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./*[@value='3']]", "ChildRule[AttributeRule]", "26303.4345", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[@value='4']]", "ChildRule[AttributeRule]", "26303.4347", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./*[@value='4']]", "ChildRule[AttributeRule]", "26303.4349", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[@value='5']]", "ChildRule[AttributeRule]", "26303.4351", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./*[@value='5']]", "ChildRule[AttributeRule]", "26303.4353", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[@value='6']]", "ChildRule[AttributeRule]", "26303.4355", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./*[@value='6']]", "ChildRule[AttributeRule]", "26303.4357", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[@value='7']]", "ChildRule[AttributeRule]", "26303.4359", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./*[@value='7']]", "ChildRule[AttributeRule]", "26303.4361", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[@value='8']]", "ChildRule[AttributeRule]", "26303.4363", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./*[@value='8']]", "ChildRule[AttributeRule]", "26303.4365", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[@value='9']]", "ChildRule[AttributeRule]", "26303.4367", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./*[@value='9']]", "ChildRule[AttributeRule]", "26303.4369", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[@value='10']]", "ChildRule[AttributeRule]", "26303.4371", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./*[@value='10']]", "ChildRule[AttributeRule]", "26303.4373", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[@id=\"oldSelectMenu\"]", "IDRule", "26303.4375", "" ) );
bC.add( new ByFactory( ById.class, "oldSelectMenu", "IDRule", "26303.4377", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"oldSelectMenu\"]", "IDRule", "26303.4379", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[text()=\"Red\"]]", "ChildRule[TextRule]", "26303.4381", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[text()=\"Blue\"]]", "ChildRule[TextRule]", "26303.4383", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[text()=\"Green\"]]", "ChildRule[TextRule]", "26303.4385", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[text()=\"Yellow\"]]", "ChildRule[TextRule]", "26303.4387", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[text()=\"Purple\"]]", "ChildRule[TextRule]", "26303.4389", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[text()=\"Black\"]]", "ChildRule[TextRule]", "26303.4391", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[text()=\"White\"]]", "ChildRule[TextRule]", "26303.4393", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[text()=\"Voilet\"]]", "ChildRule[TextRule]", "26303.4395", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[text()=\"Indigo\"]]", "ChildRule[TextRule]", "26303.4397", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[text()=\"Magenta\"]]", "ChildRule[TextRule]", "26303.4399", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[text()=\"Aqua\"]]", "ChildRule[TextRule]", "26303.4401", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='select-menu-container']/div[6]/div[1]/div[1]/select[1]", "ParentRule[AttributeRule]", "26303.4403", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='select-menu-container']/div[6]/div[1]/div[1]/select[1]", "ParentRule[AttributeRule]", "26303.4405", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"selectMenuContainer\"]/div[6]/div[1]/div[1]/select[1]", "ParentRule[IDRule]", "26303.4407", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"selectMenuContainer\"]/div[6]/div[1]/div[1]/select[1]", "ParentRule[IDRule]", "26303.4409", "" ) );


objectMap.put( "26303.4329", bC );


bC = new ByFactoryCollection("Select", "26303.4413", "");
bC.add( new ByFactory( ByXPath.class, "//div[./div[@class=' css-1wa3eu0-placeholder']]", "ChildRule[AttributeRule]", "26303.4415", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@class=' css-1wa3eu0-placeholder']]", "ChildRule[AttributeRule]", "26303.4417", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@style='opacity: 1; transition: opacity 260ms;']]", "ChildRule[AttributeRule]", "26303.4419", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@style='opacity: 1; transition: opacity 260ms;']]", "ChildRule[AttributeRule]", "26303.4421", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[text()=\"Select...\"]]", "ChildRule[TextRule]", "26303.4423", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class=' css-1hwfws3'])[3]", "IndexedAttributeRule", "26303.4425", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[1]/div[1]/div[1]", "AbsoluteRule", "26303.4427", "" ) );


objectMap.put( "26303.4413", bC );


bC = new ByFactoryCollection("react-select-7-option-2", "26303.4430", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class=' css-1n7v3ny-option']", "AttributeRule", "26303.4432", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class=' css-1n7v3ny-option']", "AttributeRule", "26303.4434", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"react-select-7-option-2\"]", "IDRule", "26303.4436", "" ) );
bC.add( new ByFactory( ById.class, "react-select-7-option-2", "IDRule", "26303.4438", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"react-select-7-option-2\"]", "IDRule", "26303.4440", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"react-select-7-option-0\"]/following-sibling::div[2]", "SiblingRule", "26303.4442", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class=' css-11unzgr']/div[3]", "ParentRule[AttributeRule]", "26303.4444", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class=' css-11unzgr']/div[3]", "ParentRule[AttributeRule]", "26303.4446", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[text()=\"Black\"]", "TextRule", "26303.4448", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@tabindex='-1'])[3]", "IndexedAttributeRule", "26303.4450", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[1]/div[2]/div[1]/div[3]", "AbsoluteRule", "26303.4452", "" ) );


objectMap.put( "26303.4430", bC );


bC = new ByFactoryCollection("css-1gtu0rj-indicatorContainer", "26303.4455", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class=' css-1pahdxg-control']/div[2]/div[2]", "ParentRule[AttributeRule]", "26303.4457", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class=' css-1pahdxg-control']/div[2]/div[2]", "ParentRule[AttributeRule]", "26303.4459", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@aria-hidden='true'])[3]/following-sibling::div[1]", "SiblingRule", "26303.4461", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class=' css-1gtu0rj-indicatorContainer'])[2]", "IndexedAttributeRule", "26303.4463", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@aria-hidden='true'])[4]", "IndexedAttributeRule", "26303.4465", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[2]", "AbsoluteRule", "26303.4467", "" ) );


objectMap.put( "26303.4455", bC );


bC = new ByFactoryCollection("cars", "26303.4470", "");
bC.add( new ByFactory( ByXPath.class, "//select[./option[@value='volvo']]", "ChildRule[AttributeRule]", "26303.4472", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./*[@value='volvo']]", "ChildRule[AttributeRule]", "26303.4474", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[@value='saab']]", "ChildRule[AttributeRule]", "26303.4476", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./*[@value='saab']]", "ChildRule[AttributeRule]", "26303.4478", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[@value='opel']]", "ChildRule[AttributeRule]", "26303.4480", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./*[@value='opel']]", "ChildRule[AttributeRule]", "26303.4482", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[@value='audi']]", "ChildRule[AttributeRule]", "26303.4484", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./*[@value='audi']]", "ChildRule[AttributeRule]", "26303.4486", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[@id=\"cars\"]", "IDRule", "26303.4488", "" ) );
bC.add( new ByFactory( ById.class, "cars", "IDRule", "26303.4490", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"cars\"]", "IDRule", "26303.4492", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[@name=\"cars\"]", "NameRule", "26303.4494", "" ) );
bC.add( new ByFactory( ByName.class, "cars", "NameRule", "26303.4496", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"cars\"]", "NameRule", "26303.4498", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[text()=\"Volvo\"]]", "ChildRule[TextRule]", "26303.4500", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[text()=\"Saab\"]]", "ChildRule[TextRule]", "26303.4502", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[text()=\"Opel\"]]", "ChildRule[TextRule]", "26303.4504", "" ) );
bC.add( new ByFactory( ByXPath.class, "//select[./option[text()=\"Audi\"]]", "ChildRule[TextRule]", "26303.4506", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='select-menu-container']/div[8]/div[1]/select[1]", "ParentRule[AttributeRule]", "26303.4508", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='select-menu-container']/div[8]/div[1]/select[1]", "ParentRule[AttributeRule]", "26303.4510", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@id=\"selectMenuContainer\"]/div[8]/div[1]/select[1]", "ParentRule[IDRule]", "26303.4512", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"selectMenuContainer\"]/div[8]/div[1]/select[1]", "ParentRule[IDRule]", "26303.4514", "" ) );


objectMap.put( "26303.4470", bC );


bC = new ByFactoryCollection("css-tlfecz-indicatorContainer", "26303.4663", "");
bC.add( new ByFactory( ByXPath.class, "(//span[@class=' css-1okebmr-indicatorSeparator'])[3]/following-sibling::div[1]", "SiblingRule", "26303.4665", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@class=' css-tlfecz-indicatorContainer'])[3]", "IndexedAttributeRule", "26303.4667", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@aria-hidden='true'])[3]", "IndexedAttributeRule", "26303.4669", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]", "AbsoluteRule", "26303.4671", "" ) );


objectMap.put( "26303.4663", bC );


bC = new ByFactoryCollection("col-12mt-4col-md-3", "26303.4679", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='col-12 mt-4  col-md-3']/following-sibling::div[2]", "SiblingRule", "26303.4681", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='col-12 mt-4 col-md-3']", "AttributeRule", "26303.4683", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='col-12 mt-4 col-md-3']", "AttributeRule", "26303.4685", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@class='sidebar-content pattern-backgound shadow widget-divider-off']]", "ChildRule[AttributeRule]", "26303.4687", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@class='sidebar-content pattern-backgound shadow widget-divider-off']]", "ChildRule[AttributeRule]", "26303.4689", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='container playgound-body']/div[1]/div[3]", "ParentRule[AttributeRule]", "26303.4691", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='container playgound-body']/div[1]/div[3]", "ParentRule[AttributeRule]", "26303.4693", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]", "AbsoluteRule", "26303.4695", "" ) );


objectMap.put( "26303.4679", bC );
/* Page: default 
    
    */

    /*
    Site: www.mansionglobal.com
    Add a description of www.mansionglobal.com
    */
    /* Page: Law & Order Filmed in the Building of This Penthouse With a Massive Terrace - Mansion Global 
    
    */

    /* Page: NoMad Stakes Its Claim as Manhattans Rising Luxury Address - Mansion Global 
    
    */

    /* Page: $65 Million Manhattan Penthouse Offers Awe-Inspiring City Views - Mansion Global 
    
    */

    /* Page: A Brooklyn Penthouse Is Selling With Apartment-Sized Terrace Space - Mansion Global 
    
    */

    /*
    Site: www.instagram.com
    Add a description of www.instagram.com
    */
    /* Page: Log in  Instagram 
    
    */

    /*
    Site: www.manageengine.com
    Add a description of www.manageengine.com
    */
    /* Page: IIS log analyzer - Microsoft IIS server log analysis tool 
    
    */

    /*
    Site: www.google.com
    Add a description of www.google.com
    */
    /* Page: Google 
    
    */

    /* Page: default 
    
    */

    /*
    Site: zerostep.com
    Add a description of zerostep.com
    */
    /* Page: Add AI to your Playwright tests | ZeroStep 
    
    */

    



  }
  
  public By getObject( Object alchemyIdentifier, Map<String,Object> contextMap, DataSourceProvider dM ) {
    
    if ( alchemyIdentifier instanceof By ) {
      return (By) alchemyIdentifier;
    }
    
    ByFactory by = objectMap.get( alchemyIdentifier + "" );
    if ( by == null ) {
      return new By() {
        @Override
        public List<WebElement> findElements(SearchContext sc) {
          throw new RuntimeException( "Could not find and object using [" + alchemyIdentifier + "]" );
        }
      };
    }
    return by.create(contextMap, dM);
  }

  public ByFactory getObject( String alchemyIdentifier ) {
   
    return objectMap.get( alchemyIdentifier );
  }
}
