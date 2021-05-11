package org.example;


import com.fasterxml.jackson.databind.ObjectMapper;

public class Cars  {


    private String color;
    private String type;
    private String transmission;
    private int door;


    public Cars(String color, String type, String transmission, int door) {
        this.color = color;
        this.type = type;
        this.transmission = transmission;
        this.door = door;
    }

    public Cars() {

    }

    public static void main( String[] args) {

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Cars myBmw = new Cars("black", "Bmw", "Auto", 4);

            String carAsJson = objectMapper.writeValueAsString(myBmw);
            System.out.println(carAsJson);



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    }

