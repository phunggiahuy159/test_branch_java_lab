import javax.swing.JOptionPane;
public class ShowTwoNumber {
    public static void main (String[] args){

        String strNum1, strNum2;
        String strNotification="You've just entered: ";
        double sum ;

        strNum1 = JOptionPane.showInputDialog(null,
                    "Please input the first number: ","Input the first number",
                    JOptionPane.INFORMATION_MESSAGE);
        strNum2=JOptionPane.showInputDialog(null,
                    "Please input the second number: ","Input the second number",
                    JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        strNotification+=strNum1+" and ";
        
        double num2=Double.parseDouble(strNum2);
        sum=num1+num2;
        strNotification+=strNum2;
        
        JOptionPane.showMessageDialog(null, strNotification,"Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);   
    }
}