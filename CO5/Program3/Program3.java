/* Find the percentage of marks obtained by a student in 5 subjects. Display a happy face if
he secures above 50% or a sad face if otherwise. */


import java.awt.*;
import java.awt.event.*;

public class Program3 extends Frame {
    private TextField[] txtMarks;
    private Label lblResult;

    public MarksCalculator() {
        setTitle("Marks Calculator");
        setSize(300, 200);
        setLayout(new FlowLayout());

        txtMarks = new TextField[5];
        for (int i = 0; i < 5; i++) {
            Label lblSubject = new Label("Subject " + (i + 1) + ":");
            txtMarks[i] = new TextField(10);
            add(lblSubject);
            add(txtMarks[i]);
        }

        Button btnCalculate = new Button("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int totalMarks = 0;
                for (int i = 0; i < 5; i++) {
                    int marks = Integer.parseInt(txtMarks[i].getText());
                    totalMarks += marks;
                }

                double percentage = (totalMarks / 500.0) * 100;

                if (percentage > 100) {
                    lblResult.setText("\uD83D\uDE00");
                } else {
                    lblResult.setText("\uD83D\uDE41"); 
                }
            }
        });

        lblResult = new Label();

        add(btnCalculate);
        add(lblResult);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MarksCalculator();
    }
}

