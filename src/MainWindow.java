import java.awt.*;

public class MainWindow extends Frame
{
    Label label = new Label("Это будет в четвертой лабе где JAVAFX");

    public MainWindow()
    {
        add(label);
        setSize(300, 200);
        addWindowListener(new WindowCloser());
        setVisible(true);
    }
}
