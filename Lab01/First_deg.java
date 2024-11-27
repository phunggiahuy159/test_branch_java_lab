import javax.swing.JOptionPane;
public class First_deg {
    public static void main(String[]args){
        double res ;
        String noti1="equation has infinity root";
        String noti2="equation has no root";
        String a1,b1;
        

        a1=JOptionPane.showInputDialog(null,
        "Please input a in equation ax+b=0: ",

        JOptionPane.INFORMATION_MESSAGE);
        b1=JOptionPane.showInputDialog(null,
        "Please input b in equation ax+b: ",
        JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(a1);
        double b = Double.parseDouble(b1);

        if (a==0){
            if (b==0){
                JOptionPane.showMessageDialog(null, noti1,"", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, noti2,"", JOptionPane.INFORMATION_MESSAGE);
            }    
        }
        else{
            res=(-1)*(b)/a ;
            JOptionPane.showMessageDialog(null, res,"the root is", JOptionPane.INFORMATION_MESSAGE);

        }
        System.exit(0);   
    }
}