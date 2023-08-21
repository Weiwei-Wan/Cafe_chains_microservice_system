# distributed_loyaltycard_system
The group project for distributed systems

We implemented the distributed cafe system which is designed to handle various failure scenarios, including server, software, and network issues. By utilising multiple servers, data replication, and load balancing, the system maintains service availability even if a server goes down, providing a seamless user experience.

The system uses a master-slave replication architecture, which allows for data redundancy and quick recovery in case of a failure in the master database.

Load balancing is implemented to distribute traffic across multiple servers and microservices and ensure optimal resource utilisation, minimising response times and avoiding server overloads. Nginx can be used to manage load balancing efficiently.
    
<img width="2592" alt="Distributed System - Youtube" src="https://github.com/Weiwei-Wan/Cafe_chains_microservice_system/assets/74362292/d9f889d5-d1f0-4ea3-8b28-03fe3636e128">
