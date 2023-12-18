/***********************************************************************
 * Module:  CourseItem.java
 * Author:  yjx
 * Purpose: Defines the Class CourseItem
 ***********************************************************************/

import java.util.*;

/** @pdOid 828517f8-f526-4411-a54c-84f2dc63db02 */
public class CourseItem {
   /** @pdOid 9ccda82c-5602-4352-a09c-2fcd96fe7814 */
   private int courseId;
   /** @pdOid dd45c844-ce54-48c6-b9d0-91fe0a9f035e */
   private String courseName;
   /** @pdOid 86b2a362-cede-464c-8fce-6be4d6f5206d */
   private String classAddr;
   /** @pdOid 69267754-d095-4b33-a437-8a1fef48dd08 */
   private Date courseTime;
   /** @pdOid 967b7436-8c3d-40e2-8a22-99f90d82d45b */
   private String teacherName;
   /** @pdOid 5f4bc30b-a993-403a-a02c-95288dbcf039 */
   private int courseSize;
   
   /** @pdRoleInfo migr=no name=CourseDB assc=association14 mult=1..1 */
   public CourseDB courseDB;
   
   /** @pdOid c1a6e7c5-37f0-4bcb-91f5-c36b56091262 */
   public void writeToDB() {
      // TODO: implement
   }

}