package pl.edu.agh.data.sub;

import pl.edu.agh.data.Base;

public class Another {
    private Base base;

    public void callIncrement(){        //ehh nie wiem do końca, starałem się zrobić tak by zgadzało się z UMLem a wygląda to bezsensu
        base.callIncrement();
    }
    public void callDecrement(){
        base.callDecrement();
    }
    public void callChangeName(String newName){
        base.callChangeName(newName);
    }
}
