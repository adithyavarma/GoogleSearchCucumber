$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/admin/eclipse-workspace/GoogleSearch/src/main/java/com/google_search/features/search.feature");
formatter.feature({
  "line": 1,
  "name": "Browsing Google for testing",
  "description": "",
  "id": "browsing-google-for-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Google Web Browsing",
  "description": "",
  "id": "browsing-google-for-testing;google-web-browsing",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is in Google Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of page is Google",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on Im Feeling Lucky button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Title of page is Google Doodles",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Navigate back to the Google Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Enter data in the search text box",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on Google Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Title of page is entered search data",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_in_Google_Home_Page()"
});
formatter.result({
  "duration": 13072050558,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.title_of_page_is_Google()"
});
formatter.result({
  "duration": 67360495,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_Im_Feeling_Lucky_button()"
});
formatter.result({
  "duration": 5598046622,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.title_of_page_is_Google_Doodles()"
});
formatter.result({
  "duration": 16674368,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.navigate_back_to_the_Google_Home_Page()"
});
formatter.result({
  "duration": 9785130368,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.enter_data_in_the_search_text_box()"
});
formatter.result({
  "duration": 1233746745,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_Google_Search_button()"
});
formatter.result({
  "duration": 10430258046,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.title_of_page_is_entered_search_data()"
});
formatter.result({
  "duration": 17863019,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 1066893542,
  "status": "passed"
});
});