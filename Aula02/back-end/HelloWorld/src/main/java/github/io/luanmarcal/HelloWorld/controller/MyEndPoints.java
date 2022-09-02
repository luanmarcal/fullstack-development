package github.io.luanmarcal.HelloWorld.controller;

import github.io.luanmarcal.HelloWorld.models.Device;
import github.io.luanmarcal.HelloWorld.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")


public class MyEndPoints
{
    @Autowired
    private MyService myService;

    @GetMapping // http://localhost:8080/test
    public List<Device> myFirstGet(){
        System.out.println(myService.getAllDevices());
        return myService.getAllDevices();
    }

    @GetMapping("/{myId}") // http://localhost:8080/test/<myId>
    public String endPonintWithParameter(@PathVariable Integer myId){
        System.out.println("endPonintWithParameter = " + myId); // /test/2
        return "Hello Wolrd " + myId;
    }

    @GetMapping("/v1") // http://localhost:8080/test/v1?value=<?>
    public String endPointWithQuery(@RequestParam Integer value){
        System.out.println("endPointWithQuery = " + value); // /v1?value=2
        return "Hello World " + value;
    }

    @PostMapping() // http://localhost:8080/test
    public Device myFirstPost(@RequestBody Device device){
        System.out.println(device);
        return myService.save(device);
    }

    @DeleteMapping() // http://localhost:8080/test
    public Device myFirstDelete(@RequestBody Device device){

        return myService.delete(device);
    }

    @PutMapping() // http://localhost:8080/test
    public Device myFirstPut(@RequestBody Device device){

        return myService.put(device);
    }
}
