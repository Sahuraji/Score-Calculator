import javax.swing.*;
import java.awt.*;

public class Candidate {

    private JPanel Score3;
    private JLabel score1;
    private JLabel score2;
    private JLabel score3;
    private JLabel Avg;
    private JLabel Grade;
    private JLabel CandidateName;
    private JLabel TotalLabel;
    private JButton calButton;
    private JTextField txtCandidateName;
    private JTextField txtTotal;
    private JTextField txtGrade;
    private JTextField txtAvg;
    private JTextField txtScore3;
    private JTextField txtScore2;
    private JTextField txtScore1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Score Calculator");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        String txtCandidateName = ("Enter the candidate Name");
        JTextField txtCandidateNameField = new JTextField();
        JLabel txtScore1 = new JLabel("Enter Score 1:");
        JTextField txtScore1Field = new JTextField();
        JLabel txtScore2 = new JLabel("Enter Score 2:");
        JTextField txtScore2Field = new JTextField();
        JLabel txtScore3 = new JLabel("Enter Score 3:");
        JTextField txtScore3Field = new JTextField();
        JLabel txtTotal = new JLabel("Total:");
        JLabel txtAvg = new JLabel("Average:");
        JLabel txtGrade = new JLabel("Grade:");
        JButton button = new JButton("Calculate");

        button.addActionListener(e -> {
            int m1 = Integer.parseInt(txtScore1Field.getText());
            int m2 = Integer.parseInt(txtScore2Field.getText());
            int m3 = Integer.parseInt(txtScore3Field.getText());

            int total = m1 + m2 + m3;
            txtTotal.setText("Total: " + total);

            double avg = total / 3.0;
            txtAvg.setText("Average: " + avg);

            if (avg > 50) {
                txtGrade.setText("Grade: Pass");
            } else {
                txtGrade.setText("Grade: Fail");
            }
        });

        frame.add(txtScore1);
        frame.add(txtScore1Field);
        frame.add(txtScore2);
        frame.add(txtScore2Field);
        frame.add(txtScore3);
        frame.add(txtScore3Field);
        frame.add(txtTotal);
        frame.add(txtAvg);
        frame.add(txtGrade);
        frame.add(button);

        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
