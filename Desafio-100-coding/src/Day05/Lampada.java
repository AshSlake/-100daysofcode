package Day05;

public class Lampada {

    private String mark;
    private String model;
    private String color;
    private boolean isLed;
    private boolean isConnected;
    private double price;

    public Lampada() {}

    public Lampada(String mark, String model, String color, boolean isLed, boolean isConnected, double price) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.isLed = isLed;
        this.isConnected = isConnected;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        try {
            this.mark = mark;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        try {
            this.model = model;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        try {
            this.color = color;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public boolean isLed() {
        return isLed;
    }

    public void setIfItIsled(boolean led) {
        try {
            isLed = led;
        }catch (Exception e) {
            throw new IllegalArgumentException (e);
        }
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void turnOnTheLamp(boolean connected) {
        try {
            isConnected = connected;
        }catch (Exception e) {
            throw new IllegalArgumentException (e);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        try {
            if ( price <= 0 ){
                throw new IllegalArgumentException ("Preço precisa ser positivo");
            }
            this.price = price;
        } catch (Exception e) {
            throw new IllegalArgumentException (e);
        }
    }


}
