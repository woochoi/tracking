package com.member.tracking.controller.test;

import com.member.tracking.domain.entity.Member;
import com.member.tracking.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class MemberTestController {
    private final MemberService service;

    @PostMapping
    public Member create(@RequestBody Member member) {
        return service.create(member);
    }

    @GetMapping
    public List<Member> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Member getById(@PathVariable String id) {
        return service.getById(id);
    }

}
