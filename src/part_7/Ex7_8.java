package part_7;

public class Ex7_8 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Product p;

        b.buy(new Tv());
        b.buy(new Radio());
/*        System.out.println("현재 남은 돈은" + b.money);
        System.out.println("현재 포인트는"+b.totalpoint);*/
        b.summary();

    }
}


class Product{
    int price;
    int bonous;

   // Product(){}
    Product(int price){
        this.price = price;
        bonous = (int)(price/10.0);
    }

}

class Tv extends Product{

    Tv() {
        super(2000); //super()는 조상의 생성자 호출.
    }
    public String toString(){return "Tv";}
}
class Radio extends Product{

    Radio(){
        super(1000);
    }
    public String toString(){return "Radio";}
}

class Buyer{
    int money = 10000;
    int totalpoint = 0;
    Product [] cart = new Product[10];
    int i=0;

    void buy(Product p){

        money -= p.price;
        totalpoint += p.bonous;
        System.out.println(p + "를 구매하셨습니다.");
        cart[i++] = p;
    }

    void summary(){
        int sum=0;
        String itemList ="";
        for(int i=0; i<cart.length; i++){
            if(cart[i]==null)break;
            sum += cart[i].price;
            itemList += cart[i] +", ";
        }

        System.out.println("구입하신 품목은" + itemList);
        System.out.println("총 금액은 " + sum);

    }


}
