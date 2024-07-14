package com.example.demo.service;

import com.example.demo.Membership;
import com.example.demo.repo.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MembershipService {

    @Autowired
    private MembershipRepository membershipRepository;

    public List<Membership> getAllMemberships() {
        return membershipRepository.findAll();
    }

    public Optional<Membership> getMembershipById(String id) {
        return membershipRepository.findById(id);
    }

    public Membership saveMembership(Membership membership) {
        return membershipRepository.save(membership);
    }

    public void deleteMembership(String id) {
        membershipRepository.deleteById(id);
    }
}
