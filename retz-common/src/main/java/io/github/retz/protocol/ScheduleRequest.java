/**
 *    Retz
 *    Copyright (C) 2016 Nautilus Technologies, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package io.github.retz.protocol;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ScheduleRequest extends Request {
    private Job job; // TODO: this cannot be NULL
    private boolean doWatch;

    @JsonCreator
    public ScheduleRequest(@JsonProperty(value = "job", required = true) Job job,
                           @JsonProperty("doWatch") boolean doWatch) {
        this.job = job;
        this.doWatch = doWatch;
    }

    @JsonGetter("job")
    public Job job() {
        return job;
    }

    @JsonGetter("doWatch")
    public boolean doWatch() {
        return doWatch;
    }
}
