class Hello{
    public static void main(String a[]){
        int num = 3;
        //byte num0 = 129; //--> will not overflow just give error
        byte num0 = 127;
        double num1 = 5.2; //Note in Java deflaut data type for fractions is double
        //float num2 = 5.2; -->This gives error as you can't use it
        float num2 = 5.2f; //We need to say the decimal should be only 4 byte resolution hear
        char ch = 'c'; 
        // char ch = "c" --> wron double qutoes only for string
        System.out.print("Hello world");
        System.out.println("Hellow world"); //This add a new line after imedeitly   
        int num_bin = 0b1010;
        int num_hex = 0x7E;
        int num_with_underscore = 10_00_00_000; //This underscore is just for readability
    }
}

Hello.main(null)