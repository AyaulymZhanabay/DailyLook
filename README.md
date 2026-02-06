Project Plan Documentation
DailyLook Outfit Recommandation System
Course: Object-Oriented Programming (Java)

By Ayaulym Zhanabay, Dariya Kazbekova, Nurdana Kumisbay ST-2504
 
1. Project Title
DailyLook Outfit Recommandation System
 
2. Team Members and Role Distribution

The project was developed by a team of three members with clearly defined responsibilities:

Ayaulym – Backend & Business Logic: responsible for core Java logic, rule-based recommendation logic and service layer implementation.
Dariya – Database & Data Management: responsible for database structure design and JDBC connection.
Nurdana – System Architecture and Planning: responsible for application structure and class design.
All team members also participated in Java coding, testing, and debugging to ensure system reliability and quality.
 
3. Detailed Project Description

DailyLook is a Java-based application designed to help users choose suitable outfits for daily wear.
The system generates outfit recommendations based on:
• User preferences (style, favorite colors, clothing types)
• Weather conditions (temperature, season, weather type)
• Occasion (casual, formal, sport, etc.)
 
Goals and Objectives
• Simplify the daily decision of choosing what to wear
• Provide personalized outfit recommendations
• Organize a user’s wardrobe digitally
• Demonstrate object-oriented design and backend development skills in Java
 
The project uses a rule-based recommendation system instead of machine learning.
This makes the application:
• Easy to understand and modify
• Transparent in decision-making
• Efficient for MVP-level implementation
• Suitable for educational purposes 
 
4. Technologies and Tools

The following technologies and tools are used in the development of the project:
        Programming Language
• Java — main programming language
        Backend / Application Framework
• Spring Boot— backend logic, REST services
• JavaFX — desktop user interface
        Database
• PostgreSQL — main production database
• SQLite — lightweight local database for MVP
          ORM & Persistence
• Hibernate / JPA — object-relational mapping and data persistence
        Build Tools
• Maven or Gradle — dependency management and build automation
           Version Control
• Git — version control
• GitHub — project repository and collaboration
 

5. Project Structure and Class Interactions

Architecture Overview
 
The project follows a layered architecture:
1. Presentation Layer
JavaFX UI or REST API controllers 
2. Service Layer
Business logic 
Recommendation rules 
3. Data Access Layer
Repositories (JPA) 
Database interaction 
4. Database Layer
Relational database (PostgreSQL / SQLite) 
 
Core Classes and Entities
• User
• ClothingItem
• Outfit
• WeatherCondition
• Occasion
• RecommendationService
 
6. Minimum Viable Product (MVP)
 
1. User Profile Creation

• Users can create a profile with basic preferences

• Stores style and basic clothing preferences

 

2. Wardrobe Management

• Add, edit, and remove clothing items

• Each item includes type, color, and season

 

3. Weather and Occasion Selection

• Users select current weather conditions

• Users choose an occasion (casual, formal, sport)

 

4. Rule-Based Recommendation Engine

• Matches clothing items with predefined rules

• Filters outfits based on weather and occasion

• Generates suitable outfit combinations

 

5. Viewing Recommendations

• Displays recommended outfits to the user
• Simple and clear presentation

7. Possible Improvements After MVP
Features not required for core functionality but planned for future development:
• Saving favorite outfits
• Outfit history tracking
• Color matching and compatibility rules
• Basic style rating system
• Seasonal wardrobe filtering
• Integration with real-time weather APIs
• Mobile or web interface

8. Development Timeline

Week 1
• Requirements analysis
• System design
• GitHub repository setup
 
Week 2
• Backend logic implementation
• Database entities and Relationships
 
Week 3
• UI development / API integration
• Testing and bug fixing
 
 
 
 
