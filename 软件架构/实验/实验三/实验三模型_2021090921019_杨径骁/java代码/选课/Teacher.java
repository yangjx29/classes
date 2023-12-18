/***********************************************************************
 * Module:  Teacher.java
 * Author:  yjx
 * Purpose: Defines the Class Teacher
 ***********************************************************************/

import java.util.*;

/** @pdOid e62b4cde-cb53-4d05-92cf-e1f819d50f5f */
public class Teacher extends User {
   /** @pdOid 2314a53e-5064-48f4-913d-ce15edab502e */
   private int account;
   /** @pdOid 7f190762-dbe5-4446-a67b-0431872ff594 */
   private String password;
   /** @pdOid 6e35b7c0-eacc-42a1-82c5-26846ae440eb */
   private String name;
   
   /** @pdOid ea958903-9dfb-4ade-91f8-47e8a26c4648 */
   public int id;
   /** @pdOid f8dec701-c015-47ff-9710-bfb066a1e9e8 */
   public int department;
   
   /** @pdRoleInfo migr=no name=ChooseCourseLog assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<ChooseCourseLog> chooseCourseLog;
   /** @pdRoleInfo migr=no name=ChooseCourseSystem assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<ChooseCourseSystem> chooseCourseSystem;
   /** @pdRoleInfo migr=no name=Course assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Course> course;
   
   /** @pdOid 3ee71064-b1e2-47b5-8a49-76d41a1bfd74 */
   public String showMyCourses() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 2f9ad6b3-07bf-4cc5-9af5-023dd0c86ac2 */
   public String viewCourses() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 3b5e4ade-bac1-49db-88d9-c50b6d14234e */
   public String viewStudents() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<ChooseCourseLog> getChooseCourseLog() {
      if (chooseCourseLog == null)
         chooseCourseLog = new java.util.HashSet<ChooseCourseLog>();
      return chooseCourseLog;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorChooseCourseLog() {
      if (chooseCourseLog == null)
         chooseCourseLog = new java.util.HashSet<ChooseCourseLog>();
      return chooseCourseLog.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newChooseCourseLog */
   public void setChooseCourseLog(java.util.Collection<ChooseCourseLog> newChooseCourseLog) {
      removeAllChooseCourseLog();
      for (java.util.Iterator iter = newChooseCourseLog.iterator(); iter.hasNext();)
         addChooseCourseLog((ChooseCourseLog)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newChooseCourseLog */
   public void addChooseCourseLog(ChooseCourseLog newChooseCourseLog) {
      if (newChooseCourseLog == null)
         return;
      if (this.chooseCourseLog == null)
         this.chooseCourseLog = new java.util.HashSet<ChooseCourseLog>();
      if (!this.chooseCourseLog.contains(newChooseCourseLog))
         this.chooseCourseLog.add(newChooseCourseLog);
   }
   
   /** @pdGenerated default remove
     * @param oldChooseCourseLog */
   public void removeChooseCourseLog(ChooseCourseLog oldChooseCourseLog) {
      if (oldChooseCourseLog == null)
         return;
      if (this.chooseCourseLog != null)
         if (this.chooseCourseLog.contains(oldChooseCourseLog))
            this.chooseCourseLog.remove(oldChooseCourseLog);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllChooseCourseLog() {
      if (chooseCourseLog != null)
         chooseCourseLog.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<ChooseCourseSystem> getChooseCourseSystem() {
      if (chooseCourseSystem == null)
         chooseCourseSystem = new java.util.HashSet<ChooseCourseSystem>();
      return chooseCourseSystem;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorChooseCourseSystem() {
      if (chooseCourseSystem == null)
         chooseCourseSystem = new java.util.HashSet<ChooseCourseSystem>();
      return chooseCourseSystem.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newChooseCourseSystem */
   public void setChooseCourseSystem(java.util.Collection<ChooseCourseSystem> newChooseCourseSystem) {
      removeAllChooseCourseSystem();
      for (java.util.Iterator iter = newChooseCourseSystem.iterator(); iter.hasNext();)
         addChooseCourseSystem((ChooseCourseSystem)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newChooseCourseSystem */
   public void addChooseCourseSystem(ChooseCourseSystem newChooseCourseSystem) {
      if (newChooseCourseSystem == null)
         return;
      if (this.chooseCourseSystem == null)
         this.chooseCourseSystem = new java.util.HashSet<ChooseCourseSystem>();
      if (!this.chooseCourseSystem.contains(newChooseCourseSystem))
         this.chooseCourseSystem.add(newChooseCourseSystem);
   }
   
   /** @pdGenerated default remove
     * @param oldChooseCourseSystem */
   public void removeChooseCourseSystem(ChooseCourseSystem oldChooseCourseSystem) {
      if (oldChooseCourseSystem == null)
         return;
      if (this.chooseCourseSystem != null)
         if (this.chooseCourseSystem.contains(oldChooseCourseSystem))
            this.chooseCourseSystem.remove(oldChooseCourseSystem);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllChooseCourseSystem() {
      if (chooseCourseSystem != null)
         chooseCourseSystem.clear();
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