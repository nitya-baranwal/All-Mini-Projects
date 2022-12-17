package Q2;

public interface Hotel {

    void chickenBiryani();

    void masalaDosa();

}

class TajHotel implements Hotel{

    @Override
    public void chickenBiryani(){
        System.out.println("chicken biryani from Taj Hotel");
    }

    @Override
    public void masalaDosa(){
        System.out.println("masala dosa from Taj Hotel");
    }

    public void welcomeDrink() {
        System.out.println("Welcome Drink from the Taj Hotel");
    }

}

class RoadSideHotel implements Hotel{

    @Override
    public void chickenBiryani(){
        System.out.println("chicken biryani from Road Side Hotel");
    }

    @Override
    public void masalaDosa(){
        System.out.println("masala dosa from Road Side Hotel");
    }


}