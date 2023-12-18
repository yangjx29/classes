/***********************************************************************
 * Module:  Student.java
 * Author:  yjx
 * Purpose: Defines the Class Student
 ***********************************************************************/

import java.util.*;

/** @pdOid 89b63c31-ceb7-4871-85f2-f6efeda3d144 */
public class Student extends User {
   /** @pdOid 0c772b67-5160-4e13-89d9-eb1b78ab430d */
   private int account;
   /** @pdOid b6aca85a-8fe2-4a2b-9698-9ab76246a63f */
   private String password;
   /** @pdOid c9c24519-d6aa-4d54-adcb-8f7df28fdee7 */
   private int name;
   
   /** @pdOid a2bf0651-b420-448f-92f0-89195032ccbb */
   public int id;
   /** @pdOid 0e59f93f-f3e0-405d-b386-b7d4533ca60f */
   public int department;
   
   /** @pdRoleInfo migr=no name=ChooseCourseLog assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<ChooseCourseLog> chooseCourseLog;
   /** @pdRoleInfo migr=no name=ChooseCourseSystem assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<ChooseCourseSystem> chooseCourseSystem;
   /** @pdRoleInfo migr=no name=Course assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Course> course;
   
   /** @pdOid a35b2d87-c93e-4f74-9854-c16758905a80 */
   public boolean chooseCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 3cc75126-1228-4df7-a89e-901e78a48122 */
   public boolean quitCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 42213297-1f3f-43be-8beb-28a5b8346cac */
   public String viewCourseDetail() {
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