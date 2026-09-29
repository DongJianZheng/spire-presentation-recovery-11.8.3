/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdxm;
import com.spire.presentation.packages.sprfvo;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprtgka;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzen;
import java.io.IOException;

public abstract class sprfcn
extends sprxgf
implements sprml {
    public static final sprqbn cfr_renamed_3 = new sprdxm(sprfcn.class, 30);
    public final char[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprfcn(char[] cArray) {
        void arg0;
        if (cArray == null) {
            throw new NullPointerException(sprfvo.cfr_renamed_9("\n\u000fY\u000eD\u0012J[\r\u001fL\u0012C\u0013Y\\O\u0019\r\u0012X\u0010A"));
        }
        this.cfr_renamed_4 = arg0;
    }

    public static sprfcn cfr_renamed_23(Object arg0) {
        sprxgf sprxgf2;
        if (arg0 == null || arg0 instanceof sprfcn) {
            return (sprfcn)arg0;
        }
        if (arg0 instanceof sprco && (sprxgf2 = ((sprco)arg0).cfr_renamed_119()) instanceof sprfcn) {
            return (sprfcn)sprxgf2;
        }
        if (arg0 instanceof byte[]) {
            try {
                return (sprfcn)cfr_renamed_3.cfr_renamed_184((byte[])arg0);
            }
            catch (Exception exception) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprtgka.cfr_renamed_9("yj\u007fkxmrc<anvsv<mr${ahMrwhergy><")).append(exception.toString()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprfvo.cfr_renamed_9("D\u0010A\u0019J\u001dA\\B\u001eG\u0019N\b\r\u0015C\\J\u0019Y5C\u000fY\u001dC\u001fHF\r")).append(arg0.getClass().getName()).toString());
    }

    public static sprfcn cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprfcn)cfr_renamed_3.cfr_renamed_11433(arg0, arg1);
    }

    @Override
    public final boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprfcn)) {
            return false;
        }
        sprfcn sprfcn2 = (sprfcn)arg0;
        return sproze.cfr_renamed_561(this.cfr_renamed_4, sprfcn2.cfr_renamed_4);
    }

    public static sprfcn cfr_renamed_11509(char[] arg0) {
        return new sprzen(arg0);
    }

    @Override
    public final int hashCode() {
        return sproze.cfr_renamed_544(this.cfr_renamed_4);
    }

    @Override
    public final int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_4.length * 2);
    }

    @Override
    public final void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        char c;
        int n;
        int n2 = this.cfr_renamed_4.length;
        sproen sproen2 = arg0;
        sproen2.cfr_renamed_11285(arg1, 30);
        sproen2.cfr_renamed_11281(n2 * 2);
        byte[] byArray = new byte[8];
        int n3 = 0;
        int n4 = n2 & 0xFFFFFFFC;
        int n5 = n3;
        while (n5 < n4) {
            sprfcn sprfcn2 = this;
            n = sprfcn2.cfr_renamed_4[n3];
            c = sprfcn2.cfr_renamed_4[n3 + 1];
            char c2 = sprfcn2.cfr_renamed_4[n3 + 2];
            int n6 = n3 + 3;
            n3 += 4;
            char c3 = sprfcn2.cfr_renamed_4[n6];
            byArray[0] = (byte)(n >> 8);
            byArray[1] = (byte)n;
            byArray[2] = (byte)(c >> 8);
            byArray[3] = (byte)c;
            byArray[4] = (byte)(c2 >> 8);
            byArray[5] = (byte)c2;
            byArray[6] = (byte)(c3 >> 8);
            byArray[7] = (byte)c3;
            arg0.cfr_renamed_4924(byArray, 0, 8);
            n5 = n3;
        }
        if (n3 < n2) {
            n = 0;
            do {
                c = this.cfr_renamed_4[n3++];
                byArray[n++] = (byte)(c >> 8);
                byArray[n++] = (byte)c;
            } while (n3 < n2);
            arg0.cfr_renamed_4924(byArray, 0, n);
        }
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    /*
     * WARNING - void declaration
     */
    public sprfcn(byte[] byArray) {
        int n;
        void arg0;
        if (byArray == null) {
            throw new NullPointerException(sprtgka.cfr_renamed_9(";whvuj{#<g}jrkh$~a<jihp"));
        }
        int n2 = ((void)arg0).length;
        if (0 != (n2 & 1)) {
            throw new IllegalArgumentException(sprfvo.cfr_renamed_9("\u0011L\u0010K\u0013_\u0011H\u0018\r>`,~\b_\u0015C\u001b\r\u0019C\u001fB\u0018D\u0012J\\H\u0012N\u0013X\u0012Y\u0019_\u0019I"));
        }
        int n3 = n2 / 2;
        char[] cArray = new char[n3];
        int n4 = n = 0;
        while (n4 != n3) {
            int n5 = n;
            char c = (char)(arg0[2 * n5] << 8 | arg0[2 * n + 1] & 0xFF);
            cArray[n5] = c;
            n4 = ++n;
        }
        this.cfr_renamed_4 = cArray;
    }

    @Override
    public final String cfr_renamed_314() {
        return new String(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprfcn(String string) {
        void arg0;
        if (string == null) {
            throw new NullPointerException(sprtgka.cfr_renamed_9(";whvuj{#<g}jrkh$~a<jihp"));
        }
        this.cfr_renamed_4 = arg0.toCharArray();
    }

    @Override
    public final boolean cfr_renamed_11277() {
        return false;
    }

    public static sprfcn cfr_renamed_11295(byte[] arg0) {
        return new sprzen(arg0);
    }
}

