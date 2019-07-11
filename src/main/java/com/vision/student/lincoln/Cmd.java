/*    */ package com.lincoln;
/*    */ 
/*    */ import java.math.BigDecimal;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class Cmd
/*    */ {
/*    */   private String cmd;
/*    */   private List<BigDecimal> params;
/*    */   
/*    */   public Cmd(String content) {
/* 13 */     this.cmd = content.substring(0, 1);
/* 14 */     if (content.length() > 1) {
/* 15 */       String[] ds = content.substring(1).split(" ");
/* 16 */       this.params = new ArrayList();
/* 17 */       for (String d : ds) {
/* 18 */         this.params.add(new BigDecimal(d));
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public Cmd(String cmd, List<BigDecimal> params) {
/* 24 */     this.cmd = cmd;
/* 25 */     this.params = params;
/*    */   }
/*    */ 
/*    */   
/* 29 */   public String getCmd() { return this.cmd; }
/*    */ 
/*    */ 
/*    */   
/* 33 */   public void setCmd(String cmd) { this.cmd = cmd; }
/*    */ 
/*    */ 
/*    */   
/* 37 */   public List<BigDecimal> getParams() { return this.params; }
/*    */ 
/*    */ 
/*    */   
/* 41 */   public void setParams(List<BigDecimal> params) { this.params = params; }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 45 */     StringBuilder stringBuilder = new StringBuilder();
/* 46 */     stringBuilder.append(this.cmd);
/* 47 */     if (this.params != null && this.params.size() > 0) {
/* 48 */       for (int i = 0; i < this.params.size(); i++) {
/* 49 */         BigDecimal d = (BigDecimal)this.params.get(i);
/* 50 */         stringBuilder.append(d.doubleValue());
/* 51 */         if (i != this.params.size() - 1) {
/* 52 */           stringBuilder.append(" ");
/*    */         }
/*    */       } 
/*    */     }
/* 56 */     return stringBuilder.toString();
/*    */   }
/*    */ }


/* Location:              E:\juying-spider-1.0-SNAPSHOT.jar!\com\lincoln\Cmd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.5
 */