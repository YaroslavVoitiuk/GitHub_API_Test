package com.softserveinc.service;

import com.softserveinc.model.dto.BranchDto;
import com.softserveinc.model.dto.RepoDto;
import java.util.List;


public interface RepoService {

  List<RepoDto> getAllRepos(String user);

  List<BranchDto> getAllBranches(String repoName, String user);

}
