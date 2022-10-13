package dev.luan.demo.services;

import dev.luan.demo.domain.Lock;
import dev.luan.demo.models.requests.LockRequest;
import dev.luan.demo.models.responses.LockResponse;

public interface LockService {

    LockResponse saveLock(LockRequest LockRequest);

    LockResponse getLock(String LockId);

    Iterable<Lock> getAllLocks();

}
