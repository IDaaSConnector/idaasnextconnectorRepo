# iDaaSNext Provisioned Asset Connector Framework

### Requirements
---
1. Java JDK 1.8+
2. Maven 3.x

### Java Setup
---
1. Download and install Java SDK 1.8+ from Oracle website
2. Setup necessary environment variables
    1. __JAVA_HOME__ - Refers to the JDK home folder
    2. __JRE_HOME__ - Refers to the JRE home folder
    3. Add to __PATH__ as needed
3. Test __javac__ and __java__ running fine from a terminal

### Maven Setup
---
1. Download Maven 3.x from Maven Apache website. The zip version will do.
2. Extract and place the maven folder at a suitable location.
3. Setup necessary environment variables
    1. __M2_HOME__ - Refers to the Maven home folder
    2. __M2__ - Refers to the bin sub-folder inside Maven home folder
    3. Add __M2__ to __PATH__ variable as well
4. Run _mvn --version_ from a terminal to validate correct setup of Maven

### Project Import into IDE
---
1. For eclipse:
    * Start eclipse
    * Click File > Import
    * In the pop window that appears, chose Existing Maven Projects
    * Follow the onscreen steps to complete the import
2. For IntelliJ:
    * Start IntelliJ
    * Select File > New > Project from Existing Resources
    * Follow the onscreen steps to complete the import

## Build Process
1. Ensure all the previous steps are successful
2. Fire up a terminal and navigate to the project root folder
3. The first run for maven will be slower, as it has to download all the
necessary dependecies and place them in __.m2__ folder of each users
home directory. Sub-sequent builds are faster as it'll avoid re-download
of dependencies unless there is some change noted.
4. Any new dependencies can be added into the __pom.xml__ file after
looking up the dependency artifact from maven central repository
5. Run the following commands as needed
    1. __mvn clean package__ - This will clean & package the jar for you.
6. There will be two jars generated in the target folder:
    1. One jar will be a fat jar which contains the java classes and the libs which are dependencies. This is referenced
    by the suffix __shaded__ at the end of the jar name.
    2. The other jar will contain only the java class files. Library dependencies will not be packaged.

### Additional Notes
---
1. .gitignore file has been placed at the root of the project, to ensure unnecessary files are never staged and committed into the git repository. Please do not
edit it unless you know what you are doing.
2. Github will automatically show the markdown output of this file. For local purposes, setup a markdown plugin for eclipse. Intellij comes with a default plugin
3. Install maven plugin for Eclipse if you don't already have it. Intellij has it installed by default.



"# idaasnextconnectorRepo" 
