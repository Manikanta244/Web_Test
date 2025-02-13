/**
  * @version 1
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
 
 public class upload_and_download_image extends AbstractTestWrapper
 {
   Map<String,FunctionVariableWrapper> ingressSignature = new HashMap<>( 5 );;

   public upload_and_download_image() {
     super(15003, "26303.2104", "upload and download image", "Add a description of upload and download image", 0, "", "".split(","), "{\"symphonyId\":0,\"id\":15003,\"name\":\"upload and download image\",\"description\":\"Add a description of upload and download image\",\"userId\":362,\"userConfidence\":0,\"organizationId\":0,\"organizationConfidence\":0,\"status\":1,\"reviewFlag\":0,\"createDate\":\"Jan 24, 2025, 10:11:04 AM\",\"modifyDate\":\"Jan 24, 2025, 10:26:37 AM\",\"version\":1,\"lockUserId\":0,\"level\":1,\"pre\":\"\",\"post\":\"\",\"deviceTagNames\":\"\",\"changeCount\":0,\"uniqueContributors\":0,\"stepCount\":0,\"testUserConfidence\":0.0,\"errorHandler\":\"\",\"classificationId\":0,\"synchronizationId\":0,\"storageVersion\":2,\"alchemyId\":2104,\"alchemySeed\":26303,\"referenceSuiteID\":0,\"signature\":\"null\",\"acls\":[],\"changed\":false}");
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
    String testName = "upload_and_download_image";

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
      

      vM.addVariable( createVariable( "url", 15, true, "https://demoqa.com", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "timeout", 2, true, "30000", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Navigate_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":82,\"checkpointId\":1,\"alchemyId\":2109,\"alchemySeed\":26303,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"https://demoqa.com\",\"inputId\":7,\"templateId\":0,\"inputName\":\"url\",\"inputDescription\":\"The Application Locator\",\"inputData\":\"null\",\"inputTypeId\":15,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"30000\",\"inputId\":7,\"templateId\":0,\"inputName\":\"timeout\",\"inputDescription\":\"The time in milliseconds to wait for a page to load\",\"inputData\":\"null\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":5,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Navigate to {var:url}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "action", 10, true, "Resize", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "height", 2, true, "662.0", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "width", 2, true, "1024.0", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Browser_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":271,\"checkpointId\":1,\"alchemyId\":2110,\"alchemySeed\":26303,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Resize\",\"inputId\":0,\"templateId\":0,\"inputName\":\"action\",\"inputDescription\":\"The action to take on the browser\",\"inputData\":\"Back,Forward,Refresh,Resize,Maximize,Minimize,Full Screen,Close\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"662.0\",\"inputId\":0,\"templateId\":0,\"inputName\":\"height\",\"inputDescription\":\"When the Resize method is selected, this value will specify the height of the browser\",\"inputData\":\"\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"1024.0\",\"inputId\":0,\"templateId\":0,\"inputName\":\"width\",\"inputDescription\":\"When the Resize method is selected, this value will specify the width of the browser\",\"inputData\":\"\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":37,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Perform the {var:action} browser action\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "Method", 10, true, "URL", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "Exact Match", 4, true, "false", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "Identifier", 1, true, "demoqa.com", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "Case Sensitive", 4, true, "false", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Change_Window_v1", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":86,\"checkpointId\":1,\"alchemyId\":2111,\"alchemySeed\":26303,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"URL\",\"inputId\":0,\"templateId\":0,\"inputName\":\"Method\",\"inputDescription\":\"The method used to identify the window \",\"inputData\":\"Title,URL,Handle,Index\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"false\",\"inputId\":0,\"templateId\":0,\"inputName\":\"Exact Match\",\"inputDescription\":\"True indicates that we must match the entire Identifier.  False allows for a partial match\",\"inputData\":\"\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"demoqa.com\",\"inputId\":0,\"templateId\":0,\"inputName\":\"Identifier\",\"inputDescription\":\"The value used to find the window using the Method\",\"inputData\":\"\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"false\",\"inputId\":0,\"templateId\":0,\"inputName\":\"Case Sensitive\",\"inputDescription\":\"True if the Identifier is must match case, false otherwise\",\"inputData\":\"\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":39,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":1,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Change to the window identified by {var:Identifier} using {var:Method}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "action", 10, true, "Resize", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "height", 2, true, "768.0", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "width", 2, true, "1024.0", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Browser_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":271,\"checkpointId\":1,\"alchemyId\":2112,\"alchemySeed\":26303,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Resize\",\"inputId\":0,\"templateId\":0,\"inputName\":\"action\",\"inputDescription\":\"The action to take on the browser\",\"inputData\":\"Back,Forward,Refresh,Resize,Maximize,Minimize,Full Screen,Close\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"768.0\",\"inputId\":0,\"templateId\":0,\"inputName\":\"height\",\"inputDescription\":\"When the Resize method is selected, this value will specify the height of the browser\",\"inputData\":\"\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"1024.0\",\"inputId\":0,\"templateId\":0,\"inputName\":\"width\",\"inputDescription\":\"When the Resize method is selected, this value will specify the width of the browser\",\"inputData\":\"\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":37,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Perform the {var:action} browser action\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "26303.1799", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":2115,\"alchemySeed\":26303,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"26303.1799\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "26303.2117", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":2130,\"alchemySeed\":26303,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"26303.2117\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      

      
      
      
      
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