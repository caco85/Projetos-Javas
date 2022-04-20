package AtivdadeArvore;


/**
 *
 * @author Renato Nunes
 */
public class TreeNode<T extends Comparable<T>> {

    private TreeNode<T> esq;
    private T info;
    private TreeNode<T> dir;

    public TreeNode(T info) {
        this.info = info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return this.info;
    }

    public void setDir(TreeNode<T> dir) {
        this.dir = dir;
    }

    public TreeNode getDir() {
        return this.dir;
    }

    public void setEsq(TreeNode<T> esq) {
        this.esq = esq;
    }

    public TreeNode getEsq() {
        return this.esq;
    }

    T findNode(T value) {
        if (value.compareTo(this.info) == 0) {
            return this.info;
        } else if (value.compareTo(this.info) < 0) {
            if (this.esq == null) {
                return null;
            } else {
                return this.esq.findNode(value);
            }
        } else {
            if (this.dir == null) {
                return null;
            } else {
                return this.dir.findNode(value);
            }
        }
    }
}
