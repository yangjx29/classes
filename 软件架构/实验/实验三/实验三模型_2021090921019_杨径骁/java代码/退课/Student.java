/***********************************************************************
 * Module:  Student.java
 * Author:  yjx
 * Purpose: Defines the Class Student
 ***********************************************************************/

import java.util.*;

/** @pdOid a9b56c1f-9c1c-4157-9a6e-30f3092b04ad */
public class Student extends User {
   /** @pdOid 2b4623dd-84ac-439b-abfd-f31f0a096f6d */
   private int account;
   /** @pdOid 2bacd28b-1464-478d-9a15-94d6a0cc6b08 */
   private String password;
   /** @pdOid 8893b8d7-6ad3-438a-9084-5f7858dc3da0 */
   private int name;
   
   /** @pdOid c6f6717f-8d54-451d-80ea-0f7b0712019b */
   public int id;
   /** @pdOid aedecb03-918a-438a-bfa9-10a451f7f61f */
   public int department;
   
   /** @pdRoleInfo migr=no name=QuitCourseLog assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<QuitCourseLog> quitCourseLog;
   /** @pdRoleInfo migr=no name=QuitCourseSystem assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<QuitCourseSystem> quitCourseSystem;
   /** @pdRoleInfo migr=no name=Course assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Course> course;
   
   /** @pdOid d2403b78-b738-43fc-81b4-5ed3016ffb0a */
   public boolean chooseCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 4dbead92-e4b7-482f-b265-2a1e52086ecf */
   public boolean quitCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 6cbe4382-196e-42a3-9b14-e5c53c52f740 */
   public String viewCourseDetail() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<QuitCourseLog> getQuitCourseLog() {
      if (quitCourseLog == null)
         quitCourseLog = new java.util.HashSet<QuitCourseLog>();
      return quitCourseLog;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorQuitCourseLog() {
      if (quitCourseLog == null)
         quitCourseLog = new java.util.HashSet<QuitCourseLog>();
      return quitCourseLog.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newQuitCourseLog */
   public void setQuitCourseLog(java.util.Collection<QuitCourseLog> newQuitCourseLog) {
      removeAllQuitCourseLog();
      for (java.util.Iterator iter = newQuitCourseLog.iterator(); iter.hasNext();)
         addQuitCourseLog((QuitCourseLog)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newQuitCourseLog */
   public void addQuitCourseLog(QuitCourseLog newQuitCourseLog) {
      if (newQuitCourseLog == null)
         return;
      if (this.quitCourseLog == null)
         this.quitCourseLog = new java.util.HashSet<QuitCourseLog>();
      if (!this.quitCourseLog.contains(newQuitCourseLog))
         this.quitCourseLog.add(newQuitCourseLog);
   }
   
   /** @pdGenerated default remove
     * @param oldQuitCourseLog */
   public void removeQuitCourseLog(QuitCourseLog oldQuitCourseLog) {
      if (oldQuitCourseLog == null)
         return;
      if (this.quitCourseLog != null)
         if (this.quitCourseLog.contains(oldQuitCourseLog))
            this.quitCourseLog.remove(oldQuitCourseLog);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllQuitCourseLog() {
      if (quitCourseLog != null)
         quitCourseLog.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<QuitCourseSystem> getQuitCourseSystem() {
      if (quitCourseSystem == null)
         quitCourseSystem = new java.util.HashSet<QuitCourseSystem>();
      return quitCourseSystem;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorQuitCourseSystem() {
      if (quitCourseSystem == null)
         quitCourseSystem = new java.util.HashSet<QuitCourseSystem>();
      return quitCourseSystem.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newQuitCourseSystem */
   public void setQuitCourseSystem(java.util.Collection<QuitCourseSystem> newQuitCourseSystem) {
      removeAllQuitCourseSystem();
      for (java.util.Iterator iter = newQuitCourseSystem.iterator(); iter.hasNext();)
         addQuitCourseSystem((QuitCourseSystem)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newQuitCourseSystem */
   public void addQuitCourseSystem(QuitCourseSystem newQuitCourseSystem) {
      if (newQuitCourseSystem == null)
         return;
      if (this.quitCourseSystem == null)
         this.quitCourseSystem = new java.util.HashSet<QuitCourseSystem>();
      if (!this.quitCourseSystem.contains(newQuitCourseSystem))
         this.quitCourseSystem.add(newQuitCourseSystem);
   }
   
   /** @pdGenerated default remove
     * @param oldQuitCourseSystem */
   public void removeQuitCourseSystem(QuitCourseSystem oldQuitCourseSystem) {
      if (oldQuitCourseSystem == null)
         return;
      if (this.quitCourseSystem != null)
         if (this.quitCourseSystem.contains(oldQuitCourseSystem))
            this.quitCourseSystem.remove(oldQuitCourseSystem);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllQuitCourseSystem() {
      if (quitCourseSystem != null)
         quitCourseSystem.clear();
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