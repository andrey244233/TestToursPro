package AirplainTours;

public abstract class GeneralTour {
   private String typeName;
   private String transport;
   private String food;
   private int days;
   private int number;


   public abstract void showFields();


   public String getTypeName() {
      return typeName;
   }

   public void setTypeName(String typeName) {
      this.typeName = typeName;
   }

   public String getTransport() {
      return transport;
   }

   public void setTransport(String transport) {
      this.transport = transport;
   }

   public String getFood() {
      return food;
   }

   public void setFood(String food) {
      this.food = food;
   }

   public int getDays() {
      return days;
   }

   public void setDays(int days) {
      this.days = days;
   }

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }
}
