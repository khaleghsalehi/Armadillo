package sampleClass;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Setter
@Getter
public class CallCenter implements Serializable {
    UUID uuid;
    String officeName;
    String phone;

    public CallCenter(UUID uuid, String officeName, String phone) {
        this.uuid = uuid;
        this.officeName = officeName;
        this.phone = phone;
    }

}
