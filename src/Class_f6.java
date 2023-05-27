import javax.microedition.lcdui.Graphics;

public class Class_f6 {

   public static int var_2c;
   public static int var_55;
   public static int var_99;
   private static String var_dc;
   private static byte[] var_113;
   private static byte[] var_13f;
   public static String[] var_187;
   public static int var_1cb;
   public static int var_1df;
   public static boolean var_209;


   public static void sub_61(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Class_71 var8) {
      int var9 = 0;
      if(var_dc != null) {
         var9 = var8.sub_59(var_dc);
      }

      int var12 = var_55;

      while(true) {
         --var12;
         if(var12 < 0) {
            int var13 = var_55;
            if(var_dc != null) {
               ++var13;
            }

            int var14 = var13 * var7 + 2 + 4 - 6;
            int var15 = var9 + 4 + 4;
            if(var15 < var3) {
               var15 = var3;
            }

            int var16 = 0;
            int var17 = 0;
            switch(var4) {
            case 1:
               var16 = var1 - var15 >> 1;
               break;
            case 4:
               var16 = 0;
               break;
            case 8:
               var16 = var1 - var15;
            }

            switch(var5) {
            case 2:
               var17 = var2 - var14 >> 1;
               break;
            case 16:
               var17 = 0;
               break;
            case 32:
               var17 = var2 - var14;
            }

            int var18;
            int var19;
            int var20;
            int var21;
            if(var_1cb > 0) {
               var0.setColor(6488245);
               var0.fillRect(var16, var17, var15, var14);
               var0.setColor(16671843);
               var0.fillRect(var16 + 2, var17 + 2, var15 - 4, var14 - 4);
               var18 = var17 + 2 + 2;
               var19 = var16 + 2 + 2;
               switch(var6) {
               case 1:
                  var19 = var16 + (var15 >> 1);
               case 8:
               default:
                  var20 = var7 - (var7 >> 1);
                  if(var_dc != null) {
                     var0.setColor(6724044);
                     var0.fillRect(var16 + 2, var18 - 2, var15 - 4, var20 + 2);
                     var8.sub_137(var0, var_dc, var19, var18 - 7, var6);
                     var18 += var20;
                  }

                  var21 = 0;
               }

               for(; var21 < var_55; ++var21) {
                  if(var21 == var_99) {
                     var0.setColor(16776960);
                     var0.fillRect(var16 + 2, var18, var15 - 4, var7);
                  }

                  if(sub_cd(var0, var21, var19, var18)) {
                     var19 += 18;
                  }

                  var8.sub_137(var0, var_187[var_113[var21]], var19, var18 + (var7 >> 1), var6 | 2);
                  var18 += var7;
                  if(var_2c == 14 || var_2c == 60 || var_2c == 92 || var_2c == 82) {
                     var19 -= 18;
                  }
               }

               --var_1cb;
            }

            var18 = var17 + 2 + 2 + var_99 * var7;
            var19 = var16 + 2 + 2;
            if(var_dc != null) {
               var20 = var7 - (var7 >> 1);
               var18 += var20;
            }

            var20 = var15 - 4;
            boolean var26 = false;
            boolean var22 = false;
            int var23 = 0;
            var21 = var20 / 24;
            int var27 = var21 * 24;
            if(var27 < var20) {
               var23 = var20 - var27;
            }

            int var24 = 0;
            boolean var25 = false;

            for(int var28 = 0; var28 < 24; ++var28) {
               sub_87(var0, var28, true);
               var0.fillRect(var16 + 2 + var24, var18, var21, var7);
               sub_87(var0, var28, false);
               var0.fillRect(var16 + 2 + var24, var18 + 1, var21, var7 - 2);
               var24 += var21;
            }

            if(var23 != 0) {
               sub_87(var0, 24, true);
               var0.fillRect(var16 + 2 + var24, var18, var23, var7);
               sub_87(var0, 24, false);
               var0.fillRect(var16 + 2 + var24, var18 + 1, var23, var7 - 2);
            }

            if(sub_cd(var0, var_99, var19, var18)) {
               var19 += 18;
            }

            var8.sub_137(var0, var_187[var_113[var_99]], var19, var18 + (var7 >> 1), var6 | 2);
            if(!var_209) {
               ++var_1df;
               if(var_1df > 24) {
                  var_209 = true;
               }
            } else {
               --var_1df;
               if(var_1df < 0) {
                  var_209 = false;
               }
            }

            return;
         }

         int var10 = var8.sub_59(var_187[var_113[var12]]);
         if(var10 > var9) {
            var9 = var10;
         }
      }
   }

