[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/eEf93O-z)

Abstract:
The University Management System is a Java Swing application developed in NetBeans to streamline the administration of a university. This comprehensive system caters to three primary user roles: Administrators, Professors, Employers and Students. The project aims to simplify administrative tasks, enhance professor-student interactions, and improve overall university management.

Table of Contents:
- 1. Introduction
- 2. Class and Architecture diagrams of the Project
- 3. Features and Functionality
- 3.1 Admin Portal
- 3.1.1 Manage Student
- 3.1.2 Manage Professor
- 3.2 Professor Portal
- 3.3 Student Portal
- 4. Employer
- 5. Conclusion
- 5.1 Project Summary
- 5.2 Difference with Tradtional University Platform


1. Introduction:
The University Management System is an innovative Java Swing application developed within the NetBeans IDE, designed to simplify and streamline administrative tasks within a university setting. This introduction underscores the project's primary objective: to create an intuitive and efficient platform for administrators, professors, employers and students. By addressing the complexities of university management, this system aims to reduce administrative burdens and enhance the overall efficiency of administrative processes. It serves as a vital tool for improving the university's operational capabilities, offering a user-friendly interface for the diverse needs of each user role.

2. Class and Architecture diagrams of the Project
This section details the Class diagrams showing how our functioanlities work and architecture diagram involving Admins, Professors and Students, explaining the interactions between various components, including the admin portal, professor portal, and student portal. The data flow is illustrated, providing insights into how user actions are processed.

DIAGRAMS:

CLASS DIAGRAM

![AED_ASSIGNMENT-3_DIAGRAM_1](https://github.com/aed5100/assignment-3-group-24/assets/141432630/e09f457d-ae74-49a0-974b-49d2af061ff7)

ARCHITECTURE DIAGRAM:
![image](https://github.com/aed5100/assignment-3-group-24/assets/141432630/4eb06b19-3fca-4dad-a6b8-afaf4d0a784e)

3. Features and Functionality:
3.1 Admin Portal:
-3.1.1 Manage Student:
- Create Student: The Admin portal includes an option to create student profiles. Admins can
input essential details such as name, domain, student ID, and password, followed by clicking the "Create Student" button. Upon submission, a new student record is generated in the system, ensuring efficient student registration.
- Search Student by ID: Admins have the ability to search for a specific student by entering their student ID in a search bar. After entering the ID, they can click the "Search" button to retrieve student information, simplifying the process of locating student records.
- Student Details and Account Management:
 - Upon searching for a student by ID, a new panel (JPanel) appears under the search results. This panel displays the student's ID and password. Below this information, an "Disable Account" option is presented with a radio button. Initially, this option is inaccessible. However, upon clicking the "Update" button, the radio button becomes enabled. Admins can then choose to disable a student account if needed, granting them greater control over account management.
- Course Status Update: Admins can access the "Status Update" feature, which leads to a new panel displaying the course IDs registered by the student. This panel also provides a "View" button to inspect specific course details. For each course, there is an option to set the student's grade and course status, which can be marked as "Pass" or "Fail." Admins can make these evaluations and save the details, ensuring comprehensive control over student progress and course outcomes.

3.1.2 Manage Professor:
- Create Professor: Within the Admin portal, there's an option to create professor profiles. Admins are required to input essential information, including the professor's name, specification, faculty ID, and password. Subsequently, by clicking the "Create" button, the system stores the professor's details, facilitating the efficient registration of professors within the university.
- Search Professor by Faculty ID: Admins possess the capability to search for a specific professor by inputting their faculty ID in a designated search bar. After entering the ID, they can initiate the search process to retrieve relevant professor information, simplifying the process of identifying and managing professor profiles.
- Professor Details and Account Management:
- Similar to student management, when searching for a professor using their faculty ID, a new
JFrame opens with options to edit professor details and disable the professor's account, if necessary. This extends the level of control that administrators have over professor accounts, ensuring efficient account management and access control.

3.2 Professor Portal:
- View and Edit Profile Details: Professors logging into their portal can access a dedicated panel with a "View Profile Details" button. This allows them to review their profile information, and if needed, make changes to the details initially set by the admin.
- Create Course: Professors have the option to create courses, contributing to the university's course offerings. By clicking the "Create Course" button, a new JFrame opens, presenting input fields for essential course details, including course ID, name, price, credits, location, and language. Professors can input this information and save it for university course registration.

- Edit Course: After creating a course, professors have the capability to edit course details. By selecting the respective course and clicking the "Edit Course" button, a new JPanel opens, offering options to modify course information. Professors can update details as needed and save the changes, ensuring up-to-date course offerings.
- Professor Rating: A valuable feature in the Professor portal is the ability for students to provide ratings for professors. This section displays an average rating given by students, offering feedback on professor performance and fostering transparency in the university community.

3.3 Student Portal:
- View and Edit Profile Details: When students access their portal, they are greeted with an option to view and edit their profile details. Similar to the Professor portal, students can review and update their profile information as required.
- Registered Courses: The Student portal provides a table displaying the courses they are currently registered for, enhancing accessibility and organization of their course information.
- Browse Courses: To explore additional course offerings, students can click the "Browse Courses" button. This action opens a new JPanel with a table listing various courses created by professors, fostering a simple and effective course selection process.
- Transcript Access: A "Transcript" button is available for students, allowing them to access their academic transcripts. This feature is pivotal in tracking academic progress.
- Course Details and Registration: After browsing courses, students can select a specific course of interest. By clicking the "View" button, a new JPanel opens, offering comprehensive course details, including the course name, description, location, professor's name, and professor rating. Additionally, students can opt to register for the course directly from this panel. Once registered, the course is added to their list of registered courses, contributing to their academic journey.

4. Employer:
- Employer can view the list of student and the courses they've taken along with the results of the students in those courses, this enables employer to pick students skilled in the subjects that the employer is looking for.
- There's an option to search with course name which helps the Employer to filter the students further down to the group of people who have taken that particular course and showing their results which reflects their skills in that subject.

5. Conclusion:
5.1 Project summary:
The University Management System is a comprehensive Java Swing application developed within the NetBeans Integrated Development Environment, aimed at revolutionizing the management of educational institutions. The primary objective of this project is to simplify and streamline administrative tasks, foster efficient communication between professors and students, and enhance overall university management.
The system introduces three distinct portals, each tailored to the specific needs of administrators, professors, and students. In the Admin portal, administrative tasks are made intuitive through functionalities like creating and managing student and professor profiles, updating student records, and overseeing course progress. Additionally, the system provides professors with tools to manage their profiles, create courses, and track their ratings by students. For students, the portal offers access to profile management, registration of courses created by professors, and convenient transcript retrieval.
The implementation utilizes Java Swing and NetBeans to create a user-friendly interface, ensuring ease of use and accessibility for all users. Robust testing and evaluation procedures guarantee the system's reliability, responsiveness, and overall performance. User feedback is invaluable in driving improvements and future enhancements.
In summary, the University Management System offers an innovative solution to the multifaceted challenges of university administration. By simplifying administrative processes, improving professor-student interactions, and enhancing the overall management of educational institutions, this project contributes to the efficiency and effectiveness of university operations.

5.2 Difference with Tradtional University Platform:
It's different from traditional University System in multiple ways like: 
One of the highlights of our 'AltEducation System' project would be that it's add employers as stakeholders in the system.
Students can choose their professor based on rating and filter them down by language, region and course, which enables more choices for students.
Professors will have more freedom in creating and managing their courses without administrator's interference.




