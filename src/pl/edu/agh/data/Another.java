package pl.edu.agh.data;

public class Another {
    private Base base;

    public void callBaseIncrement(){
        base.increment();
    }
    public void callBaseDecrement(){
        base.decrement();
    }
    public void callBaseChangeName(String newName){
        base.changeName(newName);
    }
}
