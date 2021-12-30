package com.softserveinc.controller;

import com.softserveinc.model.dto.BranchDto;
import com.softserveinc.model.dto.RepoDto;
import com.softserveinc.service.impl.RepoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepoController {


  private final RepoServiceImpl repoService;

  @Autowired
  public RepoController(RepoServiceImpl repoService) {
    this.repoService = repoService;
  }


  @RequestMapping(value = "/show_repo", method = RequestMethod.GET)
  public ResponseEntity<List<RepoDto>> findAllRepos(@RequestParam("user") String user) {
    List<RepoDto> rates = repoService.getAllRepos(user);
    return new ResponseEntity<>(rates, HttpStatus.OK);
  }

  @RequestMapping(value = "/show_branches", method = RequestMethod.GET)
  public ResponseEntity<List<BranchDto>> findAllBranches(
      @RequestParam("repoName") String repoName) {
    List<BranchDto> rates = repoService.getAllBranches(repoName);
    return new ResponseEntity<>(rates, HttpStatus.OK);

  }


}
