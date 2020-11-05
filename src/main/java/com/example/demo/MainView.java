package com.example.demo;

import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;

@Route("")
public class MainView extends VerticalLayout {
    private static final long serialVersionUID = 1L;

    public void clicked() {

    }

    public MainView() {
        H1 header = new H1("This is a test.");

        add(header);

        Div clickedMessage = new Div();

        Button button = new Button("Press me", event -> {
            clickedMessage.setText("Clicked.");
        });

        add(button);

        add(clickedMessage);
    }
}
