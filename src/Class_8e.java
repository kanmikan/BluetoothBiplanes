import javax.microedition.lcdui.Graphics;

public class Class_8e {

   public int var_45 = -1;
   public int var_ce;
   public int var_128;
   public int var_15e;
   public int var_1c1;
   public int var_1f6;


   public static int constante_186 = 300;
   public static int constante_166 = 266;
   public static int constante_111 = 211;
   public static int constante_143 = 243;
   

   public void sub_c(Graphics var1) {
      if(this.var_1f6 > 0) {
         --this.var_1f6;
         if(this.var_1f6 == 0) {
            this.var_45 = -1;
            return;
         }
      }

      if((this.var_1f6 == 0 || this.var_1f6 > 16) && this.var_1f6 == 0) {
         int var4 = this.var_45 >> 5;
         int var5 = this.var_ce >> 5;
         var1.drawImage(Class_61.var_d93[this.var_1c1], var4, var5, 33);
         
		 this.var_45 += this.var_128;
         this.var_ce += this.var_15e;
         this.var_15e += 25;
         if(this.var_15e > 200) {
            this.var_15e = 200;
         }

         boolean var6 = false;
         if(var5 > constante_186) {
            var6 = true;
         } else if(var5 > constante_166 && var4 > constante_111 && var4 < constante_143) {
            var6 = true;
         }

         if(var6 && this.var_15e > 0) {
            this.var_15e >>= 2;
            if(this.var_15e < 5) {
               this.var_45 = -1;
            }

            this.var_15e = (byte)(-this.var_15e);
         }

         ++this.var_1c1;
         if(this.var_1c1 > 56) {
            this.var_1c1 = 53;
         }
      }

   }

   public void sub_57(int var1, int var2, int var3, int var4) {
      this.var_45 = var1 << 5;
      this.var_ce = var2 << 5;
      this.var_128 = var3;
      this.var_15e = var4;
      this.var_1c1 = 53;
      this.var_1f6 = 0;
   }
}
