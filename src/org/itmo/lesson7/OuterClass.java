package org.itmo.lesson7;

public class OuterClass {
   private int a;
   private int b;

   static String name = "Mike";

   void setParams(int x, int y) {
       this.a = x;
       this.b = y;
   }

   class InnerClass {
       void sumAndPrint() {
           setParams(4, 6);
           System.out.println("sum " + (a + b));
       }
   }

   public void innerMethodCall() {
       InnerClass innerClass = new InnerClass();
       innerClass.sumAndPrint();
   }

   static class NestedStaticClass {
       void nestedStaticClassMethod() {
           System.out.println("Static method");
           System.out.println(name);
//           System.out.println("sum " + (a + b)); невозможно обратиться к нестатическим полям
       }
   }
}
