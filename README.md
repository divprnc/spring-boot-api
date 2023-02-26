<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Microservices Architecture with Spring Boot</title>
</head>
<body>
    <h1>Microservices Architecture with Spring Boot, Eureka Server, Config Server, and API Gateway</h1>
less
Copy code
<p>This is a sample microservices architecture project built with Spring Boot, Eureka Server, Config Server, and API Gateway. The project contains three microservices: employee-service, organisation-service, and department-service, each registered with the Eureka Server, and a Config Server that gets its configuration from Git. The API Gateway acts as a single entry point for all the microservices, providing load balancing and circuit breaker implementations.</p>

<h2>Components and Libraries Used</h2>

<p>The project uses the following components and libraries:</p>

<ul>
    <li>Spring Boot: 2.6.3</li>
    <li>Eureka Server</li>
    <li>Config Server</li>
    <li>API Gateway</li>
    <li>Spring Cloud Netflix</li>
    <li>Spring Cloud Config</li>
    <li>Spring Cloud Gateway</li>
    <li>MySQL Connector</li>
    <li>Model Mapper</li>
</ul>

<h2>Microservices Endpoints</h2>

<h3>Department Service</h3>

<ul>
    <li>POST /api/departments: Creates a new department.</li>
    <li>GET /api/departments/{departmentCode}: Retrieves a department by department code.</li>
</ul>

<h3>Employee Service</h3>

<ul>
    <li>POST /api/employees: Creates a new employee.</li>
    <li>GET /api/employees/{employeeId}: Retrieves an employee by employee ID.</li>
</ul>

<h3>Organisation Service</h3>

<ul>
    <li>POST /api/organisations: Creates a new organisation.</li>
    <li>GET /api/organisations/{organisationCode}: Retrieves an organisation by organisation code.</li>
</ul>

<h2>Running the Project</h2>

<p>To run the project, follow these steps:</p>

<ol>
    <li>Clone the repository.</li>
    <li>Start the Eureka Server.</li>
    <li>Start the Config Server.</li>
    <li>Start the API Gateway.</li>
    <li>Start the Department Service.</li>
    <li>Start the Employee Service.</li>
    <li>Start the Organisation Service.</li>
</ol>

<h2>Conclusion</h2>

<p>This project demonstrates how to build a microservices architecture with Spring Boot, Eureka Server, Config Server, and API Gateway. The sample microservices provide basic functionality for creating and retrieving employees, organisations, and departments. The project can be extended and customized to fit specific business requirements.</p>
</body>
</html>
