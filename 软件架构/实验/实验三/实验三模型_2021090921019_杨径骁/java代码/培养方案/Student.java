/***********************************************************************
 * Module:  Student.java
 * Author:  yjx
 * Purpose: Defines the Class Student
 ***********************************************************************/

import java.util.*;

/** @pdOid 177693b5-573e-4301-96b8-f03099b1cdd6 */
public class Student extends User {
   /** @pdOid f33f1f96-16df-4571-9483-ce660dac6bfa */
   private int account;
   /** @pdOid fbfe2374-b612-4506-833d-38b57e50dc43 */
   private String password;
   /** @pdOid 20160cb6-4e06-4dc2-9ce6-c87816ffd6e1 */
   private int name;
   
   /** @pdOid cbda139d-d576-4b7f-afb6-9befbc3726f0 */
   public int id;
   /** @pdOid f2e7d054-bcc3-4c4d-88fe-dfba627de816 */
   public int department;
   
   /** @pdRoleInfo migr=no name=CultivationLog assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<CultivationLog> cultivationLog;
   /** @pdRoleInfo migr=no name=CultivationControl assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<CultivationControl> cultivationControl;
   /** @pdRoleInfo migr=no name=Cultivation assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Cultivation> cultivation;
   
   /** @pdOid 771f685c-56cb-4104-96d3-d29aa8322d43 */
   public void chooseCultivation() {
      // TODO: implement
   }
   
   /** @pdOid 42237bc1-59ca-4973-81d8-ad359ffe6e42 */
   public String showCultivation() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid a9ac954f-e1be-430a-8f7b-c99bff18e292 */
   public String viewDetail() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<CultivationLog> getCultivationLog() {
      if (cultivationLog == null)
         cultivationLog = new java.util.HashSet<CultivationLog>();
      return cultivationLog;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCultivationLog() {
      if (cultivationLog == null)
         cultivationLog = new java.util.HashSet<CultivationLog>();
      return cultivationLog.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCultivationLog */
   public void setCultivationLog(java.util.Collection<CultivationLog> newCultivationLog) {
      removeAllCultivationLog();
      for (java.util.Iterator iter = newCultivationLog.iterator(); iter.hasNext();)
         addCultivationLog((CultivationLog)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCultivationLog */
   public void addCultivationLog(CultivationLog newCultivationLog) {
      if (newCultivationLog == null)
         return;
      if (this.cultivationLog == null)
         this.cultivationLog = new java.util.HashSet<CultivationLog>();
      if (!this.cultivationLog.contains(newCultivationLog))
         this.cultivationLog.add(newCultivationLog);
   }
   
   /** @pdGenerated default remove
     * @param oldCultivationLog */
   public void removeCultivationLog(CultivationLog oldCultivationLog) {
      if (oldCultivationLog == null)
         return;
      if (this.cultivationLog != null)
         if (this.cultivationLog.contains(oldCultivationLog))
            this.cultivationLog.remove(oldCultivationLog);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCultivationLog() {
      if (cultivationLog != null)
         cultivationLog.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<CultivationControl> getCultivationControl() {
      if (cultivationControl == null)
         cultivationControl = new java.util.HashSet<CultivationControl>();
      return cultivationControl;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCultivationControl() {
      if (cultivationControl == null)
         cultivationControl = new java.util.HashSet<CultivationControl>();
      return cultivationControl.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCultivationControl */
   public void setCultivationControl(java.util.Collection<CultivationControl> newCultivationControl) {
      removeAllCultivationControl();
      for (java.util.Iterator iter = newCultivationControl.iterator(); iter.hasNext();)
         addCultivationControl((CultivationControl)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCultivationControl */
   public void addCultivationControl(CultivationControl newCultivationControl) {
      if (newCultivationControl == null)
         return;
      if (this.cultivationControl == null)
         this.cultivationControl = new java.util.HashSet<CultivationControl>();
      if (!this.cultivationControl.contains(newCultivationControl))
         this.cultivationControl.add(newCultivationControl);
   }
   
   /** @pdGenerated default remove
     * @param oldCultivationControl */
   public void removeCultivationControl(CultivationControl oldCultivationControl) {
      if (oldCultivationControl == null)
         return;
      if (this.cultivationControl != null)
         if (this.cultivationControl.contains(oldCultivationControl))
            this.cultivationControl.remove(oldCultivationControl);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCultivationControl() {
      if (cultivationControl != null)
         cultivationControl.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Cultivation> getCultivation() {
      if (cultivation == null)
         cultivation = new java.util.HashSet<Cultivation>();
      return cultivation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCultivation() {
      if (cultivation == null)
         cultivation = new java.util.HashSet<Cultivation>();
      return cultivation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCultivation */
   public void setCultivation(java.util.Collection<Cultivation> newCultivation) {
      removeAllCultivation();
      for (java.util.Iterator iter = newCultivation.iterator(); iter.hasNext();)
         addCultivation((Cultivation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCultivation */
   public void addCultivation(Cultivation newCultivation) {
      if (newCultivation == null)
         return;
      if (this.cultivation == null)
         this.cultivation = new java.util.HashSet<Cultivation>();
      if (!this.cultivation.contains(newCultivation))
         this.cultivation.add(newCultivation);
   }
   
   /** @pdGenerated default remove
     * @param oldCultivation */
   public void removeCultivation(Cultivation oldCultivation) {
      if (oldCultivation == null)
         return;
      if (this.cultivation != null)
         if (this.cultivation.contains(oldCultivation))
            this.cultivation.remove(oldCultivation);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCultivation() {
      if (cultivation != null)
         cultivation.clear();
   }

}