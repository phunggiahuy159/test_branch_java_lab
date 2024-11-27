import javax.swing.JOptionPane;
public class system_1_deg {
    public static void main(String[]args){
        double det,div1,div2,div3 ;
        String noti1="equation has infinity root";
        String noti2="equation has no root";
        String stra11,stra12,stra21,stra22,strb1,strb2;

        stra11=JOptionPane.showInputDialog(null,"a11: ",JOptionPane.INFORMATION_MESSAGE);
        stra12=JOptionPane.showInputDialog(null,"a12: ",JOptionPane.INFORMATION_MESSAGE);
        strb1=JOptionPane.showInputDialog(null,"b1: ",JOptionPane.INFORMATION_MESSAGE);
        stra21=JOptionPane.showInputDialog(null,"a21: ",JOptionPane.INFORMATION_MESSAGE);
        stra22=JOptionPane.showInputDialog(null,"a22: ",JOptionPane.INFORMATION_MESSAGE);
        strb2=JOptionPane.showInputDialog(null,"b2: ",JOptionPane.INFORMATION_MESSAGE);
        //convert
        double a11=Double.parseDouble(stra11);
        double a12=Double.parseDouble(stra12);
        double a21=Double.parseDouble(stra21);
        double a22=Double.parseDouble(stra22);
        double b1=Double.parseDouble(strb1);
        double b2=Double.parseDouble(strb2);
        //cal
        double d=a11*a22-a21*a12;
        double d1= b1*a22-b2*a12;
        double d2=a11*b2-a21*b1;

        if (d==0) {
            if (a11*a22 == a12*a21 && a11*b2==b1*a21) {
                JOptionPane.showMessageDialog(null,  noti1, "",
        JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, noti2, "",
        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else {
            double x=d1/d;
            double y=d2/d;
            JOptionPane.showMessageDialog(null, "x=" + x + "y=" + y, "",
        JOptionPane.INFORMATION_MESSAGE); 
        }
        System.exit(0); 
    }
}