/***********************************************************************
 * Module:  CourseControl.java
 * Author:  yjx
 * Purpose: Defines the Class CourseControl
 ***********************************************************************/

import java.util.*;

/** @pdOid 3a07cc7e-6232-4a06-ac79-cf227e308eb3 */
public class CourseControl {
   /** @pdOid 2edd4a6b-d0a3-456e-a8a1-51fd079bf077 */
   public int courseId;
   /** @pdOid 939d84ee-0fea-42f6-8e7b-4467ccea9a94 */
   public String operation;
   
   /** @pdRoleInfo migr=no name=CourseInfo assc=association4 mult=1..1 */
   public CourseInfo courseInfo;
   /** @pdRoleInfo migr=no name=Course assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Course> course;
   
   /** @pdOid 6a5ee8fa-623d-4859-a271-1f9dfdf30f21 */
   public int viewCourseInfo() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid b3490349-b557-43fe-ac8c-733a2b1e3842 */
   public void showDetail() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Course> getCourse() {
      if (course == null)
         course = new java.util.HashSet<Course>();
      return course;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCourse() {
      if (course == null)
         course = new java.util.HashSet<Course>();
      return course.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCourse */
   public void setCourse(java.util.Collection<Course> newCourse) {
      removeAllCourse();
      for (java.util.Iterator iter = newCourse.iterator(); iter.hasNext();)
         addCourse((Course)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCourse */
   public void addCourse(Course newCourse) {
      if (newCourse == null)
         return;
      if (this.course == null)
         this.course = new java.util.HashSet<Course>();
      if (!this.course.contains(newCourse))
         this.course.add(newCourse);
   }
   
   /** @pdGenerated default remove
     * @param oldCourse */
   public void removeCourse(Course oldCourse) {
      if (oldCourse == null)
         return;
      if (this.course != null)
         if (this.course.contains(oldCourse))
            this.course.remove(oldCourse);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCourse() {
      if (course != null)
         course.clear();
   }

}