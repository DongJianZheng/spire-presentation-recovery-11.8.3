/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcmn;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.spriae;
import com.spire.presentation.packages.sprite;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprsph;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxse;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryte;
import java.math.BigInteger;

public class sprome
extends sprkra {
    private sprite cfr_renamed_79;
    private BigInteger cfr_renamed_107;
    private sprxse cfr_renamed_132;
    private spryee cfr_renamed_102;
    private int cfr_renamed_93 = 1;
    private spryee cfr_renamed_86;
    private static final int cfr_renamed_152 = 3;
    private static final int cfr_renamed_112 = 4;
    private static final int cfr_renamed_119 = 0;
    private static final int cfr_renamed_91 = 1;
    private sprszd cfr_renamed_0;
    private spriae cfr_renamed_1;
    private spryee cfr_renamed_2;
    private static final int cfr_renamed_3 = 2;
    private static final int cfr_renamed_4 = 1;

    public static sprome cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprome) {
            return (sprome)arg0;
        }
        if (arg0 != null) {
            return new sprome(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_93;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(sprsph.cfr_renamed_9("\f\"\u000b'\u001a\u00119\u0001-\u0007<=&\u0012'\u0006%\u0015<\u001d'\u001ah\u000fB"));
        if (this.cfr_renamed_93 != 1) {
            stringBuffer.append(sprcmn.cfr_renamed_9("e?a)z5}`3") + this.cfr_renamed_93 + "\n");
        }
        stringBuffer.append(new StringBuilder().insert(0, sprsph.cfr_renamed_9(";\u0011:\u0002!\u0017-Nh")).append(this.cfr_renamed_79).append("\n").toString());
        if (this.cfr_renamed_107 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprcmn.cfr_renamed_9("}5}9v`3")).append(this.cfr_renamed_107).append("\n").toString());
        }
        if (this.cfr_renamed_132 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprsph.cfr_renamed_9(":\u00119\u0001-\u0007< !\u0019-Nh")).append(this.cfr_renamed_132).append("\n").toString());
        }
        if (this.cfr_renamed_102 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprcmn.cfr_renamed_9("a?b/v)g?a`3")).append(this.cfr_renamed_102).append("\n").toString());
        }
        if (this.cfr_renamed_1 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprsph.cfr_renamed_9(":\u00119\u0001-\u0007<$'\u0018!\u00171Nh")).append(this.cfr_renamed_1).append("\n").toString());
        }
        if (this.cfr_renamed_86 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprcmn.cfr_renamed_9(">e9``3")).append(this.cfr_renamed_86).append("\n").toString());
        }
        if (this.cfr_renamed_2 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprsph.cfr_renamed_9(",\u0015<\u0015\u0004\u001b+\u0015<\u001d'\u001a;Nh")).append(this.cfr_renamed_2).append("\n").toString());
        }
        if (this.cfr_renamed_0 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprcmn.cfr_renamed_9("?k.v4`3|4``3")).append(this.cfr_renamed_0).append("\n").toString());
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append(sprsph.cfr_renamed_9("\tB"));
        return stringBuffer2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprome(sprbne sprbne2) {
        sprome sprome2;
        void arg0;
        int n = 0;
        if (sprbne2.cfr_renamed_85(0) instanceof sprooe) {
            sprooe sprooe2 = sprooe.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
            sprome2 = this;
            this.cfr_renamed_93 = sprooe2.cfr_renamed_97().intValue();
        } else {
            sprome2 = this;
            this.cfr_renamed_93 = 1;
        }
        sprome2.cfr_renamed_79 = sprite.cfr_renamed_23(arg0.cfr_renamed_85(n));
        int n2 = ++n;
        while (n2 < arg0.cfr_renamed_84()) {
            spra spra2 = arg0.cfr_renamed_85(n);
            if (spra2 instanceof sprooe) {
                this.cfr_renamed_107 = sprooe.cfr_renamed_23(spra2).cfr_renamed_97();
            } else if (spra2 instanceof sprrpe) {
                this.cfr_renamed_132 = sprxse.cfr_renamed_23(spra2);
            } else if (spra2 instanceof spryte) {
                spryte spryte2 = spryte.cfr_renamed_23(spra2);
                switch (spryte2.cfr_renamed_312()) {
                    case 0: {
                        this.cfr_renamed_102 = spryee.cfr_renamed_341(spryte2, false);
                        break;
                    }
                    case 1: {
                        this.cfr_renamed_1 = spriae.cfr_renamed_23(sprbne.cfr_renamed_341(spryte2, false));
                        break;
                    }
                    case 2: {
                        this.cfr_renamed_86 = spryee.cfr_renamed_341(spryte2, false);
                        break;
                    }
                    case 3: {
                        this.cfr_renamed_2 = spryee.cfr_renamed_341(spryte2, false);
                        break;
                    }
                    case 4: {
                        this.cfr_renamed_0 = sprszd.cfr_renamed_341(spryte2, false);
                    }
                }
            } else {
                this.cfr_renamed_132 = sprxse.cfr_renamed_23(spra2);
            }
            n2 = ++n;
        }
        return;
    }

    public spriae cfr_renamed_2595() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprvva cfr_renamed_119() {
        int n;
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_93 != 1) {
            sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_93));
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_79);
        if (this.cfr_renamed_107 != null) {
            sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_107));
        }
        if (this.cfr_renamed_132 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_132);
        }
        int[] nArray = new int[5];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 4;
        int[] nArray2 = nArray;
        spra[] spraArray = new spra[5];
        spraArray[0] = this.cfr_renamed_102;
        spraArray[1] = this.cfr_renamed_1;
        spraArray[2] = this.cfr_renamed_86;
        spraArray[3] = this.cfr_renamed_2;
        spraArray[4] = this.cfr_renamed_0;
        spra[] spraArray2 = spraArray;
        int n2 = n = 0;
        while (n2 < nArray2.length) {
            int n3 = nArray2[n];
            spra spra2 = spraArray2[n];
            if (spra2 != null) {
                sprlre2.cfr_renamed_49(new sprhse(false, n3, spra2));
            }
            n2 = ++n;
        }
        return new sprpse(sprlre2);
    }

    public BigInteger cfr_renamed_596() {
        return this.cfr_renamed_107;
    }

    public spryee cfr_renamed_2596() {
        return this.cfr_renamed_2;
    }

    public sprszd cfr_renamed_98() {
        return this.cfr_renamed_0;
    }

    public spryee cfr_renamed_2599() {
        return this.cfr_renamed_86;
    }

    public sprite cfr_renamed_2594() {
        return this.cfr_renamed_79;
    }

    public sprxse cfr_renamed_2590() {
        return this.cfr_renamed_132;
    }

    public static sprome cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprome.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    public spryee cfr_renamed_2592() {
        return this.cfr_renamed_102;
    }
}

