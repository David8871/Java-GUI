import javax.swing.*;
class GUI{
    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
        JButton button = new JButton("Press");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.setVisible(true);
    }
    public static void func(){
        System.out.println("Never again");

    }
}