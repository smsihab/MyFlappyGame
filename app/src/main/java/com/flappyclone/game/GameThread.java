public class GameThread extends Thread {
   // Game state variables
   private boolean running;
   private final SurfaceHolder surfaceHolder;
   private final GameView gameView;

   public GameThread(SurfaceHolder surfaceHolder, GameView gameView) {
       super();
       this.surfaceHolder = surfaceHolder;
       this.gameView = gameView;
   }

   @Override
   public void run() {
       while (running) {
           // Update game state
           gameView.update();

           // Draw to the canvas
           Canvas canvas = null;
           try {
               canvas = surfaceHolder.lockCanvas();
               synchronized (surfaceHolder) {
                   gameView.draw(canvas);
               }
           } finally {
               if (canvas != null) {
                   surfaceHolder.unlockCanvasAndPost(canvas);
               }
           }
       }
   }

   public void setRunning(boolean running) {
       this.running = running;
   }
}