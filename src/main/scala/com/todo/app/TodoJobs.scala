
package com.todo.app

//JSON related libraries
import org.json4s.{DefaultFormats, Formats}

//JSON handling support from Scalatra
import org.scalatra.json._

// JSON library for converting the POJO toString as Json
import org.json4s.native.Json

class TodoJobs(val id:Int, var subject:String, var content:String, var status:String) {                                   
                                                                                              
        println("TodoJobs - Constructor  BEGIN .... ")

	def this(subject:String, content:String, status:String) {
		this(TodoJobs.inc, subject, content, status)
	}
                                                                                              
	override def toString = Json(DefaultFormats).write(this) 

	println("TodoJobs - Constructor END .... ")
}                                                                                             
                                                                                              
object TodoJobs {                                                                             
	private var id = 0                                                                    
                                                                                              
        private def inc = {   
	       println(" ****** Inc method called, id = " + id)
       	        id += 1;                                                                      
               	id                                                                            
        }                                                                                     
}  