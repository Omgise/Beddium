/*
 * Beddium
 *
 * Copyright (C) 2025 Ven, FalsePattern
 * All Rights Reserved
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, only version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.ventooth.beddium.mixin.mixins.client.MEGAChunks;

import com.ventooth.beddium.modules.MEGAChunks.MegaChunkMetadata;
import org.embeddedt.embeddium.impl.util.PositionUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

//SUSCRIBE NOW!
@Mixin(value = PositionUtil.class,
       remap = false)
public class PositionUtilMixin {
    @ModifyConstant(method = "posToSectionCoord(I)I",
                    constant = @Constant(intValue = 4),
                    require = 1)
    private static int extendChunk1(int constant) {
        return MegaChunkMetadata.BLOCKS_PER_WR_EDGE_BITS;
    }
    @ModifyConstant(method = "sectionToBlockCoord",
                    constant = @Constant(intValue = 4),
                    require = 1)
    private static int extendChunk2(int constant) {
        return MegaChunkMetadata.BLOCKS_PER_WR_EDGE_BITS;
    }
}
