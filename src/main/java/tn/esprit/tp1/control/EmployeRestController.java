package tn.esprit.tp1.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp1.entities.Employe;
import tn.esprit.tp1.service.interfaces.IEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeRestController {
    IEmployeService employeService;

    @GetMapping("/retrieve-all-employes")
    public List<Employe> getEmployes() {
        List<Employe> listEmployes = employeService.retrieveAllEmployes();
        return listEmployes;
    }

    @GetMapping("/retrieve-employe/{employe-id}")
    public Employe retrieveEmploye(@PathVariable("employe-id") Long employeId) {
        Employe employe = employeService.retrieveEmploye(employeId);
        return employe;
    }

    @PostMapping("/add-employe")
    public Employe addEmploye(@RequestBody Employe employe) {
        Employe employe1 = employeService.addEmploye(employe);
        return employe1;
    }

    @DeleteMapping("/remove-employe")
    public void removeEmploye(@RequestParam Long idEmploye) {
        employeService.removeEmploye(idEmploye);
    }

    @PutMapping("/modify-employe")
    public void modifyEmploye(@RequestBody Employe employe) {
        Employe employe1 = employeService.modifyEmploye(employe);
    }
}