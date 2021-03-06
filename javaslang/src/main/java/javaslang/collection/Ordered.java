/*     / \____  _    _  ____   ______  / \ ____  __    _______
 *    /  /    \/ \  / \/    \ /  /\__\/  //    \/  \  //  /\__\   JΛVΛSLΛNG
 *  _/  /  /\  \  \/  /  /\  \\__\\  \  //  /\  \ /\\/ \ /__\ \   Copyright 2014-2016 Javaslang, http://javaslang.io
 * /___/\_/  \_/\____/\_/  \_/\__\/__/\__\_/  \_//  \__/\_____/   Licensed under the Apache License, Version 2.0
 */
package javaslang.collection;

import java.util.Comparator;

/**
 * An ordered collection interface.
 *
 * @param <T> Component type
 * @author Ruslan Sennov, Daniel Dietrich
 * @since 2.1.0
 */
public interface Ordered<T> {

    /**
     * Returns the comparator which defines the order of the elements contained in this collection.
     *
     * @return The comparator that defines the order of this collection's elements.
     */
    Comparator<T> comparator();
}
