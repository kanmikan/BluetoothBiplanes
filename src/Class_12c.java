
public final class Class_12c {

   public static boolean var_56;
   public static final int[] var_64 = new int[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, -10, -11, -13, -12, -20, -21, -1, -2, -3, -4, -6, -7, -5, 42, 35};
   private static final int[][] var_80 = new int[][]{{0}, {1}, {2, 10}, {3}, {4, 12}, {5, 14}, {6, 13}, {7}, {8, 11}, {9}, {10, 20}, {11, 21}, {12, 19}, {13}, {15}, {16}, {10, 20}, {11, 21}, {12, 19}, {13}, {15}, {16}, {14}, {17}, {18, 14}};
   public static boolean[] var_a6 = new boolean[22];
   private static int var_102 = 0;
   private static int var_132 = 0;
   private static int[] var_1b5 = new int[20];


   private static int[] sub_3d(int var0) {
      for(int var1 = 0; var1 < var_64.length; ++var1) {
         if(var0 == var_64[var1]) {
            return var_80[var1];
         }
      }

      return null;
   }

   public static void sub_59(int var0) {
      int[] var1 = sub_3d(var0);
      if(var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            int var3 = var1[var2];
            sub_9d(var3);
            var_a6[var3] = true;
         }
      }

      var_56 = true;
   }

   private static void sub_9d(int var0) {
	  var_1b5[var_132++] = var0;
      if(var_132 >= 20) {
         var_132 = 0;
      }

      if(var_132 == var_102) {
         ++var_102;
         if(var_102 >= 20) {
            var_102 = 0;
         }
      }

   }

   public static void sub_e0(int var0) {
      var_56 = false;
      int[] var1 = sub_3d(var0);
      if(var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            int var3 = var1[var2];
            if(var_a6[var3]) {
               var_a6[var3] = false;
            }
         }

      }
   }

   public static boolean sub_140(int var0) {
      return var_a6[var0];
   }

   public static int sub_168() {
      if(var_102 == var_132) {
         return -66;
      } else {
         int var0 = var_1b5[var_102++];
         if(var_102 >= 20) {
            var_102 = 0;
         }

         return var0;
      }
   }

   public static void sub_1bf() {
      int var0 = 22;

      while(true) {
         --var0;
         if(var0 < 0) {
            var_56 = false;
            return;
         }

         var_a6[var0] = false;
      }
   }

}
