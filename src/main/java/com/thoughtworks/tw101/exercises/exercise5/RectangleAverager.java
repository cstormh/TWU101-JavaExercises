package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    int totalArea;
    float averageArea;

    public float averageArea(Rectangle[] rectangles) {

        for (Rectangle rectangle:rectangles) {
            totalArea = totalArea + rectangle.area();
        }

        averageArea = totalArea / rectangles.length;
        return averageArea;
    }
}
