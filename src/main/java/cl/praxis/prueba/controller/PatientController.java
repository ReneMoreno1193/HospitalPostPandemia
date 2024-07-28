package cl.praxis.prueba.controller;

import cl.praxis.prueba.entity.Patient;
import cl.praxis.prueba.service.IPatientService;
import jakarta.jws.WebParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PatientController {
    @Autowired
    private IPatientService patientService;


    @GetMapping("/patients")
    public String viewPatients(Model model){
        model.addAttribute("patient", new Patient());
        model.addAttribute("patients", patientService.getAllPacients());
        return "patients";

    }

    @PostMapping("/patients")
    public String addPatient(@ModelAttribute Patient patient){
        patientService.savePacients(patient);
        return "redirect:/patients";
    }
    @GetMapping("/editarPaciente/{id}") //capturar parámetro que viene por url por eso usamos @pathvariable
    public String editPatient(@PathVariable Long id, Model model){
        Patient patient = patientService.findPatientById(id).get(); //crear paciente
        model.addAttribute("patient", patient); //para enviar un atributo a la vista
        return "/editPatient";
    }
}
