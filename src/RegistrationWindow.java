import java.awt.*;

public class RegistrationWindow extends Frame
{
    Label label = new Label("Это будет в третьей лабе где SWING");

    public RegistrationWindow()
    {
        add(label);
        setSize(300, 200);
        addWindowListener(new WindowCloser());
        setVisible(true);
    }
}
