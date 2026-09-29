/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreve;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprgwe;
import com.spire.presentation.packages.sprinq;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmg;
import com.spire.presentation.packages.sprnxe;
import com.spire.presentation.packages.sprqke;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import java.io.IOException;
import java.util.Hashtable;

public class sprghe
extends sprkra {
    public static Hashtable cfr_renamed_102;
    public static final sprtzd cfr_renamed_93;
    public static final int cfr_renamed_86 = 64;
    public static final int cfr_renamed_152 = 1;
    public static final int cfr_renamed_112 = 192;
    public static final int cfr_renamed_119 = 0;
    public static final int cfr_renamed_91 = 2;
    public static Hashtable cfr_renamed_0;
    public static spreve cfr_renamed_1;
    public sprgwe cfr_renamed_2;
    public sprtzd cfr_renamed_3;
    public static final int cfr_renamed_4 = 128;

    /*
     * WARNING - void declaration
     */
    public sprghe(sprtzd sprtzd2, int n) throws IOException {
        void arg0;
        sprghe sprghe2 = this;
        sprghe2.cfr_renamed_4732((sprtzd)arg0);
        sprghe2.cfr_renamed_4733((byte)n);
    }

    public sprtzd cfr_renamed_4721() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre3.cfr_renamed_49(this.cfr_renamed_2);
        return new sprgwe(76, sprlre2);
    }

    public static int cfr_renamed_4734(String arg0) {
        Integer n = (Integer)cfr_renamed_1.cfr_renamed_4735(arg0);
        if (n == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprinq.cfr_renamed_9("I w s9rnj/p;yn")).append(arg0).toString());
        }
        return n;
    }

    static {
        cfr_renamed_93 = sprmg.cfr_renamed_0.cfr_renamed_1436(sprnxe.cfr_renamed_9("NWLWOWL"));
        cfr_renamed_0 = new Hashtable();
        cfr_renamed_1 = new spreve();
        cfr_renamed_102 = new Hashtable();
        cfr_renamed_0.put(spriwa.cfr_renamed_279(2), sprinq.cfr_renamed_9("\u001c]\n[z"));
        cfr_renamed_0.put(spriwa.cfr_renamed_279(1), sprnxe.cfr_renamed_9("/89>N"));
        cfr_renamed_1.put(spriwa.cfr_renamed_279(192), sprinq.cfr_renamed_9("_\u0018_\u000f"));
        cfr_renamed_1.put(spriwa.cfr_renamed_279(128), sprnxe.cfr_renamed_9("9/\"=248*)0>"));
        cfr_renamed_1.put(spriwa.cfr_renamed_279(64), sprinq.cfr_renamed_9("X\u0018C\bS\u001cY\u0007[\u0000"));
        cfr_renamed_1.put(spriwa.cfr_renamed_279(0), sprnxe.cfr_renamed_9("0."));
    }

    /*
     * WARNING - void declaration
     */
    public sprghe(sprgwe sprgwe2) throws IOException {
        if (sprgwe2.cfr_renamed_4576() == 76) {
            void arg0;
            this.cfr_renamed_4736(new sprgle(arg0.cfr_renamed_4577()));
        }
    }

    private /* synthetic */ void cfr_renamed_4733(byte arg0) {
        byte[] byArray = new byte[1];
        byte[] byArray2 = byArray;
        byArray[0] = arg0;
        sprghe sprghe2 = this;
        sprghe2.cfr_renamed_2 = new sprgwe(sprqke.cfr_renamed_4704(83), byArray2);
    }

    public int cfr_renamed_4716() {
        return this.cfr_renamed_2.cfr_renamed_4577()[0] & 0xFF;
    }

    public static String cfr_renamed_4737(int arg0) {
        return (String)cfr_renamed_1.get(spriwa.cfr_renamed_279(arg0));
    }

    private /* synthetic */ void cfr_renamed_4732(sprtzd arg0) {
        this.cfr_renamed_3 = arg0;
    }

    private /* synthetic */ void cfr_renamed_4736(sprgle arg0) throws IOException {
        sprvva sprvva2 = arg0.cfr_renamed_24();
        if (!(sprvva2 instanceof sprtzd)) {
            throw new IllegalArgumentException(sprinq.cfr_renamed_9("r!<\u0001u*<'rn_+n:u-}:y\u0006s\"x+n\u000fi:t!n'f/h's "));
        }
        this.cfr_renamed_3 = (sprtzd)sprvva2;
        sprvva2 = arg0.cfr_renamed_24();
        if (sprvva2 instanceof sprgwe) {
            this.cfr_renamed_2 = (sprgwe)sprvva2;
            return;
        }
        throw new IllegalArgumentException(sprnxe.cfr_renamed_9("7\u0012Y\u001c\u001a\u001e\u001c\u000e\n]\u000b\u0014\u001e\u0015\r\u000eY\u0014\u0017]:\u0018\u000b\t\u0010\u001e\u0018\t\u001c5\u0016\u0011\u001d\u0018\u000b<\f\t\u0011\u0012\u000b\u0014\u0003\u001c\r\u0014\u0016\u0013"));
    }
}

