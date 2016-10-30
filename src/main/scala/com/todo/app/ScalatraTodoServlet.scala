package com.todo.app

import org.scalatra._

//JSON related libraries
import org.json4s.{DefaultFormats, Formats}

//JSON handling support from Scalatra
import org.scalatra.json._

class ScalatraTodoServlet extends Scalatra_todoStack with JacksonJsonSupport {

  // Sets up automatic case class to JSON output serialization, required by
  // the JValueResult trait.
  protected implicit lazy val jsonFormats: Formats = DefaultFormats

  // Before every action runs, set the content type to be in JSON format
  before() {
  	println(" ====> Content-Type set to Json <===== ")
  	contentType = formats("json")
  }

  var todoJobsModel = new TodoJobsModel() 

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }


   get("/todos") {
      todoJobsModel.map
   }

   get("/todo/:Id") {
    var IdInt = Integer.parseInt(params("Id"))
        println("GET - TodoJobs Id - arg. passed :: " + IdInt)
    todoJobsModel.get(IdInt)
   }

   post("/todo/create") {
    var todoj = parsedBody.extract[TodoJobs]
    todoJobsModel.add(todoj)
   }

   delete("/todo/:Id") {
    var IdInt = Integer.parseInt(params("Id"))
        println("DELETE - TodoJobs Id - arg. passed :: " + IdInt)
      todoJobsModel.remove(IdInt)
      todoJobsModel.map
   }

   put("/todo/status/:Id") {
      var IdInt = Integer.parseInt(params("Id"))
      val status = (parse(request.body) \ "status").extract[String]
      var c:TodoJobs = todoJobsModel.get(IdInt)
          c.status = status
      todoJobsModel.update(IdInt,c)
      todoJobsModel.get(IdInt)
   }

   put("/todo/update/:Id") {
      var IdInt = Integer.parseInt(params("Id"))
      var todoj = parsedBody.extract[TodoJobs]
       var c:TodoJobs = todoJobsModel.get(IdInt)
           c.status = todoj.status
           c.subject = todoj.subject
           c.content = todoj.content
      todoJobsModel.update(IdInt,c)
      todoJobsModel.get(IdInt)
   }

}
