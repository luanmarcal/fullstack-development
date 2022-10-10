package dev.luan.demo.controller;

import dev.luan.demo.domain.Lock;
import dev.luan.demo.models.requests.LockRequest;
import dev.luan.demo.models.responses.LockResponse;
import dev.luan.demo.services.LockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/")

public class LockController {

    @Autowired
    private LockService lockService;

    @PostMapping
    public LockResponse saveLock(@RequestBody LockRequest lockRequest) {

        return lockService.saveLock(lockRequest);
    }

    @GetMapping("/{lockId}")
    public LockResponse getLock(@PathVariable String lockId) {
        return lockService.getLock(lockId);
    }

    @GetMapping("/")
    public Iterable<Lock> getAllLocks ()
    {
        return lockService.getAllLocks();
    }

//    @PutMapping("/{lockId}")
//    public LockResponse putLock(@PathVariable String LockId, @RequestBody String lockRequest)
//    {
//
//    }

}

