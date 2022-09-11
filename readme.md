# Java Maven Project - Selenium & Rest Assured
#### 1. Create a project in Intellij
while creating it may be just a java project.
Inorder to convert this to a maven project.
- Right-click on the project and click on the 'Add Framework Support'
- Select 'Maven' - so that project is converted into a Maven Project
- As soon as that's done a pom file will be created.
- In the pom file - provide the dependencies: 
These dependencies can be found in the 'Maven Repository' search
- Cucumber for Java and Cucumber testng

##### Basic Cucumber test
Skeleton of a cucumber test
1. Feature file -> contains test in Gherkin language, using given when then syntax
2. Logical/Programmatic implementation of the feature. generally called steps

it is preferred to keep the feature files in a separate **Resources** folder inside the test folder.

For creating a resources' folder - right-click on the 'test' folder and click on create directory - it will automatically show resources folder - accept that
under resources folder you can create a feature file

For creating a step definitions' folder - right-click on the 'java' folder and click on create package - and rename this package as 'Step Definitions'
you can create step definitions (java classes of steps) under this folder

For creating a runner file - right-click on the java folder and click on create package folder - and rename this package as 'Runner'
Create a java file names as 'Run.java'
create cucumber options method and run class extending from 'AbstractTestNGCucumberTests'

Add a plugin of 'Create TestNg XML'
Right-Click on the project and click on 'Create TestNG xml'
after this testng.xml will be created in the project
modify the xml little - and then right click on testng.xml 

````
Project
|-----src
|      |---main
       |---src
           |---java
           |       |---Page
           |       |   |---Actions
           |       |   |    |---GenericActions
           |       |   |    |---LoginActions
           |       |   |---Objects
           |       |   |    |---HomePage
           |       |   |    |---LoginPage
           |       |
           |       |---Runner
           |       |---StepDefinitions
           |       |
           |       |---Utility
           |       |    |---BrowserDriver
           |       |    |---Hooks
````

### Introduce Page object model, Step Definition in Glue & Utility folder

Add the features & step definition path in the glue
and add the annotations: @RunWith and @CucumberOptions

add the Utility folder which stores the hooks file and Browser driver file
hooks will be called with before and after annotations
browser file will be called for instantiating the driver 

Install 'Docker Desktop for Windows'.
and after installing - verify if the docker is installed
Command : docker --version

