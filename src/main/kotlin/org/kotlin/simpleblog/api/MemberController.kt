package org.kotlin.simpleblog.api

import org.kotlin.simpleblog.domain.member.Member
import org.kotlin.simpleblog.service.MemberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController (
    private val memberService: MemberService
){

    @GetMapping("/members")
    fun findAll(): List<Member> {
        return memberService.findAll()
    }

}