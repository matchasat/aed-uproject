/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AdminPackage;

import Business.CoursePackage.Course;
import Business.CoursePackage.CourseCatalog;

/**
 *
 * @author smatcha
 */
public class BusinessLogic {

    StudentDirectory studentDirectory;
    FacultyDirectory facultyDirectory;
    CourseCatalog courseCatalog;

    public BusinessLogic(StudentDirectory studentDirectory, FacultyDirectory facultyDirectory, CourseCatalog courseCatalog) {

        this.studentDirectory = studentDirectory;
        this.facultyDirectory = facultyDirectory;
        this.courseCatalog = courseCatalog;

        Faculty faculty1 = new Faculty();
        faculty1.setFullName("FACULTY TEST1");
        faculty1.setSpeciality("SOFTWARE");
        faculty1.setFacultyId("FACULTY1");
        faculty1.setPassword("FACULTY1");
        this.facultyDirectory.addFacultyToFacultyDirectory(faculty1);
        System.out.println("FACULTY USER ADDED: " + faculty1);
        
        Course course1 = new Course();
        course1.setCourseId(1);
        course1.setCourseName("course1");
        course1.setCredit(1);
        course1.setPrice(1);
        course1.setRegion("region1");
        course1.setLanguage("lang1");
        course1.setFaculty(faculty1);
        course1.setSemester("sem1");
        courseCatalog.addCourseToCourseList(course1);
        
        Student student1 = new Student();
        student1.setDomain("IS");
        student1.setFullName("TEST STUDENT1");
        student1.setUserId("STUDENT1");
        student1.setPassword("STUDENT1");
        studentDirectory.addStudentToStudentDirectory(student1);
        System.out.println("STUDENT USER ADDED: " + student1);
        student1.addCourseToTheStudent(course1);
        
        Student student11 = new Student();
        student11.setDomain("IS");
        student11.setFullName("TEST STUDENT11");
        student11.setUserId("STUDENT11");
        student11.setPassword("STUDENT11");
        studentDirectory.addStudentToStudentDirectory(student11);
        System.out.println("STUDENT USER ADDED: " + student11);
        student11.addCourseToTheStudent(course1);
        
        Student student12 = new Student();
        student12.setDomain("IS");
        student12.setFullName("TEST STUDENT12");
        student12.setUserId("STUDENT12");
        student12.setPassword("STUDENT12");
        studentDirectory.addStudentToStudentDirectory(student12);
        System.out.println("STUDENT USER ADDED: " + student12);
        student12.addCourseToTheStudent(course1);
        
        Student student13 = new Student();
        student13.setDomain("IS");
        student13.setFullName("TEST STUDENT13");
        student13.setUserId("STUDENT13");
        student13.setPassword("STUDENT13");
        studentDirectory.addStudentToStudentDirectory(student13);
        System.out.println("STUDENT USER ADDED: " + student13);
        student13.addCourseToTheStudent(course1);
        
        Student student14 = new Student();
        student14.setDomain("IS");
        student14.setFullName("TEST STUDENT14");
        student14.setUserId("STUDENT14");
        student14.setPassword("STUDENT14");
        studentDirectory.addStudentToStudentDirectory(student14);
        System.out.println("STUDENT USER ADDED: " + student14);
        student14.addCourseToTheStudent(course1);
        
        Student student15 = new Student();
        student15.setDomain("IS");
        student15.setFullName("TEST STUDENT15");
        student15.setUserId("STUDENT15");
        student15.setPassword("STUDENT15");
        studentDirectory.addStudentToStudentDirectory(student15);
        System.out.println("STUDENT USER ADDED: " + student15);
        student15.addCourseToTheStudent(course1);
        
        Student student16 = new Student();
        student16.setDomain("IS");
        student16.setFullName("TEST STUDENT16");
        student16.setUserId("STUDENT16");
        student16.setPassword("STUDENT16");
        studentDirectory.addStudentToStudentDirectory(student16);
        System.out.println("STUDENT USER ADDED: " + student16);
        student16.addCourseToTheStudent(course1);
        
        Student student17 = new Student();
        student17.setDomain("IS");
        student17.setFullName("TEST STUDENT17");
        student17.setUserId("STUDENT17");
        student17.setPassword("STUDENT17");
        studentDirectory.addStudentToStudentDirectory(student17);
        System.out.println("STUDENT USER ADDED: " + student17);
        student17.addCourseToTheStudent(course1);
        
        Student student18 = new Student();
        student18.setDomain("IS");
        student18.setFullName("TEST STUDENT18");
        student18.setUserId("STUDENT18");
        student18.setPassword("STUDENT18");
        studentDirectory.addStudentToStudentDirectory(student18);
        System.out.println("STUDENT USER ADDED: " + student18);
        student18.addCourseToTheStudent(course1);
        
        Student student19 = new Student();
        student19.setDomain("IS");
        student19.setFullName("TEST STUDENT19");
        student19.setUserId("STUDENT19");
        student19.setPassword("STUDENT19");
        studentDirectory.addStudentToStudentDirectory(student19);
        System.out.println("STUDENT USER ADDED: " + student19);
        student19.addCourseToTheStudent(course1);
        
        //Course course1 = new course();
        
        Faculty faculty2 = new Faculty();
        faculty2.setFullName("FACULTY TEST2");
        faculty2.setSpeciality("SOFTWARE2");
        faculty2.setFacultyId("FACULTY2");
        faculty2.setPassword("FACULTY2");
        this.facultyDirectory.addFacultyToFacultyDirectory(faculty2);
        System.out.println("FACULTY USER ADDED: " + faculty2);
        
        Course course2 = new Course();
        course2.setCourseId(2);
        course2.setCourseName("course2");
        course2.setCredit(2);
        course2.setPrice(2);
        course2.setRegion("region2");
        course2.setLanguage("lang2");
        course2.setFaculty(faculty2);
        course2.setSemester("sem2");
        courseCatalog.addCourseToCourseList(course2);
        
        Student student2 = new Student();
        student2.setDomain("IS");
        student2.setFullName("TEST STUDENT2");
        student2.setUserId("STUDENT2");
        student2.setPassword("STUDENT2");
        studentDirectory.addStudentToStudentDirectory(student2);
        System.out.println("STUDENT USER ADDED: " + student2);
        student2.addCourseToTheStudent(course2);
        
        Student student21 = new Student();
        student21.setDomain("IS");
        student21.setFullName("TEST STUDENT21");
        student21.setUserId("STUDENT21");
        student21.setPassword("STUDENT21");
        studentDirectory.addStudentToStudentDirectory(student21);
        System.out.println("STUDENT USER ADDED: " + student21);
        student21.addCourseToTheStudent(course2);
        
        Student student22 = new Student();
        student22.setDomain("IS");
        student22.setFullName("TEST STUDENT22");
        student22.setUserId("STUDENT22");
        student22.setPassword("STUDENT22");
        studentDirectory.addStudentToStudentDirectory(student22);
        System.out.println("STUDENT USER ADDED: " + student22);
        student22.addCourseToTheStudent(course2);
        
        Student student23 = new Student();
        student23.setDomain("IS");
        student23.setFullName("TEST STUDENT23");
        student23.setUserId("STUDENT23");
        student23.setPassword("STUDENT23");
        studentDirectory.addStudentToStudentDirectory(student23);
        System.out.println("STUDENT USER ADDED: " + student23);
        student23.addCourseToTheStudent(course2);
        
        Student student24 = new Student();
        student24.setDomain("IS");
        student24.setFullName("TEST STUDENT24");
        student24.setUserId("STUDENT24");
        student24.setPassword("STUDENT24");
        studentDirectory.addStudentToStudentDirectory(student24);
        System.out.println("STUDENT USER ADDED: " + student24);
        student24.addCourseToTheStudent(course2);
        
        Student student25 = new Student();
        student25.setDomain("IS");
        student25.setFullName("TEST STUDENT25");
        student25.setUserId("STUDENT25");
        student25.setPassword("STUDENT25");
        studentDirectory.addStudentToStudentDirectory(student25);
        System.out.println("STUDENT USER ADDED: " + student25);
        student25.addCourseToTheStudent(course2);
        
        Student student26 = new Student();
        student26.setDomain("IS");
        student26.setFullName("TEST STUDENT26");
        student26.setUserId("STUDENT26");
        student26.setPassword("STUDENT26");
        studentDirectory.addStudentToStudentDirectory(student26);
        System.out.println("STUDENT USER ADDED: " + student26);
        student26.addCourseToTheStudent(course2);
        
        Student student27 = new Student();
        student27.setDomain("IS");
        student27.setFullName("TEST STUDENT27");
        student27.setUserId("STUDENT27");
        student27.setPassword("STUDENT27");
        studentDirectory.addStudentToStudentDirectory(student27);
        System.out.println("STUDENT USER ADDED: " + student27);
        student27.addCourseToTheStudent(course2);
        
        Student student28 = new Student();
        student28.setDomain("IS");
        student28.setFullName("TEST STUDENT28");
        student28.setUserId("STUDENT28");
        student28.setPassword("STUDENT28");
        studentDirectory.addStudentToStudentDirectory(student28);
        System.out.println("STUDENT USER ADDED: " + student28);
        student28.addCourseToTheStudent(course2);
        
        Student student29 = new Student();
        student29.setDomain("IS");
        student29.setFullName("TEST STUDENT29");
        student29.setUserId("STUDENT29");
        student29.setPassword("STUDENT29");
        studentDirectory.addStudentToStudentDirectory(student29);
        System.out.println("STUDENT USER ADDED: " + student29);
        student29.addCourseToTheStudent(course2);
        
        Faculty faculty3 = new Faculty();
        faculty3.setFullName("FACULTY TEST3");
        faculty3.setSpeciality("SOFTWARE3");
        faculty3.setFacultyId("FACULTY3");
        faculty3.setPassword("FACULTY3");
        this.facultyDirectory.addFacultyToFacultyDirectory(faculty3);
        System.out.println("FACULTY USER ADDED: " + faculty3);
        
        Course course3 = new Course();
        course3.setCourseId(3);
        course3.setCourseName("course3");
        course3.setCredit(3);
        course3.setPrice(3);
        course3.setRegion("region3");
        course3.setLanguage("lang3");
        course3.setFaculty(faculty3);
        course3.setSemester("sem3");
        courseCatalog.addCourseToCourseList(course3);
        
        Student student3 = new Student();
        student3.setDomain("IS");
        student3.setFullName("TEST STUDENT3");
        student3.setUserId("STUDENT3");
        student3.setPassword("STUDENT3");
        studentDirectory.addStudentToStudentDirectory(student3);
        System.out.println("STUDENT USER ADDED: " + student3);
        student3.addCourseToTheStudent(course3);
        
        Student student31 = new Student();
        student31.setDomain("IS");
        student31.setFullName("TEST STUDENT31");
        student31.setUserId("STUDENT31");
        student31.setPassword("STUDENT31");
        studentDirectory.addStudentToStudentDirectory(student31);
        System.out.println("STUDENT USER ADDED: " + student31);
        student31.addCourseToTheStudent(course3);
        
        Student student32 = new Student();
        student32.setDomain("IS");
        student32.setFullName("TEST STUDENT32");
        student32.setUserId("STUDENT32");
        student32.setPassword("STUDENT32");
        studentDirectory.addStudentToStudentDirectory(student32);
        System.out.println("STUDENT USER ADDED: " + student32);
        student32.addCourseToTheStudent(course3);
        
        Student student33 = new Student();
        student33.setDomain("IS");
        student33.setFullName("TEST STUDENT33");
        student33.setUserId("STUDENT33");
        student33.setPassword("STUDENT33");
        studentDirectory.addStudentToStudentDirectory(student33);
        System.out.println("STUDENT USER ADDED: " + student33);
        student33.addCourseToTheStudent(course3);
        
        Student student34 = new Student();
        student34.setDomain("IS");
        student34.setFullName("TEST STUDENT34");
        student34.setUserId("STUDENT34");
        student34.setPassword("STUDENT34");
        studentDirectory.addStudentToStudentDirectory(student34);
        System.out.println("STUDENT USER ADDED: " + student34);
        student34.addCourseToTheStudent(course3);
        
        Student student35 = new Student();
        student35.setDomain("IS");
        student35.setFullName("TEST STUDENT35");
        student35.setUserId("STUDENT35");
        student35.setPassword("STUDENT35");
        studentDirectory.addStudentToStudentDirectory(student35);
        System.out.println("STUDENT USER ADDED: " + student35);
        student35.addCourseToTheStudent(course3);
        
        Student student36 = new Student();
        student36.setDomain("IS");
        student36.setFullName("TEST STUDENT36");
        student36.setUserId("STUDENT36");
        student36.setPassword("STUDENT36");
        studentDirectory.addStudentToStudentDirectory(student36);
        System.out.println("STUDENT USER ADDED: " + student36);
        student36.addCourseToTheStudent(course3);
        
        Student student37 = new Student();
        student37.setDomain("IS");
        student37.setFullName("TEST STUDENT37");
        student37.setUserId("STUDENT37");
        student37.setPassword("STUDENT37");
        studentDirectory.addStudentToStudentDirectory(student37);
        System.out.println("STUDENT USER ADDED: " + student37);
        student37.addCourseToTheStudent(course3);
        
        Student student38 = new Student();
        student38.setDomain("IS");
        student38.setFullName("TEST STUDENT38");
        student38.setUserId("STUDENT38");
        student38.setPassword("STUDENT38");
        studentDirectory.addStudentToStudentDirectory(student38);
        System.out.println("STUDENT USER ADDED: " + student38);
        student38.addCourseToTheStudent(course3);
        
        Student student39 = new Student();
        student39.setDomain("IS");
        student39.setFullName("TEST STUDENT39");
        student39.setUserId("STUDENT39");
        student39.setPassword("STUDENT39");
        studentDirectory.addStudentToStudentDirectory(student39);
        System.out.println("STUDENT USER ADDED: " + student39);
        student39.addCourseToTheStudent(course3);
        
        Faculty faculty4 = new Faculty();
        faculty4.setFullName("FACULTY TEST4");
        faculty4.setSpeciality("SOFTWARE4");
        faculty4.setFacultyId("FACULTY4");
        faculty4.setPassword("FACULTY4");
        this.facultyDirectory.addFacultyToFacultyDirectory(faculty4);
        System.out.println("FACULTY USER ADDED: " + faculty4);
        
        Course course4 = new Course();
        course4.setCourseId(4);
        course4.setCourseName("course4");
        course4.setCredit(4);
        course4.setPrice(4);
        course4.setRegion("region4");
        course4.setLanguage("lang4");
        course4.setFaculty(faculty4);
        course4.setSemester("sem4");
        courseCatalog.addCourseToCourseList(course4);
        
        Student student4 = new Student();
        student4.setDomain("IS");
        student4.setFullName("TEST STUDENT4");
        student4.setUserId("STUDENT4");
        student4.setPassword("STUDENT4");
        studentDirectory.addStudentToStudentDirectory(student4);
        System.out.println("STUDENT USER ADDED: " + student4);
        student4.addCourseToTheStudent(course4);
        
        Student student41 = new Student();
        student41.setDomain("IS");
        student41.setFullName("TEST STUDENT41");
        student41.setUserId("STUDENT41");
        student41.setPassword("STUDENT41");
        studentDirectory.addStudentToStudentDirectory(student41);
        System.out.println("STUDENT USER ADDED: " + student41);
        student41.addCourseToTheStudent(course4);
        
        Student student42 = new Student();
        student42.setDomain("IS");
        student42.setFullName("TEST STUDENT42");
        student42.setUserId("STUDENT42");
        student42.setPassword("STUDENT42");
        studentDirectory.addStudentToStudentDirectory(student42);
        System.out.println("STUDENT USER ADDED: " + student42);
        student42.addCourseToTheStudent(course4);
        
        Student student43 = new Student();
        student43.setDomain("IS");
        student43.setFullName("TEST STUDENT43");
        student43.setUserId("STUDENT43");
        student43.setPassword("STUDENT43");
        studentDirectory.addStudentToStudentDirectory(student43);
        System.out.println("STUDENT USER ADDED: " + student43);
        student43.addCourseToTheStudent(course4);
        
        Student student44 = new Student();
        student44.setDomain("IS");
        student44.setFullName("TEST STUDENT44");
        student44.setUserId("STUDENT44");
        student44.setPassword("STUDENT44");
        studentDirectory.addStudentToStudentDirectory(student44);
        System.out.println("STUDENT USER ADDED: " + student44);
        student44.addCourseToTheStudent(course4);
        
        Student student45 = new Student();
        student45.setDomain("IS");
        student45.setFullName("TEST STUDENT45");
        student45.setUserId("STUDENT45");
        student45.setPassword("STUDENT45");
        studentDirectory.addStudentToStudentDirectory(student45);
        System.out.println("STUDENT USER ADDED: " + student45);
        student45.addCourseToTheStudent(course4);
        
        Student student46 = new Student();
        student46.setDomain("IS");
        student46.setFullName("TEST STUDENT46");
        student46.setUserId("STUDENT46");
        student46.setPassword("STUDENT46");
        studentDirectory.addStudentToStudentDirectory(student46);
        System.out.println("STUDENT USER ADDED: " + student46);
        student46.addCourseToTheStudent(course4);
        
        Student student47 = new Student();
        student47.setDomain("IS");
        student47.setFullName("TEST STUDENT47");
        student47.setUserId("STUDENT47");
        student47.setPassword("STUDENT47");
        studentDirectory.addStudentToStudentDirectory(student47);
        System.out.println("STUDENT USER ADDED: " + student47);
        student47.addCourseToTheStudent(course4);
        
        Student student48 = new Student();
        student48.setDomain("IS");
        student48.setFullName("TEST STUDENT48");
        student48.setUserId("STUDENT48");
        student48.setPassword("STUDENT48");
        studentDirectory.addStudentToStudentDirectory(student48);
        System.out.println("STUDENT USER ADDED: " + student48);
        student48.addCourseToTheStudent(course4);
        
        Student student49 = new Student();
        student49.setDomain("IS");
        student49.setFullName("TEST STUDENT49");
        student49.setUserId("STUDENT49");
        student49.setPassword("STUDENT49");
        studentDirectory.addStudentToStudentDirectory(student49);
        System.out.println("STUDENT USER ADDED: " + student49);
        student49.addCourseToTheStudent(course4);
        
        Faculty faculty5 = new Faculty();
        faculty5.setFullName("FACULTY TEST5");
        faculty5.setSpeciality("SOFTWARE5");
        faculty5.setFacultyId("FACULTY5");
        faculty5.setPassword("FACULTY5");
        this.facultyDirectory.addFacultyToFacultyDirectory(faculty5);
        System.out.println("FACULTY USER ADDED: " + faculty5);
        
        Course course5 = new Course();
        course5.setCourseId(5);
        course5.setCourseName("course5");
        course5.setCredit(5);
        course5.setPrice(5);
        course5.setRegion("region5");
        course5.setLanguage("lang5");
        course5.setFaculty(faculty5);
        course5.setSemester("sem5");
        courseCatalog.addCourseToCourseList(course5);
        
        Student student5 = new Student();
        student5.setDomain("IS");
        student5.setFullName("TEST STUDENT5");
        student5.setUserId("STUDENT5");
        student5.setPassword("STUDENT5");
        studentDirectory.addStudentToStudentDirectory(student5);
        System.out.println("STUDENT USER ADDED: " + student5);
        student5.addCourseToTheStudent(course5);
        
        Student student51 = new Student();
        student51.setDomain("IS");
        student51.setFullName("TEST STUDENT51");
        student51.setUserId("STUDENT51");
        student51.setPassword("STUDENT51");
        studentDirectory.addStudentToStudentDirectory(student51);
        System.out.println("STUDENT USER ADDED: " + student51);
        student51.addCourseToTheStudent(course5);
        
        Student student52 = new Student();
        student52.setDomain("IS");
        student52.setFullName("TEST STUDENT52");
        student52.setUserId("STUDENT52");
        student52.setPassword("STUDENT52");
        studentDirectory.addStudentToStudentDirectory(student52);
        System.out.println("STUDENT USER ADDED: " + student52);
        student52.addCourseToTheStudent(course5);
        
        Student student53 = new Student();
        student53.setDomain("IS");
        student53.setFullName("TEST STUDENT43");
        student53.setUserId("STUDENT53");
        student53.setPassword("STUDENT53");
        studentDirectory.addStudentToStudentDirectory(student53);
        System.out.println("STUDENT USER ADDED: " + student53);
        student53.addCourseToTheStudent(course5);
        
        Student student54 = new Student();
        student54.setDomain("IS");
        student54.setFullName("TEST STUDENT54");
        student54.setUserId("STUDENT54");
        student54.setPassword("STUDENT54");
        studentDirectory.addStudentToStudentDirectory(student54);
        System.out.println("STUDENT USER ADDED: " + student54);
        student54.addCourseToTheStudent(course5);
        
        Student student55 = new Student();
        student55.setDomain("IS");
        student55.setFullName("TEST STUDENT55");
        student55.setUserId("STUDENT55");
        student55.setPassword("STUDENT55");
        studentDirectory.addStudentToStudentDirectory(student55);
        System.out.println("STUDENT USER ADDED: " + student55);
        student55.addCourseToTheStudent(course5);
        
        Student student56 = new Student();
        student56.setDomain("IS");
        student56.setFullName("TEST STUDENT56");
        student56.setUserId("STUDENT56");
        student56.setPassword("STUDENT56");
        studentDirectory.addStudentToStudentDirectory(student56);
        System.out.println("STUDENT USER ADDED: " + student56);
        student56.addCourseToTheStudent(course5);
        
        Student student57 = new Student();
        student57.setDomain("IS");
        student57.setFullName("TEST STUDENT57");
        student57.setUserId("STUDENT57");
        student57.setPassword("STUDENT57");
        studentDirectory.addStudentToStudentDirectory(student57);
        System.out.println("STUDENT USER ADDED: " + student57);
        student57.addCourseToTheStudent(course5);
        
        Student student58 = new Student();
        student58.setDomain("IS");
        student58.setFullName("TEST STUDENT58");
        student58.setUserId("STUDENT58");
        student58.setPassword("STUDENT58");
        studentDirectory.addStudentToStudentDirectory(student58);
        System.out.println("STUDENT USER ADDED: " + student58);
        student58.addCourseToTheStudent(course5);
        
        Student student59 = new Student();
        student59.setDomain("IS");
        student59.setFullName("TEST STUDENT59");
        student59.setUserId("STUDENT59");
        student59.setPassword("STUDENT59");
        studentDirectory.addStudentToStudentDirectory(student59);
        System.out.println("STUDENT USER ADDED: " + student59);
        student59.addCourseToTheStudent(course5);
        
        Faculty faculty6 = new Faculty();
        faculty6.setFullName("FACULTY TEST6");
        faculty6.setSpeciality("SOFTWARE6");
        faculty6.setFacultyId("FACULTY6");
        faculty6.setPassword("FACULTY6");
        this.facultyDirectory.addFacultyToFacultyDirectory(faculty6);
        System.out.println("FACULTY USER ADDED: " + faculty6);
        
        Course course6 = new Course();
        course6.setCourseId(6);
        course6.setCourseName("course6");
        course6.setCredit(6);
        course6.setPrice(6);
        course6.setRegion("region6");
        course6.setLanguage("lang6");
        course6.setFaculty(faculty6);
        course6.setSemester("sem6");
        courseCatalog.addCourseToCourseList(course6);
        
        Student student6 = new Student();
        student6.setDomain("IS");
        student6.setFullName("TEST STUDENT6");
        student6.setUserId("STUDENT6");
        student6.setPassword("STUDENT6");
        studentDirectory.addStudentToStudentDirectory(student6);
        System.out.println("STUDENT USER ADDED: " + student6);
        student6.addCourseToTheStudent(course6);
        
        Student student61 = new Student();
        student61.setDomain("IS");
        student61.setFullName("TEST STUDENT61");
        student61.setUserId("STUDENT61");
        student61.setPassword("STUDENT61");
        studentDirectory.addStudentToStudentDirectory(student61);
        System.out.println("STUDENT USER ADDED: " + student61);
        student61.addCourseToTheStudent(course6);
        
        Student student62 = new Student();
        student62.setDomain("IS");
        student62.setFullName("TEST STUDENT62");
        student62.setUserId("STUDENT62");
        student62.setPassword("STUDENT62");
        studentDirectory.addStudentToStudentDirectory(student62);
        System.out.println("STUDENT USER ADDED: " + student62);
        student62.addCourseToTheStudent(course6);
        
        Student student63 = new Student();
        student63.setDomain("IS");
        student63.setFullName("TEST STUDENT63");
        student63.setUserId("STUDENT63");
        student63.setPassword("STUDENT63");
        studentDirectory.addStudentToStudentDirectory(student63);
        System.out.println("STUDENT USER ADDED: " + student63);
        student63.addCourseToTheStudent(course6);
        
        Student student64 = new Student();
        student64.setDomain("IS");
        student64.setFullName("TEST STUDENT64");
        student64.setUserId("STUDENT64");
        student64.setPassword("STUDENT64");
        studentDirectory.addStudentToStudentDirectory(student64);
        System.out.println("STUDENT USER ADDED: " + student64);
        student64.addCourseToTheStudent(course6);
        
        Student student65 = new Student();
        student65.setDomain("IS");
        student65.setFullName("TEST STUDENT65");
        student65.setUserId("STUDENT65");
        student65.setPassword("STUDENT65");
        studentDirectory.addStudentToStudentDirectory(student65);
        System.out.println("STUDENT USER ADDED: " + student65);
        student65.addCourseToTheStudent(course6);
        
        Student student66 = new Student();
        student66.setDomain("IS");
        student66.setFullName("TEST STUDENT66");
        student66.setUserId("STUDENT66");
        student66.setPassword("STUDENT66");
        studentDirectory.addStudentToStudentDirectory(student66);
        System.out.println("STUDENT USER ADDED: " + student66);
        student66.addCourseToTheStudent(course6);
        
        Student student67 = new Student();
        student67.setDomain("IS");
        student67.setFullName("TEST STUDENT67");
        student67.setUserId("STUDENT67");
        student67.setPassword("STUDENT67");
        studentDirectory.addStudentToStudentDirectory(student67);
        System.out.println("STUDENT USER ADDED: " + student67);
        student67.addCourseToTheStudent(course6);
        
        Student student68 = new Student();
        student68.setDomain("IS");
        student68.setFullName("TEST STUDENT68");
        student68.setUserId("STUDENT68");
        student68.setPassword("STUDENT68");
        studentDirectory.addStudentToStudentDirectory(student68);
        System.out.println("STUDENT USER ADDED: " + student68);
        student68.addCourseToTheStudent(course6);
        
        Student student69 = new Student();
        student69.setDomain("IS");
        student69.setFullName("TEST STUDENT69");
        student69.setUserId("STUDENT69");
        student69.setPassword("STUDENT69");
        studentDirectory.addStudentToStudentDirectory(student69);
        System.out.println("STUDENT USER ADDED: " + student69);
        student69.addCourseToTheStudent(course6);
        
        Faculty faculty7 = new Faculty();
        faculty7.setFullName("FACULTY TEST7");
        faculty7.setSpeciality("SOFTWARE7");
        faculty7.setFacultyId("FACULTY7");
        faculty7.setPassword("FACULTY7");
        this.facultyDirectory.addFacultyToFacultyDirectory(faculty7);
        System.out.println("FACULTY USER ADDED: " + faculty7);
        
        Course course7 = new Course();
        course7.setCourseId(7);
        course7.setCourseName("course7");
        course7.setCredit(7);
        course7.setPrice(7);
        course7.setRegion("region7");
        course7.setLanguage("lang7");
        course7.setFaculty(faculty7);
        course7.setSemester("sem7");
        courseCatalog.addCourseToCourseList(course7);
        
        Student student7 = new Student();
        student7.setDomain("IS");
        student7.setFullName("TEST STUDENT7");
        student7.setUserId("STUDENT7");
        student7.setPassword("STUDENT7");
        studentDirectory.addStudentToStudentDirectory(student7);
        System.out.println("STUDENT USER ADDED: " + student7);
        student7.addCourseToTheStudent(course7);
        
        Student student71 = new Student();
        student71.setDomain("IS");
        student71.setFullName("TEST STUDENT71");
        student71.setUserId("STUDENT71");
        student71.setPassword("STUDENT71");
        studentDirectory.addStudentToStudentDirectory(student71);
        System.out.println("STUDENT USER ADDED: " + student71);
        student71.addCourseToTheStudent(course7);
        
        Student student72 = new Student();
        student72.setDomain("IS");
        student72.setFullName("TEST STUDENT72");
        student72.setUserId("STUDENT72");
        student72.setPassword("STUDENT72");
        studentDirectory.addStudentToStudentDirectory(student72);
        System.out.println("STUDENT USER ADDED: " + student72);
        student72.addCourseToTheStudent(course7);
        
        Student student73 = new Student();
        student73.setDomain("IS");
        student73.setFullName("TEST STUDENT73");
        student73.setUserId("STUDENT73");
        student73.setPassword("STUDENT73");
        studentDirectory.addStudentToStudentDirectory(student73);
        System.out.println("STUDENT USER ADDED: " + student73);
        student73.addCourseToTheStudent(course7);
        
        Student student74 = new Student();
        student74.setDomain("IS");
        student74.setFullName("TEST STUDENT74");
        student74.setUserId("STUDENT74");
        student74.setPassword("STUDENT74");
        studentDirectory.addStudentToStudentDirectory(student74);
        System.out.println("STUDENT USER ADDED: " + student74);
        student74.addCourseToTheStudent(course7);
        
        Student student75 = new Student();
        student75.setDomain("IS");
        student75.setFullName("TEST STUDENT75");
        student75.setUserId("STUDENT75");
        student75.setPassword("STUDENT75");
        studentDirectory.addStudentToStudentDirectory(student75);
        System.out.println("STUDENT USER ADDED: " + student75);
        student75.addCourseToTheStudent(course7);
        
        Student student76 = new Student();
        student76.setDomain("IS");
        student76.setFullName("TEST STUDENT76");
        student76.setUserId("STUDENT76");
        student76.setPassword("STUDENT76");
        studentDirectory.addStudentToStudentDirectory(student76);
        System.out.println("STUDENT USER ADDED: " + student76);
        student76.addCourseToTheStudent(course7);
        
        Student student77 = new Student();
        student77.setDomain("IS");
        student77.setFullName("TEST STUDENT77");
        student77.setUserId("STUDENT77");
        student77.setPassword("STUDENT77");
        studentDirectory.addStudentToStudentDirectory(student77);
        System.out.println("STUDENT USER ADDED: " + student77);
        student77.addCourseToTheStudent(course7);
        
        Student student78 = new Student();
        student78.setDomain("IS");
        student78.setFullName("TEST STUDENT78");
        student78.setUserId("STUDENT78");
        student78.setPassword("STUDENT78");
        studentDirectory.addStudentToStudentDirectory(student78);
        System.out.println("STUDENT USER ADDED: " + student78);
        student78.addCourseToTheStudent(course7);
        
        Student student79 = new Student();
        student79.setDomain("IS");
        student79.setFullName("TEST STUDENT79");
        student79.setUserId("STUDENT79");
        student79.setPassword("STUDENT79");
        studentDirectory.addStudentToStudentDirectory(student79);
        System.out.println("STUDENT USER ADDED: " + student79);
        student79.addCourseToTheStudent(course7);
        
        Faculty faculty8 = new Faculty();
        faculty8.setFullName("FACULTY TEST8");
        faculty8.setSpeciality("SOFTWARE8");
        faculty8.setFacultyId("FACULTY8");
        faculty8.setPassword("FACULTY8");
        this.facultyDirectory.addFacultyToFacultyDirectory(faculty8);
        System.out.println("FACULTY USER ADDED: " + faculty8);
        
        Course course8 = new Course();
        course8.setCourseId(8);
        course8.setCourseName("course8");
        course8.setCredit(8);
        course8.setPrice(8);
        course8.setRegion("region8");
        course8.setLanguage("lang8");
        course8.setFaculty(faculty8);
        course8.setSemester("sem8");
        courseCatalog.addCourseToCourseList(course8);
        
        Student student8 = new Student();
        student8.setDomain("IS");
        student8.setFullName("TEST STUDENT8");
        student8.setUserId("STUDENT8");
        student8.setPassword("STUDENT8");
        studentDirectory.addStudentToStudentDirectory(student8);
        System.out.println("STUDENT USER ADDED: " + student8);
        student8.addCourseToTheStudent(course8);
        
        Student student81 = new Student();
        student81.setDomain("IS");
        student81.setFullName("TEST STUDENT81");
        student81.setUserId("STUDENT81");
        student81.setPassword("STUDENT81");
        studentDirectory.addStudentToStudentDirectory(student81);
        System.out.println("STUDENT USER ADDED: " + student81);
        student81.addCourseToTheStudent(course8);
        
        Student student82 = new Student();
        student82.setDomain("IS");
        student82.setFullName("TEST STUDENT82");
        student82.setUserId("STUDENT82");
        student82.setPassword("STUDENT82");
        studentDirectory.addStudentToStudentDirectory(student82);
        System.out.println("STUDENT USER ADDED: " + student82);
        student82.addCourseToTheStudent(course8);
        
        Student student83 = new Student();
        student83.setDomain("IS");
        student83.setFullName("TEST STUDENT83");
        student83.setUserId("STUDENT83");
        student83.setPassword("STUDENT83");
        studentDirectory.addStudentToStudentDirectory(student83);
        System.out.println("STUDENT USER ADDED: " + student83);
        student83.addCourseToTheStudent(course8);
        
        Student student84 = new Student();
        student84.setDomain("IS");
        student84.setFullName("TEST STUDENT84");
        student84.setUserId("STUDENT84");
        student84.setPassword("STUDENT84");
        studentDirectory.addStudentToStudentDirectory(student84);
        System.out.println("STUDENT USER ADDED: " + student84);
        student84.addCourseToTheStudent(course8);
        
        Student student85 = new Student();
        student85.setDomain("IS");
        student85.setFullName("TEST STUDENT85");
        student85.setUserId("STUDENT85");
        student85.setPassword("STUDENT85");
        studentDirectory.addStudentToStudentDirectory(student85);
        System.out.println("STUDENT USER ADDED: " + student85);
        student85.addCourseToTheStudent(course8);
        
        Student student86 = new Student();
        student86.setDomain("IS");
        student86.setFullName("TEST STUDENT86");
        student86.setUserId("STUDENT86");
        student86.setPassword("STUDENT86");
        studentDirectory.addStudentToStudentDirectory(student86);
        System.out.println("STUDENT USER ADDED: " + student86);
        student86.addCourseToTheStudent(course8);
        
        Student student87 = new Student();
        student87.setDomain("IS");
        student87.setFullName("TEST STUDENT87");
        student87.setUserId("STUDENT87");
        student87.setPassword("STUDENT87");
        studentDirectory.addStudentToStudentDirectory(student87);
        System.out.println("STUDENT USER ADDED: " + student87);
        student87.addCourseToTheStudent(course8);
        
        Student student88 = new Student();
        student88.setDomain("IS");
        student88.setFullName("TEST STUDENT88");
        student88.setUserId("STUDENT88");
        student88.setPassword("STUDENT88");
        studentDirectory.addStudentToStudentDirectory(student88);
        System.out.println("STUDENT USER ADDED: " + student88);
        student88.addCourseToTheStudent(course8);
        
        Student student89 = new Student();
        student89.setDomain("IS");
        student89.setFullName("TEST STUDENT89");
        student89.setUserId("STUDENT89");
        student89.setPassword("STUDENT89");
        studentDirectory.addStudentToStudentDirectory(student89);
        System.out.println("STUDENT USER ADDED: " + student89);
        student89.addCourseToTheStudent(course8);
        
        Faculty faculty9 = new Faculty();
        faculty9.setFullName("FACULTY TEST9");
        faculty9.setSpeciality("SOFTWARE9");
        faculty9.setFacultyId("FACULTY9");
        faculty9.setPassword("FACULTY9");
        this.facultyDirectory.addFacultyToFacultyDirectory(faculty9);
        System.out.println("FACULTY USER ADDED: " + faculty9);
        
        Course course9 = new Course();
        course9.setCourseId(9);
        course9.setCourseName("course9");
        course9.setCredit(9);
        course9.setPrice(9);
        course9.setRegion("region9");
        course9.setLanguage("lang9");
        course9.setFaculty(faculty9);
        course9.setSemester("sem9");
        courseCatalog.addCourseToCourseList(course9);
        
        Student student9 = new Student();
        student9.setDomain("IS");
        student9.setFullName("TEST STUDENT9");
        student9.setUserId("STUDENT9");
        student9.setPassword("STUDENT9");
        studentDirectory.addStudentToStudentDirectory(student9);
        System.out.println("STUDENT USER ADDED: " + student9);
        student9.addCourseToTheStudent(course9);
        
        Student student91 = new Student();
        student91.setDomain("IS");
        student91.setFullName("TEST STUDENT91");
        student91.setUserId("STUDENT91");
        student91.setPassword("STUDENT91");
        studentDirectory.addStudentToStudentDirectory(student91);
        System.out.println("STUDENT USER ADDED: " + student91);
        student91.addCourseToTheStudent(course9);
        
        Student student92 = new Student();
        student92.setDomain("IS");
        student92.setFullName("TEST STUDENT92");
        student92.setUserId("STUDENT92");
        student92.setPassword("STUDENT92");
        studentDirectory.addStudentToStudentDirectory(student92);
        System.out.println("STUDENT USER ADDED: " + student92);
        student92.addCourseToTheStudent(course9);
        
        Student student93 = new Student();
        student93.setDomain("IS");
        student93.setFullName("TEST STUDENT93");
        student93.setUserId("STUDENT93");
        student93.setPassword("STUDENT93");
        studentDirectory.addStudentToStudentDirectory(student93);
        System.out.println("STUDENT USER ADDED: " + student93);
        student93.addCourseToTheStudent(course9);
        
        Student student94 = new Student();
        student94.setDomain("IS");
        student94.setFullName("TEST STUDENT94");
        student94.setUserId("STUDENT94");
        student94.setPassword("STUDENT94");
        studentDirectory.addStudentToStudentDirectory(student94);
        System.out.println("STUDENT USER ADDED: " + student94);
        student94.addCourseToTheStudent(course9);
        
        Student student95 = new Student();
        student95.setDomain("IS");
        student95.setFullName("TEST STUDENT95");
        student95.setUserId("STUDENT95");
        student95.setPassword("STUDENT95");
        studentDirectory.addStudentToStudentDirectory(student95);
        System.out.println("STUDENT USER ADDED: " + student95);
        student95.addCourseToTheStudent(course9);
        
        Student student96 = new Student();
        student96.setDomain("IS");
        student96.setFullName("TEST STUDENT96");
        student96.setUserId("STUDENT96");
        student96.setPassword("STUDENT96");
        studentDirectory.addStudentToStudentDirectory(student96);
        System.out.println("STUDENT USER ADDED: " + student96);
        student96.addCourseToTheStudent(course9);
        
        Student student97 = new Student();
        student97.setDomain("IS");
        student97.setFullName("TEST STUDENT97");
        student97.setUserId("STUDENT97");
        student97.setPassword("STUDENT97");
        studentDirectory.addStudentToStudentDirectory(student97);
        System.out.println("STUDENT USER ADDED: " + student97);
        student97.addCourseToTheStudent(course9);
        
        Student student98 = new Student();
        student98.setDomain("IS");
        student98.setFullName("TEST STUDENT98");
        student98.setUserId("STUDENT98");
        student98.setPassword("STUDENT98");
        studentDirectory.addStudentToStudentDirectory(student98);
        System.out.println("STUDENT USER ADDED: " + student98);
        student98.addCourseToTheStudent(course9);
        
        Student student99 = new Student();
        student99.setDomain("IS");
        student99.setFullName("TEST STUDENT99");
        student99.setUserId("STUDENT99");
        student99.setPassword("STUDENT99");
        studentDirectory.addStudentToStudentDirectory(student99);
        System.out.println("STUDENT USER ADDED: " + student99);
        student99.addCourseToTheStudent(course9);
        
        Faculty faculty10 = new Faculty();
        faculty10.setFullName("FACULTY TEST10");
        faculty10.setSpeciality("SOFTWARE10");
        faculty10.setFacultyId("FACULTY10");
        faculty10.setPassword("FACULTY10");
        this.facultyDirectory.addFacultyToFacultyDirectory(faculty10);
        System.out.println("FACULTY USER ADDED: " + faculty10);
        
        Course course10 = new Course();
        course10.setCourseId(10);
        course10.setCourseName("course10");
        course10.setCredit(10);
        course10.setPrice(10);
        course10.setRegion("region10");
        course10.setLanguage("lang10");
        course10.setFaculty(faculty10);
        course10.setSemester("sem10");
        courseCatalog.addCourseToCourseList(course10);
        
        Student student10 = new Student();
        student10.setDomain("IS");
        student10.setFullName("TEST STUDENT10");
        student10.setUserId("STUDENT10");
        student10.setPassword("STUDENT10");
        studentDirectory.addStudentToStudentDirectory(student10);
        System.out.println("STUDENT USER ADDED: " + student10);
        student10.addCourseToTheStudent(course10);
        
        Student student101 = new Student();
        student101.setDomain("IS");
        student101.setFullName("TEST STUDENT101");
        student101.setUserId("STUDENT101");
        student101.setPassword("STUDENT101");
        studentDirectory.addStudentToStudentDirectory(student101);
        System.out.println("STUDENT USER ADDED: " + student101);
        student101.addCourseToTheStudent(course10);
        
        Student student102 = new Student();
        student102.setDomain("IS");
        student102.setFullName("TEST STUDENT102");
        student102.setUserId("STUDENT102");
        student102.setPassword("STUDENT102");
        studentDirectory.addStudentToStudentDirectory(student102);
        System.out.println("STUDENT USER ADDED: " + student102);
        student102.addCourseToTheStudent(course10);
        
        Student student103 = new Student();
        student103.setDomain("IS");
        student103.setFullName("TEST STUDENT103");
        student103.setUserId("STUDENT103");
        student103.setPassword("STUDENT103");
        studentDirectory.addStudentToStudentDirectory(student103);
        System.out.println("STUDENT USER ADDED: " + student103);
        student103.addCourseToTheStudent(course10);
        
        Student student104 = new Student();
        student104.setDomain("IS");
        student104.setFullName("TEST STUDENT104");
        student104.setUserId("STUDENT104");
        student104.setPassword("STUDENT104");
        studentDirectory.addStudentToStudentDirectory(student104);
        System.out.println("STUDENT USER ADDED: " + student104);
        student104.addCourseToTheStudent(course10);
        
        Student student105 = new Student();
        student105.setDomain("IS");
        student105.setFullName("TEST STUDENT105");
        student105.setUserId("STUDENT105");
        student105.setPassword("STUDENT105");
        studentDirectory.addStudentToStudentDirectory(student105);
        System.out.println("STUDENT USER ADDED: " + student105);
        student105.addCourseToTheStudent(course10);
        
        Student student106 = new Student();
        student106.setDomain("IS");
        student106.setFullName("TEST STUDENT106");
        student106.setUserId("STUDENT106");
        student106.setPassword("STUDENT106");
        studentDirectory.addStudentToStudentDirectory(student106);
        System.out.println("STUDENT USER ADDED: " + student106);
        student106.addCourseToTheStudent(course10);
        
        Student student107 = new Student();
        student107.setDomain("IS");
        student107.setFullName("TEST STUDENT107");
        student107.setUserId("STUDENT107");
        student107.setPassword("STUDENT107");
        studentDirectory.addStudentToStudentDirectory(student107);
        System.out.println("STUDENT USER ADDED: " + student107);
        student107.addCourseToTheStudent(course10);
        
        Student student108 = new Student();
        student108.setDomain("IS");
        student108.setFullName("TEST STUDENT108");
        student108.setUserId("STUDENT108");
        student108.setPassword("STUDENT108");
        studentDirectory.addStudentToStudentDirectory(student108);
        System.out.println("STUDENT USER ADDED: " + student108);
        student108.addCourseToTheStudent(course10);
        
        Student student109 = new Student();
        student109.setDomain("IS");
        student109.setFullName("TEST STUDENT109");
        student109.setUserId("STUDENT109");
        student109.setPassword("STUDENT109");
        studentDirectory.addStudentToStudentDirectory(student109);
        System.out.println("STUDENT USER ADDED: " + student109);
        student109.addCourseToTheStudent(course10);
        
        Student student110 = new Student();
        student110.setDomain("IS");
        student110.setFullName("TEST STUDENT110");
        student110.setUserId("STUDENT110");
        student110.setPassword("STUDENT110");
        studentDirectory.addStudentToStudentDirectory(student110);
        System.out.println("STUDENT USER ADDED: " + student110);
        student110.addCourseToTheStudent(course10);
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }

    public void setFacultyDirectory(FacultyDirectory facultyDirectory) {
        this.facultyDirectory = facultyDirectory;
    }

    public CourseCatalog getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(CourseCatalog courseCatalog) {
        this.courseCatalog = courseCatalog;
    }
    

}
