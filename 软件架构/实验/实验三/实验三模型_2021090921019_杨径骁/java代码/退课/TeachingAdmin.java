/***********************************************************************
 * Module:  TeachingAdmin.java
 * Author:  yjx
 * Purpose: Defines the Class TeachingAdmin
 ***********************************************************************/

import java.util.*;

/** @pdOid 67f51bcf-a04d-43fd-88bd-bc542b480604 */
public class TeachingAdmin extends User {
   /** @pdOid c225e5b4-5e88-42a9-8ba0-4428087a283f */
   private String name;
   /** @pdOid 52d40c2b-9642-4ede-a78c-53b469f406ad */
   private int account;
   /** @pdOid a4238421-5bfc-4eed-ab1d-af5a9136c45a */
   private String password;
   
   /** @pdOid e81af7ea-8ce9-4216-9ca8-8985090e53e0 */
   public int id;
   /** @pdOid 66964a34-3533-407b-a357-a159b49b60b1 */
   public int department;
   
   /** @pdRoleInfo migr=no name=QuitCourseLog assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<QuitCourseLog> quitCourseLog;
   /** @pdRoleInfo migr=no name=QuitCourseSystem assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<QuitCourseSystem> quitCourseSystem;
   /** @pdRoleInfo migr=no name=Course assc=association10 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Course> course;
   
   /** @pdOid bc388e98-0c39-46c4-9f9b-30d36957e8f2 */
   public boolean updateCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid ba3b4ab2-7fe4-4545-84ec-dfd9db0d5995 */
   public boolean deleteCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid db8b701d-dc74-4311-b050-9ac0acd96dbc */
   public boolean addCourse() {
      // TODO: implement
      return false;
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