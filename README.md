# unsplash-automation-framework
This is automated testing framework for Unsplash application

## Getting started
### Prerequisites
Configuring local environment

* Java in latest version. Currently Java JDK 15 - https://www.oracle.com/java/technologies/javase-jdk15-downloads.html
* Maven - https://maven.apache.org/download.cgi?Preferred=ftp://ftp.osuosl.org/pub/apache/
* Allure CLI - https://docs.qameta.io/allure/#_get_started (For windows https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/)
* Sourcetree as a Git client (can be anything else) - https://www.sourcetreeapp.com/ 
* Intellij Community as IDE (can be anything else) - https://www.jetbrains.com/idea/download/#section=windows

### Installing and Validation installing
* Windows environment variables:
* Environment variables validation:
```
#java -version
C:\Users\Dung Pham>java -version
java version "15.0.1" 2020-10-20
Java(TM) SE Runtime Environment (build 15.0.1+9-18)
Java HotSpot(TM) 64-Bit Server VM (build 15.0.1+9-18, mixed mode, sharing)
```
```
#echo %JAVA_HOME%
C:\Users\Dung Pham>echo %JAVA_HOME%
C:\Program Files\Java\jdk-15.0.1
```
```
maven -version
```
```
allure --version
```
## Running the test
There two ways to start tests.
* First is to use TestNG files like this
* Second way is to use maven

 Executing test under development.
 * Add tag @Development above scenario you want to execute, No need to add new runners. Just use 
 ```
-Dcucumber.filter.tags="@TAG_NAME"
```
  in terminal.
                                                            