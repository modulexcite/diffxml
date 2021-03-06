/*
diffxml and patchxml - diff and patch for XML files

Copyright 2013 Adrian Mouat

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 */

package org.diffxml.diffxml.fmes;

import java.util.Comparator;

/**
 * Comparator for NodeInfo objects.
 * 
 * Based on reverse depth.
 */

class NodeDepthComparator implements Comparator<NodeDepth> {

    /**
     * Compares two NodeDepth objects.
     * 
     * Stores in reverse order of depth.
     * *NOT* consistent with equals; we only care about depth and it is
     * expensive to compare Nodes.
     * 
     * TODO: Consider making serializable, in case TreeSet is serialized.
     * TODO: Check if need to enforce Document Position ordering
     * 
     * @param nodeInfo1
     *            First NodeInfo object
     * @param nodeInfo2
     *            Second NodeInfo object
     * @return Negative if nodeInfo1 is at a greater depth than nodeInfo2, 
     *         positive if smaller depth, 0 if same depth 
     */
    public final int compare(final NodeDepth nodeInfo1, 
            final NodeDepth nodeInfo2) {

            return nodeInfo2.getDepth() - nodeInfo1.getDepth();
    }
}
