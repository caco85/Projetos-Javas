package AtivdadeArvore;

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

    public void percorrerEmOrdem(TreeNode<T> r) {
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

}
