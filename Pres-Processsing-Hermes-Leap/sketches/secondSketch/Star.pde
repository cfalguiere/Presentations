class Star {
  private PVector center;
  
  Star(PVector aCenter) {
    center = aCenter;
  }
  
  void draw() {
    pushMatrix();
    translate(width/2, height/2);
    int i=0;
    while(i<n) {
      line(center.x, center.y, len*cos(i*step), len*sin(i*step));
      i++;
    }
    popMatrix();
  }
}
