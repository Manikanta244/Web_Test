
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
    Site: momobizuat.momo.africa
    Add a description of momobizuat.momo.africa
    */
    /* Page: MoMo Pay 
    
    */

    

bC = new ByFactoryCollection("MuiSelect-nativeInputcss-1k3x8v3", "27861.2231", "");
bC.add( new ByFactory( ByXPath.class, "//div[@tabindex='0']/following-sibling::input[1]", "SiblingRule", "27861.2233", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@tabindex='-1']", "AttributeRule", "27861.2235", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@tabindex='-1']", "AttributeRule", "27861.2237", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='MuiSelect-nativeInput css-1k3x8v3']", "AttributeRule", "27861.2239", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='MuiSelect-nativeInput css-1k3x8v3']", "AttributeRule", "27861.2241", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-invalid='false']", "AttributeRule", "27861.2243", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-invalid='false']", "AttributeRule", "27861.2245", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-hidden='true']", "AttributeRule", "27861.2247", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl country-drop css-jblqdz']/input[1]", "ParentRule[AttributeRule]", "27861.2249", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl country-drop css-jblqdz']/input[1]", "ParentRule[AttributeRule]", "27861.2251", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]", "AbsoluteRule", "27861.2253", "" ) );


objectMap.put( "27861.2231", bC );


bC = new ByFactoryCollection("Ghana", "27861.2256", "");
bC.add( new ByFactory( ByXPath.class, "//li[@class='MuiButtonBase-root MuiMenuItem-root Mui-disabled MuiMenuItem-gutters Mui-disabled MuiMenuItem-root Mui-disabled MuiMenuItem-gutters css-1km1ehz']/following-sibling::li[1]", "SiblingRule", "27861.2258", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-focusVisible MuiMenuItem-root MuiMenuItem-gutters css-1yg7zvo']", "AttributeRule", "27861.2260", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-focusVisible MuiMenuItem-root MuiMenuItem-gutters css-1yg7zvo']", "AttributeRule", "27861.2262", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[@tabindex='0']", "AttributeRule", "27861.2264", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[@data-value='233']", "AttributeRule", "27861.2266", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-value='233']", "AttributeRule", "27861.2268", "" ) );
bC.add( new ByFactory( ByXPath.class, "//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li[2]", "ParentRule[AttributeRule]", "27861.2270", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li[2]", "ParentRule[AttributeRule]", "27861.2272", "" ) );
bC.add( new ByFactory( ByXPath.class, "//ul[@role='listbox']/li[2]", "ParentRule[AttributeRule]", "27861.2274", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@role='listbox']/li[2]", "ParentRule[AttributeRule]", "27861.2276", "" ) );
bC.add( new ByFactory( ByXPath.class, "//ul[@tabindex='-1']/li[2]", "ParentRule[AttributeRule]", "27861.2278", "" ) );
bC.add( new ByFactory( ByXPath.class, "//ul[@aria-labelledby='country-select-label']/li[2]", "ParentRule[AttributeRule]", "27861.2280", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-labelledby='country-select-label']/li[2]", "ParentRule[AttributeRule]", "27861.2282", "" ) );
bC.add( new ByFactory( ByXPath.class, "//ul[@id=\":r0:\"]/li[2]", "ParentRule[IDRule]", "27861.2284", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\":r0:\"]/li[2]", "ParentRule[IDRule]", "27861.2286", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Ghana\"]]", "ChildRule[TextRule]", "27861.2288", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@role='option'])[2]", "IndexedAttributeRule", "27861.2290", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@aria-selected='false'])[2]", "IndexedAttributeRule", "27861.2292", "" ) );
bC.add( new ByFactory( ByXPath.class, "//ul/li[2]", "ParentRule[TagRule]", "27861.2294", "" ) );


objectMap.put( "27861.2256", bC );


bC = new ByFactoryCollection("INPUT", "27861.2297", "");
bC.add( new ByFactory( ByXPath.class, "//label[@style='position: absolute; top: 50%; left: 16px; padding: 0px 4px; background: white; transition: top 0.3s, left 0.3s; transform: translateY(-50%); pointer-events: none; color: black; font-family: var(--input-font-family) var(--input-font-weight); font-size: 16px;']/following-sibling::input[1]", "SiblingRule", "27861.2299", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@style='width: 100%; max-width: 550px; height: 56px; padding: 0px 19px 0px 16px; box-sizing: border-box; border-radius: var(--input-border-radius); border: 1px solid black; color: black; font-family: var(--input-font-family) var(--input-font-weight);']", "AttributeRule", "27861.2301", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='width: 100%; max-width: 550px; height: 56px; padding: 0px 19px 0px 16px; box-sizing: border-box; border-radius: var(--input-border-radius); border: 1px solid black; color: black; font-family: var(--input-font-family) var(--input-font-weight);']", "AttributeRule", "27861.2303", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@type='text']", "AttributeRule", "27861.2305", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='text']", "AttributeRule", "27861.2307", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@maxlength='10']", "AttributeRule", "27861.2309", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@maxlength='10']", "AttributeRule", "27861.2311", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@style='position: relative; width: 100%; max-width: 550px; height: 56px;']/input[1]", "ParentRule[AttributeRule]", "27861.2313", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='position: relative; width: 100%; max-width: 550px; height: 56px;']/input[1]", "ParentRule[AttributeRule]", "27861.2315", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/input[1]", "AbsoluteRule", "27861.2317", "" ) );


