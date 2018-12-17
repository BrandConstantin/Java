public class WViewer
{
   public static void main(String[] args)
   {
        Line line1 = new Line (0,0,10,30);
        line1.draw();
        Line line2 = new Line (10,30,20,0);
        line2.draw();
        Line line3 = new Line (20,0,30,30);
        line3.draw();
        Line line4 = new Line (30,30,40,0);
        line4.draw();
   }
}