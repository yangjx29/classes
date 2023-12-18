/***********************************************************************
 * Module:  QuitCourseSystem.java
 * Author:  yjx
 * Purpose: Defines the Class QuitCourseSystem
 ***********************************************************************/

import java.util.*;

/** @pdOid 89a11650-ceb6-415b-80fb-391918c3478c */
public class QuitCourseSystem {
   /** @pdOid bb07593a-6afb-4d7d-9227-fbc72eca87de */
   private int permission;
   
   /** @pdOid 3bc92d34-a8c6-4ffa-9783-02c477caf557 */
   public int systemId;
   /** @pdOid 89a43e74-6df8-4061-bf31-1ae64bb3779b */
   public int version;
   
   /** @pdRoleInfo migr=no name=Course assc=association11 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Course> course;
   
   /** @pdOid f9fbcf6a-3534-4aaf-9199-903536d212c9 */
   public int judgePermission() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 73843758-4a31-4144-bbe0-bc382db64b22 */
   public void operatorCourse() {
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