objectMap.put( "27861.2297", bC );


bC = new ByFactoryCollection("CONTINUE", "27861.2321", "");
bC.add( new ByFactory( ByXPath.class, "//button[@class='primary']", "AttributeRule", "27861.2323", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='primary']", "AttributeRule", "27861.2325", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@style='background: var(--button-default); color: var(--global-white); border: none; border-radius: var(--button-corner-radius); cursor: pointer; width: var(--button-full-width-width); height: var(--button-full-width-height); font-family: var(--button-font-family) var(--button-full-width-weight); font-size: var(--button-full-width-size); text-transform: var(--global-text-case-uppercase);']", "AttributeRule", "27861.2327", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='background: var(--button-default); color: var(--global-white); border: none; border-radius: var(--button-corner-radius); cursor: pointer; width: var(--button-full-width-width); height: var(--button-full-width-height); font-family: var(--button-font-family) var(--button-full-width-weight); font-size: var(--button-full-width-size); text-transform: var(--global-text-case-uppercase);']", "AttributeRule", "27861.2329", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='continue-btn']/button[1]", "ParentRule[AttributeRule]", "27861.2331", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='continue-btn']/button[1]", "ParentRule[AttributeRule]", "27861.2333", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[text()=\"CONTINUE\"]", "TextRule", "27861.2335", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]", "AbsoluteRule", "27861.2337", "" ) );


objectMap.put( "27861.2321", bC );


