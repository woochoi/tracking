package com.member.controller;

import com.member.tracking.domain.entity.MemberSigninLog;
import com.member.tracking.service.MemberSigninLogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class MemberTrackingRestController {
    private final MemberSigninLogService memberSigninLogService;

    // 프론트 조회 어드민 페이지에 제공해 줄 API 를 만든다!

    @GetMapping("signin-log-list")
    public List<MemberSigninLog> viewSigninLogs() { // 니중에 API Response 로 변경한다. (openfeign)
        List<MemberSigninLog> logs = memberSigninLogService.getSigninLogs();
        return logs;
    }
}
