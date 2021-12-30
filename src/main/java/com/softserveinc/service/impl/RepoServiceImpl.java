package com.softserveinc.service.impl;

import com.softserveinc.model.dto.BranchDto;
import com.softserveinc.model.dto.RepoDto;
import com.softserveinc.service.RepoService;
import java.util.List;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RepoServiceImpl implements RepoService {

  @Override
  public List<RepoDto> getAllRepos(String user) {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<List<RepoDto>> rateResponse =
        restTemplate.exchange("https://api.github.com/users/" + user + "/repos",
            HttpMethod.GET, null, new ParameterizedTypeReference<List<RepoDto>>() {
            });
    return rateResponse.getBody();
  }

  @Override
  public List<BranchDto> getAllBranches(String repoName) {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<List<BranchDto>> rateResponse =
        restTemplate.exchange(
            "https://api.github.com/repos/YaroslavVoitiuk/" + repoName + "/branches",
            HttpMethod.GET, null, new ParameterizedTypeReference<List<BranchDto>>() {
            });
    return rateResponse.getBody();
  }


}
