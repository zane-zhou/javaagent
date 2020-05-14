import java.lang.instrument.Instrumentation;

/**
 * Created by zane on 2020/5/11
 */
public class FirstAgent {
    public static void premain(String agentArgs, Instrumentation inst){
        System.out.println("FirstAgent is Start.");
        inst.addTransformer(new FirstTransformer());
    }
}
