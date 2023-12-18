/***********************************************************************
 * Module:  ChooseCourseSystem.java
 * Author:  yjx
 * Purpose: Defines the Class ChooseCourseSystem
 ***********************************************************************/

import java.util.*;

/** @pdOid 4ec0058a-4e00-492a-bda2-ee2747084747 */
public class ChooseCourseSystem {
   /** @pdOid 3d76adae-2533-4e02-9c7a-f68cc0f9a623 */
   private int permission;
   
   /** @pdOid 8bb5ed46-9519-4ff5-92ea-bfd50f61ff18 */
   public int systemId;
   /** @pdOid 811ca21c-6832-403c-bb64-726c2489c38e */
   public int version;
   
   /** @pdRoleInfo migr=no name=Course assc=association11 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Course> course;
   
   /** @pdOid ca7699c0-d150-4a7a-b255-bee98d955169 */
   public int judgePermission() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid f7f56f08-6a4c-4c36-9bb7-8182f6ac0d90 */
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