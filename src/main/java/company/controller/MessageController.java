package company.controller;

import company.dto.MessageDTO;
import company.dto.ResponseMessageDTO;
import company.dto.ResponseRestMessageDTO;
import company.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nata on 14.06.2017.
 */

@RestController
public class MessageController {
@Autowired
    MessageService messageService;

    @RequestMapping(value = "/messages", method = RequestMethod.GET)

    public ResponseEntity<ResponseRestMessageDTO> getAllMessages(HttpSession session) throws IOException {
        ResponseRestMessageDTO responseRestMessageDTO= new ResponseRestMessageDTO();

        List<ResponseMessageDTO> list = new ArrayList<>();

       List<MessageDTO> messageDTOList= messageService.getAllMessages();

        for (MessageDTO messageDTO: messageDTOList)
        {
            ResponseMessageDTO message= new ResponseMessageDTO();

            message.setNumber(messageDTO.getNumber());
            message.setTime(messageDTO.getTime());
            message.setMessageType(messageDTO.getMessageType());
            message.setTimer(messageDTO.getTimer());
            message.setStatus(messageDTO.getStatus());
            message.setDbChange(messageDTO.getDbChange());
            message.setTimerService(messageDTO.getTimerService());
            message.setInform1(messageDTO.getInform1());
            message.setInform2(messageDTO.getInform2());


            list.add(message);
        }





        responseRestMessageDTO.setMessage(list);

        return new ResponseEntity<>(responseRestMessageDTO, HttpStatus.OK);
    }

}
