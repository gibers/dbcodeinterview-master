package move.jbc.test.impl;


import move.jbc.test.entities.Contact;
import move.jbc.test.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @RequestMapping(value="aff", method = RequestMethod.GET)
    public String home(Map<String,Object> model) {
        List<Contact> contacts = contactRepository.findAll();
        model.put("contacts", contacts);
        return "home";
    }

    @RequestMapping(value="mod/{id}", method = RequestMethod.GET)
    public String modify(@PathVariable("id") long idcont, Map<String,Object> model) {
        List<Contact> contacts = contactRepository.findAll();
        Optional<Contact> byId = contactRepository.findById(idcont);
        if(byId.isPresent()) {
            Contact contact = byId.get();
            contact.setPhoneNumber("9999999999");
            contactRepository.saveAndFlush(contact);
        }
        model.put("contacts", contacts);
        return "home";
    }

    @RequestMapping(value="submit", method = RequestMethod.POST)
    public String submit(Contact contact) {
        contactRepository.save(contact);
        return "redirect:/";
    }

//    @RequestMapping(value="select/{reader}", method = RequestMethod.GET)
//    public String select(@PathVariable("reader") String reader, Model model) {
//        List<Contact> readingList = contactRepository.findByFirstname(reader);
//        if (readingList != null) {
//            model.addAttribute("books", readingList);
//        }
//        return "home";
//    }

}
