package company.dto;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by nata on 15.06.2017.
 */
@XmlRootElement(name = "messages")
public class ResponseRestMessageDTO {


    private List<ResponseMessageDTO> message;

    public ResponseRestMessageDTO() {
    }

    public List<ResponseMessageDTO> getMessage() {
        return message;
    }

    public void setMessage(List<ResponseMessageDTO> message) {
        this.message = message;
    }
}
