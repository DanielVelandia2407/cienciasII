import controller.menu.MainController;
import view.menu.MainView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainView mainView = new MainView();
            MainController mainController = new MainController(mainView);
            mainView.showView();
        });
    }
}