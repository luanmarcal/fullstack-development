package github.io.luanmarcal.HelloWorld.services.implementation;

import github.io.luanmarcal.HelloWorld.models.Device;
import github.io.luanmarcal.HelloWorld.services.MyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyServiceImplementation implements MyService {

    //MOCK LISTA NA MEMÓRIA
    private List<Device> myDevices = new ArrayList<>();


    @Override
    public Device save(Device device)
    {

        boolean contains = myDevices.contains(device);
        
        if(contains){
            throw new RuntimeException("Mac address exist");
        }
        else{
            myDevices.add(device);
        }

        return device;
    }

    @Override
    public Device getDeviceByMac(String macAddress) {
        return null;
    }

    @Override
    public List<Device> getAllDevices() {
        return myDevices;
    }

    @Override
    public Device delete(Device device) {
        boolean contains = myDevices.contains(device);

        if(contains){
            System.out.println(device.getMacAddress() + " deletado com sucesso");
            myDevices.remove(device);
        }
        else{
            throw new RuntimeException("Mac address dont exist");
        }

        return device;
    }

    @Override
    public Device put(Device device) {
        boolean contains = myDevices.contains(device);

        if(contains){
            System.out.println(device.getMacAddress() + " modificado com sucesso");
            myDevices.setter(device);
        }
        else{
            throw new RuntimeException("Mac address dont exist");
        }

        return device;
    }
}
