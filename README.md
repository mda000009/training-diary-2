# training-diary-2

## Description
The goal of this REST API is to record gym training sessions.

## Installation
To run the project locally, the prerequisites detailed in the "Prerequisites" section must be met. Then open a terminal or command line in the project directory and execute the corresponding command according to your operating system
- Windows: mvnw.cmd spring-boot:run
- Linux or macOS: ./mvnw spring-boot:run

## Usage
Once the project is running locally, you can send requests to any API endpoint. You can use the [Postman collections](https://1drv.ms/u/c/34367cf4eb5bef5e/EZ5liB5ZdHNNrbvcSQNGy1UBuahdveazxtj0ng5wYZW2HA?e=lBwnfE). You can also make requests to the endpoints via [Swagger Editor](https://editor.swagger.io/) using the file "training-diary-2/src/main/resources/swagger/training-diary-v1.yml".  

## Contribution
To contribute to the project, please contact us via the email provided in the "Contact" section.  

## Contact
0610809824@uma.es

## Prerequisites
- Install JDK 17.
- Configure the system environment variables DB_URL, DB_USER, DB_PASSWORD, MAIL_USER and MAIL_PASSWORD. To know their values, please contact us via the email provided in the "Contact" section.

## Other Considerations
- For the database, a MySQL instance has been created on the AWS Free Tier. This free service is limited to 12 months. If you have any issues connecting to the database, please contact us using the email address provided in the "Contact" section.
- Although there are only three endpoints, three controllers have been created because the idea is to continue expanding the project and create the rest of the operations (GET, PUT, and DELETE) in each controller.
- Security has not been added to the API (JWT Token, OAuth 2.0...) because the project is purely educational and is not intended to be deployed on any remote server at the moment.