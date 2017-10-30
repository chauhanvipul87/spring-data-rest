# spring-boot-spring-data-rest with H2 database

I have created sample project in Spring Data Rest with MYSQL. 

<h3>Adding Spring Data REST to a Maven project</h3>
To add Spring Data REST to a Maven-based project, add the spring-data-rest-webmvc artifact to your
compile-time dependencies:

<dependency>
<groupId>org.springframework.data</groupId>
<artifactId>spring-data-rest-webmvc</artifactId>
<version>3.0.1.RELEASE</version>
</dependency>



<h3> What is HA Browser & what is the use of it?</h3>

The developer of the HAL spec has a useful application: the HAL Browser. It’s a web app that stirs
in a little HAL-powered JavaScript. You can point it at any Spring Data REST API and use it to
navigate the app and create new resources.

Instead of pulling down the files, embedding them in your application, and crafting a Spring MVC
controller to serve them up, If you would like to add HAL Browser supprt then all you need to do is add a single dependency.

<h3>In Maven: </h3>

<dependency>
<groupId>org.springframework.data</groupId>
<artifactId>spring-data-rest-hal-browser</artifactId>
</dependency>


I have used HA Browser in my project. If you above dependency in your project then no need to add spring-data-rest-webmvc dependency because it was already included in spring-data-rest-hal-browser.

This dependency will autoconfigure the HAL Browser to be served up when you visit your
application’s root URI in a browser. (NOTE: http://localhost:8080 was plugged into the browser & displayed as below.)




