/***********************************************************************
 * Module:  CourseItem.java
 * Author:  yjx
 * Purpose: Defines the Class CourseItem
 ***********************************************************************/

import java.util.*;

/** @pdOid 1d07a755-8288-462b-bf8c-87fc0bdb8f81 */
public class CourseItem {
   /** @pdOid ace06e21-c301-4cfe-bd47-70840ef61021 */
   private int courseId;
   /** @pdOid f5755d77-38ca-4fa6-9c74-647eb037dbb5 */
   private String courseName;
   /** @pdOid cfb6651f-1824-422c-82fe-08c52685e20b */
   private String classAddr;
   /** @pdOid 2c79d771-087a-4c15-97a2-db76b7e4903c */
   private Date courseTime;
   /** @pdOid 6c18bfd6-82c1-4f2e-8a66-8c34cb2e635a */
   private String teacherName;
   /** @pdOid 186513be-725a-4e32-a8b3-0c201c4560ea */
   private int courseSize;
   
   /** @pdRoleInfo migr=no name=CourseDB assc=association14 mult=1..1 */
   public CourseDB courseDB;
   
   /** @pdOid a1bbf5ee-0c33-4680-b685-13a52e62ca5b */
   public void writeToDB() {
      // TODO: implement
   }

}