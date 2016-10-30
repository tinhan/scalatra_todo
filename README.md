# scalatra_todo
   This project create by scala and scalatra framwork, you can clone and funny with it.
   
 
 ## Pre-requisites
    - Install Java  project used version 1.8.0_101 
    - Install scala project used version 2.11.8 
    - Installing Scalatra <a href="http://www.scalatra.org/getting-started/installation.html">click</a>
    - Install build Tool Download <a href="http://www.scala-sbt.org/index.html">click</a> 
    
 ## Build and Run
    - Clone a repository
    
    Localhost run :
    go to <Project path> run command
     ./sbt
     > jetty:start
    go to Browser access by http://localhost:8080/
    
    Production Build :
    go to <Project path> run command
    ./sbt package
    find .war file in target/scala-x.xx/scalatra_todo_x.xx-x.x.war
    Deploy on tomcat or other web server application.
    
 
