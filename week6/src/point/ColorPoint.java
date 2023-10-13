package point;

 class ColorPoint extends MyPoint {
  public String color;
   public void setColor(String color) {
	   this.color = color;
   }
   
   public void showColorPoint() {
	   System.out.print(color);
	   showPoint();
   }
}
