package org.itmo.lesson3;

import org.itmo.lesson2.Color;

public class Sun {
    private static Sun sun;
    private final Color color;
    private final Integer size;

    private Sun() {
        this.color = Color.WHITE;
        this.size = 777;
    }

    public static Sun getSun() {
        if (sun == null) {
            sun = new Sun();
        }
        return sun;
    }

    public Color getColor() {
        return color;
    }

//    public void setColor(Color color) {
//        this.color = color;
//    }
//
//    public void setSize(Integer size) {
//        this.size = size;
//    }

    public Integer getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "Sun{" +
                "color=" + color +
                ", size=" + size +
                '}';
    }
}
