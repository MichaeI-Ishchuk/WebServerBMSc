package company.service;

import company.dto.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nata on 14.06.2017.
 */

@Service
public class MessageService {

   @Autowired
    private ResourceLoader resourceLoader;
    @Scheduled(fixedDelay = 300000)
    public List<MessageDTO> getAllMessages() throws IOException {

        List<MessageDTO> list =new ArrayList<>();

        try(FileReader fileReader =new FileReader(resourceLoader.getResource("classpath:log.txt").getFile());
                BufferedReader reader = new BufferedReader(fileReader);

        )

        {  StringBuilder sb = new StringBuilder();
            String text =reader.readLine();
            while (text!=null)

            {

                sb.append(text);

                text=reader.readLine();

            }
            sb.append("END");

            Pattern p = Pattern.compile("\\d{8}\\.\\d{3} \\|\\d{2}:\\d{2}:\\d{2}.\\d+ \\|(?:SdlSig|Stopping).*?(?=\\d{8}\\.|END)");
            Matcher m = p.matcher(sb);

            while (m.find()) {

                String array []=  m.group().split("\\|");

                System.out.println(array.length+"//////////////");

                MessageDTO messageDTO = new MessageDTO();

                messageDTO.setNumber(array[0]);
                messageDTO.setTime(array[1]);
                messageDTO.setMessageType(array[2]);
                messageDTO.setTimer(array[3]);
                messageDTO.setStatus(array[4]);
                messageDTO.setDbChange(array[5]);
                messageDTO.setTimerService(array[6]);
                messageDTO.setInform1(array[7]);
                messageDTO.setInform2(array[8]);
                list.add(messageDTO);

            }

        }catch (FileNotFoundException e){}

        System.out.println(list.size()+"///////////////////");
        return list;

    }










}
