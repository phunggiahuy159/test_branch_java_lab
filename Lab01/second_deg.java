import javax.swing.JOptionPane;
public class second_deg {
    public static void main(String[]args){
        double res,d ;
        String noti1="equation has infinity root";
        String noti2="equation has no root";
        String stra,strb,strc;

        stra=JOptionPane.showInputDialog(null,"a in ax^2+bx+c=0 ",JOptionPane.INFORMATION_MESSAGE);
        strb=JOptionPane.showInputDialog(null,"b in ax^2+bx+c=0 ",JOptionPane.INFORMATION_MESSAGE);
        strc=JOptionPane.showInputDialog(null,"c in ax^2+bx+c=0 ",JOptionPane.INFORMATION_MESSAGE);
        //convert
        double a=Double.parseDouble(stra);
        double b=Double.parseDouble(strb);
        double c=Double.parseDouble(strc);
        //cal
        d = b*b-4*a*c;
        if (a!=0) {
            if (d>0) {
                double r1=(-b + Math.sqrt(d)) / (2*a);
                double r2=(-b - Math.sqrt(d)) / (2*a);
                JOptionPane.showMessageDialog(null, "First root: " + r1 + "Second root: " + r2, "",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else if (d==0) {
                double r=-b/(2*a);
                JOptionPane.showMessageDialog(null, "two root is: " + r, "",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "There is no solution", "",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            if(b==0){
                if(c==0){
                    JOptionPane.showMessageDialog(null, noti1,"", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, noti2,"", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                res=(-1)*c/b; 
                    JOptionPane.showMessageDialog(null, res,"", JOptionPane.INFORMATION_MESSAGE);
            }    
        }
        
        System.exit(0);   
    }
}