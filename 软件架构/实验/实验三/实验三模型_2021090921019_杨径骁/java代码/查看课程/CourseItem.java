/***********************************************************************
 * Module:  CourseItem.java
 * Author:  yjx
 * Purpose: Defines the Class CourseItem
 ***********************************************************************/

import java.util.*;

/** @pdOid 2e255e13-20ee-4128-9698-01da81175b6f */
public class CourseItem {
   /** @pdOid a03268da-7ea3-4826-925c-e5247b8f6ab0 */
   private int courseId;
   /** @pdOid d785e55b-a054-4874-9495-076b8efbfb29 */
   private String courseName;
   /** @pdOid c4e0f72b-a9ff-4a26-bfd5-5b06b499ea1f */
   private String classAddr;
   /** @pdOid 4a47f015-5008-4e2e-81dd-3203ae2bf5e6 */
   private Date courseTime;
   /** @pdOid ffd6f33b-b241-4e1e-b353-820d7bbeeaa8 */
   private String teacherName;
   /** @pdOid 739ce631-f2f6-44dd-b438-17777f35e916 */
   private int courseSize;
   
   /** @pdRoleInfo migr=no name=CourseDB assc=association14 mult=1..1 */
   public CourseDB courseDB;
   
   /** @pdOid fb185ed8-31b4-4007-9577-a4ba73fb4145 */
   public void writeToDB() {
      // TODO: implement
   }

}