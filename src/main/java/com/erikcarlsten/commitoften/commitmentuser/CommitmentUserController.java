package com.erikcarlsten.commitoften.commitmentuser;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CommitmentUserController {

    @RequestMapping("/users")
    public List<CommitmentUser> getAllUsers() {
        ArrayList<CommitmentUser> commitmentUsers = new ArrayList<>();
        commitmentUsers.add(new CommitmentUser("Erik", "Carlsten"));
        commitmentUsers.add(new CommitmentUser("John", "Carlsten"));

        return commitmentUsers;
    }

}
