/***********************************************************************
 * Module:  Course.java
 * Author:  yjx
 * Purpose: Defines the Class Course
 ***********************************************************************/

import java.util.*;

/** @pdOid 45bc2fb8-766d-48f0-a75e-e16f49079b34 */
public class Course {
   /** @pdOid b2f7af9e-2764-44cc-a8b9-b416c683c634 */
   private int courseId;
   /** @pdOid 2a0d55a9-ff5d-4e1f-956c-3dd07baa00ad */
   private String courseName;
   /** @pdOid f0cdd046-adf8-43d0-b51c-d1af55c507dc */
   private String classAddr;
   /** @pdOid 312eb7d5-de4e-4dd0-9b69-9ba0ba7d7db8 */
   private Date courseTime;
   /** @pdOid 2ce8868a-b4f7-4bad-92b7-3308268379d2 */
   private String teacherName;
   /** @pdOid a7c7b52c-7bbf-4b71-af79-c4480de9335b */
   private int courseSize;
   
   /** @pdRoleInfo migr=no name=CourseItem assc=association12 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<CourseItem> courseItem;
   /** @pdRoleInfo migr=no name=CourseDB assc=association13 mult=1..1 */
   public CourseDB courseDB;
   /** @pdRoleInfo migr=no name=StudentList assc=association15 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<StudentList> studentList;
   
   /** @pdOid 8fcc5e69-e112-42e1-9e17-3395f7b4582c */
   public int chooseCourse() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid c02e7577-bdca-4b91-83b6-f309543973d4 */
   public void operatorCourse() {
      // TODO: implement
   }
   
   /** @pdOid 7602e1e6-f84e-4fc9-a33c-31e597b2e474 */
   public boolean addCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid d7d8239b-c248-4546-ad89-abf4f938b882 */
   public boolean setCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid ecdc3409-7f2c-4425-981a-54eff46e130c */
   public boolean updateCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid d7d53120-e33d-4917-b659-40e25d608a95 */
   public boolean deleteCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid c47e7635-685d-47c1-8693-167437f80dab */
   public int getCourseSize() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 4ec3b142-865c-419b-adb3-be5dee008c7b */
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