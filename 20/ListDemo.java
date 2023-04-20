import java.awt.*;
import java.awt.event.*;

public class ListDemo extends Frame implements ActionListener {
    private List listBox;
    private Button addButton, removeButton;
    private TextField textField;

    public ListDemo() {
        super("List Demo");

        setLayout(new BorderLayout());

        listBox = new List();
        addButton = new Button("Add");
        removeButton = new Button("Remove");
        textField = new TextField();

        addButton.addActionListener(this);
        removeButton.addActionListener(this);

        Panel buttonPanel = new Panel(new GridLayout(1, 2));
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);

        add(listBox, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(textField, BorderLayout.NORTH);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String newItem = textField.getText().trim();
            if (!newItem.isEmpty()) {
                listBox.add(newItem);
                textField.setText("");
            }
        } else if (e.getSource() == removeButton) {
            int selectedIndex = listBox.getSelectedIndex();
            if (selectedIndex >= 0) {
                listBox.remove(selectedIndex);
            }
        }
    }

    public static void main(String[] args) {
        new ListDemo();
    }
}
