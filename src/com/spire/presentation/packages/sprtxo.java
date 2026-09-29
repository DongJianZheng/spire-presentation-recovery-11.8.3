/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdrda;
import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprkpy;
import com.spire.presentation.packages.sprkqo;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;

@sprtea
public class sprtxo
extends sprkqo {
    @sprtea
    public short cfr_renamed_105;
    @sprtea
    public static final int cfr_renamed_137 = 151552;
    @sprtea
    public sprwvn cfr_renamed_79;
    @sprtea
    public int cfr_renamed_107;
    private static final int cfr_renamed_132 = 258;
    @sprtea
    public int cfr_renamed_102;
    @sprtea
    public static final int cfr_renamed_93 = 196608;
    @sprtea
    public int cfr_renamed_86;
    @sprtea
    public short cfr_renamed_152;
    @sprtea
    public static final int cfr_renamed_112 = 131072;
    @sprtea
    public static final int cfr_renamed_119 = 65536;
    @sprtea
    public int cfr_renamed_91;
    @sprtea
    public int cfr_renamed_0;
    @sprtea
    public int cfr_renamed_1;
    @sprtea
    public int cfr_renamed_2;
    @sprtea
    public int[] cfr_renamed_3;
    @sprtea
    public int cfr_renamed_4;

    @Override
    @sprtea
    public void cfr_renamed_18252(sprruo arg0) {
        sprtxo sprtxo2 = this;
        sprruo sprruo2 = arg0;
        sprtxo sprtxo3 = this;
        sprruo sprruo3 = arg0;
        sprtxo sprtxo4 = this;
        sprruo sprruo4 = arg0;
        sprruo4.cfr_renamed_12761(this.cfr_renamed_2);
        sprruo4.cfr_renamed_12761(this.cfr_renamed_0);
        arg0.cfr_renamed_14639(sprtxo4.cfr_renamed_152);
        sprruo3.cfr_renamed_14639(sprtxo4.cfr_renamed_105);
        sprruo3.cfr_renamed_12761(this.cfr_renamed_1);
        arg0.cfr_renamed_12761(sprtxo3.cfr_renamed_107);
        sprruo2.cfr_renamed_12761(sprtxo3.cfr_renamed_86);
        sprruo2.cfr_renamed_12761(this.cfr_renamed_4);
        arg0.cfr_renamed_12761(sprtxo2.cfr_renamed_102);
        switch (sprtxo2.cfr_renamed_2) {
            case 131072: {
                int n;
                int n2;
                arg0.cfr_renamed_14639(this.cfr_renamed_91);
                int[] nArray = this.cfr_renamed_3;
                int n3 = this.cfr_renamed_3.length;
                int n4 = n2 = 0;
                while (n4 < n3) {
                    arg0.cfr_renamed_14639(nArray[n2++]);
                    n4 = n2;
                }
                int n5 = n = 0;
                while (n5 < this.cfr_renamed_79.size()) {
                    Object object = this.cfr_renamed_79.get(n);
                    sprtxo.cfr_renamed_18573((String)object, arg0);
                    n5 = ++n;
                }
                break;
            }
            case 65536: 
            case 196608: {
                return;
            }
            default: {
                throw new IllegalStateException(sprkpy.cfr_renamed_9("pv@`U}Fl@|\u0005HJkQKFjLhQ8QyGt@8S}WkLwK6"));
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_18454(sprdsp sprdsp2) {
        sprtxo sprtxo2 = this;
        sprtxo2.cfr_renamed_107 = 0;
        sprtxo2.cfr_renamed_86 = 0;
        this.cfr_renamed_4 = 0;
        this.cfr_renamed_102 = 0;
        switch (this.cfr_renamed_2) {
            case 131072: {
                void arg0;
                this.cfr_renamed_18574((sprdsp)arg0);
                return;
            }
            case 65536: 
            case 196608: {
                return;
            }
        }
        throw new IllegalStateException(sprdrda.cfr_renamed_9("<}\fk\u0019v\ng\fwIC\u0006`\u001d@\na\u0000c\u001d3\u001dr\u000b\u007f\f3\u001fv\u001b`\u0000|\u0007="));
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprtxo(sprmzo sprmzo2, long l) {
        void arg0;
        void v0 = arg0;
        sprtxo sprtxo2 = this;
        void v2 = arg0;
        sprtxo sprtxo3 = this;
        void v4 = arg0;
        long l2 = v4.cfr_renamed_14060().cfr_renamed_3274();
        this.cfr_renamed_2 = v4.cfr_renamed_12261();
        sprtxo3.cfr_renamed_0 = v4.cfr_renamed_12261();
        sprtxo3.cfr_renamed_152 = arg0.cfr_renamed_12254();
        this.cfr_renamed_105 = v2.cfr_renamed_12254();
        sprtxo2.cfr_renamed_1 = v2.cfr_renamed_12261();
        sprtxo2.cfr_renamed_107 = arg0.cfr_renamed_12261();
        this.cfr_renamed_86 = v0.cfr_renamed_12261();
        this.cfr_renamed_4 = v0.cfr_renamed_12261();
        this.cfr_renamed_102 = sprmzo2.cfr_renamed_12261();
        switch (this.cfr_renamed_2) {
            case 131072: {
                int n;
                int n2;
                this.cfr_renamed_91 = arg0.cfr_renamed_13218() & 0xFFFF;
                this.cfr_renamed_3 = new int[this.cfr_renamed_91];
                int n3 = 0;
                int n4 = n2 = 0;
                while (n4 < this.cfr_renamed_3.length) {
                    n = arg0.cfr_renamed_13218();
                    this.cfr_renamed_3[n2] = n & 0xFFFF;
                    if ((n & 0xFFFF) <= Short.MAX_VALUE) {
                        n3 = sprrgga.cfr_renamed_2548(n & 0xFFFF, n3);
                    }
                    n4 = ++n2;
                }
                n2 = n3 - 258 + 1;
                n2 = n2 < 0 ? 0 : n2;
                sprtxo sprtxo4 = this;
                sprtxo4.cfr_renamed_79 = new sprwvn(n2);
                int n5 = n = 258;
                while (true) {
                    void arg1;
                    if (n5 > n3) {
                        return;
                    }
                    if (arg0.cfr_renamed_14060().cfr_renamed_3274() >= l2 + arg1) {
                        return;
                    }
                    sprovja.cfr_renamed_11658(this.cfr_renamed_79, sprtxo.cfr_renamed_18575((sprmzo)arg0));
                    n5 = ++n;
                }
            }
            case 65536: 
            case 196608: {
                return;
            }
        }
        throw new IllegalStateException(sprkpy.cfr_renamed_9("pv@`U}Fl@|\u0005HJkQKFjLhQ8QyGt@8S}WkLwK6"));
    }

    private /* synthetic */ void cfr_renamed_18574(sprdsp arg0) {
        int n;
        int[] nArray = new int[arg0.cfr_renamed_11861()];
        sprwvn sprwvn2 = new sprwvn();
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_11861()) {
            sprdsp sprdsp2 = arg0;
            int n3 = sprdsp2.cfr_renamed_7861(n);
            int n4 = (Integer)sprdsp2.cfr_renamed_13485(n);
            int n5 = this.cfr_renamed_3[n3];
            if (n5 < 258 || n5 > Short.MAX_VALUE) {
                nArray[n4] = n5 & 0xFFFF;
            } else {
                int n6 = n5 - 258;
                if (n6 >= this.cfr_renamed_79.size()) {
                    nArray[n4] = 0;
                } else {
                    String string = (String)this.cfr_renamed_79.get(n6);
                    int n7 = sprovja.cfr_renamed_11658(sprwvn2, string);
                    nArray[n4] = n7 + 258 & 0xFFFF;
                }
            }
            n2 = ++n;
        }
        sprtxo sprtxo2 = this;
        sprtxo2.cfr_renamed_91 = arg0.cfr_renamed_11861() & 0xFFFF;
        sprtxo2.cfr_renamed_3 = nArray;
        this.cfr_renamed_79 = sprwvn2;
    }

    private static /* synthetic */ void cfr_renamed_18573(String arg0, sprruo arg1) {
        if (arg0.length() > 255) {
            throw new IllegalStateException(sprdrda.cfr_renamed_9("={\f39|\u001ag:p\u001bz\u0019gIt\u0005j\u0019{I}\b~\f3\u0000`Ig\u0006|I\u007f\u0006}\u000e="));
        }
        byte[] byArray = sprszca.cfr_renamed_14249().cfr_renamed_11606(arg0);
        arg1.cfr_renamed_11594((byte)byArray.length);
        arg1.cfr_renamed_15098(byArray, 0, byArray.length);
    }

    private static /* synthetic */ String cfr_renamed_18575(sprmzo arg0) {
        sprmzo sprmzo2 = arg0;
        int n = sprmzo2.cfr_renamed_12137() & 0xFF;
        if (sprmzo2.cfr_renamed_14060().cfr_renamed_3274() + (long)n > arg0.cfr_renamed_14060().cfr_renamed_806()) {
            n = (int)(arg0.cfr_renamed_14060().cfr_renamed_806() - arg0.cfr_renamed_14060().cfr_renamed_3274());
        }
        byte[] byArray = arg0.cfr_renamed_16065(n);
        return sprszca.cfr_renamed_14249().cfr_renamed_14565(byArray);
    }
}

