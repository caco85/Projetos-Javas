package jdbc.gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import jdbc.banco.*;
import jdbc.conta.*;
import jdbc.cliente.*;
import jdbc.util.*;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:
 * @author
 * @version 1.0
 */

public class FrameAplicacaoBancaria extends JFrame {

    private Banco fachada;
    private Conta[] contasSelecionadas;
    private Cliente clienteSelecionado;

    JTabbedPane jTabbedPane1 = new JTabbedPane();
    JPanel Conta = new JPanel();
    JPanel Cliente = new JPanel();
    JLabel lbl_numero = new JLabel();
    JTextField tf_numero = new JTextField();
    JButton bt_cadastrarConta = new JButton();
    JLabel jLabel2 = new JLabel();
    JTextField tf_valor = new JTextField();
    JButton btn_creditar = new JButton();
    JButton btn_debitar = new JButton();
    JButton bt_procurarConta = new JButton();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JTextField tf_nome = new JTextField();
    JTextField tf_cpf = new JTextField();
    JButton bt_cadastrarCliente = new JButton();
    JLabel jLabel4 = new JLabel();
    JButton bt_addConta = new JButton();
    JButton bt_removerConta = new JButton();
    JButton bt_procurarCliente = new JButton();
    List lst_contasSelecionadas = new List();
    JButton bt_atualizarCliente = new JButton();
    JLabel jLabel5 = new JLabel();
    JTextField tf_saldo = new JTextField();
  JButton bt_limparConta = new JButton();
  JButton bt_limparCliente = new JButton();
  JButton br_sair = new JButton();

