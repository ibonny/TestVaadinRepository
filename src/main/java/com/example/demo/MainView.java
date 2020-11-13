package com.example.demo;

import com.vaadin.flow.router.Route;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;

@Route("")
public class MainView extends VerticalLayout {
    @Autowired
    JsonPlaceholderService jps;

    private static final long serialVersionUID = 1L;

    public void clicked() {

    }

    public MainView() {
        H1 header = new H1("This is a test.");

        add(header);

        Div clickedMessage = new Div();

        Grid<Post> myGrid = new Grid<>(Post.class);

        Button button = new Button("Press me", event -> {
            clickedMessage.setText("Clicked.");

            myGrid.setItems(jps.getPosts());

            myGrid.setVisible(true);
        });

        add(button);

        add(clickedMessage);

        myGrid.setColumns("userId", "id", "title");

        myGrid.setVisible(false);

        add(myGrid);
    }
}
