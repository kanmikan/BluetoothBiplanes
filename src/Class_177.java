import java.util.TimerTask;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;

public class Class_177 extends TimerTask {

   private Player var_41;


   public Class_177(Player var1) {
      this.var_41 = var1;
   }

   public void run() {
      try {
         this.var_41.stop();
      } catch (MediaException var2) {
         var2.printStackTrace();
      }

   }
}
