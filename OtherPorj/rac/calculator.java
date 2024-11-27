import javax.swing.JOptionPane;

public class calculator {
    public static void main (String[] args) {
        
        String strNum1, strNum2;
        String strNotification = "You're just entered: ";
        String noti = "num2 is zero";
        double diff,sum,mul,div;

        // Input the first number
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number:", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        strNotification += strNum1 + " and ";

        // Input the second number
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number:", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
                
        double num2 = Double.parseDouble(strNum2);
        strNotification += strNum2;

        // Calculate the difference
        sum=num1+num2;
        diff = num1 - num2;
        mul=num1*num2;



        // Show the entered numbers and the difference
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Sum: " + sum, "Show Sum", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mul: " + mul, "Show mul", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Difference: " + diff, "Show Difference", JOptionPane.INFORMATION_MESSAGE);
        if(num2==0){
            JOptionPane.showMessageDialog(null, noti, "Show noti", JOptionPane.INFORMATION_MESSAGE);

        }
        else{
            div = num1/num2;
            JOptionPane.showMessageDialog(null, "Div: " + div, "Show Div", JOptionPane.INFORMATION_MESSAGE);}
    
        System.exit(0);
    }
}


