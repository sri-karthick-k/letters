package com.example.demo;

import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private LetterService letterService;

    @Autowired
    private TagService tagService;

    @Autowired
    private RuleService ruleService;

    @Autowired
    private RegionService regionService;

    @Autowired
    private MembershipService membershipService;

    @Override
    public void run(String... args) throws Exception {
        // Populate Regions
        Region region1 = new Region();
        region1.setName("North America");
        regionService.saveRegion(region1);

        Region region2 = new Region();
        region2.setName("Europe");
        regionService.saveRegion(region2);

        // Populate Memberships
        Membership membership1 = new Membership();
        membership1.setName("Gold");
        membership1.setPlans(Arrays.asList("PlanA", "PlanB"));
        membershipService.saveMembership(membership1);

        Membership membership2 = new Membership();
        membership2.setName("Silver");
        membership2.setPlans(Arrays.asList("PlanC", "PlanD"));
        membershipService.saveMembership(membership2);

        // Populate Rules
        Rule rule1 = new Rule();
        rule1.setTagId("1");
        rule1.setRegionId(region1.getId());
        rule1.setMembershipPlans(Arrays.asList("PlanA"));
        rule1.setRequestTypes(Arrays.asList("Type1"));
        rule1.setLevelsOfService(Arrays.asList("High"));
        rule1.setProviderStatuses(Arrays.asList("Active"));
        rule1.setProducts(Arrays.asList("Product1"));
        ruleService.saveRule(rule1);

        Rule rule2 = new Rule();
        rule2.setTagId("2");
        rule2.setRegionId(region2.getId());
        rule2.setMembershipPlans(Arrays.asList("PlanD"));
        rule2.setRequestTypes(Arrays.asList("Type2"));
        rule2.setLevelsOfService(Arrays.asList("Medium"));
        rule2.setProviderStatuses(Arrays.asList("Inactive"));
        rule2.setProducts(Arrays.asList("Product2"));
        ruleService.saveRule(rule2);

        // Populate Tags
        Tag tag1 = new Tag();
        tag1.setName("Important");
        tag1.setLetters(Arrays.asList());
        tag1.setRuleId(rule1.getId());
        tagService.saveTag(tag1);

        Tag tag2 = new Tag();
        tag2.setName("Urgent");
        tag2.setLetters(Arrays.asList());
        tag2.setRuleId(rule2.getId());
        tagService.saveTag(tag2);

        // Populate Letters
        Letter letter1 = new Letter();
        letter1.setName("Welcome Letter");
        letter1.setDesc("Welcome to our service");
        letter1.setStatus("Sent");
        letter1.setOrganization("Org1");
        letter1.setTags(Arrays.asList(tag1));
        letterService.saveLetter(letter1);

        Letter letter2 = new Letter();
        letter2.setName("Reminder Letter");
        letter2.setDesc("Reminder for pending payment");
        letter2.setStatus("Pending");
        letter2.setOrganization("Org2");
        letter2.setTags(Arrays.asList(tag2));
        letterService.saveLetter(letter2);

        // Update Tags with Letters
        tag1.setLetters(Arrays.asList(letter1));
        tagService.saveTag(tag1);

        tag2.setLetters(Arrays.asList(letter2));
        tagService.saveTag(tag2);
    }
}
