package com.prueba.controller;

import com.prueba.model.Reminder;
import com.prueba.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reminder")
public class ReminderController {

    @Autowired
    private ReminderService reminderService;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public List<Reminder> getAllReminder() {
        return reminderService.getAllReminder();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getReminderById(@PathVariable Long id) {
        
        Optional<Reminder> foundReminder=reminderService.getReminderById(id);
        if(foundReminder.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body("Successfully deleted madafaka");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Couldn't find Reminder");
        }
    }

    @PostMapping("/")
    public ResponseEntity<Object> saveReminder(@RequestBody Reminder reminder) {
        Reminder savedReminder=reminderService.saveReminder(reminder);

        if(savedReminder!=null){
            return ResponseEntity.status(HttpStatus.OK).body("Successfully created bitch");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Couldn't find Reminder");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteReminder(@PathVariable Long id) {
        try{
            reminderService.deleteReminder(id);
            return ResponseEntity.status(HttpStatus.OK).body("Successfully deleted madafaka");
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
        
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateReminder(@PathVariable Long id, @RequestBody Reminder updatedReminder) {
        try{
            Reminder updatedEntity = reminderService.updateReminder(id, updatedReminder);
            return ResponseEntity.status(HttpStatus.OK).body(updatedEntity);
           
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
       
    }

}
