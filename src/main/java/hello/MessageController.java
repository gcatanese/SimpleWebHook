package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @RequestMapping("/message")
    public Payload greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

        Payload payload = new Payload();

        payload.setMessages(getJoke1());

        return payload;
    }

    private Messages[] getJoke1() {
        Messages[] messages = new Messages[2];

        messages[0] = new Messages("Did you hear about the restaurant on the moon?");
        messages[1] = new Messages("Great food, no atmosphere.");

        return messages;
    }
    
    
}
