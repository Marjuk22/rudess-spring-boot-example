# Rudess-spring-boot-example
Basic spring application exampling crud operations

# Description

Basic spring boot application for handling the specified data structure  with basic functionalities like basic CRUD features, manipulating the data from the specified data structure, custom exception management, documentation of the available APIs with swagger 3, basic unit testing.

This demo application is made to handle a particular json format using spring boot rest APIs
This application follows basic spring framework mvc containing controller classes, service classes and repository management


# Payload Json
{
  "activities": [
    {
      "activeDuration": 1536000,
      "activityLevel": [
        {
          "minutes": 3,
          "name": "sedentary"
        },
        {
          "minutes": 9,
          "name": "lightly"
        },
        {
          "minutes": 2,
          "name": "fairly"
        },
        {
          "minutes": 11,
          "name": "very"
        }
      ],
      "activityName": "Walk",
      "activityTypeId": 90013,
      "calories": 204,
      "duration": 1536000,
      "elevationGain": 0,
      "lastModified": "2019-01-04T19:31:15.000Z",
      "logId": 19018673358,
      "logType": "auto_detected",
      "steps": 1799
    }
  ]
}

*This implementation handles the exact payload

#Added swagger 3.0 for api documentation
Api documentation can be found at
http://localhost:9191/swagger-ui.html

# Database 
As there are multiple levels for the 'Activity' Entity, i implemented Activity table joining with activity levels tables to parse and store the payload Json

# Exception handling
Implemented custom exception handling for backend api errors

# Github share

# AWS deployment in progress




