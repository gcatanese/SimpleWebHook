package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    
    @RequestMapping("/message")
    public Payload greeting(@RequestParam(value="name", defaultValue="World") String name) {
        
        Payload payload = new Payload();
        Messages m1 = new  Messages("1");
        Messages m2 = new  Messages("2");
        
        Messages[] messages = new Messages[2];
        messages[0] = m1;
        messages[1] = m2;
        
        payload.setMessages(messages);
        
        
        return payload;
    }
}
