package com.aeternal.botaniverse.api.state.enums;

import net.minecraft.util.IStringSerializable;

import java.util.Locale;

public enum MoreRockVariant implements IStringSerializable {
    NILFHEIM,
    MUSPELHEIM,
    ALFHEIM,
    ASGARD;

    @Override
    public String getName() {
        return name().toLowerCase(Locale.ROOT);
    }

}
