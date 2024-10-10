class MyName{
    public static void printMyName(){
        System.out.println("My Name is: Nandu");
    }
    void printMySurname(){
        System.out.println("My Surname is: Nandyala");
    }
}

class MyFirstProgram{
    public static void main(String[] args){
        System.out.println("Hello World My First Program");
        MyName.printMyName();
        // MyName.printMySurname();
        MyName obj1 = new MyName();
        obj1.printMySurname();

    }
}