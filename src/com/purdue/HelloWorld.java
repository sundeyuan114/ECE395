public class HelloWorld{
    private String name;
    public HelloWorld(String _name){
        name = _name;
    }
    public void sayHello(){
        System.out.println("爷("+name+")来了");
    }
    public static void main(String[]args){
        HelloWorld aoligei = new HelloWorld("孙得元");
        aoligei.sayHello();
    }
}