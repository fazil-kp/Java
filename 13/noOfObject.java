class CountObjects {

    // static varibale to store number of objects
    static int count = 0;

    // various types of constructor
    public CountObjects(){
        count+=1;
    }

    public CountObjects(int i){
        count+=1;
    }
    
    public static void main(String[] args) {
        CountObjects obj1 = new CountObjects();
        CountObjects obj2 = new CountObjects(9);
        CountObjects obj3 = new CountObjects();

        // display count
        System.out.println("Number of objects created : " + CountObjects.count);
    }
}