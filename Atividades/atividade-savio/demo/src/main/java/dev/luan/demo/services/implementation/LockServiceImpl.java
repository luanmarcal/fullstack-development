package dev.luan.demo.services.implementation;

import dev.luan.demo.domain.Lock;
import dev.luan.demo.domain.LockRepository;
import dev.luan.demo.models.requests.LockRequest;
import dev.luan.demo.models.responses.LockResponse;
import dev.luan.demo.services.LockService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LockServiceImpl implements LockService {

    @Autowired
    private LockRepository LockRepository;

    @Override
    public Iterable<Lock> getAllLocks() {
        return LockRepository.findAll();
    }

    @Override
    public LockResponse saveLock(LockRequest LockRequest) {
        ModelMapper modelMapper = new ModelMapper();

        Lock lock = modelMapper.map(LockRequest, Lock.class);

        lock.setLockId(UUID.randomUUID().toString());

        Lock lockSaved = LockRepository.save(lock);

        return modelMapper.map(lockSaved, LockResponse.class);
    }

    @Override
    public LockResponse getLock(String LockId) {
        ModelMapper modelMapper = new ModelMapper();
        Lock lock = LockRepository.findByLockId(LockId);

        return modelMapper.map(lock, LockResponse.class);
    }





}
