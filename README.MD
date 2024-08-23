# INTRODUCTION  
This application mocks a simple yard application containing information trailers.  
# HOW TO RUN
To run this application you must have docker started.  
In the terminal run 
```docker-compose up -d```.  
This will containerize the application.

# HOW TO USE HTTP METHODS
There are two methods implemented in the app ->  
[localhost:8080/get](http://localhost:8080/get)  
[localhost:8080/add](http://localhost:8080/add)
## Health Check
You can also run a health check ->  
[localhost:8080/health](http://localhost:8080/health)   
This uses swagger to document the APIs