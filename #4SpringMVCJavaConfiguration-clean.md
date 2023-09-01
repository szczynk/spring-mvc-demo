# Spring MVC Java Configuration

## Spring MVC Example using Java Based Configuration

- Topic: Spring MVC Example using Java Based Configuration

1. Spring MVC Application Setup:
    - Spring MVC can be configured using XML, annotations, or Java-based configuration.
    - The speaker discusses Java-based configuration in this video.
    - Spring Tool Suite (STS) is used for the demonstration.
2. Project Creation:
    - A Maven project is created in STS.
    - The project is named "Spring MVC Java" for Java-based configuration.
3. Tomcat Configuration:
    - Tomcat is linked to the project in STS for deployment.
4. Creating Simple Application:
    - A simple application to add two numbers is demonstrated.
    - A form with two text fields (T1 and T2) and a submit button is added to the index page.
    - The goal is to handle the form submission and display the result.
5. Creating a Controller:
    - A new class "AddController" is created to handle the form submission.
    - The @Controller annotation is used to mark the class as a Spring MVC controller.
    - The @RequestMapping annotation is used to map the request URL to a method in the controller.
    - The method receives the values from the form fields as parameters and returns the view name.
6. Maven Dependency Configuration:
    - The Spring MVC dependency (version 4.3.12) is added to the project's Maven configuration.
7. Creating Result View:
    - A JSP page named "result.jsp" is created to display the result.
    - The result value is displayed dynamically using Expression Language (EL).
8. Java Configuration for Dispatcher Servlet:
    - A configuration class "MyFrontController" is created to replace the "web.xml" configuration.
    - The class extends AbstractAnnotationConfigDispatcherServletInitializer and overrides required methods.
    - The getServletMappings method returns the mappings for the dispatcher servlet.
9. Java Configuration for Component Scanning:
    - A configuration class "MvcConfig" is created to replace the XML configuration for component scanning.
    - The @EnableWebMvc annotation enables Spring MVC configuration.
    - The @ComponentScan annotation specifies the base package for component scanning.
10. Web Application Initialization:
     - The configuration classes are registered with the front controller using getRootConfigClasses and getServletConfigClasses methods.
11. Running the Application:
     - The application is run on the Tomcat server.
     - The user can input two numbers, submit the form, and see the result displayed on the "result.jsp" page.
12. Notes on EL (Expression Language):
     - Expression Language (EL) is used to dynamically display values in JSP pages.
     - By default, EL might be ignored in a Maven project, so it needs to be enabled.
13. Recap:
     - The demonstration covers setting up a Spring MVC application using Java-based configuration.
     - Controllers, views, dispatcher servlet, and component scanning are configured using Java classes instead of XML.
14. Future Plans:
     - The speaker mentions plans for a future video demonstrating a Spring MVC application with Hibernate and Java-based configuration.
