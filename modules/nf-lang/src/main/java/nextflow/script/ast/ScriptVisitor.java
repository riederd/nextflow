/*
 * Copyright 2024-2025, Seqera Labs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nextflow.script.ast;

import org.codehaus.groovy.ast.ClassNode;
import org.codehaus.groovy.ast.GroovyCodeVisitor;

public interface ScriptVisitor extends GroovyCodeVisitor {

    void visit(ScriptNode node);

    void visitFeatureFlag(FeatureFlagNode node);

    void visitInclude(IncludeNode node);

    void visitParam(ParamNode node);

    void visitWorkflow(WorkflowNode node);

    void visitProcess(ProcessNode node);

    void visitFunction(FunctionNode node);

    void visitEnum(ClassNode node);

    void visitOutputs(OutputBlockNode node);

    void visitOutput(OutputNode node);

}
