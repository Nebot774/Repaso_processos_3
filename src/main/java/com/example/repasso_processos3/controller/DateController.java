package com.example.repasso_processos3.controller;


import com.example.repasso_processos3.model.DateInfo;
import com.example.repasso_processos3.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/date")
public class DateController {

    @Autowired
    private DateService dateService;

    //http://localhost:8080/api/date/current
    @GetMapping("/current")
    public DateInfo getCurrentDate() {
        return dateService.getCurrentDate();
    }

    //http://localhost:8080/api/date/add/5
    @GetMapping("/add/{n}")
    public DateInfo addDays(@PathVariable int n) {
        return dateService.addDaysToDate(n);
    }

    @PostMapping
    public void setDate(@RequestBody DateInfo newDate) {
        // Explicación de la implementación:
        //
        // Este método recibiría un objeto DateInfo desde el cuerpo de una solicitud POST.
        // DateInfo contiene los campos para el día, mes y año.
        //
        // La implementación de este método dependería del sistema operativo en el que se esté ejecutando la aplicación.
        // Es importante destacar que cambiar la fecha del sistema operativo requiere privilegios de administrador/root,
        // lo cual implica riesgos de seguridad.
        //
        // En sistemas Unix/Linux, se podría realizar mediante la ejecución de un comando de shell desde Java.
        // Por ejemplo, se podría construir un comando como 'sudo date mmddHHMM[[yy]yy]'.
        // Este comando se ejecutaría mediante un proceso creado con Runtime.getRuntime().exec(comando).
        //
        // En Windows, se utilizaría un comando similar utilizando 'cmd /C' seguido por el comando para cambiar la fecha,
        // como 'date mm-dd-yy'.
        //
        // Es fundamental validar y sanitizar los datos de entrada (newDate) para prevenir inyecciones de comandos
        // o ejecución de comandos no deseados.
        //
        // Dado que esta operación puede afectar otros procesos y aplicaciones en el servidor,
        // debería implementarse con extrema precaución. Además, se recomendaría registrar esta acción
        // y notificar a los administradores del sistema cada vez que se realice un cambio de fecha.
        //
        // Finalmente, debido a los riesgos de seguridad y estabilidad asociados con esta operación,
        // se debería considerar si hay alternativas más seguras para alcanzar el objetivo deseado, como
        // manejar una fecha/hora "virtual" dentro de la aplicación en lugar de cambiar la fecha del sistema.
    }

}

