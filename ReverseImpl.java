import ReverseModule.ReversePOA;
import java.lang.String;

public class ReverseImpl extends ReversePOA {
    ReverseImpl(){
        super();
        System.out.println("Reverse object creates");
    }

    public String reverse_string(String name){
        StringBuffer str = new StringBuffer(name);
        str.reverse();
        return (("Server Send " + str));
    }

}
