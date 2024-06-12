package org.kotlin.simpleblog.service

import org.kotlin.simpleblog.domain.member.Member
import org.kotlin.simpleblog.domain.member.MemberRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {

    @Transactional(readOnly = true)
    fun findAll(): List<Member> = memberRepository.findAll()


}