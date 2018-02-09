package hardTask;

public abstract class Function implements Runnable {

    public abstract String getName();

    public abstract void setArgs(String[] args);

    public abstract int getNumArgs();
}
