# Spring MVC Deployment Guide

## Spring MVC and Mysql on Openshift part 1

Important Notes from the Video Transcript:

- Speaker: Navin Reddy from Thediscore Learnings
- Topic: Creating a Spring MVC application with Maven and deploying it on OpenShift

Key Steps:

1. Prerequisites:
    - Familiarity with Spring MVC basics and Maven.
    - An account on OpenShift server.
2. Creating OpenShift Account:
    - Sign up for a free OpenShift account.
    - Alternative options for web servers include Amazon Web Services and Google App Engine.
3. Accessing OpenShift Web Console:
    - Log into your OpenShift account via the web console.
4. Creating OpenShift Application:
    - Click "Add Application."
    - Choose server type (e.g., JBoss).
    - Provide an application name (e.g., "login") and create the application.
5. Importing Project into Eclipse:
    - Install OpenShift plugin from Eclipse marketplace.
    - Import the project: Right-click, select "Import," choose "OpenShift," and follow instructions.
    - Generate an SSH key for the project.
6. Fetching Project from Server:
    - Configure SSH2 preferences with generated key.
    - Use the key to fetch the project from the OpenShift server.
7. Working with Maven Project:
    - The project is a Maven project.
    - Modify the pom.xml file to include necessary dependencies.
    - Add dependencies for JBoss and Spring.
8. Setting Up Web Files:
    - Inside the "src" folder, create a "main" subfolder.
    - In the "webapp" folder, create or modify "index.html" to create a form.
9. Setting Up Servlet and Spring Configuration:
    - Modify "web.xml" to map requests to the DispatcherServlet.
    - Create "login-servlet.xml" Spring configuration file for the DispatcherServlet.
10. Creating Controller:
     - Create a new Java class named "LoginController" in the "com.login" package.
     - Annotate the class with @Controller.
     - Define a method (e.g., checkUser) annotated with @RequestMapping to handle requests.
     - Use the method parameters (HttpServletRequest and HttpServletResponse) to handle user data.

Note: The transcript seems to describe the process step by step, but the context is limited to the content provided in the transcript. The accuracy of the technical details cannot be guaranteed without direct access to the video content. It's advisable to cross-reference the instructions with official documentation when working with technical tools like Spring MVC, Maven, and OpenShift.

## Spring MVC and Mysql on Openshift part 2

Important Notes from the Video Transcript:

1. Verification and Testing Locally:
    - Using static values for verification.
    - Running the code locally with Tomcat.
    - Username: "abc", Password: "123" for successful login.
    - Using "index.jsp" instead of "index.html".
2. Connecting to Database on OpenShift:
    - Creating a database on OpenShift using MySQL cartridge.
    - Accessing phpMyAdmin for database management.
    - Obtaining database URL, username, and password.
3. Setting Up Database Connection:
    - Using JDBC to connect to the database.
    - Constructing connection URL with IP address, database name, username, and password.
    - Preparing and executing a SELECT query using prepared statements.
    - Handling exceptions and print statements for debugging.
4. Database Interaction and Verification:
    - Using the "login-service" class to verify user credentials with the database.
    - Handling ResultSet to check if the login data is valid.
    - Returning a boolean value for successful or unsuccessful login attempts.
5. Pushing Changes to OpenShift Server:
    - Committing and pushing changes to the server using Git.
    - Updating files and ensuring synchronization with the server.
    - Verifying changes on the OpenShift server by accessing the deployed web application.
6. Additional Notes:
    - Mention of Spring JDBC and dependency injection features in Spring.
    - Main focus on connecting Spring MVC with MySQL on OpenShift server.

Please note that the transcript is based on the provided content, and the technical details mentioned are context-specific to the content of the video.
