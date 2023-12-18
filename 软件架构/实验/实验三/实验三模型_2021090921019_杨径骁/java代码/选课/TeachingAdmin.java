/***********************************************************************
 * Module:  TeachingAdmin.java
 * Author:  yjx
 * Purpose: Defines the Class TeachingAdmin
 ***********************************************************************/

import java.util.*;

/** @pdOid 13a26e1e-06a8-40c2-a9cb-84414949da55 */
public class TeachingAdmin extends User {
   /** @pdOid 45362452-de50-48d2-ad99-5c9a3644f437 */
   private String name;
   /** @pdOid 6d925972-3d87-4192-a883-3794f10fa1ee */
   private int account;
   /** @pdOid a86e94dd-717a-400d-a71b-2be0d662b890 */
   private String password;
   
   /** @pdOid 19545a91-64b2-4267-a741-b620b8e62d78 */
   public int id;
   /** @pdOid df648398-6371-4c06-b870-17f65cf06612 */
   public int department;
   
   /** @pdRoleInfo migr=no name=ChooseCourseLog assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<ChooseCourseLog> chooseCourseLog;
   /** @pdRoleInfo migr=no name=ChooseCourseSystem assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<ChooseCourseSystem> chooseCourseSystem;
   /** @pdRoleInfo migr=no name=Course assc=association10 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Course> course;
   
   /** @pdOid eab35a6a-51b7-440f-a51a-db10c04b42c8 */
   public boolean updateCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 56566dcc-3418-4880-b019-89c8e391fd29 */
   public boolean deleteCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid a4bbebfe-899b-45be-93bb-f9178e44633d */
   public boolean addCourse() {
      // TODO: implement
      return false;
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