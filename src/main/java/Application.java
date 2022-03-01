import library.CryptoWrapper;
import sampleClass.CallCenter;

import java.io.Serializable;
import java.util.UUID;

public class Application implements Serializable {

    public static void main(String[] args) throws Exception {

        CallCenter callCenter = new CallCenter(UUID.randomUUID(),
                "Headquarter",
                "(+1) 888-3444");

        System.out.println("wrapper...");
        String res = CryptoWrapper.safeSerialize(callCenter);
        CryptoWrapper.writeSafeObject("delta.ser", res);
        System.out.println(res);


        System.out.println("unwrapped...");
        CallCenter newReflectedObject = (CallCenter) CryptoWrapper.safeDeSerialize(res);
        System.out.println(newReflectedObject.getOfficeName());
        System.out.println(newReflectedObject.getPhone());
        System.out.println(newReflectedObject.getUuid());

        System.out.println("unwrapped from file...");
        String content = CryptoWrapper.readSafeObject("delta.ser");
        System.out.println(content);
        CallCenter newReflectedObjFromFile = (CallCenter) CryptoWrapper.safeDeSerialize(content);
        System.out.println(newReflectedObjFromFile.getOfficeName());
        System.out.println(newReflectedObjFromFile.getPhone());
        System.out.println(newReflectedObjFromFile.getUuid());


    }
}
