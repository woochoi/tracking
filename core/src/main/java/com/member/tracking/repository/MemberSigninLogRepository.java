package com.member.tracking.repository;

import com.member.tracking.domain.entity.MemberSigninLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberSigninLogRepository extends MongoRepository<MemberSigninLog, String> {




}