bC = new ByFactoryCollection("Uganda", "27861.2346", "");
bC.add( new ByFactory( ByXPath.class, "//li[@class='MuiButtonBase-root MuiMenuItem-root Mui-disabled MuiMenuItem-gutters Mui-disabled MuiMenuItem-root Mui-disabled MuiMenuItem-gutters css-1km1ehz']/following-sibling::li[4]", "SiblingRule", "27861.2348", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[@data-value='256']", "AttributeRule", "27861.2350", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-value='256']", "AttributeRule", "27861.2352", "" ) );
bC.add( new ByFactory( ByXPath.class, "//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li[5]", "ParentRule[AttributeRule]", "27861.2354", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li[5]", "ParentRule[AttributeRule]", "27861.2356", "" ) );
bC.add( new ByFactory( ByXPath.class, "//ul[@role='listbox']/li[5]", "ParentRule[AttributeRule]", "27861.2358", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@role='listbox']/li[5]", "ParentRule[AttributeRule]", "27861.2360", "" ) );
bC.add( new ByFactory( ByXPath.class, "//ul[@tabindex='-1']/li[5]", "ParentRule[AttributeRule]", "27861.2362", "" ) );
bC.add( new ByFactory( ByXPath.class, "//ul[@aria-labelledby='country-select-label']/li[5]", "ParentRule[AttributeRule]", "27861.2364", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-labelledby='country-select-label']/li[5]", "ParentRule[AttributeRule]", "27861.2366", "" ) );
bC.add( new ByFactory( ByXPath.class, "//ul[@id=\":r0:\"]/li[5]", "ParentRule[IDRule]", "27861.2368", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\":r0:\"]/li[5]", "ParentRule[IDRule]", "27861.2370", "" ) );
bC.add( new ByFactory( ByXPath.class, "//li[./span[text()=\"Uganda\"]]", "ChildRule[TextRule]", "27861.2372", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1yg7zvo'])[3]", "IndexedAttributeRule", "27861.2374", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@tabindex='-1'])[4]", "IndexedAttributeRule", "27861.2376", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@role='option'])[5]", "IndexedAttributeRule", "27861.2378", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//li[@aria-selected='false'])[5]", "IndexedAttributeRule", "27861.2380", "" ) );
bC.add( new ByFactory( ByXPath.class, "//ul/li[5]", "ParentRule[TagRule]", "27861.2382", "" ) );


objectMap.put( "27861.2346", bC );


bC = new ByFactoryCollection("INPUT1", "27861.2388", "");
bC.add( new ByFactory( ByXPath.class, "//div[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--otp-border-default);']/input[1]", "ParentRule[AttributeRule]", "27861.2390", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--otp-border-default);']/input[1]", "ParentRule[AttributeRule]", "27861.2392", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[1]", "IndexedAttributeRule", "27861.2394", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@maxlength='1'])[1]", "IndexedAttributeRule", "27861.2396", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@style='width: var(--otp-single-container-width); height: var(--otp-single-container-height); border-radius: var(--otp-border-radius); margin-top: var(--otp-top-margin); margin-left: var(--otp-left-margin); margin-right: var(--otp-right-margin); margin-bottom: var(--otp-bottom-margin); text-align: center; font-family: var(--otp-font-family) var(--otp-font-weight); font-size: var(--otp-font-size); border-color: var(--otp-border-default); border-top-style: ; border-top-width: ; border-right-style: ; border-right-width: ; border-bottom-style: ; border-bottom-width: ; border-left-style: ; border-left-width: ; border-image-source: ; border-image-slice: ; border-image-width: ; border-image-outset: ; border-image-repeat: ; color: var(--otp-border-error);'])[1]", "IndexedAttributeRule", "27861.2398", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]", "AbsoluteRule", "27861.2400", "" ) );


objectMap.put( "27861.2388", bC );


bC = new ByFactoryCollection("INPUT1-1", "27861.2403", "");
bC.add( new ByFactory( ByXPath.class, "//input[@value='1']/following-sibling::input[1]", "SiblingRule", "27861.2405", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--global-mo-mo-blue);']/input[2]", "ParentRule[AttributeRule]", "27861.2407", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--global-mo-mo-blue);']/input[2]", "ParentRule[AttributeRule]", "27861.2409", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[2]", "IndexedAttributeRule", "27861.2411", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@maxlength='1'])[2]", "IndexedAttributeRule", "27861.2413", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@style='width: var(--otp-single-container-width); height: var(--otp-single-container-height); border-radius: var(--otp-border-radius); margin-top: var(--otp-top-margin); margin-left: var(--otp-left-margin); margin-right: var(--otp-right-margin); margin-bottom: var(--otp-bottom-margin); text-align: center; font-family: var(--otp-font-family) var(--otp-font-weight); font-size: var(--otp-font-size); border-color: var(--global-mo-mo-blue); border-top-style: ; border-top-width: ; border-right-style: ; border-right-width: ; border-bottom-style: ; border-bottom-width: ; border-left-style: ; border-left-width: ; border-image-source: ; border-image-slice: ; border-image-width: ; border-image-outset: ; border-image-repeat: ; color: var(--otp-border-default);'])[2]", "IndexedAttributeRule", "27861.2415", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[2]", "AbsoluteRule", "27861.2417", "" ) );


objectMap.put( "27861.2403", bC );


bC = new ByFactoryCollection("INPUT1-2", "27861.2421", "");
bC.add( new ByFactory( ByXPath.class, "//div[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--global-mo-mo-blue);']/input[3]", "ParentRule[AttributeRule]", "27861.2423", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--global-mo-mo-blue);']/input[3]", "ParentRule[AttributeRule]", "27861.2425", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[1]/following-sibling::input[2]", "SiblingRule", "27861.2427", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[3]", "IndexedAttributeRule", "27861.2429", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@maxlength='1'])[3]", "IndexedAttributeRule", "27861.2431", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@style='width: var(--otp-single-container-width); height: var(--otp-single-container-height); border-radius: var(--otp-border-radius); margin-top: var(--otp-top-margin); margin-left: var(--otp-left-margin); margin-right: var(--otp-right-margin); margin-bottom: var(--otp-bottom-margin); text-align: center; font-family: var(--otp-font-family) var(--otp-font-weight); font-size: var(--otp-font-size); border-color: var(--global-mo-mo-blue); border-top-style: ; border-top-width: ; border-right-style: ; border-right-width: ; border-bottom-style: ; border-bottom-width: ; border-left-style: ; border-left-width: ; border-image-source: ; border-image-slice: ; border-image-width: ; border-image-outset: ; border-image-repeat: ; color: var(--otp-border-default);'])[3]", "IndexedAttributeRule", "27861.2433", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[3]", "AbsoluteRule", "27861.2435", "" ) );


objectMap.put( "27861.2421", bC );


bC = new ByFactoryCollection("INPUT1-3", "27861.2439", "");
bC.add( new ByFactory( ByXPath.class, "//div[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--global-mo-mo-blue);']/input[4]", "ParentRule[AttributeRule]", "27861.2441", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--global-mo-mo-blue);']/input[4]", "ParentRule[AttributeRule]", "27861.2443", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[1]/following-sibling::input[3]", "SiblingRule", "27861.2445", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[4]", "IndexedAttributeRule", "27861.2447", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@maxlength='1'])[4]", "IndexedAttributeRule", "27861.2449", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@style='width: var(--otp-single-container-width); height: var(--otp-single-container-height); border-radius: var(--otp-border-radius); margin-top: var(--otp-top-margin); margin-left: var(--otp-left-margin); margin-right: var(--otp-right-margin); margin-bottom: var(--otp-bottom-margin); text-align: center; font-family: var(--otp-font-family) var(--otp-font-weight); font-size: var(--otp-font-size); border-color: var(--global-mo-mo-blue); border-top-style: ; border-top-width: ; border-right-style: ; border-right-width: ; border-bottom-style: ; border-bottom-width: ; border-left-style: ; border-left-width: ; border-image-source: ; border-image-slice: ; border-image-width: ; border-image-outset: ; border-image-repeat: ; color: var(--otp-border-default);'])[4]", "IndexedAttributeRule", "27861.2451", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[4]", "AbsoluteRule", "27861.2453", "" ) );


objectMap.put( "27861.2439", bC );


bC = new ByFactoryCollection("INPUT1-4", "27861.2456", "");
bC.add( new ByFactory( ByXPath.class, "//div[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--global-mo-mo-blue);']/input[5]", "ParentRule[AttributeRule]", "27861.2458", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--global-mo-mo-blue);']/input[5]", "ParentRule[AttributeRule]", "27861.2460", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[1]/following-sibling::input[4]", "SiblingRule", "27861.2462", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[5]", "IndexedAttributeRule", "27861.2464", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@maxlength='1'])[5]", "IndexedAttributeRule", "27861.2466", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@style='width: var(--otp-single-container-width); height: var(--otp-single-container-height); border-radius: var(--otp-border-radius); margin-top: var(--otp-top-margin); margin-left: var(--otp-left-margin); margin-right: var(--otp-right-margin); margin-bottom: var(--otp-bottom-margin); text-align: center; font-family: var(--otp-font-family) var(--otp-font-weight); font-size: var(--otp-font-size); border-color: var(--global-mo-mo-blue); border-top-style: ; border-top-width: ; border-right-style: ; border-right-width: ; border-bottom-style: ; border-bottom-width: ; border-left-style: ; border-left-width: ; border-image-source: ; border-image-slice: ; border-image-width: ; border-image-outset: ; border-image-repeat: ; color: var(--otp-border-default);'])[5]", "IndexedAttributeRule", "27861.2468", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[5]", "AbsoluteRule", "27861.2470", "" ) );


objectMap.put( "27861.2456", bC );


bC = new ByFactoryCollection("INPUT1-5", "27861.2474", "");
bC.add( new ByFactory( ByXPath.class, "//div[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--global-mo-mo-blue);']/input[6]", "ParentRule[AttributeRule]", "27861.2476", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--global-mo-mo-blue);']/input[6]", "ParentRule[AttributeRule]", "27861.2478", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[1]/following-sibling::input[5]", "SiblingRule", "27861.2480", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[6]", "IndexedAttributeRule", "27861.2482", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@maxlength='1'])[6]", "IndexedAttributeRule", "27861.2484", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@style='width: var(--otp-single-container-width); height: var(--otp-single-container-height); border-radius: var(--otp-border-radius); margin-top: var(--otp-top-margin); margin-left: var(--otp-left-margin); margin-right: var(--otp-right-margin); margin-bottom: var(--otp-bottom-margin); text-align: center; font-family: var(--otp-font-family) var(--otp-font-weight); font-size: var(--otp-font-size); border-color: var(--global-mo-mo-blue); border-top-style: ; border-top-width: ; border-right-style: ; border-right-width: ; border-bottom-style: ; border-bottom-width: ; border-left-style: ; border-left-width: ; border-image-source: ; border-image-slice: ; border-image-width: ; border-image-outset: ; border-image-repeat: ; color: var(--otp-border-default);'])[6]", "IndexedAttributeRule", "27861.2486", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[6]", "AbsoluteRule", "27861.2488", "" ) );


objectMap.put( "27861.2474", bC );


bC = new ByFactoryCollection("VERIFY", "27861.2492", "");
bC.add( new ByFactory( ByXPath.class, "//button[@style='background: var(--button-default); color: var(--global-white); border: none; border-radius: var(--button-corner-radius); cursor: pointer; width: var(--button-full-width-width); height: var(--button-full-width-height); font-family: var(--button-font-family) var(--button-full-width-weight); font-size: var(--button-full-width-size); text-transform: var(--global-text-case-uppercase);']", "AttributeRule", "27861.2494", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='background: var(--button-default); color: var(--global-white); border: none; border-radius: var(--button-corner-radius); cursor: pointer; width: var(--button-full-width-width); height: var(--button-full-width-height); font-family: var(--button-font-family) var(--button-full-width-weight); font-size: var(--button-full-width-size); text-transform: var(--global-text-case-uppercase);']", "AttributeRule", "27861.2496", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@class='primary']", "AttributeRule", "27861.2498", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='primary']", "AttributeRule", "27861.2500", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='continue-otp-btn']/button[1]", "ParentRule[AttributeRule]", "27861.2502", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='continue-otp-btn']/button[1]", "ParentRule[AttributeRule]", "27861.2504", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[text()=\"VERIFY\"]", "TextRule", "27861.2506", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]", "AbsoluteRule", "27861.2508", "" ) );


objectMap.put( "27861.2492", bC );


bC = new ByFactoryCollection("INPUT1-6", "27861.2582", "");
bC.add( new ByFactory( ByXPath.class, "//div[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--global-mo-mo-blue);']/input[1]", "ParentRule[AttributeRule]", "27861.2584", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--global-mo-mo-blue);']/input[1]", "ParentRule[AttributeRule]", "27861.2586", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@style='width: var(--otp-single-container-width); height: var(--otp-single-container-height); border-radius: var(--otp-border-radius); margin-top: var(--otp-top-margin); margin-left: var(--otp-left-margin); margin-right: var(--otp-right-margin); margin-bottom: var(--otp-bottom-margin); text-align: center; font-family: var(--otp-font-family) var(--otp-font-weight); font-size: var(--otp-font-size); border-color: var(--global-mo-mo-blue); border-top-style: ; border-top-width: ; border-right-style: ; border-right-width: ; border-bottom-style: ; border-bottom-width: ; border-left-style: ; border-left-width: ; border-image-source: ; border-image-slice: ; border-image-width: ; border-image-outset: ; border-image-repeat: ; color: var(--otp-border-default);'])[1]", "IndexedAttributeRule", "27861.2588", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[1]", "IndexedAttributeRule", "27861.2590", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@maxlength='1'])[1]", "IndexedAttributeRule", "27861.2592", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]", "AbsoluteRule", "27861.2594", "" ) );


objectMap.put( "27861.2582", bC );


bC = new ByFactoryCollection("randomFieldName", "27861.2610", "");
bC.add( new ByFactory( ByXPath.class, "//label[@style='position: absolute; top: 50%; left: 16px; padding: 0px 4px; background: white; transition: top 0.3s, left 0.3s; transform: translateY(-50%); pointer-events: none; color: black; font-family: var(--input-font-family) var(--input-font-weight);']/following-sibling::input[1]", "SiblingRule", "27861.2612", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@style='width: 100%; height: 56px; box-sizing: border-box; padding: 0px 19px 0px 16px; border-radius: var(--input-border-radius); border: 1px solid black; font-family: \"MTN Brighter Sans Regular\"; color: black;']", "AttributeRule", "27861.2614", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='width: 100%; height: 56px; box-sizing: border-box; padding: 0px 19px 0px 16px; border-radius: var(--input-border-radius); border: 1px solid black; font-family: \"MTN Brighter Sans Regular\"; color: black;']", "AttributeRule", "27861.2616", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@type='password']", "AttributeRule", "27861.2618", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='password']", "AttributeRule", "27861.2620", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@maxlength='5']", "AttributeRule", "27861.2622", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@maxlength='5']", "AttributeRule", "27861.2624", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@autocomplete='on']", "AttributeRule", "27861.2626", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@autocomplete='on']", "AttributeRule", "27861.2628", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"randomFieldName\"]", "NameRule", "27861.2630", "" ) );
bC.add( new ByFactory( ByName.class, "randomFieldName", "NameRule", "27861.2632", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"randomFieldName\"]", "NameRule", "27861.2634", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@style='position: relative; width: 100%; height: 56px;']/input[1]", "ParentRule[AttributeRule]", "27861.2636", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='position: relative; width: 100%; height: 56px;']/input[1]", "ParentRule[AttributeRule]", "27861.2638", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]", "AbsoluteRule", "27861.2640", "" ) );


objectMap.put( "27861.2610", bC );


bC = new ByFactoryCollection("INPUT1-7", "27861.2685", "");
bC.add( new ByFactory( ByXPath.class, "//div[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--otp-border-error);']/input[1]", "ParentRule[AttributeRule]", "27861.2687", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='font-family: var(--otp-font-family) var(--otp-font-weight); font-size: 10px; color: var(--otp-border-error);']/input[1]", "ParentRule[AttributeRule]", "27861.2689", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@style='width: var(--otp-single-container-width); height: var(--otp-single-container-height); border-radius: var(--otp-border-radius); margin-top: var(--otp-top-margin); margin-left: var(--otp-left-margin); margin-right: var(--otp-right-margin); margin-bottom: var(--otp-bottom-margin); text-align: center; font-family: var(--otp-font-family) var(--otp-font-weight); font-size: var(--otp-font-size); border-color: var(--otp-border-error); border-top-style: ; border-top-width: ; border-right-style: ; border-right-width: ; border-bottom-style: ; border-bottom-width: ; border-left-style: ; border-left-width: ; border-image-source: ; border-image-slice: ; border-image-width: ; border-image-outset: ; border-image-repeat: ; color: var(--otp-border-error);'])[1]", "IndexedAttributeRule", "27861.2691", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@type='text'])[1]", "IndexedAttributeRule", "27861.2693", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//input[@maxlength='1'])[1]", "IndexedAttributeRule", "27861.2695", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]", "AbsoluteRule", "27861.2697", "" ) );


objectMap.put( "27861.2685", bC );


bC = new ByFactoryCollection("PrivateSwitchBase-inputcss-1m9pwf3", "27884.3261", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='checkbox']", "AttributeRule", "27884.3263", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='checkbox']", "AttributeRule", "27884.3265", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='PrivateSwitchBase-input css-1m9pwf3']", "AttributeRule", "27884.3267", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='PrivateSwitchBase-input css-1m9pwf3']", "AttributeRule", "27884.3269", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-indeterminate='false']", "AttributeRule", "27884.3271", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-indeterminate='false']", "AttributeRule", "27884.3273", "" ) );
bC.add( new ByFactory( ByXPath.class, "//span[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-14uify2']/input[1]", "ParentRule[AttributeRule]", "27884.3275", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-14uify2']/input[1]", "ParentRule[AttributeRule]", "27884.3277", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]/input[1]", "AbsoluteRule", "27884.3279", "" ) );


objectMap.put( "27884.3261", bC );


bC = new ByFactoryCollection("BUTTON", "27884.3283", "");
bC.add( new ByFactory( ByXPath.class, "//label[@style='position: absolute; top: -10px; left: 16px; padding: 0px 4px; background: white; transition: top 0.3s, left 0.3s; transform: translateY(0%) scale(0.8); pointer-events: none; color: rgb(237, 52, 52); font-family: var(--input-font-family) var(--input-font-weight);']/following-sibling::button[1]", "SiblingRule", "27884.3285", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@style='background: none; border: none;']", "AttributeRule", "27884.3287", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='background: none; border: none;']", "AttributeRule", "27884.3289", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[./img[@style='position: absolute; top: 50%; right: 10px; transform: translateY(-50%); height: 24px; width: 24px;']]", "ChildRule[AttributeRule]", "27884.3291", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[./*[@style='position: absolute; top: 50%; right: 10px; transform: translateY(-50%); height: 24px; width: 24px;']]", "ChildRule[AttributeRule]", "27884.3293", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[./img[@src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAACXBIWXMAABYlAAAWJQFJUiTwAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAQsSURBVHgB7VhLctNAEO0ZKWxsKLv4VLHCnCAGEood9gkwJ0hyAswJbJ8g4QQ4J0hxgpgdVQlEnACzogih4k0WEGmG15OxowRp9ImXelW2fq2Zfv2bHhFVqFChQoUKFSqUhqAl4Xh9vS2iqCM8b1Uo1cGtBgnRMA+1nuF8qon49xV3JvcPDye0BNyIwLd2u3HH99/gtIdfu9DLWk/xP/kbRaOHQTClkihN4NfaWl9qPZhbGQPNlBAfKIomyvOClVpt2pxMZvzstNNpnJ+dtaRSLZKyJ4leaq1bdElmXJZIYQI/2u3Wiu+/x4sdMzfRR/yGRUMCBugIITaF1hvmBjwSaT168OXLuMAwxQicPH++gTjfYatjcp5w66axfPriRSuKouGCCNGODMNRMwhmed7PTeD32toAh6G50PqdvH17OA+RZeBkfZ29sU2c/PAGQqqbJ6RyEbiiPNHbu4eHO2myi8TWehOeatnbAa6DrDhnb+go2jf5kZNEJoG48lqIrXsHB+M02XiIpYjMFNHovsMAhkQY7mmuaiAho+iJK5wkOfDz2bMexSzvUp6rEur/mJXnxIaiXVmvN+EtwecgvwuxBibcPgXRtHGanz5NRRh2OcfYg9r398iBVA9wtbnlefs2DEZQZJghe2QtnyoLb/J99ugMifrYZdkr4YTExphvk+RSPcCl0igvxNilvJH1vKFRPkOWn8FiE5w2Qt/vu8ZkT4REr+1ln8su5SVw/PTpJtd5dqP0vBFlAHKrfFRa72bJRvCQmfiybKbiwcFBoKw89EkknEhASmkG55fZEpQN00bkWRP8MAzMyWWFckIrNbWniYUhOYSE+G4OWq9SAZyihGbJ5F2gGJxbnhADq9M4SSaRABJnLtznLpMyAHlDGHGdKTuPZcFrQwZsbrVQ1T6kVcBEAhwKUOodn3tK7WVZVlvreBcVxgnBC9zFO04CJg+F2OAm0XMkfGoV8rg/YSvBAugut8kBxDUvTDNYqmMXvkTws7lSruJgQ8fMqTPy0LkScy1WYXhEFwk0RBlMndT2Mu/NBUIQrfUue5JbizpCCxMN5h0sOdqRK+sPouDu58/OcpvZSnDMwk379tJJAhbmydgDjZTJeM+QuqLHlYenAlGrdbMaxlzN3BXrZpBYtMdKtcmuD8RJjjxBa7GTptA15afYmnbzlPDc7XScBK+mf8Jw6yZbwTiMl3nsgspbXfKDS6pPtDdvd8vsoOKwrTeHnIlzbgK9er1XZJ9ReEv53w6qBJHYnqEfa72d+4w0lN7Uc0ghuQeLzbn9ygAyHwmb+rPz8+lju+qywrWVlZb57CLlK5BvzxU3Vhei30TfQyVw4+9CJjeU6i8SNifKfgy4jqV92LJrRo8XM1iYk/GRtuWUyye3G1rKAM8CVKPxMvfTFSpUqFChQoUKJfEPzTw3CtLbju4AAAAASUVORK5CYII=']]", "ChildRule[AttributeRule]", "27884.3295", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[./*[@src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAACXBIWXMAABYlAAAWJQFJUiTwAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAQsSURBVHgB7VhLctNAEO0ZKWxsKLv4VLHCnCAGEood9gkwJ0hyAswJbJ8g4QQ4J0hxgpgdVQlEnACzogih4k0WEGmG15OxowRp9ImXelW2fq2Zfv2bHhFVqFChQoUKFSqUhqAl4Xh9vS2iqCM8b1Uo1cGtBgnRMA+1nuF8qon49xV3JvcPDye0BNyIwLd2u3HH99/gtIdfu9DLWk/xP/kbRaOHQTClkihN4NfaWl9qPZhbGQPNlBAfKIomyvOClVpt2pxMZvzstNNpnJ+dtaRSLZKyJ4leaq1bdElmXJZIYQI/2u3Wiu+/x4sdMzfRR/yGRUMCBugIITaF1hvmBjwSaT168OXLuMAwxQicPH++gTjfYatjcp5w66axfPriRSuKouGCCNGODMNRMwhmed7PTeD32toAh6G50PqdvH17OA+RZeBkfZ29sU2c/PAGQqqbJ6RyEbiiPNHbu4eHO2myi8TWehOeatnbAa6DrDhnb+go2jf5kZNEJoG48lqIrXsHB+M02XiIpYjMFNHovsMAhkQY7mmuaiAho+iJK5wkOfDz2bMexSzvUp6rEur/mJXnxIaiXVmvN+EtwecgvwuxBibcPgXRtHGanz5NRRh2OcfYg9r398iBVA9wtbnlefs2DEZQZJghe2QtnyoLb/J99ugMifrYZdkr4YTExphvk+RSPcCl0igvxNilvJH1vKFRPkOWn8FiE5w2Qt/vu8ZkT4REr+1ln8su5SVw/PTpJtd5dqP0vBFlAHKrfFRa72bJRvCQmfiybKbiwcFBoKw89EkknEhASmkG55fZEpQN00bkWRP8MAzMyWWFckIrNbWniYUhOYSE+G4OWq9SAZyihGbJ5F2gGJxbnhADq9M4SSaRABJnLtznLpMyAHlDGHGdKTuPZcFrQwZsbrVQ1T6kVcBEAhwKUOodn3tK7WVZVlvreBcVxgnBC9zFO04CJg+F2OAm0XMkfGoV8rg/YSvBAugut8kBxDUvTDNYqmMXvkTws7lSruJgQ8fMqTPy0LkScy1WYXhEFwk0RBlMndT2Mu/NBUIQrfUue5JbizpCCxMN5h0sOdqRK+sPouDu58/OcpvZSnDMwk379tJJAhbmydgDjZTJeM+QuqLHlYenAlGrdbMaxlzN3BXrZpBYtMdKtcmuD8RJjjxBa7GTptA15afYmnbzlPDc7XScBK+mf8Jw6yZbwTiMl3nsgspbXfKDS6pPtDdvd8vsoOKwrTeHnIlzbgK9er1XZJ9ReEv53w6qBJHYnqEfa72d+4w0lN7Uc0ghuQeLzbn9ygAyHwmb+rPz8+lju+qywrWVlZb57CLlK5BvzxU3Vhei30TfQyVw4+9CJjeU6i8SNifKfgy4jqV92LJrRo8XM1iYk/GRtuWUyye3G1rKAM8CVKPxMvfTFSpUqFChQoUKJfEPzTw3CtLbju4AAAAASUVORK5CYII=']]", "ChildRule[AttributeRule]", "27884.3297", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[./img[@alt='Icon']]", "ChildRule[AttributeRule]", "27884.3299", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[./*[@alt='Icon']]", "ChildRule[AttributeRule]", "27884.3301", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@style='position: relative; width: 100%; height: 56px;']/button[1]", "ParentRule[AttributeRule]", "27884.3303", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='position: relative; width: 100%; height: 56px;']/button[1]", "ParentRule[AttributeRule]", "27884.3305", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]", "AbsoluteRule", "27884.3307", "" ) );


objectMap.put( "27884.3283", bC );


bC = new ByFactoryCollection("ThankYou!", "27925.1224", "");
bC.add( new ByFactory( ByXPath.class, "//div[@style='display: flex; justify-content: center; color: var(--responses-font-colour1); font-size: var(--responses-font-size1); font-family: var(--responses-font-family) Medium;']", "AttributeRule", "27925.1226", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='display: flex; justify-content: center; color: var(--responses-font-colour1); font-size: var(--responses-font-size1); font-family: var(--responses-font-family) Medium;']", "AttributeRule", "27925.1228", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@style='box-sizing: border-box; display: flex; flex-direction: column;']/div[2]/div[1]", "ParentRule[AttributeRule]", "27925.1230", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='box-sizing: border-box; display: flex; flex-direction: column;']/div[2]/div[1]", "ParentRule[AttributeRule]", "27925.1232", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[text()=\"Thank You!\"]", "TextRule", "27925.1234", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]", "AbsoluteRule", "27925.1236", "" ) );


objectMap.put( "27925.1224", bC );


bC = new ByFactoryCollection("DONE", "27925.1239", "");
bC.add( new ByFactory( ByXPath.class, "//button[@style='background: var(--button-default); color: var(--global-white); border: none; border-radius: var(--button-corner-radius); cursor: pointer; width: var(--button-full-width-width); height: var(--button-full-width-height); font-family: var(--button-font-family) var(--button-full-width-weight); font-size: var(--button-full-width-size); text-transform: var(--global-text-case-uppercase);']", "AttributeRule", "27925.1241", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='background: var(--button-default); color: var(--global-white); border: none; border-radius: var(--button-corner-radius); cursor: pointer; width: var(--button-full-width-width); height: var(--button-full-width-height); font-family: var(--button-font-family) var(--button-full-width-weight); font-size: var(--button-full-width-size); text-transform: var(--global-text-case-uppercase);']", "AttributeRule", "27925.1243", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[@class='primary']", "AttributeRule", "27925.1245", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='primary']", "AttributeRule", "27925.1247", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@style='display: flex; justify-content: center; gap: var(--responses-two-button-vertical-gap); padding-top: var(--responses-one-button-body-bottom-padding);']/button[1]", "ParentRule[AttributeRule]", "27925.1249", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='display: flex; justify-content: center; gap: var(--responses-two-button-vertical-gap); padding-top: var(--responses-one-button-body-bottom-padding);']/button[1]", "ParentRule[AttributeRule]", "27925.1251", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[text()=\"DONE\"]", "TextRule", "27925.1253", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]", "AbsoluteRule", "27925.1255", "" ) );


objectMap.put( "27925.1239", bC );


bC = new ByFactoryCollection("Accounts", "27925.1258", "");
bC.add( new ByFactory( ByXPath.class, "//div[@class='account-text-dashboard']", "AttributeRule", "27925.1260", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='account-text-dashboard']", "AttributeRule", "27925.1262", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='screen-sizing']/div[1]", "ParentRule[AttributeRule]", "27925.1264", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='screen-sizing']/div[1]", "ParentRule[AttributeRule]", "27925.1266", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[text()=\"Accounts\"]", "TextRule", "27925.1268", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]", "AbsoluteRule", "27925.1270", "" ) );


objectMap.put( "27925.1258", bC );


bC = new ByFactoryCollection("Logout", "27925.1274", "");
bC.add( new ByFactory( ByXPath.class, "//div[@style='width: var(--navigation-menu-drawer-open-width); height: 48px; background-color: var(--navigation-menu-drawer-selected-bg); padding: 0px 24px 0px 0px; gap: var(--navigation-menu-drawer-open-default-icon-right-margin); box-sizing: border-box; display: flex; align-items: center; cursor: pointer; border-left-width: 6px; border-left-style: solid; border-color: var(--navigation-menu-drawer-selected-line);']", "AttributeRule", "27925.1276", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='width: var(--navigation-menu-drawer-open-width); height: 48px; background-color: var(--navigation-menu-drawer-selected-bg); padding: 0px 24px 0px 0px; gap: var(--navigation-menu-drawer-open-default-icon-right-margin); box-sizing: border-box; display: flex; align-items: center; cursor: pointer; border-left-width: 6px; border-left-style: solid; border-color: var(--navigation-menu-drawer-selected-line);']", "AttributeRule", "27925.1278", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./img[@src='/static/media/LogOutHover.ed4109c2cf1623f35d632a1555d3d586.svg']]", "ChildRule[AttributeRule]", "27925.1280", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@src='/static/media/LogOutHover.ed4109c2cf1623f35d632a1555d3d586.svg']]", "ChildRule[AttributeRule]", "27925.1282", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./img[@alt='Logout icon']]", "ChildRule[AttributeRule]", "27925.1284", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@alt='Logout icon']]", "ChildRule[AttributeRule]", "27925.1286", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[@style='width: 48px; height: 18px; font-family: var(--navigation-menu-drawer-font-family)var(--navigation-menu-drawer-font-weight1); font-size: var(--navigation-menu-drawer-font-size1); font-weight: 400; line-height: 18px; letter-spacing: 0em; text-align: left; color: var(--navigation-menu-drawer-selected-font-colour1);']]", "ChildRule[AttributeRule]", "27925.1288", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./*[@style='width: 48px; height: 18px; font-family: var(--navigation-menu-drawer-font-family)var(--navigation-menu-drawer-font-weight1); font-size: var(--navigation-menu-drawer-font-size1); font-weight: 400; line-height: 18px; letter-spacing: 0em; text-align: left; color: var(--navigation-menu-drawer-selected-font-colour1);']]", "ChildRule[AttributeRule]", "27925.1290", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='dashboard-left']/div[2]/div[4]", "ParentRule[AttributeRule]", "27925.1292", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='dashboard-left']/div[2]/div[4]", "ParentRule[AttributeRule]", "27925.1294", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@style='position: relative; background-color: var(--navigation-menu-drawer-bg); width: var(--navigation-menu-drawer-open-width); height: 100%; padding-top: 64px; box-shadow: var(--global-box-shadow-x) var(--global-box-shadow-y) var(--global-box-shadow-blur) 0px var(--global-box-shadow-colour); box-sizing: border-box; display: flex; flex-direction: column; justify-content: space-between; overflow: hidden auto;']/div[2]/div[4]", "ParentRule[AttributeRule]", "27925.1296", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='position: relative; background-color: var(--navigation-menu-drawer-bg); width: var(--navigation-menu-drawer-open-width); height: 100%; padding-top: 64px; box-shadow: var(--global-box-shadow-x) var(--global-box-shadow-y) var(--global-box-shadow-blur) 0px var(--global-box-shadow-colour); box-sizing: border-box; display: flex; flex-direction: column; justify-content: space-between; overflow: hidden auto;']/div[2]/div[4]", "ParentRule[AttributeRule]", "27925.1298", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[./div[text()=\"Logout\"]]", "ChildRule[TextRule]", "27925.1300", "" ) );
bC.add( new ByFactory( ByXPath.class, "(//div[@style='width: var(--navigation-menu-drawer-open-width); height: 48px; background-color: var(--navigation-menu-drawer-bg); padding: 0px 24px; gap: var(--navigation-menu-drawer-open-default-icon-right-margin); box-sizing: border-box; display: flex; align-items: center; cursor: pointer;'])[4]/following-sibling::div[3]", "SiblingRule", "27925.1302", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]", "AbsoluteRule", "27925.1304", "" ) );


objectMap.put( "27925.1274", bC );


bC = new ByFactoryCollection("SwitchAccount", "27925.1307", "");
bC.add( new ByFactory( ByXPath.class, "//button[@class='switch-account-link']", "AttributeRule", "27925.1309", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='switch-account-link']", "AttributeRule", "27925.1311", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@style='display: flex; flex-direction: row; justify-content: space-between;']/button[1]", "ParentRule[AttributeRule]", "27925.1313", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@style='display: flex; flex-direction: row; justify-content: space-between;']/button[1]", "ParentRule[AttributeRule]", "27925.1315", "" ) );
bC.add( new ByFactory( ByXPath.class, "//button[text()=\"Switch Account\"]", "TextRule", "27925.1317", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]", "AbsoluteRule", "27925.1319", "" ) );


objectMap.put( "27925.1307", bC );
/* Page: default 
    
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
