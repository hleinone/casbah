/**
 * Copyright (c) 2010, 2011 10gen, Inc. <http://10gen.com>
 * Copyright (c) 2009, 2010 Novus Partners, Inc. <http://novus.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For questions and comments about this product, please see the project page at:
 *
 *     http://github.com/mongodb/casbah
 *
 */

package com.mongodb.casbah

/**
 * These values not presently used.
 */
sealed trait BSONDecodingStrategy
case object NormalBSONDecodingStrategy extends BSONDecodingStrategy
case object LazyBSONDecodingStrategy extends BSONDecodingStrategy

object BSONDecodingStrategy {
  val Normal = NormalBSONDecodingStrategy
  val Lazy = LazyBSONDecodingStrategy
}
