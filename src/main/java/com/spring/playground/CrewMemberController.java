package com.spring.playground;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crewmember")
public class CrewMemberController {

    private final CrewMemberService crewMemberService;

    public CrewMemberController(CrewMemberService crewMemberService) {
        this.crewMemberService = crewMemberService;
    }
//    private CrewMemberService crewMemberService = new CrewMemberService();

    @GetMapping("")
    public String getCrewMemberSortedList(@RequestParam(required = false) boolean sort) {

        return crewMemberService.getSortedString(sort);
    }

    @GetMapping("/{id}")
    public String getMemberID(@PathVariable String id) {

        return crewMemberService.getMemberInfoFromId(id);
    }

    @PostMapping("")
    public String getCrewmemberBody(@RequestParam String name, @RequestParam int crewmember_id) {

        return crewMemberService.getMemberInfoFromBody(name, crewmember_id);
    }

}
