package org.lwjglb.engine.items;

import org.joml.Quaternionf;
import org.lwjglb.engine.graph.Mesh;
import org.lwjglb.engine.loaders.assimp.StaticMeshesLoader;

public class Car extends Vehicle {

    public Car() {
        this.setDefaultMesh();
        this.setDefaultPos();
    }
    @Override
    public void setDefaultMesh(){
        try {
            Mesh[] carMesh = StaticMeshesLoader.load("src/main/resources/models/Chevrolet_Camaro_SS_Low.obj", "src/main/resources/models/");
            //Mesh[] planeMesh = StaticMeshesLoader.load("src/main/resources/models/Russ/toyPlane.obj", "src/main/resources/models/");
            this.setMeshes(carMesh);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setDefaultPos(){
        this.setPosition(10, -14, 0);
        this.setVelocity(getFloat(-0.002f,0.02f),getFloat(-0.002f,0.002f),getFloat(-0.02f,0.02f));
        this.setRotation(new Quaternionf(0, 0, 0, 0.0f));
        this.setRotationVel(new Quaternionf(0, 0, 0, 0.0f));
    }
}
