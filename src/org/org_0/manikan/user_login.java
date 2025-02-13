/**
  * @version 5
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
 
 public class user_login extends AbstractTestWrapper
 {
   Map<String,FunctionVariableWrapper> ingressSignature = new HashMap<>( 5 );;

   public user_login() {
     super(15025, "26434.7403", "User login", "Add a description of User login", 0, "", "".split(","), "{\"symphonyId\":0,\"id\":15025,\"name\":\"User login\",\"description\":\"Add a description of User login\",\"userId\":362,\"userConfidence\":0,\"organizationId\":0,\"organizationConfidence\":0,\"status\":1,\"reviewFlag\":0,\"createDate\":\"Jan 26, 2025, 2:24:53 PM\",\"modifyDate\":\"Jan 26, 2025, 5:07:22 PM\",\"version\":5,\"lockUserId\":0,\"level\":1,\"pre\":\"\",\"post\":\"\",\"deviceTagNames\":\"\",\"changeCount\":0,\"uniqueContributors\":0,\"stepCount\":0,\"testUserConfidence\":0.0,\"errorHandler\":\"\",\"classificationId\":0,\"synchronizationId\":0,\"storageVersion\":2,\"alchemyId\":7403,\"alchemySeed\":26434,\"referenceSuiteID\":0,\"signature\":\"null\",\"acls\":[],\"changed\":false}");
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
    String testName = "user_login";

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
      eventList.add( aM.executeAction( "Navigate_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":82,\"checkpointId\":1,\"alchemyId\":7406,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"https://practicetestautomation.com/practice-test-login/\",\"inputId\":7,\"templateId\":0,\"inputName\":\"url\",\"inputDescription\":\"The Application Locator\",\"inputData\":\"null\",\"inputTypeId\":15,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"30000\",\"inputId\":7,\"templateId\":0,\"inputName\":\"timeout\",\"inputDescription\":\"The time in milliseconds to wait for a page to load\",\"inputData\":\"null\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":5,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Navigate to {var:url}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "action", 10, true, "Maximize", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "height", 2, true, "0", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "width", 2, true, "0", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Browser_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":271,\"checkpointId\":1,\"alchemyId\":7450,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Maximize\",\"inputId\":0,\"templateId\":0,\"inputName\":\"action\",\"inputDescription\":\"The action to take on the browser\",\"inputData\":\"Back,Forward,Refresh,Resize,Maximize,Minimize,Full Screen,Close\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"0\",\"inputId\":0,\"templateId\":0,\"inputName\":\"height\",\"inputDescription\":\"When the Resize method is selected, this value will specify the height of the browser\",\"inputData\":\"\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"0\",\"inputId\":0,\"templateId\":0,\"inputName\":\"width\",\"inputDescription\":\"When the Resize method is selected, this value will specify the width of the browser\",\"inputData\":\"\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":37,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Perform the {var:action} browser action\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "26434.7411", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":7436,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"26434.7411\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "value", 1, true, "", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "clearFirst", 4, true, "true", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "targetLocator", 5, true, "26434.7411", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Type_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":85,\"checkpointId\":1,\"alchemyId\":7437,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"\",\"inputId\":31,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The text to type\",\"inputData\":\"null\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"true\",\"inputId\":32,\"templateId\":0,\"inputName\":\"clearFirst\",\"inputDescription\":\"A flag indicating if the value should first be cleared\",\"inputData\":\"null\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"26434.7411\",\"inputId\":33,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The element that will receive the text\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":17,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Type {var:value} into {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "functionName", 6, true, "26303.3048", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "callStyle", 10, true, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Call_v5", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":272,\"checkpointId\":1,\"alchemyId\":7806,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"26303.3048\",\"inputId\":46,\"templateId\":0,\"inputName\":\"functionName\",\"inputDescription\":\"The name of the function to call\",\"inputData\":\"null\",\"inputTypeId\":6,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":47,\"templateId\":0,\"inputName\":\"callStyle\",\"inputDescription\":\"Defines how the function is reported\",\"inputData\":\"Default,Private Function,Error Handler\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":6,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":5,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Call the function {var:functionName}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "26434.7452", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":7477,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"26434.7452\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "value", 1, true, "Password123", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "clearFirst", 4, true, "true", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "targetLocator", 5, true, "26434.7452", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Type_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":85,\"checkpointId\":1,\"alchemyId\":7478,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Password123\",\"inputId\":31,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The text to type\",\"inputData\":\"null\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"true\",\"inputId\":32,\"templateId\":0,\"inputName\":\"clearFirst\",\"inputDescription\":\"A flag indicating if the value should first be cleared\",\"inputData\":\"null\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"26434.7452\",\"inputId\":33,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The element that will receive the text\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":17,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Type {var:value} into {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "26434.7439", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":7499,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"26434.7439\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "26434.7411", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":7778,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"26434.7411\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "name", 1, true, "", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Clear_Variable_v1", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":12,\"checkpointId\":1,\"alchemyId\":7779,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"\",\"inputId\":33,\"templateId\":0,\"inputName\":\"name\",\"inputDescription\":\"\\u003cp\\u003eThe name of the variable you want to clear.\\u0026nbsp;\\u003c/p\\u003e\\n\\u003cp\\u003e\\u003cstrong\\u003eNote: Do not drag the variable from the Test Context section. \\u0026nbsp;Doing so will replace the \\u003c/strong\\u003e\\u003ci\\u003e\\u003cstrong\\u003ename \\u003c/strong\\u003e\\u003c/i\\u003e\\u003cstrong\\u003ewith the \\u003c/strong\\u003e\\u003ci\\u003e\\u003cstrong\\u003evalue \\u003c/strong\\u003e\\u003c/i\\u003e\\u003cstrong\\u003eleading to incorrect results.\\u003c/strong\\u003e\\u003c/p\\u003e\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":14,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":1,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Clear the value of the context variable {var:name}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "26434.7701", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":7800,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"26434.7701\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "action", 10, true, "Resize", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "height", 2, true, "737.0", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "width", 2, true, "906.0", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Browser_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":271,\"checkpointId\":1,\"alchemyId\":7801,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Resize\",\"inputId\":0,\"templateId\":0,\"inputName\":\"action\",\"inputDescription\":\"The action to take on the browser\",\"inputData\":\"Back,Forward,Refresh,Resize,Maximize,Minimize,Full Screen,Close\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"737.0\",\"inputId\":0,\"templateId\":0,\"inputName\":\"height\",\"inputDescription\":\"When the Resize method is selected, this value will specify the height of the browser\",\"inputData\":\"\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"906.0\",\"inputId\":0,\"templateId\":0,\"inputName\":\"width\",\"inputDescription\":\"When the Resize method is selected, this value will specify the width of the browser\",\"inputData\":\"\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":37,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"Perform the {var:action} browser action\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "loopMode", 10, true, "Fixed Count", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "count", 2, false, "0", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "dataTable", 9, false, "", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "targetLocator", 5, false, "", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "functionName", 6, true, "", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "range", 1, false, "", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "list", 1, false, "", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Repeat_v4", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":273,\"checkpointId\":1,\"alchemyId\":7831,\"alchemySeed\":26434,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Fixed Count\",\"inputId\":38,\"templateId\":0,\"inputName\":\"loopMode\",\"inputDescription\":\"Controls what you are looping over\",\"inputData\":\"Fixed Count,Data,Page Elements,List\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"0\",\"inputId\":39,\"templateId\":0,\"inputName\":\"count\",\"inputDescription\":\"The amount of repetitions - Required for Fixed Count\",\"inputData\":\"null\",\"inputTypeId\":2,\"inputRequired\":0,\"status\":1,\"changed\":false},{\"value\":\"\",\"inputId\":40,\"templateId\":0,\"inputName\":\"dataTable\",\"inputDescription\":\"The data table that you want to select your row from\",\"inputData\":\"null\",\"inputTypeId\":9,\"inputRequired\":0,\"status\":1,\"changed\":false},{\"value\":\"\",\"inputId\":41,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"A locator referencing a list of elements - Required for Page Elements\",\"inputData\":\"null\",\"inputTypeId\":5,\"inputRequired\":0,\"status\":1,\"changed\":false},{\"value\":\"\",\"inputId\":42,\"templateId\":0,\"inputName\":\"functionName\",\"inputDescription\":\"The name of the function to call\",\"inputData\":\"null\",\"inputTypeId\":6,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"\",\"inputId\":0,\"templateId\":0,\"inputName\":\"range\",\"inputDescription\":\"An optional, zero-based, range to use when iterating over the data.  A range is specifed using a begin (inclusive) and end (exclusive) value seperated by a dash such as 2-4.  When specifying the end value, you may use * to go to the end of the list.  2-* will start at the 3rd record and go to the end of the list\",\"inputData\":\"\",\"inputTypeId\":1,\"inputRequired\":0,\"status\":1,\"changed\":false},{\"value\":\"\",\"inputId\":33,\"templateId\":0,\"inputName\":\"list\",\"inputDescription\":\"A comma seperated list of data to iterate over\",\"inputTypeId\":1,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":21,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":4,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"invertResult\":false,\"actionDisplay\":\"For {ifvar:loopMode\\u003dList;text: each item in }{ifvar:loopMode\\u003dList;var:list}{ifvar:loopMode\\u003dData;text: each record in }{ifvar:loopMode\\u003dData;var:dataTable}{ifvar:loopMode\\u003dPage Elements;text: each element found with } {ifvar:loopMode\\u003dPage Elements;var:targetLocator}{ifvar:loopMode\\u003dFixed Count;var:count}{ifvar:loopMode\\u003dFixed Count;text: Iterations } execute {var:functionName}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      

      
      
      
      
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