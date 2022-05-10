package latihan;

import javax.swing.JOptionPane;
import java.util.Scanner;


public class latihan {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int b = 1;
        String ok = "ok";
        String input;
        Scanner scan = new Scanner (System.in);
        input = scan.nextLine();
        if(input.equals(ok))
        {
            System.out.println("ok");
        }
//        Object[] options = {"Yes, please","No, thanks"};
//        JOptionPane.showOptionDialog(null,
//        "Would you like some green eggs to go "+ "with that ham?",
//       "A Silly Question",JOptionPane.YES_NO_OPTION,
//      JOptionPane.QUESTION_MESSAGE,null,options,options[1]);

    }
    
}
