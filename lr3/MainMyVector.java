class MainMyVector{
    public static void main(String[] argc) throws Exception {
    
        MyVector<Integer> vec = new MyVector<Integer>(4);
        vec.push(5);
        vec.push(5);
        System.out.println(vec);
        vec.getLast();
        System.out.println("vec:" + vec);
        vec.getLast();
        System.out.println("vec2:" + vec);
        vec.deleteByValue(5);
        System.out.println("vec2:" + vec);
        System.out.println("Capacity: " + vec.getCapacity());
        System.out.println("Lenght" + vec.getLen());
    }
}