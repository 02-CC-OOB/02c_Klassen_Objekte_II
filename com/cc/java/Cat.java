package com.cc.java;

public class Cat {
 
   private String name;
   private String furColor;
   
   private int age;
   private boolean isFemale;
   
   private int counter;



    public Cat(String name, String furColor, int age, boolean isFemale) {
    this.name = name;
    this.furColor = furColor;
    this.age = age;
    this.isFemale = isFemale;
}

    public String getNamgetStringAttributes(String flag) {

        switch (flag) {
            case "#name":
                return name;
            case "#color":
                return furColor;
            default:
                return "#!ERRPR";       
        }
    }

    public String getAge() {
    if (!isFemale) {
        return Integer.toString(age);    
    } else {
        return checkEscalationLevel();
    }

}

    

    private String checkEscalationLevel() {
   
    
    counter++;
   
   
    switch (counter) {
        case 1:
            return "wrwer";
        case 2:
            return "neeeeee";
        case 3:
            return "--------";
        default:
            return "1'*12**";
    }
    
}

    
}
