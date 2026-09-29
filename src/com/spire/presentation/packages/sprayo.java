/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyo;
import com.spire.presentation.packages.sprchm;
import com.spire.presentation.packages.sprgxo;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sproup;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;

@sprtea
public class sprayo
extends sprgxo {
    private static final byte cfr_renamed_112 = 4;
    private static final byte cfr_renamed_119 = 16;
    public sprbyo[] cfr_renamed_91;
    private static final byte cfr_renamed_0 = 2;
    private static final byte cfr_renamed_1 = 8;
    public byte[] cfr_renamed_2;
    private static final byte cfr_renamed_3 = 32;
    private static final byte cfr_renamed_4 = 1;

    @Override
    public void cfr_renamed_18252(sprruo arg0) {
        if (this.cfr_renamed_29()) {
            return;
        }
        sprayo sprayo2 = this;
        sprruo sprruo2 = arg0;
        sprayo sprayo3 = this;
        super.cfr_renamed_18252(arg0);
        sprayo3.cfr_renamed_18565(arg0);
        sprayo2.cfr_renamed_18566(sprruo2);
        sprayo2.cfr_renamed_18567(sprruo2);
    }

    private /* synthetic */ byte[] cfr_renamed_18568() {
        int n;
        byte[] byArray = new byte[this.cfr_renamed_91.length];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91.length) {
            int n3 = 0;
            if (this.cfr_renamed_91[n].cfr_renamed_13524()) {
                n3 = (byte)((n3 & 0xFF) + 1);
            }
            byArray[n++] = n3;
            n2 = n;
        }
        return byArray;
    }

    public void cfr_renamed_14822() {
        int n;
        if (this.cfr_renamed_91.length == 0) {
            return;
        }
        sprayo sprayo2 = this;
        sprayo2.cfr_renamed_4 = (byte)sprayo2.cfr_renamed_91[0].cfr_renamed_1980();
        sprayo2.cfr_renamed_0 = (byte)sprayo2.cfr_renamed_91[0].cfr_renamed_1980();
        sprayo2.cfr_renamed_3 = (byte)sprayo2.cfr_renamed_91[0].spr\u3181();
        sprayo2.cfr_renamed_2 = (byte[])((short)sprayo2.cfr_renamed_91[0].spr\u3181());
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_91.length) {
            sprayo sprayo3 = this;
            sprayo sprayo4 = this;
            sprayo3.cfr_renamed_4 = (byte)sprrgga.cfr_renamed_18292(sprayo3.cfr_renamed_4, (short)sprayo4.cfr_renamed_91[n].cfr_renamed_1980());
            sprayo3.cfr_renamed_0 = (byte)sprrgga.cfr_renamed_13324(sprayo4.cfr_renamed_0, (short)this.cfr_renamed_91[n].cfr_renamed_1980());
            sprayo3.cfr_renamed_3 = (byte)sprrgga.cfr_renamed_18292(sprayo3.cfr_renamed_3, (short)this.cfr_renamed_91[n].spr\u3181());
            int n3 = this.cfr_renamed_91[n].spr\u3181();
            sprayo3.cfr_renamed_2 = (byte[])sprrgga.cfr_renamed_13324((short)sprayo3.cfr_renamed_2, (short)n3);
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_18569(sprruo arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91.length) {
            arg0.cfr_renamed_14639(this.cfr_renamed_91[n++].cfr_renamed_18320());
            n2 = n;
        }
    }

    private static /* synthetic */ short cfr_renamed_18570(sprmzo arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            return (short)((arg0.cfr_renamed_12137() & 0xFF) * (arg2 ? 1 : -1));
        }
        if (arg2) {
            return 0;
        }
        return arg0.cfr_renamed_12254();
    }

    public static sprayo cfr_renamed_18571(sprmzo arg0) {
        int n;
        int n2;
        int n3;
        int n4;
        sprayo sprayo2 = new sprayo();
        sprayo2.cfr_renamed_1 = (byte)arg0.cfr_renamed_12254();
        if (sprayo2.cfr_renamed_1 < 0) {
            throw new IllegalStateException(sprchm.cfr_renamed_9("]\u001fb\u0010x\u0018pQw\u001ez\u0005{\u0004f\u00024\u001fa\u001cv\u0014f_"));
        }
        sprayo sprayo3 = sprayo2;
        sprmzo sprmzo2 = arg0;
        sprayo2.cfr_renamed_4 = (byte)arg0.cfr_renamed_12254();
        sprayo2.cfr_renamed_3 = (byte)sprmzo2.cfr_renamed_12254();
        sprayo3.cfr_renamed_0 = (byte)sprmzo2.cfr_renamed_12254();
        sprayo3.cfr_renamed_2 = (byte[])arg0.cfr_renamed_12254();
        if (sprayo2.cfr_renamed_29()) {
            return sprayo2;
        }
        sprtvp sprtvp2 = new sprtvp(sprayo2.cfr_renamed_1);
        int n5 = n4 = 0;
        while (n5 < sprayo2.cfr_renamed_1) {
            sprtvp2.cfr_renamed_12819(arg0.cfr_renamed_13218() & 0xFFFF);
            n5 = ++n4;
        }
        sprtvp2.cfr_renamed_4921();
        n4 = 1 + sprtvp2.cfr_renamed_576(sprayo2.cfr_renamed_1 - 1);
        int n6 = arg0.cfr_renamed_13218() & 0xFFFF;
        sprayo2.cfr_renamed_2 = arg0.cfr_renamed_16065(n6);
        byte[] byArray = new byte[n4];
        int n7 = 0;
        while (n7 < n4) {
            byte by = arg0.cfr_renamed_12137();
            byArray[n7++] = by;
            if (!sproup.cfr_renamed_17443(by, (byte)8)) continue;
            n3 = arg0.cfr_renamed_12137() & 0xFF;
            int n8 = n2 = 0;
            while (n8 < n3) {
                byArray[n7++] = by;
                n8 = ++n2;
            }
        }
        int[] nArray = new int[n4];
        int n9 = n3 = 0;
        while (n9 < n4) {
            int n10 = n3;
            short s = sprayo.cfr_renamed_18570(arg0, sproup.cfr_renamed_17443(byArray[n10], (byte)2), sproup.cfr_renamed_17443(byArray[n3], (byte)16));
            nArray[n10] = s;
            n9 = ++n3;
        }
        int[] nArray2 = new int[n4];
        int n11 = n2 = 0;
        while (n11 < n4) {
            int n12 = n2;
            short s = sprayo.cfr_renamed_18570(arg0, sproup.cfr_renamed_17443(byArray[n12], (byte)4), sproup.cfr_renamed_17443(byArray[n2], (byte)32));
            nArray2[n12] = s;
            n11 = ++n2;
        }
        sprayo2.cfr_renamed_91 = new sprbyo[n4];
        n2 = 0;
        int n13 = 0;
        int n14 = n = 0;
        while (n14 < n4) {
            n2 = (short)(n2 + nArray[n]);
            n13 = (short)(n13 + nArray2[n]);
            sprbyo sprbyo2 = new sprbyo(nArray[n], nArray2[n], n2, n13, sproup.cfr_renamed_17443(byArray[n], (byte)1), sprtvp2.cfr_renamed_18332(n));
            sprayo2.cfr_renamed_91[n++] = sprbyo2;
            n14 = n;
        }
        return sprayo2;
    }

    private /* synthetic */ void cfr_renamed_18572(sprruo arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91.length) {
            arg0.cfr_renamed_14639(this.cfr_renamed_91[n++].cfr_renamed_18321());
            n2 = n;
        }
    }

    private /* synthetic */ void cfr_renamed_18567(sprruo arg0) {
        sprayo sprayo2 = this;
        byte[] byArray = sprayo2.cfr_renamed_18568();
        sprruo sprruo2 = arg0;
        sprruo2.cfr_renamed_15098(byArray, 0, byArray.length);
        sprayo2.cfr_renamed_18572(sprruo2);
        sprayo2.cfr_renamed_18569(arg0);
    }

    private /* synthetic */ void cfr_renamed_18566(sprruo arg0) {
        arg0.cfr_renamed_15085(this.cfr_renamed_2.length);
        arg0.cfr_renamed_15098(this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
    }

    private /* synthetic */ void cfr_renamed_18565(sprruo arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91.length) {
            if (this.cfr_renamed_91[n].cfr_renamed_13522()) {
                arg0.cfr_renamed_15085(n);
            }
            n2 = ++n;
        }
    }
}

