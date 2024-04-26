package player;

public class Player{
  String name;
  String mblno;
  String address;
  public void setdetails(String nm,String mbl,String add){
     this.name = nm;
     this.mblno=mbl;
     this.address=add;

  }
  public void getdetails(){
    System.out.println("NAME IS "+this.name);
    System.out.println("MOBILE NUM "+this.mblno);
    System.out.println("ADDRESS IS "+this.address);
  }

}



