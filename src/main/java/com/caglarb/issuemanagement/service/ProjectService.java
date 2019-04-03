package com.caglarb.issuemanagement.service;

import com.caglarb.issuemanagement.dto.ProjectDto;
import com.caglarb.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    ProjectDto save(ProjectDto project);

    ProjectDto getById(Long id);

    ProjectDto getByProjectCode(String projectCode);

    List<ProjectDto> getByProjectCodeContains(String projectCode);

    TPage<ProjectDto> getAllPageable(Pageable pageable);

    Boolean delete (ProjectDto project);

    ProjectDto update(Long id, ProjectDto project);
}
