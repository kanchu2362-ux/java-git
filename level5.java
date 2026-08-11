class DataTypeOverloading {

    
    void display(int number) {
        System.out.println("Integer value: " + number);
    }

    void display(double number) {
        System.out.println("Double value: " + number);
    }

    
    void display(String text) {
        System.out.println("String value: " + text);
    }

    public static void main(String[] args) {
        DataTypeOverloading obj = new DataTypeOverloading();

        obj.display(25);
        obj.display(25.75);
        obj.display("Java Programming");
    }
}