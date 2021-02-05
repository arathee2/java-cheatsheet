/**
 * Multiline 
 * comment
 */
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
    
    // must have methods
    public String toString () {
        return "This is string representation of this object.\n" + "First field = " + this.field1;
    }
    
    public int hashCode () {
        return toString().hashCode(); //returns hash code to be used in hash tables
    }
    
    public boolean equals (Object o) { // parameter type has to be Object
        if (o != null && o.getClass().equals(getClass())) {
            ClassName other = (ClassName) o;
            return other.f0 == f0 && 
                other.f1 == f1 && 
                other.f2 == f2 &&
                other.f3 == f3;
        }
    }
}