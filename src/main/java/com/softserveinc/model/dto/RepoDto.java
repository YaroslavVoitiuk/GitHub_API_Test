package com.softserveinc.model.dto;

import com.softserveinc.model.Branch;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class RepoDto {

  private String name;

  private List<Branch> branches;
}
