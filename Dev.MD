
### 1. Pre-requisites
 The readers are expected to know the following pre-requisites for this Scala-REST example.
 1. Hands on Java Programming
 2. Hands on Scala Programming – Basics
 3. Hands on Java Web (Servlet) Programming – At least for the basic HTTP Methods (Get/Post and the Routing)
 4. Exposure to REST Style / Architecture – We will cover the minimal introduction in this article JSON data format
 

### 2. Environment
  The examples in this article are executed in the Command Prompt / Shell with the Scalatra with the REST Client(Postman) – an Add-on for Chrome browser. But they are guaranteed to work with any of the IDEs having a proper support for Scala, Scalatra and REST (like Eclipse – Scala IDE, IntelliJ IDEA etc.,) through the respective plugins. The examples are executed with the Scalatra Version 2.4.1 and Scala 2.11.8 in Mac OS.


### 3. Scalatra
  <a href="http://www.scalatra.org/">Scalatra</a> is a simple, accessible and free web micro-framework. It combines the power of the JVM with the beauty and brevity of Scala, helping you quickly build high-performance web sites and APIs.

####   3.1 Installing Scalatra
   Installing Scalatra is very simple. It requires Scala as a pre-requisite. You may have Java JDK installed in your machine prior to this installation.
As per this <a href="http://www.scalatra.org/getting-started/installation.html">URL</a>, this is a two step process. Installation of Scalatra depends on giter8 which is again depending upon Conscript which are simple utilities facilitating the installation of Scalatra from Github repositories at the latest branch. Post which we will use giter8 to install Scalatra-SBT which is a Simple Build Tool (SBT) for Scala that helps us to build any Scala application.

   OR 
   
 Downloaf an executable <a href="https://dl.bintray.com/foundweekends/maven-releases/org/foundweekends/conscript/conscript_2.11/0.5.0/conscript_2.11-0.5.0-proguard.jar">.jar</a> file.
 
 
#### 3.2 SBT (Scala Build Tool)
<a href="http://www.scala-sbt.org/index.html">SBT</a> stands for Simple Build Tool. It is an interactive build tool (like Ant, Maven etc.,) for Scala with the task definition (build.scala) file to determine the dependencies required for a project to be set up.

Now your laptop already to create new scalatra project.
