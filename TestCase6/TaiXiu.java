package TestCase6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class TaiXiu extends JFrame {
    private double taiKhoanNguoiChoi = 500;
    private JLabel lblTaiKhoan;
    private NumberFormat numf;
    private Locale lc;
    private double datCuoc = 0;
    private Timer timer;
    private int luaChonTaiXiu = 0;
    private JButton btnBet100;
    private JButton btnBet200;
    private JButton btnBet500;
    private JButton btnTai;
    private JButton btnXiu;
    private JLabel lblResult;
    private JLabel lblCountdown;
    private int countdownTime;

    public TaiXiu() {
        lc = new Locale("vi", "VN");
        numf = NumberFormat.getCurrencyInstance(lc);

        setTitle("Game Tài Xỉu");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 1));

        lblTaiKhoan = new JLabel("Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi), SwingConstants.CENTER);
        panel.add(lblTaiKhoan);

        JPanel betPanel = new JPanel();
        betPanel.setLayout(new GridLayout(1, 3));
        btnBet100 = new JButton("100");
        btnBet200 = new JButton("200");
        btnBet500 = new JButton("500");
        betPanel.add(btnBet100);
        betPanel.add(btnBet200);
        betPanel.add(btnBet500);
        panel.add(betPanel);

        JPanel choicePanel = new JPanel();
        choicePanel.setLayout(new GridLayout(1, 2));
        btnTai = new JButton("Tài");
        btnXiu = new JButton("Xỉu");
        choicePanel.add(btnTai);
        choicePanel.add(btnXiu);
        panel.add(choicePanel);

        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new GridLayout(2, 3));
        JLabel lblXucXac1 = new JLabel("", SwingConstants.CENTER);
        JLabel lblXucXac2 = new JLabel("", SwingConstants.CENTER);
        JLabel lblXucXac3 = new JLabel("", SwingConstants.CENTER);
        JLabel lblXucXac4 = new JLabel("", SwingConstants.CENTER);
        JLabel lblXucXac5 = new JLabel("", SwingConstants.CENTER);
        JLabel lblXucXac6 = new JLabel("", SwingConstants.CENTER);
        resultPanel.add(lblXucXac1);
        resultPanel.add(lblXucXac2);
        resultPanel.add(lblXucXac3);
        resultPanel.add(lblXucXac4);
        resultPanel.add(lblXucXac5);
        resultPanel.add(lblXucXac6);
        panel.add(resultPanel);

        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        panel.add(new JScrollPane(resultArea));

        lblResult = new JLabel("", SwingConstants.CENTER);
        panel.add(lblResult);

        lblCountdown = new JLabel("", SwingConstants.CENTER);
        panel.add(lblCountdown);

        add(panel);

        btnBet100.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (taiKhoanNguoiChoi >= 100) {
                    datCuoc = 100;
                    taiKhoanNguoiChoi -= datCuoc;
                    lblTaiKhoan.setText("Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi));
                    resultArea.append("Bạn đã đặt cược: " + numf.format(datCuoc) + "\n");
                } else {
                    JOptionPane.showMessageDialog(null, "Không đủ tiền để đặt cược!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnBet200.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (taiKhoanNguoiChoi >= 200) {
                    datCuoc = 200;
                    taiKhoanNguoiChoi -= datCuoc;
                    lblTaiKhoan.setText("Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi));
                    resultArea.append("Bạn đã đặt cược: " + numf.format(datCuoc) + "\n");
                } else {
                    JOptionPane.showMessageDialog(null, "Không đủ tiền để đặt cược!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnBet500.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (taiKhoanNguoiChoi >= 500) {
                    datCuoc = 500;
                    taiKhoanNguoiChoi -= datCuoc;
                    lblTaiKhoan.setText("Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi));
                    resultArea.append("Bạn đã đặt cược: " + numf.format(datCuoc) + "\n");
                } else {
                    JOptionPane.showMessageDialog(null, "Không đủ tiền để đặt cược!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnTai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (datCuoc > 0) {
                    luaChonTaiXiu = 1;
                    startGame(resultArea, lblXucXac1, lblXucXac2, lblXucXac3, lblXucXac4, lblXucXac5, lblXucXac6);
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng đặt cược hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnXiu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (datCuoc > 0) {
                    luaChonTaiXiu = 2;
                    startGame(resultArea, lblXucXac1, lblXucXac2, lblXucXac3, lblXucXac4, lblXucXac5, lblXucXac6);
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng đặt cược hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void startGame(JTextArea resultArea, JLabel lblXucXac1, JLabel lblXucXac2, JLabel lblXucXac3,
            JLabel lblXucXac4, JLabel lblXucXac5, JLabel lblXucXac6) {
        countdownTime = 5;
        lblCountdown.setText("Kết quả sẽ có sau: " + countdownTime + " giây");
        disableButtons();

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countdownTime--;
                lblCountdown.setText("Kết quả sẽ có sau: " + countdownTime + " giây");
                if (countdownTime == 0) {
                    makeChoice(resultArea, lblXucXac1, lblXucXac2, lblXucXac3, lblXucXac4, lblXucXac5, lblXucXac6);
                    lblResult.setText("");
                    lblCountdown.setText("");
                    enableButtons();
                    timer.stop();
                }
            }
        });
        timer.start();
    }

    private void makeChoice(JTextArea resultArea, JLabel lblXucXac1, JLabel lblXucXac2, JLabel lblXucXac3,
            JLabel lblXucXac4, JLabel lblXucXac5, JLabel lblXucXac6) {
        Random rand = new Random();
        int giaTri1 = rand.nextInt(6) + 1;
        int giaTri2 = rand.nextInt(6) + 1;
        int giaTri3 = rand.nextInt(6) + 1;
        int tong = giaTri1 + giaTri2 + giaTri3;

        lblXucXac1.setText(Integer.toString(giaTri1));
        lblXucXac2.setText(Integer.toString(giaTri2));
        lblXucXac3.setText(Integer.toString(giaTri3));
        lblXucXac4.setText("");
        lblXucXac5.setText("");
        lblXucXac6.setText("");

        resultArea.append("Kết quả: " + giaTri1 + "-" + giaTri2 + "-" + giaTri3 + "\n");

        String message;
        if (tong == 3 || tong == 18) {
            message = "Tổng là: " + tong + " -> Nhà cái ăn hết, bạn đã thua!";
            resultArea.append(message + "\n");
        } else if (tong >= 4 && tong <= 10) {
            message = "Tổng là: " + tong + " -> Xỉu\n";
            if (luaChonTaiXiu == 2) {
                message += "Bạn đã thắng cược!";
                taiKhoanNguoiChoi += datCuoc * 2;
            } else {
                message += "Bạn đã thua cược!";
            }
            resultArea.append(message + "\n");
        } else {
            message = "Tổng là: " + tong + " -> Tài\n";
            if (luaChonTaiXiu == 1) {
                message += "Bạn đã thắng cược!";
                taiKhoanNguoiChoi += datCuoc * 2;
            } else {
                message += "Bạn đã thua cược!";
            }
            resultArea.append(message + "\n");
        }
        lblTaiKhoan.setText("Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi));
        datCuoc = 0;

        JOptionPane.showMessageDialog(this, message, "Kết quả", JOptionPane.INFORMATION_MESSAGE);
    }

    private void disableButtons() {
        btnBet100.setEnabled(false);
        btnBet200.setEnabled(false);
        btnBet500.setEnabled(false);
        btnTai.setEnabled(false);
        btnXiu.setEnabled(false);
    }

    private void enableButtons() {
        btnBet100.setEnabled(true);
        btnBet200.setEnabled(true);
        btnBet500.setEnabled(true);
        btnTai.setEnabled(true);
        btnXiu.setEnabled(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TaiXiu().setVisible(true);
            }
        });
    }
}
