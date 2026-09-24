
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AutorizationWindow extends Frame
{
    Panel mainPanel = new Panel();
    Label labelHello = new Label("здравствуйте войдите");
    TextField loginField = new TextField("debil");
    TextField passwordField = new TextField("qwerty");
    Panel buttonPanel = new Panel();
    Button buttonSign = new Button("ВойтиВАйти");
    Button buttonRegister = new Button("зарегаться");
    Button buttonCancel = new Button("отмена");



    public AutorizationWindow ()
    {
        // С ВОНЮЧИМ AWT НЕ РАБОТАЕТ ШРИФТ С**А
        var fontImpact = new Font("Impact", Font.PLAIN, 24);
        var fontComicSans = new Font("Comic Sans MS", Font.PLAIN, 18);

        passwordField.setEchoChar('☺');

        setLayout(new FlowLayout());
        mainPanel.setPreferredSize(new Dimension(400, 264));
        add(mainPanel);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(labelHello);
        mainPanel.add(loginField);
        mainPanel.add(passwordField);
        mainPanel.add(buttonPanel);
        buttonPanel.add(buttonSign);
        buttonPanel.add(buttonRegister);
        buttonPanel.add(buttonCancel);

        System.out.println(fontImpact.getFamily());
        System.out.println(fontComicSans.getFamily());

        labelHello.setFont(fontImpact);
        loginField.setFont(fontComicSans);
        passwordField.setFont(fontComicSans);
        buttonPanel.setFont(fontImpact);

        setupButtonsListeners();

        addWindowListener(new WindowCloser());

        Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");
        setIconImage(icon);

        setSize(600, 284);
        setVisible(true);


    }

    private void setupButtonsListeners()
    {
        buttonSign.addActionListener(e -> new MainWindow());
        buttonRegister.addActionListener(e -> new RegistrationWindow());
        buttonCancel.addActionListener(e -> System.exit(228));
    }
}
