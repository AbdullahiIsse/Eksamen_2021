//package TestEksamen2;
//
//import TestEksamen2.Bed;
//import TestEksamen2.Guest;
//
//public class Room
//{
//  private int number;
//  private Guest guest;
//  private Bed bed;
////
//  public Room(int number, String bedType){
//    this.number=number;
//    bed = new Bed(bedType);
//  }
//
//  public int getNumber()
//  {
//    return number;
//  }
//
//  public int getFloor(){
//return number/100;
//  }
//
//  public String getPrice(){
//if (bed.isSingle()){
//  return "the price is 59.50$";
//    }
//else if (bed.isDouble()){
//  return "the price is 72.40$";
//}
//else if (bed.isKingsize()){
//  return "the price is 89.00$";
//}
//    return null;
//  }
//  public boolean isOccupied(){
//    if (guest==null){
//      return false;
//    }else return true;
//
//  }
//  public void registerGuest(Guest guest){
//    if (guest==null){
//      this.guest=guest;
//    }
//  }
//  public void vacate(){
//    this.guest=null;
//  }
//  public String getBedType(){
//    if (bed.isDouble()){
//      return "Double";
//    }
//    else if (bed.isSingle()){
//      return "Single";
//    }
//    else if (bed.isKingsize()){
//      return "Kingsize";
//    }
//    else return null;
//  }
//
//  public Guest getGuest()
//  {
//    return guest;
//  }
//}
