/***********************************************************************
 * Module:  Teacher.java
 * Author:  yjx
 * Purpose: Defines the Class Teacher
 ***********************************************************************/

import java.util.*;

/** @pdOid 5f913bd3-4f98-47b5-8119-f0fda84de2c2 */
public class Teacher extends User {
   /** @pdOid d4eee94d-cb7c-4779-9811-c786d12810a2 */
   private int account;
   /** @pdOid e0c3d52d-2e1e-4ae9-90ab-826ac2c8a383 */
   private String password;
   /** @pdOid 4e2a677e-b60a-4331-8c4d-f8fa6851dad2 */
   private String name;
   
   /** @pdOid 85ea2dcd-2cca-4b44-919a-dd67e3ac54cd */
   public int id;
   /** @pdOid 76d81242-1018-4593-8e8c-471fa598f3ef */
   public int department;
   
   /** @pdRoleInfo migr=no name=QuitCourseLog assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<QuitCourseLog> quitCourseLog;
   /** @pdRoleInfo migr=no name=QuitCourseSystem assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<QuitCourseSystem> quitCourseSystem;
   /** @pdRoleInfo migr=no name=Course assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Course> course;
   
   /** @pdOid 5c9f3e06-7d5f-4ea4-9956-53a7d9ccf154 */
   public String showMyCourses() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid b72c01c8-4c74-4a5a-b70c-54d99d971346 */
   public String viewCourses() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 40938c45-6437-4056-863a-9256c48daa05 */
   public String viewStudents() {
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