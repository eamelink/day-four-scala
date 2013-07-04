Exercises Play
==============

Download Play and create initial application
--------------------------------------------

* Download the latest version of Play: http://www.playframework.com/download
* Follow the installation instructions: http://www.playframework.com/documentation/2.1.1/Installing
* Create an initial application: http://www.playframework.com/documentation/2.1.1/NewApplication

Run the application
-------------------

* Start your new application with the command `play run`
 
Verify that it works by browsing to http://localhost:9000

Setup Scala IDE
---------------

* Stop the application with Ctrl-D
* Run `play eclipse`
* Import the project with Scala IDe
* Now run it again, with `play run`

Change something
----------------

Edit the file `app/controllers.Application.scala`: change the "Your new application is ready." string to something else. Then verify that it works by refreshing http://localhost:9000

Assignment #1: Add a 'hello world' page
---------------------------------------

Add a new action method `helloWorld` that renders `Hello world!` (This can be done with the code `Ok("Hello world!")` in the action method. Also setup a new route, so that it works when you visit http://localhost:9000/hello

You can consult the Play documentation:
* http://www.playframework.com/documentation/2.1.1/ScalaActions
* http://www.playframework.com/documentation/2.1.1/ScalaRouting

Assignment #2: Make what's greeted a parameter
----------------------------------------------

Add a parameter `subject` of type `String` to the action method, and greet `subject` instead of "world". This parameter must also be added in the routes file. See the documentation for the details.

Assignment #3: Add a template
-----------------------------

The greeting can be made a bit nicer, with HTML instead of plain text. Add a template that renders the greeting in an `<h1>` tag. See the template engine details for more info:

* http://www.playframework.com/documentation/2.1.1/ScalaTemplates
