/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprden;
import com.spire.presentation.packages.sprhbh;
import com.spire.presentation.packages.sprju;
import com.spire.presentation.packages.sprtvm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzbs;
import java.io.IOException;

public class sprucn
extends sprtvm {
    private final boolean cfr_renamed_4;

    @Override
    public sprco cfr_renamed_11266(boolean arg0, int arg1) throws IOException {
        if (arg0) {
            if (!this.cfr_renamed_4) {
                throw new IOException(sprzbs.cfr_renamed_9("4<\u0001(\u0018'\u00180Q0\u0010#\u0002d\u001c1\u00020Q&\u0014d\u0012+\u001f7\u00056\u0004'\u0005!\u0015dY7\u0014!Q\u001c_rHtQ|_uEjCm"));
            }
            return this.cfr_renamed_2.cfr_renamed_11267(arg1);
        }
        if (this.cfr_renamed_4) {
            return this.cfr_renamed_2.cfr_renamed_11268(arg1);
        }
        return this.cfr_renamed_2.cfr_renamed_11269(arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprucn(int n, int n2, boolean bl, sprden sprden2) {
        super((int)arg0, (int)arg1, (sprden)arg3);
        void arg3;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = bl;
    }

    @Override
    public sprco cfr_renamed_11270() throws IOException {
        if (!this.cfr_renamed_4) {
            throw new IOException(sprhbh.cfr_renamed_9("I[|Oe@eW,WmD\u007f\u0003aV\u007fW,Ai\u0003oLbPxQy@xFh\u0003$PiF,{\"\u00155\u0013,\u001b\"\u00128\r>\n"));
        }
        return this.cfr_renamed_2.cfr_renamed_24();
    }

    @Override
    public sprju cfr_renamed_11271() throws IOException {
        if (!this.cfr_renamed_4) {
            throw new IOException(sprzbs.cfr_renamed_9("4<\u0001(\u0018'\u00180Q0\u0010#\u0002d\u001c1\u00020Q&\u0014d\u0012+\u001f7\u00056\u0004'\u0005!\u0015dY7\u0014!Q\u001c_rHtQ|_uEjCm"));
        }
        return this.cfr_renamed_2.cfr_renamed_11272();
    }

    @Override
    public sprju cfr_renamed_11273(int arg0, int arg1) throws IOException {
        sprucn sprucn2 = this;
        return new sprucn(arg0, arg1, sprucn2.cfr_renamed_4, sprucn2.cfr_renamed_2);
    }

    @Override
    public sprxgf cfr_renamed_2414() throws IOException {
        sprucn sprucn2 = this;
        sprucn sprucn3 = this;
        return sprucn2.cfr_renamed_2.cfr_renamed_11274(sprucn2.cfr_renamed_3, sprucn3.cfr_renamed_4 ? 1 : 0, sprucn3.cfr_renamed_4);
    }
}

