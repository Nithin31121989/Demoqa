Selenium Automation with DemoQA

This project is a **Java Selenium WebDriver automation script** that interacts with various elements on [DemoQA](https://demoqa.com/).  
It demonstrates handling of text boxes, checkboxes, radio buttons, web tables, buttons, links, broken links, file upload/download, and more.

---

## 🚀 Features Covered
- **Browser Setup**
  - Launches Firefox using `geckodriver`.
  - Maximizes the browser window.

- **Elements Interaction**
  - Text Box: Fills in name, email, current & permanent address.
  - Check Box: Selects the "Home" checkbox.
  - Radio Button: Selects "Yes".

- **Web Tables**
  - Adds a new record with first name, last name, age, email, salary, and department.

- **Buttons**
  - Performs **double click**, **right click**, and **single click** actions using `Actions` class.

- **Links**
  - Opens simple links and dynamic links in new tabs/windows.
  - Handles navigation and switching between windows.
  - Clicks on response code links (Created, No Content, Moved, Bad Request, Unauthorized, Forbidden, Invalid URL).

- **Broken Links & Images**
  - Tests working and broken links.

- **Upload & Download**
  - Downloads a sample file.
  - Uploads a file from local system.

---

## 🛠️ Technologies Used
- **Java** (JDK 8+)
- **Selenium WebDriver**
- **GeckoDriver** (for Firefox)
- **Eclipse IDE** (Maven project)

---

## ⚙️ Setup & Usage
1. Install [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Install [Eclipse IDE](https://www.eclipse.org/downloads/).
3. Install [Maven](https://maven.apache.org/).
4. Add [GeckoDriver](https://github.com/mozilla/geckodriver/releases) to your system path or update the script with the correct path.