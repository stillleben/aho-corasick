/*
 * Copyright 2015 Rogue Wave Software.
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
package org.ahocorasick.trie;

/**
 * Model transitions on words
 * @author doug.lovell
 */
public class WordTransition extends Transition<String> {

    public WordTransition(String s) {
        super(s);
    }

    @Override
    public void updateMatch(StringBuffer match) {
        if (0 < match.length()) {
            match.append(' ');
        }
        match.append(token);
    }

    @Override
    public boolean isWordSeparator() {
        return true;
    }
    
}