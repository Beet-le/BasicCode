package Day607;

import javax.swing.*;

class LoginDemo extends JFrame {
    //用户名和密码：
    private String username = "123";
    private String password = "123";
    //窗口：
    JFrame window;
    //用户名、密码文本框
    JTextField user;
    JTextField pwd;
    //登录按钮
    JButton Login;
    //初始化
    public LoginDemo() {
        window = new JFrame("学生管理系统");
        window.setLayout(null);
        window.setSize(600, 600);//设置大小
        window.setLocationRelativeTo(null);//设置居中
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置可关闭
        window.setLayout(null);//设置绝对布局（窗口里面的内容不会随着窗口的改变而改变）
        window.setResizable(false);//设置窗口不可拉伸改变大小
        //设置用户名标签
        JLabel username_label = new JLabel("用户名:");
        username_label.setBounds(100, 100, 100, 50);
        window.add(username_label);
        //设置密码标签
        JLabel password_label = new JLabel("密码");
        password_label.setBounds(100, 200, 100, 50);
        window.add(password_label);
        //设置用户名文本框
        user = new JTextField();
        user.setBounds(150, 100, 300, 50);
        window.add(user);
        //设置密码文本框
        pwd = new JPasswordField();//隐藏密码
        pwd.setBounds(150, 200, 300, 50);
        window.add(pwd);
        //设置按钮
        Login = new JButton("登录");
        Login.setBounds(250, 300, 100, 50);
        window.add(Login);
        window.setVisible(true);//设置面板可见
    }

}

