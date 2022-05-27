import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ZodiacSign
 {
    String birthmonth = "";
    public static void main(String[] args) 
    {
        
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                
                JFrame frame = new JFrame("Zodiac Sign");
                frame.setSize(300,200);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Color color=new Color(253,102,102);
                frame.getContentPane().setBackground(color);

                JLabel label1 = new JLabel("Enter your Birth Month");
               
                JTextField field = new JTextField(25);
                frame.setLayout(new FlowLayout());
                JLabel label2 = new JLabel("Enter your Birth Day");
                JTextField field1 = new JTextField(25);
                frame.setLayout(new FlowLayout());
                frame.add(label1);
                frame.add(field);
                frame.add(label2);
                frame.add(field1);
                 
                JButton button = new JButton("Show");
                button.setBackground(Color.PINK);
                button.setPreferredSize(new Dimension(70, 25));    
                button.addActionListener(new ActionListener() 
                {
                
                    public void actionPerformed(ActionEvent ae) 
                    {
                        String user_bmonth = field.getText();
                        String user_bday = field1.getText();
                            
                        String[] month_arr = {"january","february","march","april","may","june","july","august","september","october","november","december"};
                        int[] month_arr_day = {31,29,31,30,31,30,31,31,30,31,30,31};
                        int numeric_bmonth = 0;
                        String error_bday = "";

                        for(int i = 0; i < month_arr.length ; i++)
                        {
                        if(user_bmonth.toLowerCase().equals(month_arr[i])){
                        numeric_bmonth = i + 1;
                        if(Integer.parseInt(user_bday) <= 0 || Integer.parseInt(user_bday) > month_arr_day[i]){
                        error_bday = "Out of Range";
                        }
                    }
                }
                            
                        if(!error_bday.equals(""))
                        {
                            JOptionPane.showMessageDialog(null, error_bday , "Error Message", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else if(numeric_bmonth <= 0)
                        {
                            JOptionPane.showMessageDialog(null, "Invalid Birth Month" , "Error Message", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                        try 
                        {
                                    
                            String birthDate = numeric_bmonth+"/"+user_bday+"/2020";
                            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                            Date convertBirthDate = df.parse(birthDate);
                                    
                            String zodiac = "";
                            String zodiac_personality = "";
                                   
                                    
                                   
                            if(convertBirthDate.after(df.parse("12/21/2019")) && convertBirthDate.before(df.parse("01/20/2020"))){
                            zodiac = "CAPRICORN";
                            zodiac_personality = "Stubborn, Hardworking, Direct";
                                        
                            }
                            else if(convertBirthDate.after(df.parse("01/19/2020")) && convertBirthDate.before(df.parse("02/20/2020"))){
                            zodiac = "AQUARIUS";
                            zodiac_personality = "Innovative, Admired, Eccentric";

                            }
                            else if(convertBirthDate.after(df.parse("02/19/2020")) && convertBirthDate.before(df.parse("03/21/2020"))){
                            zodiac = "PISCES";
                            zodiac_personality = "Free, Sensual , Sensitive";

                            }
                            else if(convertBirthDate.after(df.parse("03/20/2020")) && convertBirthDate.before(df.parse("04/21/2020"))){
                            zodiac = "ARIES";
                            zodiac_personality = "Brave, Independent, Impulsive";

                            }
                            else if(convertBirthDate.after(df.parse("04/20/2020")) && convertBirthDate.before(df.parse("05/21/2020"))){
                            zodiac = "TAURUS";
                            zodiac_personality = "Down to earth, Sensual, Stubborn";

                            }
                            else if(convertBirthDate.after(df.parse("05/20/2020")) && convertBirthDate.before(df.parse("06/21/2020"))){
                                        zodiac = "GEMINI";
                                        zodiac_personality = "Talented, Dynamic, Gamer";

                            }
                            else if(convertBirthDate.after(df.parse("06/20/2020")) && convertBirthDate.before(df.parse("07/23/2020"))){
                            zodiac = "CANCER";
                            zodiac_personality = "Practical, Friendly, Sensitive";

                            }
                            else if(convertBirthDate.after(df.parse("07/22/2020")) && convertBirthDate.before(df.parse("08/23/2020"))){
                            zodiac = "LEO";
                            zodiac_personality = "Creative, Popular, Faihtful";

                            }
                            else if(convertBirthDate.after(df.parse("08/22/2020")) && convertBirthDate.before(df.parse("09/23/2020"))){
                            zodiac = "VIRGO";
                            zodiac_personality = "Creative, Clever, Successful";

                            }
                            else if(convertBirthDate.after(df.parse("09/22/2020")) && convertBirthDate.before(df.parse("10/23/2020"))){
                            zodiac = "LIBRA";
                            zodiac_personality = "Irresistible, Adventurous, Indecisive";

                            }
                            else if(convertBirthDate.after(df.parse("10/22/2020")) && convertBirthDate.before(df.parse("11/23/2020"))){
                            zodiac = "SCORPIO";
                            zodiac_personality = "Independent, Powerful, Dominant";

                            }
                            else if(convertBirthDate.after(df.parse("11/22/2020")) && convertBirthDate.before(df.parse("12/22/2020"))){
                            zodiac = "SAGITTARIUS";
                            zodiac_personality = "Smart, Loving, Insensitive";
                            }
                                JOptionPane.showMessageDialog(null, "YOUR ZODIAC SIGN IS "+ zodiac +" \n "+ zodiac_personality , "Message", JOptionPane.INFORMATION_MESSAGE);
                                    
                            } 
                            catch (ParseException ex) 
                            {
                                Logger.getLogger(ZodiacSign.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } 
                    }
                });

       
                
                frame.getContentPane().setLayout(new FlowLayout());
                frame.getContentPane().add(button);
                 
                frame.setVisible(true);
            }
        });
    }
    
}
