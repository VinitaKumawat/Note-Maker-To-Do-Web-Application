# 📝 Note Maker & To-Do Web Application

## 📌 Introduction  
This repository outlines the testing strategy for the **Note Maker & To-Do** web application. The app enables users to create and edit notes, manage to-do lists, securely authenticate, and ensure real-time data synchronization. The aim is to validate that the application meets functional, usability, and compatibility standards across various devices.

## 🎯 Objectives
- ✅ Validate critical workflows: note creation, to-do management, and user login/authentication.
- ✅ Ensure data synchronization and responsive UI across desktop, tablet, and mobile.
- ✅ Identify and log a minimum of 15 high-priority bugs.
- ✅ Suggest improvements for usability and maintainability.

## 📦 Scope

### In-Scope
- Functional testing for:
  - Note creation/editing
  - To-do operations (add/update/delete)
  - Authentication flows
- UI/UX testing on multiple devices (desktop, tablet, mobile)
- Automation of major workflows using Selenium

### Out of Scope
- Backend/database performance testing
- Localization and multi-language support

## ✅ Testable Features
- 📝 Note Creation & Editing  
- ✅ To-Do List Management (Add, Update, Delete)  
- 🔐 User Authentication & Authorization  
- 🔄 Real-Time Data Synchronization  
- 📱 Responsive Design across devices  

## 🧪 Testing Approach

### Manual Testing
- Functional, UI, usability, and cross-device testing.

### Automation Testing
- Framework: Selenium with Page Object Model (POM)
- Automated flows:
  - Login & Authentication
  - Note Creation
  - To-Do Add & Update
  - Synchronization Verification
- Use TestNG for assertions and structured reporting.
- Detailed bug reports with steps, logs, and screenshots.

## 👩‍💻 Roles and Responsibilities

**QA Engineer Responsibilities:**
- Design and execute manual test cases
- Develop and maintain Selenium scripts
- Log and categorize bugs
- Participate in bug triage meetings
- Propose usability and UI/UX improvements

## 🗓️ Test Schedule

| Task                      | Duration      |
|---------------------------|---------------|
| Requirement Analysis      | 1 Day         |
| Test Planning             | 1 Day         |
| Manual Test Execution     | 2 Days        |
| Automation Scripting      | 2 Days        |
| Bug Reporting & Review    | Ongoing       |
| Final Report Submission   | 1 Day         |

## 📄 Test Deliverables
- ✅ Test Plan Document  
- ✅ Test Scenarios & Test Cases  
- ✅ Selenium Automation Scripts  
- ✅ Bug Reports  
- ✅ Final Summary Report with Metrics  

## ✅ Entry and Exit Criteria

### Entry Criteria
- Stable application version available
- Access credentials (if required)
- Defined test requirements and key flows

### Exit Criteria
- All planned test cases executed
- Critical bugs resolved and verified
- Final test report submitted

## 🛠️ Tools Used
- **Selenium WebDriver** - UI Automation  
- **TestNG** - Assertions & Test Reporting  
- **Google Sheets/Docs** - Documentation  

## ⚠️ Risks and Mitigation

| Risk                             | Mitigation Strategy                                   |
|----------------------------------|--------------------------------------------------------|
| Ambiguous requirements           | Maintain ongoing communication with dev team          |
| UI inconsistencies across devices| Perform responsive testing across various screen sizes|
| Limited testing time             | Prioritize critical flows & automate major tasks      |

## ✅ Approvals
This test plan has been reviewed and approved by:

**👩‍💼 Pooja Ma’am** - Head 
