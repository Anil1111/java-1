import javax.swing.*;
import java.util.*;

public class GuiApp1 {
//Note: Typically the main method will be in a
//separate class. As this is a simple one class
//example it's all in the one class.
    public static void main(String[] args) {
        new GuiApp1();
        }
        public GuiApp1()
        {
        JFrame guiFrame = new JFrame();
        //mafs
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: " );
        int n = scan.nextInt();
        List<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= n;i++) {
            if (i == n || i == 1){
            }
            else if (n % i == 0) {
                numberList.add(i);
            }
        }
        StringBuilder strbul  = new StringBuilder();
        Iterator<Integer> iter = numberList.iterator();
        while(iter.hasNext())
        {
            strbul.append(iter.next());
           if(iter.hasNext()){
            strbul.append(" ");
           }
        }
        String output = strbul.toString();
        System.out.println(output);
        String outputfinal = ("Non trivial divisors of "+ n +":"+ output);
        


        //make sure the program exits when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Divisors");
        guiFrame.setSize(300,250);
        final JTextField tf = new JTextField();
        tf.setBounds(50,50, 150,20);
        tf.setText(outputfinal);
        //create a button
        JButton a=new JButton("Ok");
        //add button
        a.setBounds(150,120,95,30);
        guiFrame.add(a);
        guiFrame.setSize(400,200);  
        guiFrame.setLayout(null);    
        //This will center the JFrame in the middle of the screen
        guiFrame.setLocationRelativeTo(null);
        //make sure the JFrame is visible
        guiFrame.setVisible(true);
    }
}