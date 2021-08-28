/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;
import static home.UIUtils.COLOR_OUTLINE;
import static home.UIUtils.FONT_FORGOT_PASSWORD;
import javax.swing.*;
import java.awt.*;
import static java.awt.Cursor.HAND_CURSOR;
import static java.awt.Cursor.getPredefinedCursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
/**
 *
 * @author Sijan
 */









class TrayIco {
public static String mes=null,err=null;
    public static void main() throws AWTException {
        
        if (SystemTray.isSupported()) {
            if(mes!=null){
            displayTray();}
            if(err!=null){
            displayerror();}
        } else {
            System.err.println("System tray not supported!");
        }
    }
    public static void displayTray() throws AWTException {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();
        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().getImage("/home/icons/try.ico");
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Tray");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("Lifely");
        
        tray.add(trayIcon);
        trayIcon.displayMessage(mes, "Life Management Software", TrayIcon.MessageType.WARNING);
    }
    static void displayerror() throws AWTException{
    try {
        SystemTray tray = SystemTray.getSystemTray();
        BufferedImage img = ImageIO.read(TrayIco.class.getResource("/home/icons/lifely.png"));
       ImageIcon image = new ImageIcon(img);
       // Image image = Toolkit.getDefaultToolkit().getImage("/home/icons/lifely.png");
        TrayIcon trayIcon = new TrayIcon(img, "Lifely");
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip("Lifely Error");
        tray.add(trayIcon);
        trayIcon.displayMessage(err, "Life Management Software", TrayIcon.MessageType.NONE);
    } catch (IOException ex) {
        Logger.getLogger(TrayIco.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}












class HyperlinkText extends JLabel {
    public HyperlinkText(String hyperlinkText, int xPos, int yPos, Runnable hyperlinkAction) {
        super(hyperlinkText);
        setForeground(COLOR_OUTLINE);
        setFont(FONT_FORGOT_PASSWORD);
        setCursor(getPredefinedCursor(HAND_CURSOR));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                hyperlinkAction.run();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setForeground(COLOR_OUTLINE.darker());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setForeground(COLOR_OUTLINE);
            }
        });

        Dimension prefSize = getPreferredSize();
        setBounds(xPos, yPos, prefSize.width, prefSize.height);
    }
}










class ImgUtils {

        public BufferedImage scaleImage(int WIDTH, int HEIGHT, String filename) {
            BufferedImage bi;
            try {
                ImageIcon ii = new ImageIcon(filename);//path to image
                bi = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
                Graphics2D g2d = (Graphics2D) bi.createGraphics();
                g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
                g2d.drawImage(ii.getImage(), 0, 0, WIDTH, HEIGHT, null);
            } catch (Exception e) {
                return null;
            }
            return bi;
        }
    }








class Emailvalidate {
   static boolean isValid(String email) {
      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return email.matches(regex);
   }
}








class NetTest {
   boolean check(){
       //  URL url = new URL("https://www.google.com");
       //  URLConnection connection = url.openConnection();
       //  connection.connect();
       System.out.println("Internet is connected");
       return true;
       
   }
   boolean create() throws MalformedURLException, IOException{
         try {

            Desktop.getDesktop().browse(new URI("http://lifely.bhandarisijan.com.np/register.php?id=123"));

        } catch (IOException | URISyntaxException e1) {
        }        
        
        
       return false;
   }  
}











class Offline {
    FileReader freader;
    BufferedReader breader;
    File file=new File("offline.dat");
    
    
}











class Toaster {
    private static final int STARTING_Y_POS = 15;
    private static final int SPACER_DISTANCE = 15;
    private static final ArrayList<ToasterBody> toasterBodies = new ArrayList<>();
    private final static AtomicInteger CURRENT_Y_OFFSET = new AtomicInteger();
    private final JPanel panelToToastOn;

    public Toaster(JPanel panelToToastOn) {
        this.panelToToastOn = panelToToastOn;
    }

    public void error(String... messages) {
        for (String s : messages) {
            toast(s, new Color(181, 59, 86));
        }
    }

    public void success(String... messages) {
        for (String s : messages) {
            toast(s, new Color(33, 181, 83));
        }
    }
String[] url;
    public void info(String... messages) {
        for (String s : messages) {
            toast(s, new Color(13, 116, 181));
        }
    }

    public void warn(String... messages) {
        for (String s : messages) {
            toast(s, new Color(181, 147, 10));
        }
    }

    void toast(String message, Color bgColor) {
        ToasterBody toasterBody;

        if (toasterBodies.isEmpty()) {
            toasterBody = new ToasterBody(panelToToastOn, message, bgColor, STARTING_Y_POS);
            CURRENT_Y_OFFSET.set(STARTING_Y_POS + toasterBody.getHeightOfToast());
        } else {
            toasterBody = new ToasterBody(panelToToastOn, message, bgColor, CURRENT_Y_OFFSET.get() + SPACER_DISTANCE);
            CURRENT_Y_OFFSET.addAndGet(SPACER_DISTANCE + toasterBody.getHeightOfToast());
        }

        toasterBodies.add(toasterBody);

        new Thread(() -> {
            toasterBody.addMouseListener(new MouseAdapter() {
                @Override
                
                public void mousePressed(MouseEvent e) {
                    
                    removeToast(toasterBody);
                }
            });
            
            Component add = panelToToastOn.add(toasterBody, 0);
            panelToToastOn.repaint();
            //Thread.sleep(6000);
            //removeToast(toasterBody);

        }).start();
    }

