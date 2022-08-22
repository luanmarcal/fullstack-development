package github.io.luanmarcal.HelloWorld.services;

import github.io.luanmarcal.HelloWorld.models.Device;

import java.util.List;

public interface MyService {

    Device save(Device device);
    Device getDeviceByMac(String macAddress);
    List<Device> getAllDevices();

    Device delete(Device device);

    Device put(Device device);

}
