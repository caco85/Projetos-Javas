package jdbc.gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class DialogMensagem extends JDialog {
  Panel panel1 = new Panel();
  Button btnOK = new Button();
  Label lblMensagem = new Label();
  FlowLayout flowLayout1 = new FlowLayout();


  public DialogMensagem(Frame frame, String title, String mensagem) {
    super(frame, title, true);
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try  {
      jbInit();
      lblMensagem.setText(mensagem);
      getContentPane().add(panel1);
      pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dialogSize = this.getSize();
        if (dialogSize.height > screenSize.height) {
          dialogSize.height = screenSize.height;
        }
        if (dialogSize.width > screenSize.width) {
          dialogSize.width = screenSize.width;
        }
        this.setLocation((screenSize.width - dialogSize.width) / 2, (screenSize.height - dialogSize.height) / 2);
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  void jbInit() throws Exception {
    btnOK.setLabel("OK");
    btnOK.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnOK_actionPerformed(e);
      }
    });
    lblMensagem.setText("   label");
    panel1.setSize(new Dimension(289, 59));
    panel1.setLayout(flowLayout1);
    panel1.add(lblMensagem, null);
    panel1.add(btnOK, null);
    setSize(150,50);
  }

  protected void processWindowEvent(WindowEvent e) {
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      cancel();
    }
    super.processWindowEvent(e);
  }

  void cancel() {
    dispose();
  }

  void btnOK_actionPerformed(ActionEvent e) {
    cancel();
  }

}


