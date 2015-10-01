/*
*  Copyright 2015 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 *
 */

package scouter.server.core.app;

class PerfStat {
    var count = 0
    var error = 0
    var elapsed = 0L

    def add(o: PerfStat) {
        this.count += o.count;
        this.error += o.error;
        this.elapsed += o.elapsed;
    }

    def getAvgElapsed(): Long = {
        return if (count == 0) 0 else elapsed / count
    }

}