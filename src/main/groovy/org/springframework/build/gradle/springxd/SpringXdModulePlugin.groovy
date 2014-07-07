/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.build.gradle.springxd

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.bundling.Zip

class SpringXdModulePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        project.task('buildModule', dependsOn: 'build', type:Zip) {
            archiveName = name + '.zip'
            from(project.tasks.getByName('jar').archivePath) {
                into 'lib'
            }
            from(project.configurations.default) {
                into 'lib'
            }
            from(project.sourceSets.main.resources) {
                into 'config'
            }
        }
    }

}