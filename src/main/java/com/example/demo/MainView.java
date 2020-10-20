package com.example.demo;

import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.H1;

@Route("")
public class MainView extends VerticalLayout {
    public MainView() {
        H1 header = new H1("This is a test.");

        add(header);
    }
}