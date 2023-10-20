package org.example;

import org.example.controllers.CalculatorController;
import org.example.models.ConsoleLogger;
import org.example.models.Logger;
import org.example.services.CalculatorService;
import org.example.view.CalculatorView;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        CalculatorService service = new CalculatorService(logger);
        CalculatorView view = new CalculatorView(logger);
        CalculatorController controller = new CalculatorController(service, view);
        controller.run();
    }
}