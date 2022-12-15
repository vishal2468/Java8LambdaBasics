/**
 * DoSomething
 */
public class DoSomething {
    public void perform(SendGreetings sendGreetings){
        sendGreetings.greet();
    }
    public static void main(String[] args) {
        DoSomething doSomething=new DoSomething();
        doSomething.perform(new SendHelloGreetings());
    }
}
