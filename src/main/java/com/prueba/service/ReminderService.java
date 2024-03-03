package com.prueba.service;

import com.prueba.model.Reminder;
import com.prueba.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReminderService {

    @Autowired
    private ReminderRepository reminderRepository;

    public List<Reminder> getAllReminder() {
        return reminderRepository.findAll();
    }

    public Optional<Reminder> getReminderById(Long id) {
        return reminderRepository.findById(id);
    }

    public Reminder saveReminder(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    public void deleteReminder(Long id) throws Exception {
        Reminder existingReminder = reminderRepository.findById(id).orElse(null);
        if(existingReminder!=null) {
            reminderRepository.deleteById(id);
        }else{
            throw new Exception("Couldn't find that Reminder you silly bastard");
        }

    }

    public Reminder updateReminder(Long id, Reminder updatedReminder) throws Exception {
        Reminder existingReminder = reminderRepository.findById(id).orElse(null);
        if (existingReminder != null) {
            // Update the fields of existingReminder with the values from updatedReminder
            existingReminder.setNombre(updatedReminder.getNombre());
            existingReminder.setCategoria(updatedReminder.getCategoria());
            existingReminder.setEstado(updatedReminder.getEstado());
            existingReminder.setOrden(updatedReminder.getOrden());
            existingReminder.setPrioridad(updatedReminder.getPrioridad());

            // Save the updated entity
            return reminderRepository.save(existingReminder);
        }
        throw new Exception("Couldn't find that Reminder you silly bastard"); // Or throw an exception if desired
    }
}
