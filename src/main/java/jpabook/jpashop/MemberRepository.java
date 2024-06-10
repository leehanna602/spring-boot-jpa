package jpabook.jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    /* 커맨드와 쿼리를 분리해라
    *  - 저장은 side-effect를 일으키는 커맨드 -> 아이디 정도만 반환하는게 좋음(다시조회 가능) */
    public Long save(Member member) {
        em.persist(member);
        return member.getId();
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }

}
