class TestBank
{
  public static void main(String[] args)
  {
    Bank bank1 = new SBI();
    Bank bank2 = new PNB();
    System.out.println("The rate of interest at SBI is " + (100f * bank1.getRateOfInterest()) + "%");
    System.out.println("The rate of interest at PNB is " + (100f * bank2.getRateOfInterest()) + "%");
  }
}

//new class, template for creating an object of class Bank
abstract class Bank
{
  //a Bank object has the following behaviors/methods: getRateOfInterest
  abstract float getRateOfInterest();
}

//subclass SBI extends Bank
class SBI extends Bank
{
  //the getRateOfInterest method is overridden
  float getRateOfInterest()
  {
    return 0.07f;
  }
}

//subclass PNB extends Bank
class PNB extends Bank
{
  //the getRateOfInterest method is overridden
  float getRateOfInterest()
  {
    return 0.05f;
  }
}
