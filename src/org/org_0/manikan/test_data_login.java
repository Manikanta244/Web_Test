/**
  * @version 3
  */
 package org.org_0.manikan;

 import java.util.*;
 import java.sql.*;
 import java.util.function.*;
 import java.io.*;
 import java.lang.reflect.*;
 import org.apache.commons.logging.*;
 import org.openqa.selenium.*;
 import org.openqa.selenium.interactions.*;
 import org.openqa.selenium.remote.*;
 import org.openqa.selenium.support.ui.*;
 import com.google.gson.*;
 import static com.orasi.shared_library.*;
 import com.orasi.event.spi.*;
 import com.orasi.event.configuration.*;
 import com.orasi.*;
 import com.orasi.model.*;
 import com.orasi.datasource.*;
 import com.orasi.alchemy.mediation.execution.*;
 import java.time.*;
 
 public class test_data_login extends AbstractTestWrapper
 {
   Map<String,FunctionVariableWrapper> ingressSignature = new HashMap<>( 5 );;

   public test_data_login() {
     super(15027, "26434.7842", "Test_data_login", "Add a description of Test_data_login", 0, "", "".split(","), "{\"symphonyId\":0,\"id\":15027,\"name\":\"Test_data_login\",\"description\":\"Add a description of Test_data_login\",\"userId\":362,\"userConfidence\":0,\"organizationId\":0,\"organizationConfidence\":0,\"status\":1,\"reviewFlag\":0,\"createDate\":\"Jan 26, 2025, 5:07:22 PM\",\"modifyDate\":\"Jan 26, 2025, 5:15:29 PM\",\"version\":3,\"lockUserId\":0,\"level\":1,\"pre\":\"\",\"post\":\"\",\"deviceTagNames\":\"\",\"changeCount\":0,\"uniqueContributors\":0,\"stepCount\":0,\"testUserConfidence\":0.0,\"errorHandler\":\"\",\"classificationId\":0,\"synchronizationId\":0,\"storageVersion\":2,\"alchemyId\":7842,\"alchemySeed\":26434,\"referenceSuiteID\":0,\"signature\":\"null\",\"acls\":[],\"changed\":false}");
   }

   private void sleep( long sleepTime ) {
    try {
      Thread.sleep( sleepTime );
    } catch( InterruptedException ignoreMe) {
      
    }
  }
 
 	@Override
   public void _executeTest( int executionId, int testExecutionId, final WebDriver webDriver, final Map<String,Object> contextMap, String contextName, final Stack<String> callStack, final Stack<Integer> stepStack )
   {
    String testName = "test_data_login";

    if ( contextMap.get( "__callStyle" ) == null ) { contextMap.put( "__callStyle", 1 ); }
    callStack.push( getClass().getName() );
    if ( stepStack.isEmpty() ) stepStack.push( 0 );
    int callStyle = (Integer) contextMap.get( "__callStyle" );
    final Deque<StepEvent> eventList = new ArrayDeque<>( 10 );

    DataSourceProvider dS = DataSourceProviderFactory.instance().getDataSourceProvider();
    if ( dS == null ) {
      throw new IllegalArgumentException( "No Data Source Provider was specified" );
    }

    //
    // Initialize the Action Mediator for this test
    //
    ActionMediator aM = new ActionMediator(executionId, testExecutionId, testName, webDriver, contextMap, callStack, stepStack, callStyle);
    VariableMediator vM = new VariableMediator();
    

    try
    {
      
      
      
      
      

      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "url", 15, true, "https://practicetestautomation.com/practice-test-login/", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "timeout", 2, true, "30000", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Navigate_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":82,\"checkpointId\":1,\"alchemyId\":7843,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"https://practicetestautomation.com/practice-test-login/\",\"inputId\":7,\"templateId\":0,\"inputName\":\"url\",\"inputDescription\":\"The Application Locator\",\"inputData\":\"null\",\"inputTypeId\":15,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"30000\",\"inputId\":7,\"templateId\":0,\"inputName\":\"timeout\",\"inputDescription\":\"The time in milliseconds to wait for a page to load\",\"inputData\":\"null\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":5,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Navigate to {var:url}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "action", 10, true, "Maximize", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "height", 2, true, "0", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "width", 2, true, "0", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Browser_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":271,\"checkpointId\":1,\"alchemyId\":7950,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Maximize\",\"inputId\":0,\"templateId\":0,\"inputName\":\"action\",\"inputDescription\":\"The action to take on the browser\",\"inputData\":\"Back,Forward,Refresh,Resize,Maximize,Minimize,Full Screen,Close\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"0\",\"inputId\":0,\"templateId\":0,\"inputName\":\"height\",\"inputDescription\":\"When the Resize method is selected, this value will specify the height of the browser\",\"inputData\":\"\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"0\",\"inputId\":0,\"templateId\":0,\"inputName\":\"width\",\"inputDescription\":\"When the Resize method is selected, this value will specify the width of the browser\",\"inputData\":\"\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":37,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Perform the {var:action} browser action\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "loopMode", 10, true, "Data", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "count", 2, false, "0", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "dataTable", 9, false, "26434.7910-26434.7911", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "targetLocator", 5, false, "", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "functionName", 6, true, "26434.7878", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "range", 1, false, "", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "list", 1, false, "", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Repeat_v4", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":273,\"checkpointId\":1,\"alchemyId\":7913,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Data\",\"inputId\":38,\"templateId\":0,\"inputName\":\"loopMode\",\"inputDescription\":\"Controls what you are looping over\",\"inputData\":\"Fixed Count,Data,Page Elements,List\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"0\",\"inputId\":39,\"templateId\":0,\"inputName\":\"count\",\"inputDescription\":\"The amount of repetitions - Required for Fixed Count\",\"inputData\":\"null\",\"inputTypeId\":2,\"inputRequired\":0,\"status\":1,\"changed\":false},{\"value\":\"26434.7910-26434.7911\",\"inputId\":40,\"templateId\":0,\"inputName\":\"dataTable\",\"inputDescription\":\"The data table that you want to select your row from\",\"inputData\":\"null\",\"inputTypeId\":9,\"inputRequired\":0,\"status\":1,\"changed\":false},{\"value\":\"\",\"inputId\":41,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"A locator referencing a list of elements - Required for Page Elements\",\"inputData\":\"null\",\"inputTypeId\":5,\"inputRequired\":0,\"status\":1,\"changed\":false},{\"value\":\"26434.7878\",\"inputId\":42,\"templateId\":0,\"inputName\":\"functionName\",\"inputDescription\":\"The name of the function to call\",\"inputData\":\"null\",\"inputTypeId\":6,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"\",\"inputId\":0,\"templateId\":0,\"inputName\":\"range\",\"inputDescription\":\"An optional, zero-based, range to use when iterating over the data.  A range is specifed using a begin (inclusive) and end (exclusive) value seperated by a dash such as 2-4.  When specifying the end value, you may use * to go to the end of the list.  2-* will start at the 3rd record and go to the end of the list\",\"inputData\":\"\",\"inputTypeId\":1,\"inputRequired\":0,\"status\":1,\"changed\":false},{\"value\":\"\",\"inputId\":33,\"templateId\":0,\"inputName\":\"list\",\"inputDescription\":\"A comma seperated list of data to iterate over\",\"inputTypeId\":1,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":21,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":4,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"For {ifvar:loopMode\\u003dList;text: each item in }{ifvar:loopMode\\u003dList;var:list}{ifvar:loopMode\\u003dData;text: each record in }{ifvar:loopMode\\u003dData;var:dataTable}{ifvar:loopMode\\u003dPage Elements;text: each element found with } {ifvar:loopMode\\u003dPage Elements;var:targetLocator}{ifvar:loopMode\\u003dFixed Count;var:count}{ifvar:loopMode\\u003dFixed Count;text: Iterations } execute {var:functionName}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      

      
      
      
      
    } catch( BreakException e ) {
      throw e;
    } catch (EOTException e) {
      if (e.getStepPayload() == null) {
        e.setStepPayload(new StepPayload());
      }
      e.getStepPayload().setMessage(e.getMessage());
      if (!e.isTestPassed()) {
        try {
          e.getStepPayload().setScreenShot(screenShot(webDriver));
          e.getStepPayload().setSource(webDriver.getPageSource());
          
        } catch (Exception _e) {
          e.getStepPayload().setMessage("Could not acquire details from connected endpoint");
        }
      }
      throw e;
    } catch (StepException e) {
      log.error( e.getMessage(), e );
      if (e.getStepPayload() == null) {
        e.setStepPayload( new StepPayload() );
      }
      try {
        e.getStepPayload().setScreenShot(screenShot(webDriver));
        e.getStepPayload().setSource(webDriver.getPageSource());
        e.getStepPayload().setMessage(e.getMessage());
      } catch (Exception _e) {
        log.error( _e.getMessage(), _e );
        e.getStepPayload().setMessage("Could not acquire details from connected endpoint");
      }
      notifyListeners(new StepEvent(e.getStepPayload(), testName, 3));
      throw e;
    } finally {
      if ( eventList.peek() != null ) {
        notifyListeners(new StepEvent(eventList.peek().getPayload(), testName, 2));
      } else {
        notifyListeners(new StepEvent(new StepPayload(), testName, 2));
      }
      callStack.pop();
    }
  }

  
  private byte[] screenShot( WebDriver webDriver ) {
    if ( webDriver instanceof TakesScreenshot ) {
      return ( (TakesScreenshot) webDriver ).getScreenshotAs( OutputType.BYTES );
    } else {
      return null;
    }
  }
 }