package pl.edu.agh.data;

public class Base  {
    private int value;
    String name;

    public void callChangeName(String newName){
        changeName(newName);
    }
    public void callIncrement(){ //założyłem że increment => zwiększenie zawsze o jeden
        increment();
    }
    public void callDecrement(){
        decrement();
    }
    private void increment(){
        value = value + 1;
    }
    protected void decrement(){
        value = value - 1;
    }
    void changeName(String newName){
        name = newName;
    }

}
