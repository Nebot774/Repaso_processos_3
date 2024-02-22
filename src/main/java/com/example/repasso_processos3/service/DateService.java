package com.example.repasso_processos3.service;

import com.example.repasso_processos3.model.DateInfo;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service // Anotación para indicar que esta clase es un servicio en Spring
public class DateService {

    // Método para obtener la fecha actual
    public DateInfo getCurrentDate() {
        LocalDate now = LocalDate.now(); // Obtiene la fecha actual
        // Retorna un nuevo objeto DateInfo con el día, mes y año actuales
        return new DateInfo(now.getDayOfMonth(), now.getMonthValue(), now.getYear());
    }

    // Método para añadir días a la fecha actual
    public DateInfo addDaysToDate(int days) {
        LocalDate futureDate = LocalDate.now().plusDays(days); // Añade los días a la fecha actual
        // Retorna un nuevo objeto DateInfo con el día, mes y año de la fecha futura
        return new DateInfo(futureDate.getDayOfMonth(), futureDate.getMonthValue(), futureDate.getYear());
    }

}
