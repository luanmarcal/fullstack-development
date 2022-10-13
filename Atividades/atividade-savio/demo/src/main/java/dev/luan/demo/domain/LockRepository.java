package dev.luan.demo.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LockRepository extends MongoRepository<Lock, String> {

    Lock findByLockId(String lockId);

}
