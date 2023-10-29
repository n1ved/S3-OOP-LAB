class TestClass{
    String name;
    TestClass(){
        name = "unknown";
    }
    TestClass(String name){
        this.name = name ;
    }
}

class ConstructorWithDefaultValueTest{
    public static void main(String[] args) {
        TestClass tc1 = new TestClass("Hello");
        System.out.println(tc1.name);
        TestClass tc2 = new TestClass();
        System.out.println(tc2.name);
    }
}