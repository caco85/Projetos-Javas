package jdbc.gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import jdbc.conta.*;


/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:
 * @author
 * @version 1.0
 */

public class DialogSelecionarConta extends JDialog {
    JPanel panel1 = new JPanel();
    JLabel jLabel1 = new JLabel();
    JButton bt_ok = new JButton();
    JButton bt_cancel = new JButton();
    private Conta[] contas;
    FrameAplicacaoBancaria frame;
    List list = new List();

    public DialogSelecionarConta(FrameAplicacaoBancaria frame, Conta[] contas) {
        super(frame, "Conta", true);
        this.contas = contas;
        this.frame = frame;
        try {
            jbInit();
            pack();
            setSize(220,250);
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
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    void jbInit() throws Exception {
        panel1.setLayout(null);
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel1.setText("Selecione a conta desejada");
        jLabel1.setBounds(new Rectangle(6, 12, 203, 33));
        bt_ok.setText("OK");
        bt_ok.setBounds(new Rectangle(8, 162, 92, 30));
        bt_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bt_ok_actionPerformed(e);
            }
        });
        bt_cancel.setText("Cancelar");
        bt_cancel.setBounds(new Rectangle(111, 162, 92, 30));
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bt_cancel_actionPerformed(e);
            }
        });
        list.setBounds(new Rectangle(20, 50, 168, 104));
        getContentPane().add(panel1);
        panel1.add(jLabel1, null);
        for (int i = 0; contas[i] != null; i = i + 1) {
            list.add("Número: "+contas[i].getNumero()+" Saldo: "+contas[i].getSaldo());
        }
        panel1.add(list, null);
    panel1.add(bt_ok, null);
    panel1.add(bt_cancel, null);
    }

    void bt_ok_actionPerformed(ActionEvent e) {
        int index = list.getSelectedIndex();
        if (index == -1) {
            (new DialogMensagem(frame,"ERRO","Selecione um item da lista de contas")).setVisible(true);
        } else {
            frame.addConta(contas[index]);
            this.dispose();
        }
    }

    void bt_cancel_actionPerformed(ActionEvent e) {
        this.dispose();
    }
}