color red = #FF8888, green = #88FF88;
int width = 500, height = 400;
int n = 11;
int len = 100;
float step = TWO_PI/n;

void setup() {
  size(width, height);
  background(0);
}

void draw() {
  stroke(green);
  
  PVector center = new PVector(0,0); 
  Star star = new Star(center);
  star.draw();
  
  stroke(red);
  line(0,0, 100, 100);
}
