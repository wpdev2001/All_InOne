class ParentClass{
    public void Method1(){
        System.out.println("This is Method 1");
    }

    public void Method2(){
        System.out.println("This is Method 2");
    }

    public void Method3(){
        System.out.println("This is Method 3");
    }
}

class ChildClass extends ParentClass{
    public void Method11(){
        System.out.println("This is Method 11");
    }

    @Override
    public void Method1(){
        System.out.println("Overrided Method 1 in child");
    }

    @Override
    public void Method2(){
        System.out.println("Overrided Method 2 in child");
    }

    public void Method22(){
        System.out.println("This is Method 22");
    }

}
public class Main {
    public static void main(String[] args) {
        //CASE 1: [ Parent class can only access Parent class methods not the child class ]
        ParentClass parentClass = new ParentClass();
        parentClass.Method1();
        parentClass.Method2();
        parentClass.Method3();
//        parentClass.Method11(); --> Can't access methods of Child class

        System.out.println("===============================================================");

        //CASE 2: [ Child class can access both Parent class and Child class methods ]
        ChildClass childClass = new ChildClass();
        childClass.Method1(); // The Overriden method in Child class is called
        childClass.Method2(); // The Overriden method in Child class is called
        childClass.Method3(); // Since Method 3 isn't gets override in Child then the parent class method is called.
        childClass.Method11();
        childClass.Method22();

        System.out.println("===============================================================");

        //CASE 3:
        ParentClass pr1 = new ChildClass();
        pr1.Method1();
        pr1.Method2();
        pr1.Method3();
//        pr1.Method11();
//        The object 'pr1' here couldn't able to access the parent class here even though we have created object using new ChildClass()


        //CASE 4: Can we do this? --> NOO
//        ChildClass cr1 = new ParentClass(); -->ERROR
    }
}