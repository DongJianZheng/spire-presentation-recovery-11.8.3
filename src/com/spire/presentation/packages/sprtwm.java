/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbuy;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlrl;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprpbn;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.spruwm;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public final class sprtwm
extends sprxgf {
    private final spruwm cfr_renamed_3;
    public static final sprqbn cfr_renamed_4 = new sprpbn(sprtwm.class, 7);

    public static sprtwm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprtwm) {
            return (sprtwm)arg0;
        }
        if (arg0 instanceof sprco) {
            sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
            if (sprxgf2 instanceof sprtwm) {
                return (sprtwm)sprxgf2;
            }
        } else if (arg0 instanceof byte[]) {
            try {
                return (sprtwm)cfr_renamed_4.cfr_renamed_184((byte[])arg0);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprbuy.cfr_renamed_9("g\u0013h\u001ed\u0016!\u0006nRb\u001do\u0001u\u0000t\u0011uRn\u0010k\u0017b\u0006!\u0016d\u0001b\u0000h\u0002u\u001dsRg\u0000n\u001f!\u0010x\u0006d)\\H!")).append(iOException.getMessage()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprlrl.cfr_renamed_9("\u0014M\u0011D\u001a@\u0011\u0001\u0012C\u0017D\u001eU]H\u0013\u0001\u001aD\th\u0013R\t@\u0013B\u0018\u001b]")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public int hashCode() {
        return ~this.cfr_renamed_3.hashCode();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_11218(sproen sproen2, boolean bl) throws IOException {
        void arg1;
        void arg0;
        arg0.cfr_renamed_11285((boolean)arg1, 7);
        this.cfr_renamed_3.cfr_renamed_11218((sproen)arg0, false);
    }

    @Override
    public boolean cfr_renamed_11277() {
        return false;
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) {
        return this.cfr_renamed_3.cfr_renamed_11213(arg0);
    }

    public static sprtwm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprtwm)cfr_renamed_4.cfr_renamed_11433(arg0, arg1);
    }

    @Override
    public sprxgf cfr_renamed_4612() {
        spruwm spruwm2 = (spruwm)this.cfr_renamed_3.cfr_renamed_4612();
        if (spruwm2 == this.cfr_renamed_3) {
            return this;
        }
        return new sprtwm(spruwm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprtwm(spruwm spruwm2) {
        void arg0;
        if (null == arg0) {
            throw new NullPointerException(sprbuy.cfr_renamed_9("Uc\u0013r\u0017F\u0000`\u0002i\u001bb!u\u0000h\u001cfU!\u0011`\u001co\u001duRc\u0017!\u001ct\u001em"));
        }
        this.cfr_renamed_3 = arg0;
    }

    @Override
    public boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprtwm)) {
            return false;
        }
        sprtwm sprtwm2 = (sprtwm)arg0;
        return this.cfr_renamed_3.cfr_renamed_11432(sprtwm2.cfr_renamed_3);
    }

    public static sprtwm cfr_renamed_11295(byte[] arg0) {
        return new sprtwm(spruwm.cfr_renamed_11295(arg0));
    }

    public spruwm cfr_renamed_11185() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_4615() {
        spruwm spruwm2 = (spruwm)this.cfr_renamed_3.cfr_renamed_4615();
        if (spruwm2 == this.cfr_renamed_3) {
            return this;
        }
        return new sprtwm(spruwm2);
    }
}

