/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcvk;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfv;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprraz;
import com.spire.presentation.packages.sprydf;

public class sprhqk
extends sprcvk
implements sprfv {
    private byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private boolean cfr_renamed_1;
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprmr cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        System.arraycopy(this.cfr_renamed_0, 0, this.cfr_renamed_3, 0, this.cfr_renamed_0.length);
        sprhqk sprhqk2 = this;
        sproze.cfr_renamed_492(sprhqk2.cfr_renamed_91, (byte)0);
        sprhqk2.cfr_renamed_4.cfr_renamed_41();
    }

    private /* synthetic */ int cfr_renamed_3396(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        int n;
        if (arg1 + this.cfr_renamed_2 > arg0.length) {
            throw new sprddl(sprraz.cfr_renamed_9("\u0006L\u001fW\u001b\u0002\rW\tD\nPOV\u0000MOQ\u0007M\u001dV"));
        }
        System.arraycopy(arg0, arg1, this.cfr_renamed_91, 0, this.cfr_renamed_2);
        int n2 = this.cfr_renamed_4.cfr_renamed_3064(arg0, arg1, arg2, arg3);
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_2) {
            int n4 = arg3 + n;
            byte by = (byte)(arg2[n4] ^ this.cfr_renamed_3[n]);
            arg2[n4] = by;
            n3 = ++n;
        }
        sprhqk sprhqk2 = this;
        byte[] byArray = sprhqk2.cfr_renamed_3;
        sprhqk2.cfr_renamed_3 = sprhqk2.cfr_renamed_91;
        sprhqk2.cfr_renamed_91 = byArray;
        return n2;
    }

    public static sprfv cfr_renamed_7530(sprmr arg0) {
        return new sprhqk(arg0);
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_4.cfr_renamed_1195();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        void arg1;
        void arg0;
        boolean bl2 = this.cfr_renamed_1;
        this.cfr_renamed_1 = arg0;
        if (sprbj2 instanceof sprkpk) {
            sprkpk sprkpk2 = (sprkpk)arg1;
            byte[] byArray = sprkpk2.cfr_renamed_1205();
            if (byArray.length != this.cfr_renamed_2) {
                throw new IllegalArgumentException(sprydf.cfr_renamed_9("a.a4a!d){!|)g.(6m#|/z`e5{4(\"m`|(m`{!e%(,m.o4``i3(\"d/k+(3a:m"));
            }
            System.arraycopy(byArray, 0, this.cfr_renamed_0, 0, byArray.length);
            this.cfr_renamed_41();
            if (sprkpk2.cfr_renamed_284() != null) {
                this.cfr_renamed_4.cfr_renamed_5535((boolean)arg0, sprkpk2.cfr_renamed_284());
                return;
            }
            if (bl2 != arg0) {
                throw new IllegalArgumentException(sprraz.cfr_renamed_9("A\u000eL\u0001M\u001b\u0002\fJ\u000eL\bGOG\u0001A\u001d[\u001fV\u0006L\b\u0002\u001cV\u000eV\n\u0002\u0018K\u001bJ\u0000W\u001b\u0002\u001fP\u0000T\u0006F\u0006L\b\u0002\u0004G\u0016\f"));
            }
        } else {
            this.cfr_renamed_41();
            if (arg1 != null) {
                this.cfr_renamed_4.cfr_renamed_5535((boolean)arg0, (sprbj)arg1);
                return;
            }
            if (bl2 != arg0) {
                throw new IllegalArgumentException(sprydf.cfr_renamed_9("k!f.g4(#`!f'm`m.k2q0|)f'(3|!|%(7a4`/}4(0z/~)l)f'(+m9&"));
            }
        }
    }

    private /* synthetic */ int cfr_renamed_3393(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        int n;
        if (arg1 + this.cfr_renamed_2 > arg0.length) {
            throw new sprddl(sprraz.cfr_renamed_9("\u0006L\u001fW\u001b\u0002\rW\tD\nPOV\u0000MOQ\u0007M\u001dV"));
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            int n3 = n;
            byte by = (byte)(this.cfr_renamed_3[n3] ^ arg0[arg1 + n]);
            this.cfr_renamed_3[n3] = by;
            n2 = ++n;
        }
        sprhqk sprhqk2 = this;
        n = sprhqk2.cfr_renamed_4.cfr_renamed_3064(sprhqk2.cfr_renamed_3, 0, arg2, arg3);
        System.arraycopy(arg2, arg3, this.cfr_renamed_3, 0, this.cfr_renamed_3.length);
        return n;
    }

    @Override
    public sprmr cfr_renamed_2349() {
        return this.cfr_renamed_4;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_4.cfr_renamed_1315()).append(sprydf.cfr_renamed_9("oK\u0002K")).toString();
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) throws sprddl, IllegalStateException {
        if (this.cfr_renamed_1) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }

    public sprhqk(sprmr arg0) {
        sprhqk sprhqk2 = this;
        this.cfr_renamed_4 = null;
        this.cfr_renamed_4 = arg0;
        sprhqk2.cfr_renamed_2 = arg0.cfr_renamed_1195();
        sprhqk2.cfr_renamed_0 = new byte[this.cfr_renamed_2];
        sprhqk2.cfr_renamed_3 = new byte[sprhqk2.cfr_renamed_2];
        sprhqk2.cfr_renamed_91 = new byte[sprhqk2.cfr_renamed_2];
    }
}

