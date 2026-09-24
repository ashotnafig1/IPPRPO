import java.awt.*;
import java.awt.event.*;

public class WindowCloser extends WindowAdapter
{
    /*
     * Бригада: в awt есть интерфейсы типа WindowListener, и в них объявлено
     * штук 7 методов, ЧТО НАРУШАЕТ ПРИНЦИП РАЗДЕЛЕНИЯ ИНТЕРФЕЙСОВ,
     * чтобы не реализовывать все 7 придумали Adapter которые уже реализуют
     * все эти методы, но выглядят они вот так { }
     * колхозный язык - колхозное решение :D
    */
    // а этот метод программирует кнопку закрытия, он же крестик
    @Override
    public void windowClosing(WindowEvent e)
    {
        Window window = e.getWindow();
        window.dispose();

        // короч если кроме окна из e есть ещё хоть одно то disponse
        boolean anyVisible = false;
        for (Frame f : Frame.getFrames())
        {
            if (f.isVisible() && f != window)
            {
                anyVisible = true;
                break;
            }
        }

        if (!anyVisible)
        {
            System.exit(0);
        }
    }
}
