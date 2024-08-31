/*
 *  Copyright (C) <2024> <XiaoMoMi>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package net.momirealms.customcrops.api.core.world;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface CustomCropsRegion {

    boolean isLoaded();

    void unload();

    void load();

    @NotNull
    CustomCropsWorld<?> getWorld();

    byte[] getCachedChunkBytes(ChunkPos pos);

    RegionPos regionPos();

    boolean removeCachedChunk(ChunkPos pos);

    void setCachedChunk(ChunkPos pos, byte[] data);

    Map<ChunkPos, byte[]> dataToSave();

    boolean canPrune();
}
