

public class B extends A implements Presentable{
    private String bString;
    private String presentBString;

    public B(String bString, String presentString, String aString, String presentBString) {
        super(aString, presentString);
        this.bString = bString;
        this.presentBString = presentBString;
    }


    @Override
    public String present() {
        // TODO Auto-generated method stub
        return super.present() + bString + presentBString;
    }
}
