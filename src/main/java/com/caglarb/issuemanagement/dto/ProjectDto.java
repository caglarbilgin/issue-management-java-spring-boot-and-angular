package com.caglarb.issuemanagement.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(value = "Project Data Transfer Object")
public class ProjectDto {

    @ApiModelProperty(value = "Project ID")
    private Long id;
    @NotNull
    @ApiModelProperty(required = true, value = "Name Of Project")
    private String projectName;
    @NotNull
    @ApiModelProperty(required = true,value = "Project Manager ID")
    private Long managerId;
    @NotNull
    @ApiModelProperty(required = true, value = "Code Of Project")
    private String projectCode;
}
