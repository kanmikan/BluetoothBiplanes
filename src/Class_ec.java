import javax.microedition.lcdui.Graphics;

public class Class_ec {

   public int var_5e;
   public int var_ac;
   public int var_ec;
   public int var_12f;
   public Class_bd var_193;


   public Class_ec(Class_bd var1) {
      this.var_193 = var1;
      this.var_ac = 255;
   }

   public void sub_58(int var1, int var2, int var3) {
      this.var_5e = var1 >> 6;
      this.var_ac = var2 >> 6;
      this.var_ec = var3;
      this.var_12f = 0;
   }

   public void sub_6a(boolean var1) {
      this.var_ac = 255;
      this.var_193.sub_a7(var1);
   }

   public void sub_76(Graphics var1, boolean var2) {
      if(this.var_ac != 255) {
         if(var2) {
            ++this.var_12f;
            if(this.var_12f > 20) {
               this.sub_6a(false);
               return;
            }

            this.var_5e += Class_61.sub_aee(this.var_ec) * 10 >> 7;
            this.var_ac -= Class_61.sub_a6a(this.var_ec) * 10 >> 7;
         }

         if(this.var_ac > 189 || this.var_ac > 168 && this.var_5e > 109 && this.var_5e < 145) {
            this.var_193.var_376 = this.var_5e + 1;
            this.sub_6a(false);
         }

         var1.setColor(16737792);
         var1.fillRect(this.var_5e, this.var_ac, 3, 3);
         var1.setColor(16776960);
         var1.fillRect(this.var_5e + 1, this.var_ac + 1, 1, 1);
      }
   }
}
