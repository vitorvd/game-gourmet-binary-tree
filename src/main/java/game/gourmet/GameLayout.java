package game.gourmet;

import javax.swing.*;

public abstract class GameLayout {

    private JFrame frame;

    public GameLayout() {
        this.frame = new JFrame("Jogo Gourmet");
    }

    protected void showMessageDialog(String text) {
        JOptionPane.showMessageDialog(frame, text);
    }

    protected boolean showConfirmDialog(String text) {
        int anwser = JOptionPane.showConfirmDialog(frame, text, "Jogo Gourmet", JOptionPane.YES_NO_OPTION);

        return anwser == JOptionPane.YES_OPTION;
    }

    protected String showQuestionDialog(String text){
        return JOptionPane.showInputDialog(frame, text);
    }

}