   public static void sub_87(Graphics var0, int var1, boolean var2) {
      int var6 = Math.abs(var_1df - var1);
      if(var2) {
         var6 = 24 - var6;
      }

      short var7 = 256;
      int var8 = (24 - var6) * var7 / 24;
      int var3 = var8 * 255 + (var7 - var8) * 67;
      int var4 = var8 * 255 + (var7 - var8) * 137;
      int var5 = var8 * 0 + (var7 - var8) * 67;
      var3 /= var7;
      var4 /= var7;
      var5 /= var7;
      if(var2) {
         var3 -= 32;
         var4 -= 32;
         var5 -= 32;
      }

      var3 = var3 < 0?0:var3;
      var4 = var4 < 0?0:var4;
      var5 = var5 < 0?0:var5;
      var0.setColor(var3, var4, var5);
   }

   public static boolean sub_cd(Graphics var0, int var1, int var2, int var3) {
      if(var_2c != 14 && var_2c != 92) {
         if(var_2c != 60 && var_2c != 82) {
            return false;
         } else {
            if(var1 != 0 && !Class_61.var_680[var1 - 1]) {
               var0.drawImage(Class_61.var_d93[52], var2, var3, 20);
			} else {
               var0.drawImage(Class_61.var_d93[47 + var1], var2, var3, 20); //choose opponent opcion
			}

            var2 += 18;
            return true;
         }
      } else {
         if(var1 != 0 && !Class_61.var_680[var1 - 1]) {
            var0.drawImage(Class_61.var_d93[51], var2, var3, 20); //choose player opcion
         } else {
            var0.drawImage(Class_61.var_d93[43 + var1], var2, var3, 20); //menu
         }

         var2 += 18;
         return true;
      }
   }

   public static void sub_121(int var0) {
      Class_61.var_1af = false;
      var_1cb = 2;
      var_2c = var0 << 1;
      sub_203();
   }

   public static void sub_175(int var0) {
      switch(var0) {
      case 0:
         --var_99;
         if(var_99 < 0) {
            var_99 = var_55 - 1;
         }
         break;
      case 1:
         ++var_99;
         if(var_99 == var_55) {
            var_99 = 0;
         }
         break;
      case 2:
         int var1 = var_113[var_99] << 1;
         switch(var_13f[var1]) {
         case 3:
            sub_121(0);
            byte var2 = var_13f[var1 + 1];
            Class_61.sub_360(var2);
            break;
         default:
            if(Class_61.var_2d9 != 0) {
               ;
            }

            Class_61.var_1af = false;
            var_2c = var1;
            sub_203();
         }
      }

      var_1cb = 2;
   }

   private static void sub_1ce(boolean var0) {
      int var1 = var_13f[var_2c + 1];
      if(!var0) {
         switch(var_13f[var_2c]) {
         case 0:
            var_dc = null;
            break;
         case 1:
            var_dc = var_187[var_2c >> 1];
            break;
         case 2:
            var_2c += 2;
            var_dc = var_187[var_2c >> 1];
         }
      }

      var_2c += 2;

      while(var_2c < var_13f.length && var1 > 0) {
         byte var3 = var_13f[var_2c];
         switch(var3) {
         case 0:
         case 1:
         case 2:
            if(!var0) {
               var_113[var_55] = (byte)(var_2c >> 1);
               ++var_55;
            }

            --var1;
            sub_1ce(true);
            break;
         case 3:
            if(!var0) {
               var_113[var_55] = (byte)(var_2c >> 1);
               ++var_55;
            }

            --var1;
         default:
            var_2c += 2;
         }
      }

   }

   public static void sub_203() {
      var_1cb = 2;
      var_55 = 0;
      var_99 = 0;
      sub_1ce(false);
   }

   public static void sub_238(byte[] var0) {
      var_13f = var0;
      var_113 = new byte[6];
      sub_1ce(false);
   }
}
