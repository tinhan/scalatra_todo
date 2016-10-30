package com.todo.app

import scala.collection._

class TodoJobsModel {

	println("TodoJobsModel - Constructor BEGIN... ")

        var map:Map[Int, TodoJobs] = Map()

	init()

	def init() {
		this.add("Test Todo", "This application make by tin hanchanachai for test.", "done")
	}

        def add(subject:String, content:String, status:String):Int = {
		println("TodoJobsModel - ADD - Invoked")
                var c:TodoJobs = new TodoJobs(subject, content, status)
		println("New TodoJobs created. Id - " + c.id)
                map += (c.id -> c)
                c.id
        }
	
		def add(c:TodoJobs):TodoJobs = {
			map += (c.id -> c)
			c
		}

        def get(id:Int):TodoJobs = {
                map(id)
        }

        def remove(id:Int) = {
                map = map - id
        }

        def update(id:Int, c:TodoJobs) {
                map += (id -> c)
        }

        override def toString = s"Map :: ${map}"

	println("TodoJobsModel - Constructor END....")
}