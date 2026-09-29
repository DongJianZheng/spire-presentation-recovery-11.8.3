/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spresc;
import com.spire.presentation.packages.sprgc;
import com.spire.presentation.packages.spryad;
import java.io.IOException;

public class sprmxc
implements sprgc {
    private final spresc cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int cfr_renamed_2633(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        try {
            return this.cfr_renamed_4.cfr_renamed_2633(arg0, arg1, arg2, arg3);
        }
        catch (spryad spryad2) {
            spryad spryad3 = spryad2;
            this.cfr_renamed_4.spr\u3028\ufe34(spryad3.cfr_renamed_2909());
            throw spryad3;
        }
        catch (IOException iOException) {
            this.cfr_renamed_4.spr\u3028\ufe34((short)80);
            throw iOException;
        }
        catch (RuntimeException runtimeException) {
            this.cfr_renamed_4.spr\u3028\ufe34((short)80);
            throw new spryad(80);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_2635(byte[] arg0, int arg1, int arg2) throws IOException {
        try {
            this.cfr_renamed_4.cfr_renamed_2635(arg0, arg1, arg2);
            return;
        }
        catch (spryad spryad2) {
            spryad spryad3 = spryad2;
            this.cfr_renamed_4.spr\u3028\ufe34(spryad3.cfr_renamed_2909());
            throw spryad3;
        }
        catch (IOException iOException) {
            this.cfr_renamed_4.spr\u3028\ufe34((short)80);
            throw iOException;
        }
        catch (RuntimeException runtimeException) {
            this.cfr_renamed_4.spr\u3028\ufe34((short)80);
            throw new spryad(80);
        }
    }

    @Override
    public void cfr_renamed_2637() throws IOException {
        this.cfr_renamed_4.cfr_renamed_2637();
    }

    public sprmxc(spresc spresc2) {
        this.cfr_renamed_4 = spresc2;
    }

    @Override
    public int cfr_renamed_2634() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_2634();
    }

    @Override
    public int cfr_renamed_2636() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_2636();
    }
}