     synchronized void removeToast(ToasterBody toasterBody) {
        if (!toasterBody.getStopDisplaying()) {
            toasterBody.setStopDisplaying(true);

            toasterBodies.forEach(toasterBody1 -> {
                if (toasterBodies.indexOf(toasterBody1) >= toasterBodies.indexOf(toasterBody)) {
                    toasterBody1.setyPos(toasterBody1.getyPos() - toasterBody.getHeightOfToast() - SPACER_DISTANCE);
                }
            });

            toasterBodies.remove(toasterBody);

            CURRENT_Y_OFFSET.set(CURRENT_Y_OFFSET.get() - SPACER_DISTANCE - toasterBody.getHeightOfToast());

            panelToToastOn.remove(toasterBody);
            panelToToastOn.repaint();
        }
    }
}







class ToasterBody extends JPanel {
   
    private static final int TOAST_PADDING = 15;
    private final int toastWidth;
    private final String message;
    private final Color c;
    private volatile boolean stopDisplaying;
    private final int heightOfToast;
    private final int stringPosX;
    private final int stringPosY;
    private int yPos;
    private final JPanel panelToToastOn;

    public ToasterBody(JPanel panelToToastOn, String message, Color bgColor, int yPos) {
        this.panelToToastOn = panelToToastOn;
        this.message = message;
        this.yPos = yPos;
        this.c = bgColor;

        FontMetrics metrics = getFontMetrics(UIUtils.FONT_GENERAL_UI);
        int stringWidth = metrics.stringWidth(this.message);

        toastWidth = stringWidth + (TOAST_PADDING * 2);
        heightOfToast = metrics.getHeight() + TOAST_PADDING;
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setOpaque(false);
        setBounds((panelToToastOn.getWidth() - toastWidth) / 2, (int) -(Math.round(heightOfToast / 10.0) * 10), toastWidth, heightOfToast);

        stringPosX = (getWidth() - stringWidth) / 2;
        stringPosY = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();

        new Thread(() -> {
            while (getBounds().y < yPos) {
                int i1 = (yPos - getBounds().y) / 10;
                i1 = i1 <= 0 ? 1 : i1;
                setBounds((panelToToastOn.getWidth() - toastWidth) / 2, getBounds().y + i1, toastWidth, heightOfToast);
                repaint();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException ignored) {
                }
            }
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = UIUtils.get2dGraphics(g);
        super.paintComponent(g2);

        //Background
        g2.setColor(c);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), UIUtils.ROUNDNESS, UIUtils.ROUNDNESS);

        // Font
        g2.setFont(UIUtils.FONT_GENERAL_UI);
        g2.setColor(Color.white);
        g2.drawString(message, stringPosX, stringPosY);
    }

    public int getHeightOfToast() {
        return heightOfToast;
    }

    public synchronized boolean getStopDisplaying() {
        return stopDisplaying;
    }

    public synchronized void setStopDisplaying(boolean hasStoppedDisplaying) {
        this.stopDisplaying = hasStoppedDisplaying;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
//        setBounds((panelToToastOn.getWidth() - toastWidth) / 2, yPos, toastWidth, heightOfToast);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (getBounds().y > yPos) {
                    int i1 = Math.abs((yPos - getBounds().y) / 10);
                    i1 = i1 <= 0 ? 1 : i1;
                    setBounds((panelToToastOn.getWidth() - toastWidth) / 2, getBounds().y - i1, toastWidth, heightOfToast);
                    repaint();
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ignored) {
                    }
                }
            }
        }).start();
    }

    public int getyPos() {
        return yPos;
    }
}


















class TextFieldUsername extends JTextField {
    private Shape shape;
    private Color borderColor = UIUtils.COLOR_INTERACTIVE;

    public TextFieldUsername() {
        setOpaque(false);
        setBackground(UIUtils.COLOR_BACKGROUND);
        setForeground(Color.white);
        setCaretColor(Color.white);
        setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        setMargin(new Insets(2, 10, 2, 2));
        setHorizontalAlignment(SwingConstants.LEFT);
        setFont(UIUtils.FONT_GENERAL_UI);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = UIUtils.get2dGraphics(g);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, UIUtils.ROUNDNESS, UIUtils.ROUNDNESS);
        super.paintComponent(g2);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = UIUtils.get2dGraphics(g);
        g2.setColor(borderColor);
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, UIUtils.ROUNDNESS, UIUtils.ROUNDNESS);
    }

    @Override
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, UIUtils.ROUNDNESS, UIUtils.ROUNDNESS);
        }
        return shape.contains(x, y);
    }

    public void setBorderColor(Color color) {
        borderColor = color;
        repaint();
    }
}
public class AllClasses {
    
}









class TextFieldPassword extends JPasswordField {
    private Shape shape;
    private Color borderColor = UIUtils.COLOR_OUTLINE;

    public TextFieldPassword() {
        setOpaque(false);
        setBackground(UIUtils.COLOR_BACKGROUND);
        setForeground(Color.white);
        setCaretColor(Color.white);
        setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        setMargin(new Insets(2, 10, 2, 2));
        setHorizontalAlignment(SwingConstants.LEFT);
        setFont(UIUtils.FONT_GENERAL_UI);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = UIUtils.get2dGraphics(g);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, UIUtils.ROUNDNESS, UIUtils.ROUNDNESS);
        super.paintComponent(g2);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = UIUtils.get2dGraphics(g);
        g2.setColor(borderColor);
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, UIUtils.ROUNDNESS, UIUtils.ROUNDNESS);
    }

    @Override
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, UIUtils.ROUNDNESS, UIUtils.ROUNDNESS);
        }
        return shape.contains(x, y);
    }

    public void setBorderColor(Color color) {
        borderColor = color;
        repaint();
    }
}
