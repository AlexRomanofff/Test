package com.testingTask.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import java.util.Random;


public class TestingTask implements EntryPoint {

    public void onModuleLoad() {
        final Button button = new Button("Click Me!");

        button.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {

                String color = getColor();
                RootPanel.getBodyElement().getStyle().setProperty("backgroundColor", color);
            }
        });

        RootPanel.get("but").add(button);
    }

    private int getRandomValueForColor() {
        Random r = new Random();
        return r.nextInt(255);
    }

    private String getColor() {

        int red = getRandomValueForColor();
        int green = getRandomValueForColor();
        int blue = getRandomValueForColor();

        return "rgb("+red+","+green+","+blue+")";
    }

}
