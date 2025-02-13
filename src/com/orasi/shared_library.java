/**
 * @version 37
 *
 */
 package com.orasi;
 
 import java.util.*;
 import java.util.function.*;
 import java.io.*;
 import java.lang.reflect.*;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.openqa.selenium.*;
 import org.openqa.selenium.interactions.*;
 import org.openqa.selenium.remote.*;
 import org.openqa.selenium.support.ui.*;
 import java.util.regex.*;
 import com.orasi.datasource.*;
 import com.orasi.alchemy.mediation.execution.*;
 import java.util.concurrent.atomic.AtomicInteger;
 import com.orasi.event.*;
 import com.orasi.event.chain.*;
 import com.orasi.event.handler.EventHandler;
 import com.orasi.model.*;
 import java.time.*;
 
 public class shared_library
 {
    private static Logger log = LoggerFactory.getLogger(shared_library.class );
 
    private static final Pattern CONTEXT_REGEX = Pattern.compile( "\\$\\{([^}]*)\\}" );
 

    private static final AtomicInteger testCounter = new AtomicInteger();
    private static final AtomicInteger stepCounter = new AtomicInteger();

    public static final int getTestCounter() {
      return testCounter.incrementAndGet();
    }

    public static final int getStepCounter() {
      return stepCounter.incrementAndGet();
    }
 

 private static EventChain eventChain = new EventChain();

 public static void addEventHandler( EventHandler eventHandler ) {
   eventHandler.setEventChain(eventChain);
   eventChain.addEventHandler(eventHandler);
 }

 public static void notifyListeners( Event e ) {
   
   eventChain.handle( e );
 }

  private static List<Throwable> getThrowableList(Throwable throwable) {
    final List<Throwable> list = new ArrayList<>();
    while (throwable != null && !list.contains(throwable)) {
      list.add(throwable);
      throwable = throwable.getCause();
    }
    return list;
  }

  private static Throwable getRootCause(final Throwable throwable) {
    final List<Throwable> list = getThrowableList(throwable);
    return list.isEmpty() ? throwable : list.get(list.size() - 1);
  }

 
 
 
 public static void Click_v7( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 
   String method = (String) variableMap.get( "method" );
 

   if ( method != null && !method.isEmpty() ) {    
 
 try {
   switch (method) {
         case "Default":
           try {
             WebDriverWait wait = new WebDriverWait( webDriver,Duration.ofSeconds( 8 ), Duration.ofMillis( 250 ) );
             wait.until( (_wD) -> ExpectedConditions.elementToBeClickable( targetLocator ).apply( _wD )).click();
           } catch (Exception e) {
             try {
               if (webDriver instanceof JavascriptExecutor) {
                 WebElement wE = webDriver.findElement(targetLocator);
                 ((JavascriptExecutor) webDriver).executeScript("arguments[ 0 ].click();", wE);
               }
             } catch (Exception e2) {
               throw e;
             }
           }
           break;
         case "No Wait":
           try {
             webDriver.findElement(targetLocator).click();
           } catch (Exception e) {
             try {
               if (webDriver instanceof JavascriptExecutor) {
                 WebElement wE = webDriver.findElement(targetLocator);
                 ((JavascriptExecutor) webDriver).executeScript("arguments[ 0 ].click();", wE);
               }
             } catch (Exception e2) {
               throw e;
             }
           }
           break;
         case "Simple":
           webDriver.findElement(targetLocator).click();
           break;
         case "Right":
           Actions rC = new Actions(webDriver);
           rC.contextClick(webDriver.findElement(targetLocator)).perform();
           break;
         case "Double": 
           Actions dC = new Actions(webDriver);
           dC.doubleClick(webDriver.findElement(targetLocator)).perform();
           break;
         default:
           throw new IllegalArgumentException("Invalid method specified as " + method );
       }
     } catch( Exception e ) {
       throw new IllegalArgumentException( "Could not locate element defined by targetLocator" );
     }
 
   } else {
     throw new IllegalArgumentException("The METHOD parameter must be specified");
   }
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * The initial implementation
 */
 public static void Alert_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String alertAction = (String) variableMap.get( "alertAction" );
 
   String sendText = (String) variableMap.get( "sendText" );
 

 try {
       WebDriverWait alertWait = new WebDriverWait( webDriver,  Duration.ofMillis( 5000 ));
       Alert currentAlert = alertWait.until( new Function<WebDriver, Alert>()
       {
         @Override
         public Alert apply( WebDriver t )
         {
           return ExpectedConditions.alertIsPresent().apply( t );
 
         }
       } );
 
       if ( contextName != null && !contextName.isEmpty() ) {
         contextMap.put( contextName, currentAlert.getText() );
       }
 
       switch ( alertAction ) {
         case "Accept":
           currentAlert.accept();
           break;
 
         case "Dismiss":
           currentAlert.dismiss();
           break;
 
         case "Send Keys":
           currentAlert.sendKeys( sendText );
           currentAlert.accept();
           break;
 
         default:
           log.warn( "Unhandled Alert Type: " + alertAction );
 
       }
     } catch ( NoAlertPresentException e ) {
       throw new IllegalArgumentException( "No Alert was present to interact with", e );
     }
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 
 public static void Navigate_v2( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String url = (String) variableMap.get( "url" );
 
   Long timeout = null;
   Number _timeout = (Number) variableMap.get( "timeout" );
   if ( _timeout != null ) timeout = _timeout.longValue();
 

 webDriver.manage().timeouts().pageLoadTimeout( timeout.longValue(), java.util.concurrent.TimeUnit.MILLISECONDS ); webDriver.get( url ); 
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * This version implemented Maximize, Minimize, Full Screen, Resize and Close
 */
 public static void Browser_v2( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String action = (String) variableMap.get( "action" );
 
   Long height = null;
   Number _height = (Number) variableMap.get( "height" );
   if ( _height != null ) height = _height.longValue();
 
   Long width = null;
   Number _width = (Number) variableMap.get( "width" );
   if ( _width != null ) width = _width.longValue();
 

 switch( action ) {
  case "Back":
    webDriver.navigate().back();
    break;
  case "Forward":
    webDriver.navigate().forward();
    break;
  case "Refresh":
    webDriver.navigate().refresh();
    break;
  case "Maximize":
    webDriver.manage().window().maximize();
    break;
  case "Minimize":
    webDriver.manage().window().minimize();
    break;
  case "Full Screen":
    webDriver.manage().window().fullscreen();
    break;
  case "Resize":
    webDriver.manage().window().setSize( new Dimension( width.intValue(), height.intValue() ) );
    break;
  case "Close":
   String windowHandle = webDriver.getWindowHandle();
   String baseWindowHandle = webDriver.getWindowHandles().toArray()[ 0 ] + "";
   
   if ( !windowHandle.equals(baseWindowHandle) ) {
     webDriver.switchTo().window( windowHandle );
     webDriver.close();
     webDriver.switchTo().window( baseWindowHandle );
   } else {
     throw new IllegalArgumentException( "You can not close the default window" );
   }
}

if ( contextName != null ) {
  contextMap.put( contextName, webDriver.getCurrentUrl() );
}
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * Version 4 introduced the new context variable method.   Values created that are to be passed into the function are added to the variableMap via functionData
 */
 public static void Call_v5( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String functionName = (String) variableMap.get( "functionName" );
 
   String callStyle = (String) variableMap.get( "callStyle" );
 

 Integer originalParent = null;
     int specifiedStyle;
     switch ( callStyle ) {
       case "Default":
         specifiedStyle = 1;
         break;
       case "Error Handler":
         specifiedStyle = 2;
	 originalParent = stepStack.pop();
         break;
       case "Private Function":
         specifiedStyle = 3;
         originalParent = stepStack.pop();
         break;
       default:
         specifiedStyle = 1;
         break;
     }
 
     Map<String,Object> functionMap = new HashMap<>( 3 );
     functionMap.put( "__callStyle", specifiedStyle );

     variableMap.put( "functionData", functionMap );     
 
     try {
       FunctionExecutionMediator.instance().getFunctionExecutor().executeFunction( functionName, executionId, testExecutionId, webDriver, variableMap, contextMap, contextName, callStack, stepStack );  
     } catch ( StepException e ) {
       throw e;
     } catch ( Throwable e ) {
       throw new IllegalArgumentException( "Unknown Exception executing " + functionName, e );
     } finally {
       if ( originalParent != null ) {
         stepStack.push( originalParent );
       }
     }
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 
 public static void Change_Window_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String Method = (String) variableMap.get( "Method" );
 
   Boolean Exact_Match = Boolean.parseBoolean( variableMap.get( "Exact Match" ) + "" );
 
   String Identifier = (String) variableMap.get( "Identifier" );
 
   Boolean Case_Sensitive = Boolean.parseBoolean( variableMap.get( "Case Sensitive" ) + "" );
 

 if ( Identifier == null ) {
      throw new IllegalArgumentException( "Identifier must be specified" );
    }
    String originalWindow = webDriver.getWindowHandle();
    boolean windowLocated = false;

    if (!Case_Sensitive) {
      Identifier = Identifier.toLowerCase();
    }

    switch (Method) {
      case "Handle":
        try {
          webDriver.switchTo().window(Identifier);
          windowLocated = true;
        } catch (NoSuchWindowException e) {
          throw new IllegalArgumentException("Could not find a window using [" + Identifier + "]");
        }
      break;
      case "Index":
        try {
          int windowIndex = Integer.parseInt(Identifier);
          if (webDriver.getWindowHandles().size() <= windowIndex) {
            throw new IllegalArgumentException("There is no window at index [" + windowIndex + "]");
          }
          webDriver.switchTo().window(webDriver.getWindowHandles().toArray()[windowIndex] + "");
          windowLocated = true;
        } catch (NoSuchWindowException e) {
          throw new IllegalArgumentException("Could not find a window using [" + Identifier + "]");
        } catch (IllegalArgumentException e) {
          throw e;
        } catch (Exception e) {

      }
      break;
      
      default:
        if (!Case_Sensitive) {
          Identifier = Identifier.toLowerCase();
        }
        String useValue = null;
        for (String t : webDriver.getWindowHandles()) {
          if (Method.equals("Title")) {
            useValue = webDriver.switchTo().window(t).getTitle();
          } else if (Method.equals("URL")) {
            useValue = webDriver.switchTo().window(t).getCurrentUrl();
          }

          if (useValue != null) {
            if (!Case_Sensitive) {
              useValue = useValue.toLowerCase();
            }

            if (Exact_Match) {
              if (Identifier.equals(useValue)) {
                windowLocated = true;
                break;
              }
            } else {
              if (useValue.contains(Identifier)) {
                windowLocated = true;
                break;
              }
            }

          }
        }
        break;
    }
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * A simple test to ensure an element exists
 */
 public static void Exists_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 

 
WebElement targetElement;
try 
{
  targetElement = webDriver.findElement(targetLocator);
  if ( contextName != null && targetElement != null ) {
    contextMap.put( contextName, true );
  }
} catch (Exception e) {
  if ( contextName != null ) {
    contextMap.put( contextName, false );
  }
  throw new IllegalArgumentException( "Unable to locate element", e );
}

if ( targetElement == null ) {
  throw new IllegalArgumentException("Unable to locate element using " + targetLocator);
}


 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * Remove a variable name/value pair
 */
 public static void Clear_Variable_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String name = (String) variableMap.get( "name" );
 

 contextMap.remove( name );
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * This version will check after the clear to verify that the input is empty.  If not, it will send backspace keys for each character in the input
 */
 public static void Type_v2( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String value = (String) variableMap.get( "value" );
 
   Boolean clearFirst = Boolean.parseBoolean( variableMap.get( "clearFirst" ) + "" );
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 

 WebElement targetElement;
targetElement = webDriver.findElement(targetLocator);

if ( targetElement == null ) {
  throw new IllegalArgumentException( "Unable to locate " + targetLocator );
}

if ( clearFirst ) {   
  targetElement.clear(); 
  String text = targetElement.getAttribute( "value" );
  if ( text != null ) {
    for ( int i=0; i<text.length(); i++ ) {
      targetElement.sendKeys(Keys.BACK_SPACE);
    } 
  }
}  

targetElement.sendKeys( value );


 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 
 public static void Hover_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 

 WebElement wE = null;

try {
  wE = webDriver.findElement( targetLocator );
} catch( Exception e ) {
  throw new IllegalArgumentException( "Unable to locate element", e );
}

Actions a = new Actions( webDriver );
a.moveToElement( wE );
a.build().perform();



 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 
 public static void Change_Frame_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String Method = (String) variableMap.get( "Method" );
 
   Long Index = null;
   Number _Index = (Number) variableMap.get( "Index" );
   if ( _Index != null ) Index = _Index.longValue();
 
   String Name = (String) variableMap.get( "Name" );
 
   By Locator = (By) variableMap.get( "Locator" );
 
   String ID = (String) variableMap.get( "ID" );
 

 if ( Method == null ) {
  throw new IllegalArgumentException( "Method must be specified" );
}

switch( Method ) {
  case "Locator":
    if ( Locator == null ) {
      throw new IllegalArgumentException( "Locator is required when searching for a frame by a locator" );
    }

    WebDriverWait wait = new WebDriverWait( webDriver,Duration.ofMillis( 2500 ), Duration.ofMillis( 250 ) );

    WebElement frameElement = wait.until( new Function<WebDriver, WebElement>()
    {
      @Override
      public WebElement apply( WebDriver webDriver )
      {
        try {
          WebElement webElement = webDriver.findElement( Locator );
          webDriver.switchTo().frame( webElement );
          return webElement;
        } catch ( Exception e ) {  
          return null;
        }
      }
     } );
     break;

  case "Index":
    if ( Index == null ) {
      throw new IllegalArgumentException( "Index is required when searching for a frame by index" );
    }
    webDriver.switchTo().frame( Index.intValue() );
    break;
  case "Name":
    if ( Name == null ) {
      throw new IllegalArgumentException( "Name is required when searching for a frame by name" );
    }
    webDriver.switchTo().frame( Name );
    break;
  case "ID":
    if ( ID == null ) {
      throw new IllegalArgumentException( "ID is required when searching for a frame by id" );
    }
    webDriver.switchTo().frame( ID );
    break;
  case "Parent":
    webDriver.switchTo().parentFrame();
    break;
}

 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * Version 4 introduced the new context variable method.   Values created that are to be passed into the function are added to the variableMap via functionData
 */
 public static void Repeat_v4( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String loopMode = (String) variableMap.get( "loopMode" );
 
   Long count = null;
   Number _count = (Number) variableMap.get( "count" );
   if ( _count != null ) count = _count.longValue();
 
   DataTable dataTable = (DataTable) variableMap.get( "dataTable" );
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 
   String functionName = (String) variableMap.get( "functionName" );
 
   String range = (String) variableMap.get( "range" );
 
   String list = (String) variableMap.get( "list" );
 

 int startValue = 0;
    int endValue = -1;
    if (range != null && !range.trim().isEmpty()) {
      String[] rangeValues = range.split("-");
      if (rangeValues.length != 2) {
        throw new IllegalArgumentException("Expected format is #-# - value found was [" + range + "]");
      }

      startValue = Integer.parseInt(rangeValues[0].trim());
      if (!"*".equals(rangeValues[1].trim())) {
        endValue = Integer.parseInt(rangeValues[1].trim());
      }

    }

    Map<String, Object> functionData = new HashMap<>(5);

    switch (loopMode) {
      case "List":
        if (list == null) {
          throw new IllegalArgumentException("variable list is required when the List loopMode is specified");
        }

        String[] valueList = list.split(",");

        for (int fixedCount = startValue; fixedCount < (endValue == -1 ? valueList.length : endValue); fixedCount++) {

          if (contextName != null) {
            functionData.put(contextName + "_index", fixedCount);
            functionData.put(contextName + "_item", valueList[fixedCount]);
          } else {
            functionData.put("index", fixedCount);
            functionData.put("item", valueList[fixedCount]);
          }

          variableMap.put("functionData", functionData);

          try {

            FunctionExecutionMediator.instance().getFunctionExecutor().executeFunction(functionName, executionId, testExecutionId, webDriver, variableMap, contextMap, contextName, callStack, stepStack);
          } catch (Throwable e) {
            if (getRootCause(e) instanceof BreakException) {
              String breakReason = ((BreakException) getRootCause(e)).getBreakCode();
              if ("Continue".equals(breakReason)) {
                continue;
              } else {
                break;
              }
            } else if (getRootCause(e) instanceof StepException) {
              throw (StepException) getRootCause(e);
            } else {
              throw new IllegalArgumentException("COULD NOT EXECUTE" + functionName, e);
            }
          }

        }
        break;
      case "Fixed Count":
        if (count == null) {
          throw new IllegalArgumentException("variable count is required when the Fixed Count loopMode is specified");
        }

        for (long fixedCount = startValue; fixedCount < (endValue == -1 ? count : endValue); fixedCount++) {

          if (contextName != null) {
            functionData.put(contextName + "_index", fixedCount);
          } else {
            functionData.put("index", fixedCount);
          }
          variableMap.put("functionData", functionData);

          try {
            FunctionExecutionMediator.instance().getFunctionExecutor().executeFunction(functionName, executionId, testExecutionId, webDriver, variableMap, contextMap, contextName, callStack, stepStack);
          } catch (Throwable e) {
            if (getRootCause(e) instanceof BreakException) {
              String breakReason = ((BreakException) getRootCause(e)).getBreakCode();
              if ("Continue".equals(breakReason)) {
                continue;
              } else {
                break;
              }
            } else if (getRootCause(e) instanceof StepException) {
              throw (StepException) getRootCause(e);
            } else {
              throw new IllegalArgumentException("COULD NOT EXECUTE" + functionName, e);
            }
          }

        }
        break;

      case "Data":
        if (dataTable == null) {
          throw new IllegalArgumentException("variable dataTable is required when the Data Source loopMode is specified");
        }

        if (dataTable != null) {
          for (int i = startValue; i < (endValue == -1 ? dataTable.getRows().size() : endValue); i++) {

            DataSourceProviderFactory.instance().getDataSourceProvider().setRow(dataTable.getKey(), (DataRow) dataTable.getRows().get(i));

            if (contextName != null) {
              functionData.put(contextName + "_index", i);
            } else {
              functionData.put("index", i);
            }
            variableMap.put("functionData", functionData);

            try {
              FunctionExecutionMediator.instance().getFunctionExecutor().executeFunction(functionName, executionId, testExecutionId, webDriver, variableMap, contextMap, contextName, callStack, stepStack);
            } catch (Throwable e) {
              if (getRootCause(e) instanceof BreakException) {
                String breakReason = ((BreakException) getRootCause(e)).getBreakCode();
                if ("Continue".equals(breakReason)) {
                  continue;
                } else {
                  break;
                }
              } else if (getRootCause(e) instanceof StepException) {
                throw (StepException) getRootCause(e);
              } else {
                throw new IllegalArgumentException("COULD NOT EXECUTE" + functionName, e);
              }
            } finally {
              DataSourceProviderFactory.instance().getDataSourceProvider().setRow(dataTable.getKey(), null);
            }
          }
        }
        break;

      case "Page Elements":
        if (targetLocator == null) {
          throw new IllegalArgumentException("variable targetLocator is required when the Page Elements loopMode is specified");
        }
        List<WebElement> elementList = webDriver.findElements(targetLocator);

        if (contextName != null) {
          functionData.put(contextName + "_elementList", elementList);
        } else {
          functionData.put("_elementList", elementList);
        }

        for (int i = startValue; i < (endValue == -1 ? elementList.size() : endValue); i++) {
          WebElement wE = elementList.get(i);
          if (contextName != null) {
            functionData.put(contextName + "_element", new By() {
              @Override
              public WebElement findElement(SearchContext context) {
                return wE;
              }

              @Override
              public List<WebElement> findElements(SearchContext sc) {
                List<WebElement> wL = new ArrayList<>(1);
                wL.add(wE);
                return wL;
              }

              @Override
              public String toString() {
                return targetLocator.toString();
              }
            });
            functionData.put(contextName + "_index", i);
          } else {
            functionData.put("element", new By() {
              @Override
              public WebElement findElement(SearchContext context) {
                return wE;
              }

              @Override
              public List<WebElement> findElements(SearchContext sc) {
                List<WebElement> wL = new ArrayList<>(1);
                wL.add(wE);
                return wL;
              }

              @Override
              public String toString() {
                return targetLocator.toString();
              }
            });
            functionData.put("index", i);
          }

          variableMap.put("functionData", functionData);

          try {
            FunctionExecutionMediator.instance().getFunctionExecutor().executeFunction(functionName, executionId, testExecutionId, webDriver, variableMap, contextMap, contextName, callStack, stepStack);
          } catch (Throwable e) {
            if (getRootCause(e) instanceof BreakException) {
              String breakReason = ((BreakException) getRootCause(e)).getBreakCode();
              if ("Continue".equals(breakReason)) {
                continue;
              } else {
                break;
              }
            } else if (getRootCause(e) instanceof StepException) {
              throw (StepException) getRootCause(e);
            } else {
              throw new IllegalArgumentException("COULD NOT EXECUTE" + functionName, e);
            }
          }

        }
        break;
      default:
        throw new IllegalArgumentException("Unknown Loop Mode provided: " + loopMode);
    }
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * Initial implementation of Slide
 */
 public static void Slide_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 
   Long startX = null;
   Number _startX = (Number) variableMap.get( "startX" );
   if ( _startX != null ) startX = _startX.longValue();
 
   Long startY = null;
   Number _startY = (Number) variableMap.get( "startY" );
   if ( _startY != null ) startY = _startY.longValue();
 
   Long moveX = null;
   Number _moveX = (Number) variableMap.get( "moveX" );
   if ( _moveX != null ) moveX = _moveX.longValue();
 
   Long moveY = null;
   Number _moveY = (Number) variableMap.get( "moveY" );
   if ( _moveY != null ) moveY = _moveY.longValue();
 

 

    WebElement targetElement;
    try {
      targetElement = webDriver.findElement(targetLocator);
    } catch (Exception e) {
      throw new IllegalArgumentException("Unable to locate element", e);
    }

    Actions actionWrapper = new Actions(webDriver);
    actionWrapper
        .moveToElement(targetElement, startX.intValue(), startY.intValue())
        .clickAndHold()
        .moveByOffset(moveX.intValue(), moveY.intValue())
        .release()
        .perform();

    
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * Changed the timeout to seconds instead os milliseconds
 */
 public static void Wait_v2( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   Long timeout = null;
   Number _timeout = (Number) variableMap.get( "timeout" );
   if ( _timeout != null ) timeout = _timeout.longValue();
 

 try { Thread.sleep( timeout * 1000 ); } catch( Exception e ) {}
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 
 public static void Random_String_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String Format = (String) variableMap.get( "Format" );
 

 

    if (contextName == null) {
      throw new IllegalStateException("This Action requires an Output name to store the result as");
    }

    Random numberGenerator = new Random();

    StringBuilder returnValue = new StringBuilder();
    byte[] buffer = Format.getBytes();

    boolean isEscape = false;

    for (int i = 0; i < Format.length(); i++) {
      if (isEscape) {
        returnValue.append((char) buffer[i]);
        isEscape = false;
        continue;
      }

      switch (buffer[i]) {
        case 84:
          returnValue.append((char) (numberGenerator.nextInt(26) + 65));
          break;

        case 116:
          returnValue.append((char) (numberGenerator.nextInt(26) + 97));
          break;

        case 35:
          returnValue.append((char) (numberGenerator.nextInt(10) + 48));
          break;

        case 92:
          isEscape = true;
          break;

        default:
          returnValue.append((char) buffer[i]);
          break;
      }
    }

    contextMap.put(contextName, returnValue.toString());

    
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * This implementation will select a value based off of the method.  The default method will select by search that the value contains the provided text.  If not found, it will select by visible value, otherwise by value.  The Visible method only search by visible value and the Value method only selects by value
 */
 public static void Select_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String method = (String) variableMap.get( "method" );
 
   String value = (String) variableMap.get( "value" );
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 

 
WebElement targetElement;
try {
      targetElement = webDriver.findElement(targetLocator);

    } catch (Exception e) {
      throw new IllegalArgumentException( "Unable to locate element", e );
    }

if ( method == null ||  method.equals( "Default" ) ) {
  Select selectElement = new Select(targetElement);
  if (selectElement.isMultiple()) {
    selectElement.deselectAll();
  }

  List<WebElement> selectOptions = selectElement.getOptions();
  boolean found = false;
  for (int i = 0; i < selectOptions.size(); i++) {
    if (selectOptions.get(i).getText().contains(value)) {
      selectElement.selectByIndex(i);
      found = true;
    }
  }

  if (!found) {
    try {
      selectElement.selectByVisibleText(value);
    } catch (Exception e) {
      selectElement.selectByValue(value);
    }
  }
} else if ( method.equals( "Visible" ) ) {
  Select selectElement = new Select( targetElement );
  if ( selectElement.isMultiple() )
    selectElement.deselectAll();

  selectElement.selectByVisibleText( value );
} else if ( method.equals( "Value" ) ) {
  Select selectElement = new Select( targetElement );
  if ( selectElement.isMultiple() )
    selectElement.deselectAll();

  selectElement.selectByValue( value );
}
    

 if ( variableMap != null ) {
   variableMap.clear();
 }
}


 }
