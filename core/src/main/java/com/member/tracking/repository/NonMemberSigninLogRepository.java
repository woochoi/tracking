package com.member.tracking.repository;

import com.member.tracking.domain.entity.NonMemberSigninLog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NonMemberSigninLogRepository extends MongoRepository<NonMemberSigninLog, String> {



}
