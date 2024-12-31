/*
 * Copyright (C) 2020 Heinz Max Kabutz
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.  Heinz Max Kabutz
 * licenses this file to you under the Apache License, Version
 * 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied.  See the License for the specific
 * language governing permissions and limitations under the
 * License.
 */

package eu.javaspecialists.books.dynamicproxies;


import org.junit.*;

import static org.junit.Assert.*;

/*\\\\\
//========================
// Creator: james.zheng
// Date:    2024/12/31
//========================
 */
public class MaskTest {

  @Test
  public void testMask() {
    for (int i = 0; i < 1000; i++) {
      int a = Integer.numberOfLeadingZeros(i),
          b = Integer.numberOfLeadingZeros(i * 4 - 1),
          c = mask(i);
      System.out.println(i + " => " + a + " => " + b + " => " + c);
    }

  }

  int mask(int size) {
    return Math.max(
        (-1 >>> Integer.numberOfLeadingZeros(size * 4 - 1)),
        127);
  }
}
