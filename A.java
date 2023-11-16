

public class A implements Presentable{
    private String aString;
    private String presentString;

    public A(String aString, String presentString) {
        super();
        this.aString = aString;
        this.presentString = presentString;
    }

    @Override
    public String present() {
        // TODO Auto-generated method stub
        return aString + presentString;
    }
}
