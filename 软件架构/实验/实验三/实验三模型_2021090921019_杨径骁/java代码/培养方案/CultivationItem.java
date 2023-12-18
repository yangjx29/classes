/***********************************************************************
 * Module:  CultivationItem.java
 * Author:  yjx
 * Purpose: Defines the Class CultivationItem
 ***********************************************************************/

import java.util.*;

/** @pdOid 0839b631-2f8e-4b9e-a372-90e618fe7470 */
public class CultivationItem {
   /** @pdOid d0c06470-d25b-45bc-b6b2-d45a781c92eb */
   private int courseId;
   /** @pdOid 065c1cee-5669-4b37-960c-1a5d4cb0fdab */
   private String courseName;
   /** @pdOid 20793bd3-ac75-4ec5-835e-0d74b04cd9f3 */
   private String classAddr;
   /** @pdOid 3aa6c81a-31dc-4271-b2f0-05b281666a3a */
   private Date courseTime;
   /** @pdOid 3d4a8a7f-0bc9-4009-ac1f-7bfdbde45e4d */
   private String teacherName;
   /** @pdOid 61dac3ee-81d9-4d94-831c-04da9986d207 */
   private int courseSize;
   
   /** @pdRoleInfo migr=no name=CultivationDB assc=association14 mult=1..1 */
   public CultivationDB cultivationDB;
   
   /** @pdOid a3165a37-a009-46d0-955a-316280019adb */
   public void writeToDB() {
      // TODO: implement
   }

}