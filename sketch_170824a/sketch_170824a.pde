int xspeed = 10;
int xpostion = 1000;
int yspeed = 199;
int ypostion=1000;
void setup() {
 
size(1900,1200);

}
void draw(){
 
background(#000000);   
ellipse(xpostion,ypostion,50,50); 
fill(#817D9D);
stroke(#CDD113);
xpostion = xpostion + xspeed;
ypostion = ypostion + yspeed;
if (xpostion>width){
xspeed = -xspeed;
}
if (xpostion<0){
xspeed = -xspeed;
}
if(ypostion>height){
yspeed = -yspeed;

}


if(ypostion<0){
yspeed = -yspeed;
}
  

}