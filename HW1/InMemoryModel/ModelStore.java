package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangedObserver> changedObserver;

    public List<Scene> GetScena(int t) {
        return Scenes;
    }

    public void NotifyChange(IModelChanger sender) {
    }

    public ModelStore(List<IModelChangedObserver> changeObservers) throws Exception {
        this.changedObserver = changeObservers;

        Models = new ArrayList<>();
        Models.add(new PoligonalModel(null));

        Flashes = new ArrayList<>();
        Flashes.add(new Flash(null, null, null, null));
        Cameras = new ArrayList<>();
        Cameras.add(new Camera(null, null));
        Scenes = new ArrayList<>();
        Scenes.add(new Scene(0, Models, Flashes, Cameras));

    }

}
