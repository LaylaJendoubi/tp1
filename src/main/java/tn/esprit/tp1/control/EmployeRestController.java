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
        return employeService.retrieveAllEmployes();
    }

    @GetMapping("/retrieve-employe/{employe-id}")
    public Employe retrieveEmploye(@PathVariable("employe-id") Long employeId) {
        return employeService.retrieveEmploye(employeId);
    }

    @PostMapping("/add-employe")
    public Employe addEmploye(@RequestBody Employe employe) {
        return employeService.addEmploye(employe);
    }

    @DeleteMapping("/remove-employe")
    public void removeEmploye(@RequestParam Long idEmploye) {
        employeService.removeEmploye(idEmploye);
    }

    @PutMapping("/modify-employe")
    public void modifyEmploye(@RequestBody Employe employe) {
        employeService.modifyEmploye(employe);
    }

    //affectation et desaffectation
    @PutMapping("/desaffecterEmploye/{idEmploye}")
    public Employe desaffecterEmploye(@PathVariable Long idEmploye) {
        return employeService.desaffecterEmploye(idEmploye);
    }

    @PutMapping("/affecterEmploye/{idEmploye}/{idAgence}")
    public Employe affecterEmploye(@PathVariable Long idEmploye, @PathVariable Long idAgence) {
        return employeService.affecterEmploye(idEmploye, idAgence);
    }
}