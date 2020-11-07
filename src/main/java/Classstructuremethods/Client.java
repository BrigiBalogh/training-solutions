package Classstructuremethods;

public class Client
{
   private String name,address;
   private int year;

   public void migrate (String newaddress)
   {
      address = newaddress;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public int  setYear(int year)
   {
      this.year = year;
      return year;
   }
   public void setAddress(String address)
   {
      this.address = address;
   }
   public int getYear()
   {
      return year;
   }
   public String getName()
   {
      return name;
   }
   public String getAddress()
   {
      return address;
   }

}