    public FrameAplicacaoBancaria() {
        try {
            this.fachada = new Banco();
            jbInit();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Frame frame = new FrameAplicacaoBancaria();
        frame.setSize(400,290);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();
        if (frameSize.height > screenSize.height) {
          frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
          frameSize.width = screenSize.width;
        }
        frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
        frame.setVisible(true);
    }

    private void jbInit() throws Exception {
        jLabel1.setText("Nome");
        jLabel1.setBounds(new Rectangle(19, 22, 75, 26));
        jLabel3.setText("CPF");
        jLabel3.setBounds(new Rectangle(19, 59, 75, 26));
        tf_nome.setBounds(new Rectangle(96, 22, 212, 26));
        tf_cpf.setBounds(new Rectangle(96, 59, 75, 26));
        bt_cadastrarCliente.setText("Cadastrar");
        bt_cadastrarCliente.setBounds(new Rectangle(3, 183, 91, 28));
        bt_cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(ActionEvent e) {
            bt_cadastrarCliente_actionPerformed(e);
          }
        });
        jLabel4.setText("Contas");
        jLabel4.setBounds(new Rectangle(19, 96, 75, 26));
        bt_addConta.setText("Adicionar conta");
        bt_addConta.setBounds(new Rectangle(242, 99, 129, 27));
        bt_addConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bt_addConta_actionPerformed(e);
            }
        });
        bt_removerConta.setText("Remover conta");
        bt_removerConta.setBounds(new Rectangle(242, 133, 129, 27));
        bt_removerConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bt_removerConta_actionPerformed(e);
            }
        });
        bt_procurarCliente.setText("Procurar");
        bt_procurarCliente.setBounds(new Rectangle(192, 183, 91, 28));
        bt_procurarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bt_procurarCliente_actionPerformed(e);
            }
        });
        lst_contasSelecionadas.setBounds(new Rectangle(96, 94, 142, 76));

        bt_atualizarCliente.setText("Atualizar");
        bt_atualizarCliente.setBounds(new Rectangle(98, 183, 91, 28));
        bt_atualizarCliente.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(ActionEvent e) {
            bt_atualizarCliente_actionPerformed(e);
          }
        });
        bt_cadastrarConta.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(ActionEvent e) {
            bt_cadastrarConta_actionPerformed(e);
          }
        });
        jLabel5.setText("Saldo");
        jLabel5.setBounds(new Rectangle(30, 68, 57, 27));
        tf_saldo.setBounds(new Rectangle(88, 68, 67, 27));
        tf_valor.setBounds(new Rectangle(88, 145, 67, 27));
        jLabel2.setText("Valor");
        jLabel2.setBounds(new Rectangle(30, 145, 54, 27));
        lbl_numero.setText("Número");
        lbl_numero.setBounds(new Rectangle(30, 35, 45, 27));
        bt_cadastrarConta.setText("Cadastrar");
        bt_cadastrarConta.setBounds(new Rectangle(259, 34, 95, 27));
        Conta.setLayout(null);
        Cliente.setLayout(null);
        tf_numero.setBounds(new Rectangle(88, 35, 112, 27));
        btn_creditar.setText("Creditar");
        btn_creditar.setBounds(new Rectangle(261, 113, 95, 27));
        btn_creditar.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(ActionEvent e) {
            btn_creditar_actionPerformed(e);
          }
        });
        btn_debitar.setText("Debitar");
        btn_debitar.setBounds(new Rectangle(262, 149, 95, 27));
        btn_debitar.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(ActionEvent e) {
            btn_debitar_actionPerformed(e);
          }
        });
        bt_procurarConta.setText("Ver saldo");
        bt_procurarConta.setBounds(new Rectangle(259, 67, 95, 27));
        bt_procurarConta.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(ActionEvent e) {
            bt_procurarConta_actionPerformed(e);
          }
        });
        this.getContentPane().setLayout(null);
        jTabbedPane1.setBounds(new Rectangle(3, 7, 382, 249));
            this.addWindowListener(new java.awt.event.WindowAdapter() {
          public void windowClosing(WindowEvent e) {
            this_windowClosing(e);
          }
        });
        bt_limparConta.setText("Limpar");
    bt_limparConta.setBounds(new Rectangle(262, 185, 95, 27));
    bt_limparConta.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        bt_limparConta_actionPerformed(e);
      }
    });
    bt_limparCliente.setText("Limpar");
    bt_limparCliente.setBounds(new Rectangle(287, 183, 89, 28));
    bt_limparCliente.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        bt_limparCliente_actionPerformed(e);
      }
    });
    br_sair.setText("Sair");
    br_sair.setBounds(new Rectangle(318, 5, 67, 20));
    br_sair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        br_sair_actionPerformed(e);
      }
    });
    Cliente.add(jLabel1, null);
        Cliente.add(jLabel3, null);
        Cliente.add(tf_nome, null);
        Cliente.add(tf_cpf, null);
        Cliente.add(jLabel4, null);
        Cliente.add(lst_contasSelecionadas, null);
        Cliente.add(bt_addConta, null);
        Cliente.add(bt_removerConta, null);
    Cliente.add(bt_limparCliente, null);
    Cliente.add(bt_procurarCliente, null);
    Cliente.add(bt_cadastrarCliente, null);
    Cliente.add(bt_atualizarCliente, null);
        Conta.add(lbl_numero, null);
        Conta.add(tf_numero, null);
        Conta.add(tf_saldo, null);
        Conta.add(jLabel5, null);
        Conta.add(jLabel2, null);
        Conta.add(tf_valor, null);
        Conta.add(bt_cadastrarConta, null);
        Conta.add(bt_procurarConta, null);
    Conta.add(btn_creditar, null);
    Conta.add(btn_debitar, null);
    Conta.add(bt_limparConta, null);
    this.getContentPane().add(br_sair, null);

        jTabbedPane1.add(Cliente, "Cliente");
        jTabbedPane1.add(Conta, "Conta");
        this.getContentPane().add(jTabbedPane1, null);
    }


    void bt_addConta_actionPerformed(ActionEvent e) {
        try {
            if (criaCliente()) {
                RepositorioContas rep = fachada.getContas();
                IteratorContas iterator =  rep.getIterator();
                int i = 0;
                Conta[] contas = new Conta[100];
                while (iterator.hasNext()) {
                    contas[i] = iterator.next();
                    i = i + 1;
                }
                (new DialogSelecionarConta(this,contas)).setVisible(true);
            }
        } catch (RepositorioException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
        }
    }

    void addConta(Conta c) {
        try {
            clienteSelecionado.cadastrar(c);
            carregaListaClienteSelecionado();
        } catch(ContaJaCadastradaException ex) {
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
        } catch(RepositorioException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
        }
    }

    void bt_procurarCliente_actionPerformed(ActionEvent e) {
        String cpf = tf_cpf.getText();
        if (cpf.equals("")) {
            (new DialogMensagem(this,"ERRO","Digite um CPF")).setVisible(true);
        } else {
            try {
                this.clienteSelecionado = fachada.procurarCliente(cpf);
                tf_nome.setText(clienteSelecionado.getNome());
                carregaListaClienteSelecionado();
            } catch(ClienteNaoEncontradoException ex){
                (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
                resetCliente();
            } catch(RepositorioException ex){
                (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
            }
        }
    }

    // analogo a um refresh
    private void carregaListaClienteSelecionado() {
        try {
            contasSelecionadas = new Conta[100];
            lst_contasSelecionadas.removeAll();
            RepositorioContas rep = clienteSelecionado.getContas();
            IteratorContas iterator =  rep.getIterator();
            int i = 0;
            while (iterator.hasNext()) {
                Conta c = iterator.next();
                lst_contasSelecionadas.add("Número: "+c.getNumero()+" Saldo: "+c.getSaldo());
                contasSelecionadas[i] = c;
                i = i + 1;
            }
        } catch(RepositorioException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
        }
    }

    void bt_removerConta_actionPerformed(ActionEvent e) {
        try {
            if (clienteSelecionado != null) {
                int index = lst_contasSelecionadas.getSelectedIndex();
                if (index == -1) {
                    (new DialogMensagem(this,"ERRO","Selecione um item da lista de contas")).setVisible(true);
                } else {
                    clienteSelecionado.remover(contasSelecionadas[index].getNumero());
                    carregaListaClienteSelecionado();
                }
            }
            else {
                (new DialogMensagem(this,"ERRO","Consulte um cliente")).setVisible(true);
            }
        } catch(ContaNaoEncontradaException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
            tf_saldo.setText("");
            tf_numero.setText("");
            tf_valor.setText("");
        } catch(RepositorioException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
        }
    }

    void bt_atualizarCliente_actionPerformed(ActionEvent e) {
        try {
            if (criaCliente()) {
                fachada.atualizar(clienteSelecionado);
                (new DialogMensagem(this,"Sucesso","Cliente atualizado com sucesso!")).setVisible(true);
                resetCliente();
            } else {
                (new DialogMensagem(this,"Erro","Selecione um cliente!")).setVisible(true);
            }
        } catch(ClienteNaoEncontradoException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
            resetCliente();
        } catch(ContaNaoEncontradaException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
        } catch(RepositorioException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
        }
    }

    void bt_cadastrarConta_actionPerformed(ActionEvent e) {
        try {
            tf_saldo.setText("");
            tf_valor.setText("");
            String numero = tf_numero.getText();
            Conta c = new Conta(numero);
            fachada.cadastrar(c);
            (new DialogMensagem(this,"Sucesso","Conta cadastrada com sucesso!")).setVisible(true);
            setaConta(c.getNumero(), c.getSaldo());
        } catch(ContaJaCadastradaException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
            tf_numero.setText("");
        } catch(RepositorioException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
        }
    }

    private void setaConta(String numero, double saldo) {
        tf_numero.setText(numero);
        tf_saldo.setText(saldo+"");
    }

  void bt_procurarConta_actionPerformed(ActionEvent e) {
        try {
            String numero = tf_numero.getText();
            if (numero.equals("")) {
                (new DialogMensagem(this,"ERRO","Digite um número")).setVisible(true);
            } else {
                setaConta(numero, fachada.saldo(numero));
            }
        } catch(ContaNaoEncontradaException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
            tf_saldo.setText("");
            tf_numero.setText("");
            tf_valor.setText("");
        } catch(RepositorioException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
        }
  }

  void btn_creditar_actionPerformed(ActionEvent e) {
        try {
            String numero = tf_numero.getText();
            double valor = (new Double(tf_valor.getText())).doubleValue();
            fachada.creditar(numero,valor);
            tf_valor.setText("");
        } catch(ContaNaoEncontradaException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
            tf_saldo.setText("");
            tf_numero.setText("");
            tf_valor.setText("");
        } catch(RepositorioException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
        } finally {
            bt_procurarConta_actionPerformed(e);
        }
  }

  void btn_debitar_actionPerformed(ActionEvent e) {
        try {
            String numero = tf_numero.getText();
            double valor = (new Double(tf_valor.getText())).doubleValue();
            fachada.debitar(numero,valor);
            tf_valor.setText("");
        } catch(ContaNaoEncontradaException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
            tf_saldo.setText("");
            tf_numero.setText("");
            tf_valor.setText("");
        } catch(SaldoInsuficienteException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
            tf_valor.setText("");
        } catch(RepositorioException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
        } finally {
            bt_procurarConta_actionPerformed(e);
        }
    }

    void this_windowClosing(WindowEvent e) {
        jdbc.util.ConnectionManager.liberaRecursos();
        System.exit(0);
    }

    private boolean criaCliente() {
        boolean resposta = false;
        String nome = tf_nome.getText();
        String cpf = tf_cpf.getText();
        if (nome.equals("")) {
            (new DialogMensagem(this,"ERRO","Digite o nome do cliente")).setVisible(true);
        } else if (cpf.equals("")) {
            (new DialogMensagem(this,"ERRO","Digite o cpf do cliente")).setVisible(true);
        } else if (clienteSelecionado == null) {
            clienteSelecionado = new Cliente(nome,cpf);
            resposta = true;
        } else {
            clienteSelecionado.setNome(nome);
            resposta = true;
        }
        return resposta;
    }

    void bt_cadastrarCliente_actionPerformed(ActionEvent e) {
        try {
            if (criaCliente()) {
                fachada.cadastrar(clienteSelecionado);
                (new DialogMensagem(this,"Sucesso","Cliente cadastrado com sucesso!")).setVisible(true);
                resetCliente();
            }
        } catch(ContaNaoCadastradaException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
        } catch(ClienteJaCadastradoException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
        } catch(RepositorioException ex){
            (new DialogMensagem(this,"ERRO",ex.getMessage())).setVisible(true);
        }
    }

    void resetCliente() {
        clienteSelecionado = null;
        contasSelecionadas = new Conta[100];
        tf_nome.setText("");
        tf_cpf.setText("");
        lst_contasSelecionadas.removeAll();
    }

    void bt_limparConta_actionPerformed(ActionEvent e) {
        tf_saldo.setText("");
        tf_numero.setText("");
        tf_valor.setText("");
    }

    void bt_limparCliente_actionPerformed(ActionEvent e) {
        resetCliente();
    }

    void br_sair_actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
