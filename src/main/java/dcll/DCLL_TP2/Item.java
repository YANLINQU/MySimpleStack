package dcll.DCLL_TP2;

/**
 * Created by QYL on 2016/2/23.
 */
public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }
    /*
    * Un commentaire repondant a l'exigence #1
    * */
    public Object getValue(){
        return value;
    }
    public void setValue(Object value){
        this.value=value;
    }
}
