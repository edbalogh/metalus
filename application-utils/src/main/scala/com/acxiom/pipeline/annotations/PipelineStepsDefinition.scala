package com.acxiom.pipeline.annotations

import com.acxiom.pipeline.EngineMeta

case class PipelineStepsDefinition(pkgs: List[String],
                                   steps: List[StepDefinition])

case class StepDefinition(id: String,
                          displayName: String,
                          description: String,
                          `type`: String,
                          params: List[StepFunctionParameter],
                          engineMeta: EngineMeta)

case class StepFunctionParameter(`type`: String,
                                 name: String,
                                 required: Boolean = false,
                                 defaultValue: Option[String] = None,
                                 language: Option[String] = None,
                                 className: Option[String] = None)
