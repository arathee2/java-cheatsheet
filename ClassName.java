
public class ClassName extends ParentClass implements InterfaceClass1, InterfaceClass2 {
    private int field1;
    private final float field2;  // final means const in Java
    private static char field3;  // static fields are shared by all instances of the class.
    
    public ClassName (String f0, int f1, float f2, char f3) {
        super(f0);  // first line of construtor could be call to parent's constructor or to any other constructor in the same class (aka constructor chaining)
        this.field1 = f1;
        this.field2 = f2;
        this.field3 = f3;
    }
    
    public int getField1 () {
        return this.field1;
    }
    
    public void setField1 (int f1) {
        this.field1 = f1;
    }
}