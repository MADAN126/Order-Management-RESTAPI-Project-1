Project Overview
A Spring Boot RESTful API designed to manage an e-commerce order placement system. It processes incoming JSON payloads, handles relational data mapping, and persists nested transactional data into a relational database using Spring Data JPA.

Key Features
Hierarchical Order Management: Handles multi-tier order structures containing Customer Details, Products, Shipping Addresses, and Payment Status.
Automated Cascade Operations: Saves parent orders and child records simultaneously using CascadeType.ALL configurations.
Clean Architecture Separation: Decouples API transmission layers from internal database layers using Data Transfer Objects (DTOs).

Technical Stack
Framework: Spring Boot 3 (using Jakarta Persistence API)
Database Access: Spring Data JPA
Boilerplate Reduction: Project Lombok (@Data, @AllArgsConstructor, @NoArgsConstructor)

Data Model & Relationships
OrderEntity: The primary core root table. Uses email as the unique @Id primary key.
ProductEntity: Linked via One-to-Many (@OneToMany) using a foreign key join column (email_id). Contains an @ElementCollection to store a list of dynamic product specifications.
AddressEntity: Linked via One-to-One (@OneToOne) utilizing a foreign key reference (addr_Id).
PaymentEntity: Linked via One-to-One (@OneToOne) utilizing a foreign key reference (band_Id).

API Endpoints
POST /create : Accepts an OrderDTO request body, maps properties to entities, and persists the full dataset.
GET /load : Fetches and streams all saved customer orders along with nested structural metadata.