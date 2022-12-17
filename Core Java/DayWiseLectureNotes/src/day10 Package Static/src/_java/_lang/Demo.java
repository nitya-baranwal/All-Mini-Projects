package _java._lang;

import static java.lang.System.*;
import static _java._lang._System.*;

public class Demo {
    public static void main(String[] args) {
        String s = "Eureka";
        out.println(s);
        _out._println(s);
    }
}
class _System {
     static _Print_Stream _out = new _Print_Stream();
}
class _Print_Stream{
    void _println(String str){
        out.println(str);
    }
}