package Drago;
public class DragonHead {
    private Double eyesCount;
    public DragonHead(double eyesCount) {
        this.eyesCount = eyesCount;
    }
    private double getEyesCount(){
        return eyesCount;
    }
    public String toString(){return "Количество глаз: " + eyesCount;}
    }
