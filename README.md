# rest-api-template-spring-boot
Do not start from scratch darling :) 

[WIP] Until now i have added :
 - Simple contoller with two methods.
 - Swagger 2 configuration.
 - Jib plugin for automatic docker image build :
     ``` mvn clean install -Pdocker
     list images : docker images
     run image : docker run -p 8090:8090 nom-image
     test it : localhost:8090/swagger-ui.html ```
 - Next ? ...
