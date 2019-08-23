import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import org.openimaj.image.FImage;
import org.openimaj.image.ImageUtilities;
import org.openimaj.image.processing.face.detection.DetectedFace;
import org.openimaj.image.processing.face.detection.HaarCascadeDetector;
import java.awt.Dimension;


public class FaceDetector extends JFrame {

    public java.awt.image.BufferedImage readImg(String fn, int x,int y) throws IOException{
        int width = x;
        int height = y;
        BufferedImage image = null;
        File f = null;

        //read image
        try{
            f = new File(fn); //image file path
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(f);
        }catch(IOException e){
            System.out.println("Error: "+e);
            return null;
        }
        return image;
    }

    private static final long serialVersionUID = 1L;
    private static final HaarCascadeDetector detector = new HaarCascadeDetector();
    private BufferedImage img = null;
    private List < DetectedFace > faces = null;
    public FaceDetector(String[] a) throws IOException {
        int w = Integer.parseInt(a[1]);
        int h = Integer.parseInt(a[2]);
        img = readImg(a[0],w,h);
        ImagePanel panel = new ImagePanel(img);
        panel.setPreferredSize(new Dimension(w,h));
        add(panel);
        setTitle("Face Recognizer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void detectFace() {
        JFrame fr = new JFrame("Discovered Faces");
        // Add face detection functionality here
        faces = detector.detectFaces(ImageUtilities.createFImage(img));
        if (faces == null ) {
            System.out.println("No faces found in the captured image");
            return;
        }

        Iterator < DetectedFace > dfi = faces.iterator();
        while(dfi.hasNext()){
            DetectedFace face = dfi.next();
            FImage image1 = face.getFacePatch();
            ImagePanel p = new ImagePanel(
                    ImageUtilities.createBufferedImage(image1));
            fr.add(p);
        }

        fr.setLayout(new FlowLayout(0));
        fr.setSize(500, 500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) throws IOException {
        if ( args.length == 3){
            FaceDetector fd = new FaceDetector(args);
            fd.detectFace();
        } else {
            System.out.println("run imageFile.jpg Width Height");
        }
    }
}
