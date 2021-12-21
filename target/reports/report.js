$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/ForgotPassword.feature");
formatter.feature({
  "name": "Validate the forgot password functionality of SnuggleBugz",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "Validate the forgot password with invalid email address",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch chrome browser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "SnuggleForgotPassword.user_should_launch_chrome_browser_and_load_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move the cursor into page header and click",
  "keyword": "When "
});
formatter.match({
  "location": "SnuggleBugzLogin.move_the_cursor_into_page_header_and_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move the cursor into my account click",
  "keyword": "And "
});
formatter.match({
  "location": "SnuggleBugzLogin.move_the_cursor_into_my_account_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the forgot passwod link",
  "keyword": "And "
});
formatter.match({
  "location": "SnuggleForgotPassword.user_should_click_the_forgot_passwod_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should type the invalid email Address",
  "rows": [
    {
      "cells": [
        "ramesh",
        "gandhi",
        "marvin"
      ]
    },
    {
      "cells": [
        "123456",
        "088777",
        "777789"
      ]
    },
    {
      "cells": [
        "677655",
        "789976",
        "007877"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SnuggleForgotPassword.user_should_type_the_invalid_email_Address(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the send button",
  "keyword": "And "
});
formatter.match({
  "location": "SnuggleForgotPassword.user_should_click_the_send_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to forgot password page",
  "keyword": "Then "
});
formatter.match({
  "location": "SnuggleForgotPassword.user_should_navigate_to_forgot_password_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/SnuggleBugz.feature");
formatter.feature({
  "name": "To validate the login functionality of SnuggleBugz",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the login page with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "You should launch the browser and load SnuggleBugz Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SnuggleBugzLogin.you_should_launch_the_browser_and_load_SnuggleBugz_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move the cursor into page header and click",
  "keyword": "When "
});
formatter.match({
  "location": "SnuggleBugzLogin.move_the_cursor_into_page_header_and_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move the cursor into my account click",
  "keyword": "And "
});
formatter.match({
  "location": "SnuggleBugzLogin.move_the_cursor_into_my_account_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should type username in the SnuggleBugz",
  "keyword": "And "
});
formatter.match({
  "location": "SnuggleBugzLogin.user_should_type_username_in_the_SnuggleBugz()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should type password in the SnuggleBugz",
  "keyword": "And "
});
formatter.match({
  "location": "SnuggleBugzLogin.user_should_type_password_in_the_SnuggleBugz()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click login button",
  "keyword": "And "
});
formatter.match({
  "location": "SnuggleBugzLogin.user_should_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to print the title of my page",
  "keyword": "And "
});
formatter.match({
  "location": "SnuggleBugzLogin.i_need_to_print_the_title_of_my_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should naviagte to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "SnuggleBugzLogin.user_should_naviagte_to_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate the login page with valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "You should launch the browser and load SnuggleBugz Page",
  "keyword": "Given "
});
formatter.step({
  "name": "Move the cursor into page header and click",
  "keyword": "When "
});
formatter.step({
  "name": "Move the cursor into my account click",
  "keyword": "And "
});
formatter.step({
  "name": "User should type the valid username \"\u003cuser\u003e\" in the snuggle page",
  "keyword": "And "
});
formatter.step({
  "name": "I need to print the current url of page",
  "keyword": "And "
});
formatter.step({
  "name": "user should type the invalid password in the snuggle page \"\u003cpass\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "",
        "pass"
      ]
    },
    {
      "cells": [
        "java",
        "",
        "java@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the login page with valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "You should launch the browser and load SnuggleBugz Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SnuggleBugzLogin.you_should_launch_the_browser_and_load_SnuggleBugz_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move the cursor into page header and click",
  "keyword": "When "
});
formatter.match({
  "location": "SnuggleBugzLogin.move_the_cursor_into_page_header_and_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Move the cursor into my account click",
  "keyword": "And "
});
formatter.match({
  "location": "SnuggleBugzLogin.move_the_cursor_into_my_account_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should type the valid username \"java\" in the snuggle page",
  "keyword": "And "
});
formatter.match({
  "location": "SnuggleBugzLogin.user_should_type_the_valid_username_in_the_snuggle_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I need to print the current url of page",
  "keyword": "And "
});
formatter.match({
  "location": "SnuggleBugzLogin.i_need_to_print_the_current_url_of_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should type the invalid password in the snuggle page \"java@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "SnuggleBugzLogin.user_should_type_the_invalid_password_in_the_snuggle_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "SnuggleBugzLogin.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "SnuggleBugzLogin.user_should_navigate_to_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});