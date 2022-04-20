package Arvore;

/**
 *
 * @author Renato Nunes
 */
public class Tree<T extends Comparable<T>> {

    private TreeNode<T> raiz;

    public boolean isEmpty() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(T value) {
        if (this.isEmpty() == true) {
            raiz = new TreeNode(value);
        } else {
            raiz = this.insertNode(raiz, value);
        }
    }

    private TreeNode<T> insertNode(TreeNode<T> r, T value) {
        if (r == null) {
            r = new TreeNode(value);
        } else if (value.compareTo(r.getInfo()) < 0) {
            r.setEsq(insertNode(r.getEsq(), value));
        } else {
            r.setDir(insertNode(r.getDir(), value));
        }
        return r;
    }

    public void insertRec(T value) {
        if (this.isEmpty() == true) {
            raiz = new TreeNode(value);
        } else {
            insertRec(value);
        }

    }

    public void insertNaoRep(T value) {
        TreeNode<T> auxRaiz;
        if (this.isEmpty() == true) {
            raiz = new TreeNode(value);

        } else {
            auxRaiz = (TreeNode<T>) find(value);

            if (value.compareTo(auxRaiz.getInfo()) == 0) {
                System.out.println("valor repetido!");
            } else if (value.compareTo(auxRaiz.getInfo()) <= 0) {
                this.raiz.setEsq(insertNode(raiz.getEsq(), value));

            } else {
                raiz.setDir(insertNode(raiz.getDir(), value));
            }

        }
    }

    public void emOrdem() {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia");
        } else {
            percorrerEmOrdem(raiz);
        }
    }

    private void percorrerEmOrdem(TreeNode<T> r) {
        if (r != null) {
            percorrerEmOrdem(r.getEsq());
            System.out.print(r.getInfo() + " ");
            percorrerEmOrdem(r.getDir());
        }
    }

    public T find(T value) {
        if (this.isEmpty() == true) {
            return null;
        } else {
            return raiz.findNode(value);
        }
    }
    public int buscarCont(T value) {
        int cont = 0;
        if (this.isEmpty() == true) {
            return cont = 0;
        } else {
            while (raiz != null) {                
                if(value == raiz){
                    cont = cont+1;
                }
            }
        }
        return cont;
    }

    public void passeioPorNivel() {
        Queue<TreeNode<T>> fila;
        TreeNode<T> aux;
        if (this.isEmpty() == false) {
            fila = new Queue();
            fila.enQueue(raiz);
            while (fila.isEmpty() == false) {
                aux = fila.deQueue();
                if (aux.getEsq() != null) {
                    fila.enQueue(aux.getEsq());
                }
                if (aux.getDir() != null) {
                    fila.enQueue(aux.getDir());
                }
                System.out.println(aux.getInfo());
            }
        } else {
            System.out.println("Árvore vazia");
        }
    }
    public void menorEsqRec(TreeNode<T> r) {
        if (r.getEsq() != null) {
            menorEsqRec(r.getEsq());

        }
        if (r.getEsq() == null) {
            System.out.println("menor é" + r.getInfo());

        }
    }

   public TreeNode<T>  menor_no(TreeNode<T> r){
        while(r.getEsq() != null) {
            r = r.getEsq();
        }
        return (TreeNode<T>) r.getInfo();
    }

    public TreeNode<T> removeNaoRecursivo(TreeNode<T> r, T value) {
        TreeNode<T> pai, filho;
        if (r.getEsq() == null && r.getDir() == null) {//sem filhos
            r = null;
            System.out.println("REMOVIDO");
        } else if (r.getEsq() == null) {//um filho a direita
            r = r.getDir();
            //System.out.println("REMOVIDO");
        } else if (r.getDir() == null) {//um filho a direita
            r = r.getEsq();
        } else {//dois filhos
            pai = r;
            filho = pai.getEsq();
            while (filho.getDir() != null) {
                pai = filho;
                filho = filho.getDir();
            }//achou
            pai.setDir(filho.getEsq());
            r.setInfo(filho.getInfo());
        }
        return r;
    }

    public void remove(T value) {
        if (this.isEmpty() == true) {
            System.out.println("Arvore vazia!!");
        } else {
            this.removeNode(this.raiz, value);
        }

    }

    private TreeNode<T> removeNode(TreeNode<T> r, T value) {
        TreeNode<T> pai = null, filho = null;
        if (r == null) {
            System.out.println("Elemento não encontrado!");
        } else if (value.compareTo(r.getInfo()) == 0) {
            if (r.getEsq() == null && r.getDir() == null) { // Não tem filhos }
            } else if (r.getEsq() == null) { // Não tem filho a esquerda 
            } else if (r.getDir() == null) { // Não tem filho a direita 
            } else { // Tem ambos os filhos 
                while (filho.getDir() != null) {
                    r = null;
                    r = r.getDir();
                    r = r.getEsq();
                    pai = r;
                    filho = pai.getEsq();
                    pai = filho;
                    filho = filho.getEsq();
                }

                pai.setDir(filho.getEsq());
                r.setInfo(filho.getInfo());
            }
        } else if (value.compareTo(r.getInfo()) < 0) {
            r.setEsq(removeNode(r.getEsq(), value));
        } else {
            r.setDir(removeNode(r.getDir(), value));
        }
        return r;
    }

}
