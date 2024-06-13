package org.kotlin.simpleblog.domain.member
/**
 * dto <-> entity 간의 매핑할 때
 * */
data class MemberSaveReq(
    val email: String,
    val password: String,
    val role: Role
)

fun MemberSaveReq.toEntity(): Member {
    return Member(
        email = this.email,
        password = this.password,
        role = this.role
    )
}