/***********************************************************************
 * Module:  Course.java
 * Author:  yjx
 * Purpose: Defines the Class Course
 ***********************************************************************/

import java.util.*;

/** @pdOid 38a14585-c4a8-4059-832b-f3c104be5aa8 */
public class Course {
   /** @pdOid ae726e8c-3ec2-470d-8f4a-b6655f10b95c */
   private int courseId;
   /** @pdOid b4ce044d-d2b2-4afe-967e-403e19f4837a */
   private String courseName;
   /** @pdOid 10213c22-25a8-4549-bc5e-e5c312c8929c */
   private String classAddr;
   /** @pdOid 21846758-ae88-4e57-a07e-6a2eadd2ab23 */
   private Date courseTime;
   /** @pdOid bc63b149-824e-4c54-8051-dac58024be4c */
   private String teacherName;
   /** @pdOid 7f19c185-89a6-4fdd-9eb3-491548721484 */
   private int courseSize;
   
   /** @pdRoleInfo migr=no name=CourseItem assc=association12 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<CourseItem> courseItem;
   /** @pdRoleInfo migr=no name=CourseDB assc=association13 mult=1..1 */
   public CourseDB courseDB;
   /** @pdRoleInfo migr=no name=CourseInfo assc=association5 mult=1..1 */
   public CourseInfo courseInfo;
   /** @pdRoleInfo migr=no name=StudentList assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   public java.util.Collection<StudentList> studentList;
   
   /** @pdOid 0e881a13-8ccd-4424-b4ca-c7be88aebbaa */
   public int chooseCourse() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 573349ea-8f3f-4ccc-b1a4-c3ad684fefd1 */
   public void operatorCourse() {
      // TODO: implement
   }
   
   /** @pdOid 4240c218-6864-4fdf-9780-0cb3554e82e8 */
   public boolean addCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 3d02e22a-ebcd-4a1d-a96c-47925451bc5c */
   public boolean setCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 058ac1ce-b5ad-42d1-aaf1-efd87225bcd2 */
   public boolean updateCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 8e7d151a-8c78-48af-a8df-417d225b0481 */
   public boolean deleteCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 0fcaa9ea-fcf8-4890-a64e-ff9d58e2b93b */
   public int getCourseSize() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 37beb6dd-0e0b-4952-ab10-2fe0aa61c764 */
   public String getCourseDetail() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<CourseItem> getCourseItem() {
      if (courseItem == null)
         courseItem = new java.util.HashSet<CourseItem>();
      return courseItem;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCourseItem() {
      if (courseItem == null)
         courseItem = new java.util.HashSet<CourseItem>();
      return courseItem.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCourseItem */
   public void setCourseItem(java.util.Collection<CourseItem> newCourseItem) {
      removeAllCourseItem();
      for (java.util.Iterator iter = newCourseItem.iterator(); iter.hasNext();)
         addCourseItem((CourseItem)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCourseItem */
   public void addCourseItem(CourseItem newCourseItem) {
      if (newCourseItem == null)
         return;
      if (this.courseItem == null)
         this.courseItem = new java.util.HashSet<CourseItem>();
      if (!this.courseItem.contains(newCourseItem))
         this.courseItem.add(newCourseItem);
   }
   
   /** @pdGenerated default remove
     * @param oldCourseItem */
   public void removeCourseItem(CourseItem oldCourseItem) {
      if (oldCourseItem == null)
         return;
      if (this.courseItem != null)
         if (this.courseItem.contains(oldCourseItem))
            this.courseItem.remove(oldCourseItem);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCourseItem() {
      if (courseItem != null)
         courseItem.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<StudentList> getStudentList() {
      if (studentList == null)
         studentList = new java.util.HashSet<StudentList>();
      return studentList;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorStudentList() {
      if (studentList == null)
         studentList = new java.util.HashSet<StudentList>();
      return studentList.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newStudentList */
   public void setStudentList(java.util.Collection<StudentList> newStudentList) {
      removeAllStudentList();
      for (java.util.Iterator iter = newStudentList.iterator(); iter.hasNext();)
         addStudentList((StudentList)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newStudentList */
   public void addStudentList(StudentList newStudentList) {
      if (newStudentList == null)
         return;
      if (this.studentList == null)
         this.studentList = new java.util.HashSet<StudentList>();
      if (!this.studentList.contains(newStudentList))
         this.studentList.add(newStudentList);
   }
   
   /** @pdGenerated default remove
     * @param oldStudentList */
   public void removeStudentList(StudentList oldStudentList) {
      if (oldStudentList == null)
         return;
      if (this.studentList != null)
         if (this.studentList.contains(oldStudentList))
            this.studentList.remove(oldStudentList);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllStudentList() {
      if (studentList != null)
         studentList.clear();
   }

}