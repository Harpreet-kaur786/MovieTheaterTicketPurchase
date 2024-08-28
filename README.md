# Movie Membership Management System
This project provides a Java-based system to manage movie membership accounts. Members can purchase movie tickets, earn points, and access VIP privileges through different membership types.
Key Features
Member Details Management:
Track member information, including their name, the next movie they're planning to watch, theater type, show timings, and preferred snacks.
Automatically initialize and manage member points.
Multiple Constructors:
Overloaded constructors to initialize members with varying levels of detail.
Abstract Class Implementation:The system is designed with an abstract base class (MovieMembership) to allow flexibility for future extensions, such as different types of memberships.

#The MovieMembershipTest.java file serves as a test class for the Movie Membership Management System. It simulates the creation and evaluation of different types of movie memberships, including Silver, Gold, and IMAX members.
#Key Functionalities:
Creation of Membership Instances:
The test creates instances of SilverMember, GoldMember, and IMAXMember using various constructors.
Membership Array Management:
These membership instances are stored in an array of the abstract type MovieMembership, allowing for easy management and iteration through different member types.
Simulation of Member Interactions:
The test iterates through the array to display detailed information about each member, including their name, membership rank, points, next movie, theater type, showtime, and snacks.
It also invokes methods to display member-specific details and benefits.


#GoldMember.java
GoldMember.java is a Java class designed to represent a Gold membership for a movie membership program. This class extends the SilverMember class and implements the VIPPrivilege interface, providing additional VIP privileges and benefits for members.
#Features:
Inheritance and Implementation: The class inherits from SilverMember and implements VIPPrivilege, allowing it to provide unique functionalities and benefits to Gold members.
Discounts and Points: Gold members receive a 25% discount rate and a 2.0 points rate, with a starting bonus of 50 points.
VIP Privileges: Additional VIP privileges are available to Gold members, enhancing their membership experience.
Purpose:
The GoldMember class aims to enhance the movie membership experience by offering higher-tier benefits, such as increased discounts, faster points accumulation, and exclusive access to VIP privileges.

#IMAXMember.java
IMAXMember.java is a Java class designed to represent an IMAX membership within a movie membership program. This class extends the MovieMembership base class and provides specific benefits tailored for members who prefer IMAX screenings.
#Features:
Inheritance: The class extends MovieMembership, allowing it to utilize shared functionality while offering unique benefits for IMAX members.
Discounts and Points: IMAX members receive a 50% discount rate on IMAX movie tickets and a 1.3 points rate for purchases. Additionally, members start with 25 bonus points as a special benefit.
Customization: The class provides constructors for initializing IMAX members with default or specific benefits, allowing flexibility in membership management.
Purpose:
The IMAXMember class is designed to cater to movie enthusiasts who frequently watch IMAX screenings, offering them enhanced discounts and rewards to enrich their viewing experience.

#SilverMember.java
SilverMember.java is a Java class designed to represent a Silver membership within a movie membership program. This class extends the MovieMembership base class and provides specific benefits for members with a Silver rank.
#Features:
Inheritance: The class extends MovieMembership, allowing it to inherit common membership functionalities while offering additional benefits specific to Silver members.
Discounts and Points: Silver members receive a default 10% discount rate on movie tickets and a 1.2 points rate, making it an appealing option for frequent moviegoers.
Flexible Initialization: The class provides constructors for both default and custom discount and points rates, enabling a tailored experience for different membership levels.
Purpose:
The SilverMember class is intended for members who want to enjoy modest discounts and earn points while watching movies, providing a balanced option between basic and premium memberships.

