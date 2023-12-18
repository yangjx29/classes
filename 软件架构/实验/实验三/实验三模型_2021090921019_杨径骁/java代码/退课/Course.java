/***********************************************************************
 * Module:  Course.java
 * Author:  yjx
 * Purpose: Defines the Class Course
 ***********************************************************************/

import java.util.*;

/** @pdOid 7a28198a-edfe-4fb1-8049-973e94f0931a */
public class Course {
   /** @pdOid d735312c-803b-4f73-b28a-8024a9e2e01f */
   private int courseId;
   /** @pdOid 201b5ec3-7a68-4563-8cd5-030ad668e463 */
   private String courseName;
   /** @pdOid 77d5d26e-bd5b-49b8-993f-660e62f0c8b9 */
   private String classAddr;
   /** @pdOid 524404f5-c16b-43a7-95ea-d26ac0d16aac */
   private Date courseTime;
   /** @pdOid 251f4753-03e1-4ec1-8e3f-1f87fcfa4d08 */
   private String teacherName;
   /** @pdOid 68682b6e-cb6e-44d0-abd9-9ad24d508f9e */
   private int courseSize;
   
   /** @pdRoleInfo migr=no name=CourseItem assc=association12 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<CourseItem> courseItem;
   /** @pdRoleInfo migr=no name=CourseDB assc=association13 mult=1..1 */
   public CourseDB courseDB;
   
   /** @pdOid f843b496-6576-42a8-a3bc-b2faf16be9b1 */
   public int chooseCourse() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 6f618b41-0ab1-427e-89a6-116f528fd1b1 */
   public void operatorCourse() {
      // TODO: implement
   }
   
   /** @pdOid 5a34131d-73f9-4fda-801d-ed31fbdc11ce */
   public boolean addCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid a695dcc6-c8db-454a-8546-05f239c9667d */
   public boolean setCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid 11d66be3-de46-4ca4-8a7a-acb0c80b5e43 */
   public boolean updateCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid d4fab398-002e-44d6-8745-bc866e52a05f */
   public boolean deleteCourse() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid c153b9a8-0649-489d-a4e8-99fddf9339bd */
   public int getCourseSize() {
      // TODO: implement
      return 0;
   }
   
   /** @pdOid 09a429c7-dd0d-4bfa-b40f-b639437b4334 */
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

}