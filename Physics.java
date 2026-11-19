public class Physics{
    private float gravity = 9.8f;

    float potentialEnergy(float mass, float height) {
        return mass * height * gravity;
    }

    float v(float u, float a, float t) {
        return u + a * t;
    }

    float getGravity(){
        return gravity;
    }

     void setGravity(float gravity){
        this.gravity = gravity;
    }
    
}