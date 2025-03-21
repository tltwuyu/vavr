/* ____  ______________  ________________________  __________
 * \   \/   /      \   \/   /   __/   /      \   \/   /      \
 *  \______/___/\___\______/___/_____/___/\___\______/___/\___\
 *
 * Copyright 2014-2025 Vavr, https://vavr.io
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
package io.vavr.collection;

import java.util.Comparator;

/**
 * An ordered collection interface.
 *
 * @param <T> Component type
 * @author Ruslan Sennov, Daniel Dietrich
 */
public interface Ordered<T> {

    /**
     * Returns the comparator which defines the order of the elements contained in this collection.
     *
     * @return The comparator that defines the order of this collection's elements.
     */
    Comparator<T> comparator();
}
