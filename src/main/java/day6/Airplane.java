package day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int getFuel() { return fuel; }

    public void setFuel(int fuel) { this.fuel = fuel; }

    public void setProducer(String producer) { this.producer = producer; }

    public void setYear(int year) { this.year = year; }

    public void setLength(int length) { this.length = length;}

    public void setWeight(int weight) { this.weight = weight; }

    public void info(){
        System.out.println("Изготовитель: "+producer+"\n"+
            "Год выпуска: "+year+"\n"+
            "Длина: "+length+"\n"+
            "Вес: "+weight+"\n"+
            "Количество топлива в баке: "+fuel);
    }

    public void fillUp(int inputFuel){
       fuel += inputFuel;
    }


}
