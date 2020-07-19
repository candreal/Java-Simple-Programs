class Main
{
  public static void main(String[] args)
  {
    Bank bank1 = new SBI();
    Bank bank2 = new ICICI();
    Bank bank3 = new AXIS();
    System.out.println("The rate of interest at SBI is " + (100f * bank1.getRateOfInterest()) + "%");
    System.out.println("The rate of interest at ICICI is " + (100f * bank2.getRateOfInterest()) + "%");
    System.out.println("The rate of interest at AXIS is " + (100f * bank3.getRateOfInterest()) + "%");
  }
}

//new class, template for creating an object of class Bank
class Bank
{
  float rate;
  //a Bank object has the following behaviors/methods: getRateOfInterest
  float getRateOfInterest()
  {
    return rate;
  }
}

//subclass SBI extends Bank
class SBI extends Bank
{
  //the getRateOfInterest method is overridden
  float getRateOfInterest()
  {
    return 0.08f;
  }
}

//subclass ICICI extends Bank
class ICICI extends Bank
{
  //the getRateOfInterest method is overridden
  float getRateOfInterest()
  {
    return 0.07f;
  }
}

//subclass AXIS extends Bank
class AXIS extends Bank
{
  //the getRateOfInterest method is overridden
  float getRateOfInterest()
  {
    return 0.09f;
  }
}
